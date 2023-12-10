package com.edubridge.mobileapp.main;


import com.edubridge.mobileapp.model.Mobile;
import com.edubridge.mobileapp.service.MobileService;
import com.edubridge.mobileapp.service.MobileServiceImpl;

public class MobileApp {

	public static void main(String[] args) {
		MobileService service = new MobileServiceImpl();
		System.out.println("display all mobiles");
		service.displayMobiles().forEach(System.out::println);
		
		System.out.println("--------------------");
		
		service.addMobile(new Mobile("Sony", "silver", "Triple", 39999.00));
		service.displayMobiles().forEach(System.out::println);
		
		System.out.println("--------------------");
		
		boolean status= service.removeMobile("silver");
		if(status == true)
			System.out.println("mobile is soldout");
		else
			System.out.println("Mobile is available");
		
		service.displayMobiles().forEach(System.out::println);
		
		System.out.println("---------------------");
		
		Mobile mobile=service.searchMobile("Vivo");
				System.out.println(mobile);
			
				System.out.println("---------------------");
		
		Mobile  updateMobile=new Mobile("Samsung", "Grey", "Dual", 12999.00);
		service.updateMobile("Galaxy",updateMobile);
		service.displayMobiles().forEach(System.out::println);

		

	}

}
