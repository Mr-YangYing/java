package io.stream;

import java.io.Closeable;
import java.io.IOException;

/**
 * 流操作工具包
 * @author Administrator
 *
 */
public class FileUtils {
	
	/**
	 * 实现Closeable接口的流都可以关闭
	 * ...io 表示可变参数
	 * @param io
	 */
	public static <T extends Closeable> void closeAll(T ...io){
		for(T temp : io){
			if(null!=temp){
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
