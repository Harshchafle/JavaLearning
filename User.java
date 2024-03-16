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
