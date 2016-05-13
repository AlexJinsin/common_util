package com.alex.utils;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FileUtil {

	public FileUtil() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @description:查看压缩文件压缩前大小
	 * @param filePath
	 * @return:
	 * @time: 上午12:09:39
	 * @author: alex
	 */
	public static long getZipTrueSize(String filePath) {
		long size = 0;
		ZipFile f;
		try {
			f = new ZipFile(filePath);
			Enumeration<? extends ZipEntry> en = f.entries();
			while (en.hasMoreElements()) {
				size += en.nextElement().getSize();
			}
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return size;
	}

}
