package com;

public class Contact {

		  private String firstName;
		  private long  phoneNumber;
		  public Contact(){}
		  public String getFirstName() {
		    return firstName;
		  }
		  public void setFirstName(String firstName) {
		    this.firstName = firstName;
		  }
		 
		  
		  public long getPhoneNumber() {
		    return phoneNumber;
		  }
		  public void setPhoneNumber(long phoneNumber) {
		    this.phoneNumber = phoneNumber;
		  }
		 
		  public Contact(String firstName, String lastName, long phoneNumber,
		      String emailId) {
		    super();
		    this.firstName = firstName;
		    
		    this.phoneNumber = phoneNumber;
		    
		  }
		}
