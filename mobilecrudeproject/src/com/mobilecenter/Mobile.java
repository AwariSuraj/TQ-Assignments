package com.mobilecenter;

public class Mobile {

	private String mtype;
	private float price;
	private String brandname;

	public Mobile() {

	}

	public Mobile(String mtype, float price, String brandname) {
		super();
		this.mtype = mtype;
		this.price = price;
		this.brandname = brandname;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Override
	public String toString() {
		return "Mobile [mtype=" + mtype + ", price=" + price + ", brandname=" + brandname + "]";
	}

}
