/*
 A Web Application has a class User to represent basic user's 
information like username, password, mobile number, isActive, 
gender and created date and a method printUser() which prints the 
basic information in a specific format that should not be changed by 
the inheriting classes. There are two types of Users viz. Standard user 
and custom user. A standard user has additional fields like alias, last 
login and role whereas a custom user has fields like email, Security 
Key and Manager. Use the inheritance feature of OOP to implement 
this system (use super, final, constructors, etc. as required). Define 
methods to display appropriate information based on the user type. 
Create an array of users and display information of all users based on 
following criteria: 
• Display all female standard users . 
• Display all custom users created before 1 Jan 2000 with 
email Id containing "gmail.com".
*/

import java.time.LocalDate;

class User{
    String name,password;
    String mobile;
    boolean isActive;
    String gender;
    LocalDate Date;

    User(String name,String password,String mobile,boolean isActive,String
        gender,LocalDate Date){
        this.name= name;
        this.password=password;
        this.mobile= mobile;
        this.isActive=isActive;
        this.gender = gender;
        this.Date = Date;
    }

    final void printUser(){
        System.out.println("Name : "+name+"\nPassword : "+password+
                            "\nMobileNo. : "+mobile+"\nIs Active : "+isActive+
                            "\ngender : "+gender+"\nDate : "+Date);
    }

}
