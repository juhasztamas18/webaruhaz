package com.phonemarket.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phonemarket.domain.Phone;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("pageTitle","FlagshipPhones");
		model.addAttribute("telefonok",getPhones());
		return "index";
	}
	
	
	private ArrayList<Phone> getPhones() { 
	ArrayList<Phone> telefonok = new ArrayList<>();
	
	Phone huawei = new Phone();
	huawei.setNev("Huawei P30");
	huawei.setRam(6);
	huawei.setTarhely(64);
	huawei.setAr(200);
	huawei.setProceszor("Snapdragon 950");
	huawei.setImgU("/images/telefon1.jpg");
	
	Phone lg = new Phone();
	lg.setNev("LG G8");
	lg.setRam(6);
	lg.setTarhely(124);
	lg.setAr(200);
	lg.setProceszor("Snapdragon 950");
	lg.setImgU("/images/telefon2.jpg");
	
	Phone samsung = new Phone();
	samsung.setNev("Samsung Galaxy S20");
	samsung.setRam(6);
	samsung.setTarhely(64);
	samsung.setAr(200);
	samsung.setProceszor("Snapdragon 950");
	samsung.setImgU("/images/telefon3.jpg");
	
	Phone iphone = new Phone();
	iphone.setNev("iPhone X");
	iphone.setRam(4);
	iphone.setTarhely(64);
	iphone.setAr(400);
	iphone.setProceszor("A9");
	iphone.setImgU("/images/telefon4.jpg");
	
	
	telefonok.add(samsung);
	telefonok.add(lg);
	telefonok.add(iphone);
	telefonok.add(huawei);
	return telefonok;
	}
}
