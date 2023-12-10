package com.edubridge.mobileapp.Dao;

import java.util.ArrayList;
import java.util.List;

import com.edubridge.mobileapp.model.Mobile;

public class MobileDaoImpl implements MobileDao {
	
	static List<Mobile> mobiles = new ArrayList<Mobile>();
	
	public MobileDaoImpl() {
		mobiles.add(new Mobile("Vivo", "Blue", "Triple", 17999.00));
		mobiles.add(new Mobile("Oppo", "orange", "Quad", 16999.00));
		mobiles.add(new Mobile("Realme", "Black", "Quad", 15999.00));
		mobiles.add(new Mobile("Samsung", "Grey", "Dual", 12999.00));
		mobiles.add(new Mobile("Iphone", "Graphite", "Triple", 59999.00));
	}

	@Override
	public void addMobile(Mobile mobile) {
		mobiles.add(mobile);
		
	}

	@Override
	public boolean removeMobile(String color) {
		
		return mobiles.removeIf((mobile)-> mobile.getColor()==color);
	}

	@Override
	public List<Mobile> displayMobiles() {
		
		return mobiles;
	}

	@Override
	public Mobile searchMobile(String brand) {
		Mobile search = null;
		for(Mobile M : mobiles)
			if(M.getBrand()==brand)
				search=M;
				
		return search;
	/*	Mobile m = searchMobile(mobile.getBrand());
		if (m!= null) {
		int index =mobiles.indexOf(m);
		mobiles.set(index, mobile);
		System.out.println("udate successfully");
		}
		else {
			System.out.println("not found");
		}*/
	
	}

	@Override
	public void updateMobile(String brand, Mobile mobile) {
		Mobile m = searchMobile(mobile.getBrand());
		if (m!= null) {
		int index =mobiles.indexOf(m);
		mobiles.set(index, m);
		System.out.println("update successfully");
		}
		else {
			System.out.println("not found");
		}
		
	}

	
		
	}

		





