package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String buyerName;
    private String email;
    private String address;
    private String phoneNumber;
    private int quantity;
    private double totalPrice;
    private int book_id;
	public Transaction(int id, String buyerName, String email, String address, String phoneNumber, int quantity, double totalPrice, int book_id) {
		super();
		this.id = id;
		this.buyerName = buyerName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.book_id = book_id;
	}
	public Transaction() {
        super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbuyerName() {
		return buyerName;
	}
	public void setbuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double gettotalPrice() {
		return totalPrice;
	}
	public void settotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getbookId() {
		return book_id;
	}
	public void setbookId(int book_id) {
		this.book_id = book_id;
	}
}
