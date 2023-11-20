package com.example.demo.beans;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Employee {
	private String name;
	private String password;
	private String email;	
	private String accountNumber;	
	private int age;
	/*
	 * private String createMask(String accountNumber) { //put your masking logic
	 * here StringBuilder sb=new StringBuilder(accountNumber); for(int
	 * i=0;i<sb.length()-4;i++) { sb.setCharAt(i,'X'); } return sb.toString(); }
	 */
}
