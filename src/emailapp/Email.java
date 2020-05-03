package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 14;
	private String email;
	private String companySuffix = "companyname.com";
	
	//construct to recive the first and last name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("Email Created : "+this.firstName+" "+this.lastName);
		
		//asking for department
		this.department = setDepartment();
//		System.out.println("Department : " + department);
		
		//call to generate a password
		this.password = randomPassword(defaultPasswordLength);
//		System.out.println("Password : " + password);
		
		//creating email
		if(department.length() == 0)
		{
			this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +companySuffix;
		}
		else
		{
			this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +companySuffix;
		}
		
//		System.out.println("Email : " + email);
	}
	
	//setting department
	private String setDepartment() {
		System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 none\nEnter Department Code : ");
		Scanner scanner = new Scanner(System.in);
		int deptChoice = scanner.nextInt();
		switch(deptChoice) {
			case 1:
				return "sale";
			case 2:
				return "dev";
			case 3:
				return "acct";
			default:
				return "";
		}
	}
	
	//method to generate password
	private String randomPassword(int length) {
		char password[] = new char[length];
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*_";
		for(int i = 0; i<length; i++)
		{
			int temp = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(temp);
		}
		return new String(password);
	}
	
	//setting mail box capacity
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	//set alternate email address
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "NAME : " + firstName + " " + lastName + "\n" +
				"COMPANY EMAIL : " + email + 
				"\nPASSWORD : " + password+
				"\nMAILBOX CAPACITY : " + mailboxCapacity;
				
	}
	
}
