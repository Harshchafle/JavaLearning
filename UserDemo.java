import java.time.*;

class UserDemo{
    public static void main(String []args){
        LocalDate datefix = LocalDate.of(2000, 1, 1);
        User []userArray = {    new StandardUser("Harsh",    "Harsh@123",   "123456789", true,  "male",     LocalDate.of(2004, 02, 21), "Harsh",     LocalDate.of(2022, 4, 11), "It's_Me"),
                                new StandardUser("Shraddha", "Shraddha@123","6756749768",true,  "female",   LocalDate.of(2002, 03, 26),  "Shraddha",  LocalDate.of(2022, 5,5),   "Private_Secretary"),
                                new StandardUser("Rani",     "Rani@123",    "9876543210",false, "female",   LocalDate.of(2006, 10,1),   "Pagal",     LocalDate.of(2022, 1, 1),  "I_don't_know"),
                                new CustomUser(  "Prajwal",  "Prajwal@123", "9876567890",true,  "male",     LocalDate.of(2004, 02, 25),  "Prajwal@gmail.com", 11111, "Something"),
                                new CustomUser(  "Ashiya",   "Ashiya@123",  "9876785674",true,  "female",   LocalDate.of(1997, 9, 5),   "Ashiya@gmail.com", 22222, "Nothing"),
                                new CustomUser(  "Rohan",    "Rohan@123",   "2345263745",false, "male",     LocalDate.of(1999, 1, 7),   "Rohan@gmail.com", 44444, "Nothing"),
                            };

    for( User U:userArray){
        if(U instanceof StandardUser && U.gender.equals("female")){
            U.printUser();
            System.out.println();
        } 
    }
    for( User U:userArray){
        if(U instanceof CustomUser && datefix.isAfter(U.Date) && ((CustomUser)U).email.contains("gmail.com")){
            U.printUser();
            System.out.println();
        } 
    }
    }
}