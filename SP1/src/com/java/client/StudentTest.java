package com.java.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.java.bean.Student;

public class StudentTest {

	public static void main(String[] args) {

		String conf = "E:/PhotonWorkspace/HIBERNET/SP1/src/com/java/config/myBean.xml";

		FileSystemResource resource = new FileSystemResource(conf);
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Object obj = factory.getBean("std");
		Student std = (Student) obj;
		System.out.println("Id " + std.getStudentId());
		System.out.println("name " + std.getStudentName());
	}
}
