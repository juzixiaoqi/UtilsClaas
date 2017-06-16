package com.zyq.comm;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	private static File file=null;
	//private static String path = ".\\郑亚齐\\Desktop\\a\\a.txt";//项目根目录
	//private static String path = "郑亚齐\\Desktop\\a\\a.txt";//项目根目录
	//private static String path = "..\\郑亚齐\\Desktop\\a\\a.txt";//项目根目录上一级目录
	//private static String path = "\\郑亚齐\\Desktop\\a\\a.txt";//项目所在盘根目录下
	//private static String path = "C:\\Users\\郑亚齐\\Desktop\\a\\a.txt";//指定盘下
	public static void main(String[] args) {
		//createFile("C:\\Users\\郑亚齐\\Desktop","a.txt");
		createFile("C:\\Users\\郑亚齐\\Desktop\\a.txt");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		file.isDirectory();
		file=null;
	}
	/**
	 * 创建目录
	 * @param path
	 */
	public static void createDir(String path) {
		 file=new File(path);
		//创建目录
		if (!file.exists()) {
			//父路径必须存在
			//file.mkdir();
			file.mkdirs();
		}
	}
	/**
	 * 创建文件
	 * @param path 路径
	 */
	public static void createFile(String path) {
		 file=new File(path);
		 if(!file.getParentFile().exists()){
			 file.getParentFile().mkdirs();
			}
		try {
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 创建文件
	 * @param path 路径
	 * @param filename 文件名
	 */
	public static void createFile(String path,String filename) {
		createDir(path);
		try {
			file=new File(file, filename);
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
