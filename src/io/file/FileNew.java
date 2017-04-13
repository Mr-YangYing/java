package io.file;

import java.io.File;

/**
 * 创建File对象的方式
 * @author Administrator
 * 
 * public String getName()：返回文件名称 
 * public String getPath()：如果是相对路径，返回相对路径，如果是绝对路径，返回绝对路径
 * public String getAbsolutePath():返回绝对路径
 */
public class FileNew {

	public static void main(String[] args) {
		File src=null;
		
		/**
		 * 以相对路径创建File
		 * 1、File(File parent, String child)
		 * 2、File(String parent, String child)
		 */
		//src= new File(new File("E:/a/b"),"a.txt");
		src= new File("E:/a/b","a.txt");
		
		System.out.println(src.getName());      		//a.txt   		返回由此抽象路径名表示的文件或目录的名称。
		System.out.println(src.getPath());      		//E:\a\b\a.txt	将此抽象路径名转换为一个路径名字符串。
		
		
		
		System.out.println("-------------------");
		
		/**
		 * 以绝对路径创建File,在Windows下是以盘符开头，在Linux或者其他系统下是以/开头
		 * 1、File(String pathname)
		 */
		src= new File("E:/a/b/a.txt");
		
		System.out.println(src.getName());      		//a.txt   		返回由此抽象路径名表示的文件或目录的名称。
		System.out.println(src.getPath());      		//E:\a\b\a.txt	将此抽象路径名转换为一个路径名字符串。
		
		System.out.println("-------------------");
		
		/**
		 * 如果不指定盘符：那么就会以当前用户的workspace下的项目名称作为开头来构建
		 */
		src= new File("a.txt");
		
		System.out.println(src.getName());      		//a.txt 返回由此抽象路径名表示的文件或目录的名称。
		System.out.println(src.getPath());      		//a.txt	将此抽象路径名转换为一个路径名字符串。
		
		System.out.println(src.getAbsolutePath());		
		//E:\Users\Administrator\workspace2\javaSE\a.txt	返回此抽象路径名的绝对路径名字符串。
	}
}
