package com.flipkart.client;

import com.flipkart.business.CustomerInterface;
import com.flipkart.business.CustomerImpl;

public class CustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerInterface customer =new CustomerImpl();
		customer.createCustomer();
		customer.listCustomer();
		System.out.println("update customer-->"+customer.updateCustomer(101));
		System.out.println("delete customer-->"+customer.deleteCustomer(101));

	}

}
