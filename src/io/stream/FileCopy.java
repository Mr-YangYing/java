package io.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝
 * @author Administrator
 *
 */
public class FileCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
 		try {
			fileInputStream= new FileInputStream("a.txt");   //源文件  必须存在
			fileOutputStream = new FileOutputStream("aCopy.txt");   //目的文件
			byte[] by = new byte[1024];  //定义缓冲数组
			int len=0;   //定义读取长度
			while ((len=fileInputStream.read(by))!=-1) { //读
				fileOutputStream.write(by, 0, len);   //写
			}
			
			fileOutputStream.flush(); //强制刷新
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//释放资源 ：后打开的先关闭
			if(fileInputStream!=null){
				fileOutputStream.close();
			}
			if(fileInputStream!=null){
				fileInputStream.close();
			}
			
		}
	}
}
