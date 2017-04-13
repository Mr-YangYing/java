package io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 * 基本数据和String类型数据处理流
 * @author Administrator
 *
 */
public class DataStream {

	
	/**
	 * 将数据+数据类型写入到文件
	 * @throws Exception
	 */
	@Test
	public void dataStreamToFile() throws Exception{
		//数据源
		int a= 10;
		long b= 100L;
		double c= 12.5;
		String d="数据类型";
		
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("c.txt")
						)
				);
		dos.writeInt(a);
		dos.writeLong(b);
		dos.writeDouble(c);
		dos.writeUTF(d);
		
		dos.flush();
		dos.close();
		
	}
	
	/**
	 * 从指定文件中读取数据+类型
	 * @throws Exception
	 */
	@Test
	public void fileToDataStream() throws Exception{
		//数据源
		DataInputStream di= new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("c.txt")
						)
				);
		//注意：读取顺序要和存入的顺序一致，不然报错
		
		int readInt = di.readInt();
		long readLong = di.readLong();
		double readDouble = di.readDouble();
		String readUTF = di.readUTF();
		System.out.println(readInt+"-----"+readLong+"-----"+readDouble+"-----"+readUTF);
		
	}
	
}
