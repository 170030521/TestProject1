package com.vm.clinet;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Hello;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("helloworld.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Hello hello=(Hello) factory .getBean("hel");
		hello.display();

	}

}
