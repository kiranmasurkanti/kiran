package com.edubridge.mobileapp.service;

import java.util.List;

import com.edubridge.mobileapp.Dao.MobileDao;
import com.edubridge.mobileapp.Dao.MobileDaoImpl;
import com.edubridge.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService {
	MobileDao dao = new MobileDaoImpl();
	
	@Override
	public void addMobile(Mobile mobile) {
		dao.addMobile(mobile);
				
	}

	@Override
	public boolean removeMobile(String color) {
		
		return dao.removeMobile(color);
	}

	@Override
	public List<Mobile> displayMobiles() {
		
		return dao.displayMobiles();
	}

	@Override
	public Mobile searchMobile(String brand) {
		
		return dao.searchMobile(brand);
	}

	@Override
	public void updateMobile(String brand, Mobile mobile) {
		dao.updateMobile(brand, mobile);
	}

}
