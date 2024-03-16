import java.time.LocalDate;

class StandardUser extends User{
    String alias;
    LocalDate Datelog;
    String role;

    StandardUser(String name,String password,String mobile,boolean isActive,String
                gender,LocalDate Date,String alias,LocalDate Datelog,String role){
        super(name,password,mobile,isActive, gender, Date);
        this.alias= alias;
        this.Datelog= Datelog;
        this.role= role;
    }

    public void printStandardUser(){
        super.printUser();
        System.out.println("alias:"+alias);
        System.out.println("Date of Last LogIn:"+Datelog);
        System.out.println("role:"+role);
    }
}
