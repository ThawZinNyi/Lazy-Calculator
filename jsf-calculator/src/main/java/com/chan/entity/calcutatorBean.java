package com.chan.entity;

import java.io.Serializable; 

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@RequestScoped

public class calcutatorBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int firstNum;
	private int secNum;
	private int result;

	public int add() {
		result = firstNum + secNum;
		return result;
	}
	public int substract() {
		result = firstNum - secNum;
		return result;
	}
	public int multiply() {
		result = firstNum * secNum;
		return result;
	}
	public int divide() {
		result = firstNum / secNum;
		return result;
	}
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecNum() {
		return secNum;
	}
	public void setSecNum(int secNum) {
		this.secNum = secNum;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}
