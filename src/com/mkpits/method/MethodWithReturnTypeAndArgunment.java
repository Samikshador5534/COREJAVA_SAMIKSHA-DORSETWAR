package com.mkpits.method;

public class MethodWithReturnTypeAndArgunment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MethodWithReturnTypeAndArgunment user = new MethodWithReturnTypeAndArgunment();
		String uValue = user.getDetails(1,10000);
		System.out.println(uValue);
	}

	private String getDetails(int id, int salary) {
		// TODO Auto-generated method stub
		double incentive = salary + (salary*0.1);
		String details = ("Id is :-"+id +"  salary with incentive is :-"+incentive);
		return details;
	}

}
