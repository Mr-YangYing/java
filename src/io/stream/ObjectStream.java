package io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;

import org.junit.Test;

/**
 * 对象输入输出流
 * 输入流：反序列化
 * 输出流：序列化
 * @author Administrator
 *
 */
public class ObjectStream {

		
    	/**
    	 * 将对象序列化到文件中
    	 * @throws Exception 
    	 */
    	@Test
    	public void ObjectToFile() throws Exception{
    		Emp emp= new Emp();
    		emp.setId(UUID.randomUUID().toString());
    		emp.setName("张三");
    		emp.setSalary(1000d);
    		
    		ObjectOutputStream oos = new ObjectOutputStream(
    				new BufferedOutputStream(
    						new FileOutputStream("d.txt")));
    		
    		oos.writeObject(emp);//序列化
    		
    		oos.flush();
    		FileUtils.closeAll(oos);
    	}
    	
    	/**
    	 * 将对象从文件中反序列化出来
    	 * @throws IOException 
    	 * @throws FileNotFoundException 
    	 * @throws ClassNotFoundException 
    	 */
    	@Test
    	public void fileToObject() throws FileNotFoundException, IOException, ClassNotFoundException{
    		
    		ObjectInputStream ooi = new ObjectInputStream(
    				new BufferedInputStream(
    						new FileInputStream("d.txt")));
    		
    		Object readObject = ooi.readObject();//反序列化
			if(readObject instanceof Emp) {
				String name = ((Emp) readObject).getName();
				Double salary = ((Emp) readObject).getSalary();
				System.out.println(name);
				System.out.println(salary);
			}
			
			FileUtils.closeAll(ooi);
			
    	}
}
