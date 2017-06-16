package com.zyq.comm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOUtil {
	private static String path = "C:\\Users\\֣����\\Desktop\\aa.txt";
	private static File f = new File(path);
	private static InputStream ips = null;
	private static OutputStream ops = null;
	private static Reader reader = null;
	private static BufferedReader bufferedReader = null;
	private static Writer writer = null;
	private static BufferedWriter bufferedWriter = null;

	public static void main(String[] args) {
		// FileUtil.createFile(f);
		// f.delete();
		// writeByByte(f,"123".getBytes());
		// writeByChar(f,"���");
		// readByByte(f);
		// readByChar(f);
		readByLine(f);
	}

	/**
	 * ���ֽڶ�ȡ����
	 * 
	 * @param f
	 */
	public static void readByByte(File f) {
		try {
			ips = new FileInputStream(f);
			byte[] b = new byte[1024];
			try {
				while (ips.read(b) != -1) {
					System.out.write(b);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ips.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ���ַ���ȡ���ݣ��˶�ȡ����������������⣬��ʹ��InputStreamReader
	 * 
	 * @param f
	 */
	public static void readByChar(File f) {
		try {
			reader = new FileReader(f);
			char[] c = new char[512];
			try {
				while (reader.read(c) != -1) {
					System.out.println(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ʹ��bufferedReader���ж�ȡ����
	 * 
	 * @param f
	 */
	public static void readByLine(File f) {
		try {
			bufferedReader = new BufferedReader(new FileReader(f));
			try {
				String line = null;
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	/**
	 * �ֽڴ洢���ݣ��滻�Դ洢
	 * @param f
	 * @param b
	 */
	public static void writeByByte(File f, byte[] b) {
		try {
			ops = new FileOutputStream(f);
			try {
				ops.write(b);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ops.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * �ַ��洢���ݣ��滻�Դ洢
	 * @param f
	 * @param str
	 */
	public static void writeByChar(File f, String str) {
		try {
			writer = new FileWriter(f);
			writer.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


}
