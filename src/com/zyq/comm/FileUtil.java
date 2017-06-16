package com.zyq.comm;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	private static File file=null;
	//private static String path = ".\\֣����\\Desktop\\a\\a.txt";//��Ŀ��Ŀ¼
	//private static String path = "֣����\\Desktop\\a\\a.txt";//��Ŀ��Ŀ¼
	//private static String path = "..\\֣����\\Desktop\\a\\a.txt";//��Ŀ��Ŀ¼��һ��Ŀ¼
	//private static String path = "\\֣����\\Desktop\\a\\a.txt";//��Ŀ�����̸�Ŀ¼��
	//private static String path = "C:\\Users\\֣����\\Desktop\\a\\a.txt";//ָ������
	public static void main(String[] args) {
		//createFile("C:\\Users\\֣����\\Desktop","a.txt");
		createFile("C:\\Users\\֣����\\Desktop\\a.txt");
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		file.isDirectory();
		file=null;
	}
	/**
	 * ����Ŀ¼
	 * @param path
	 */
	public static void createDir(String path) {
		 file=new File(path);
		//����Ŀ¼
		if (!file.exists()) {
			//��·���������
			//file.mkdir();
			file.mkdirs();
		}
	}
	/**
	 * �����ļ�
	 * @param path ·��
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
	 * �����ļ�
	 * @param path ·��
	 * @param filename �ļ���
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
