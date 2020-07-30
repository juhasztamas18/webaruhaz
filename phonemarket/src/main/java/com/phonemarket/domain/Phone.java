package com.phonemarket.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Phone {
	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	 @GenericGenerator(name = "native", strategy = "native")
 @Id
 private long id;	
 private String nev;
 private int ram;
 private String proceszor;
 private int tarhely;
 private int ar;
 private String imgU;
 
 
private Phone() {
	 
 };
 
public String getImgU() {
	return imgU;
}
public void setImgU(String imgU) {
	this.imgU = imgU;
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

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}
}
