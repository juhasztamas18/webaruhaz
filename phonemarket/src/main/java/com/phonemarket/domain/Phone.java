package com.phonemarket.domain;

public class Phone {
 private String nev;
 private int ram;
 private String proceszor;
 private int tarhely;
 private int ar;
 private String imgU;
 
public String getImgU() {
	return imgU;
}
public void setImgU(String imgU) {
	this.imgU = imgU;
}
public Phone () {
	 
 }
public String getNev() {
	return nev;
}
public void setNev(String nev) {
	this.nev = nev;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getProceszor() {
	return proceszor;
}
public void setProceszor(String proceszor) {
	this.proceszor = proceszor;
}
public int getTarhely() {
	return tarhely;
}
public void setTarhely(int tarhely) {
	this.tarhely = tarhely;
}
public int getAr() {
	return ar;
}
public void setAr(int ar) {
	this.ar = ar;
}
}
