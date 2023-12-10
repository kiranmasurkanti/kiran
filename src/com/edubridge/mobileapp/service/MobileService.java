package com.edubridge.mobileapp.service;

import java.util.List;

import com.edubridge.mobileapp.model.Mobile;

public interface MobileService {
	void addMobile(Mobile mobile);
	boolean removeMobile(String color);
	List<Mobile> displayMobiles();
	Mobile searchMobile(String brand);
	void updateMobile(String brand, Mobile mobile);

}
