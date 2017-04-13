package io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

/**
 * 字节数组输入输出流
 * @author Administrator
 *
 */
public class ByteArrayStream {

	/**
	 * 从文件读取数据，然后写入到字节数组中
	 * @throws Exception
	 */
	@Test
	public void fileToByteArray() throws Exception{
		//文件输入流
		InputStream in = new BufferedInputStream(new FileInputStream("a.txt"));//数据源
		//字节数组输出流，因为字节数组输出流有新方法，所以不要用多态
		ByteArrayOutputStream bos =new ByteArrayOutputStream();
		
		//数据输出目的地
		byte[] b = null;
		
		byte [] by = new byte[1024];
		int len=0;
		while (-1!=(len=in.read(by))) {
			bos.write(by, 0, len);
		}
		
		bos.flush();//刷新一下，养成习惯
		
		b = bos.toByteArray();//将字节数组流中的数据写入到数组中
		
		bos.close();
		in.close();
		
		System.out.println(new String(b));
	}
	
	/**
	 * 从字节数组读取数据，输出到文件
	 * @throws Exception
	 */
	@Test
	public void byteArrayToFile() throws Exception{
		//数据源
		byte[] by = "nishjsihjaisdj手动阀".getBytes();
		InputStream in = new BufferedInputStream(new ByteArrayInputStream(by));
		
		//目的地
		OutputStream os =new BufferedOutputStream(new FileOutputStream("b.txt"));
		
		byte[] b = new byte[1024];
		int len=0;
		while (-1!=(len=in.read(b))) {
			os.write(b, 0, len);
		}
		os.flush();
		
		os.close();
		in.close();
		
	}
}
