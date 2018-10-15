package com.example.springBascis.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements sortAlgorithm {
public int[] sort(int []numbers){
	
	return numbers;
} 
}
