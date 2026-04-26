import java.time.LocalDate;
class CustomUser extends User{

    String email;
    int securitykey;
    String Manager;

    CustomUser(String name,String password,String mobile,boolean isActive,String
        gender,LocalDate Date,String email,int securitykey,String Manager){
        super(name,password,mobile,isActive, gender, Date);
        this.email= email;
        this.securitykey= securitykey;
        this.Manager= Manager;
    }

    public void printCustomUser(){
        super.printUser();
        System.out.println("Email:"+email);
        System.out.println("security:"+securitykey);
        System.out.println("Manager:"+Manager);
    }

}
