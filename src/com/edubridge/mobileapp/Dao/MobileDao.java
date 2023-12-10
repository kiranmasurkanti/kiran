package com.edubridge.mobileapp.Dao;

import java.util.List;

import com.edubridge.mobileapp.model.Mobile;
public interface MobileDao {
	void addMobile(Mobile mobile);
	boolean removeMobile(String color);
	List<Mobile> displayMobiles();
	Mobile searchMobile(String brand);
	void updateMobile(String brand, Mobile mobile);
}
