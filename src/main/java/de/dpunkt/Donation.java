package de.dpunkt;

public class Donation {
	private double amount;
	private String donorName;
	private Boolean receiptRequested;
	private Status status;
	private Account account;
	
	public enum Status{
		TRANSFERRED, IN_PROCESS;
	}
	public Donation() {
		this.account = new Account();
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public Boolean getReceiptRequested() {
		return receiptRequested;
	}
	public void setReceiptRequested(Boolean receiptRequested) {
		this.receiptRequested = receiptRequested;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
