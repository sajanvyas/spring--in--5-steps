package com.example.springBascis.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
	ApplicationContext applicationContext=SpringApplication.run(SpringIn5StepsApplication.class, args);
BinarySearchImpl binarySearch=	applicationContext.getBean(BinarySearchImpl.class);
		int result=binarySearch.binarySearch(new int []{12,4,6},3);
		System.out.println(result);
		//com.example.springBascis.springin5steps.QuickSortAlgorithm@15db9742
		//com.example.springBascis.springin5steps.BubbleSortAlgorithm@15db9742
		
	}
}
