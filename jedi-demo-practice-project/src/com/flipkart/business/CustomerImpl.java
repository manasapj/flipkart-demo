package com.flipkart.business;

public class CustomerImpl implements CustomerInterface {

	@Override
	public void createCustomer() {
		// TODO Auto-generated method stub
		System.out.print("create customer ");
		
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		System.out.print("the delete by id "+id);
		return true;
	}

	@Override
	public boolean updateCustomer(int id) {
		// TODO Auto-generated method stub
		System.out.print("the update by id "+id);
		return true;
	}

	@Override
	public void listCustomer() {
		// TODO Auto-generated method stub
		System.out.print("the list of customers ");
		
	}

}
