package com.work2win.model;

import java.sql.Date;

import lombok.Data;
public class AccountTransfer {
	
	private int fromAccount;
	private int toAccount;
	private float amount;
	private String typetrans;
	private Date date;
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTypetrans() {
		return typetrans;
	}
	public void setTypetrans(String typetrans) {
		this.typetrans = typetrans;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}
