package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO 注释
 *
 * @author maoenqi
 * @date 2021-12-12
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Bean.class);
		context.refresh();
		System.out.println(context.getBean(Bean.class));
	}
}