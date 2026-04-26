/*
 Develop a money class that manages currency values in rupees and paise, ensuring 
non-negative values for both components. The class constructor initializes a Money object 
while also validating the range for paise (0 to 99). Additionally, implement methods for 
addition and subtraction of two Money objects. A display method showcases the current 
object value. An extra method, INRtoUSDollar(), accepts a Money object and converts the 
Indian rupee value to its corresponding US Dollar equivalent. Write an appropriate main() 
method to demonstrate method or constructor overloading.
*/

class Money{
    int rupee;
    int  paise;
    double usd = 0;

    //constructor to give the values to rupees and paise
    Money(int r , int p){
        this.rupee = r;
        this.paise = p;
        if((this.rupee < 0) || (this.paise < 0)) {
            System.out.println("Please Enter Valid Money(Non negative number)");
            this.rupee = 0;
            this.paise = 0;
        }
    }

    // Constructor to initialize defalut values
    Money(){
        this.rupee = 0;
        this.paise = 0;
    }

    // Method to print Amount
    void printData(){
        System.out.println("Given Amount = "+this.rupee+"."+this.paise +" (Rupee = "+this.rupee+" paise = "+this.paise+")");
    }

    // Method to add Money
    void add(Money m1,Money m2){
        this.rupee = m1.rupee + m2.rupee;
        this.paise = m1.paise + m2.paise;
        if(this.paise > 99){
            rupee++;
            this.paise = this.paise % 100;
        }
        System.out.println("Added Amount = "+this.rupee+"."+this.paise +" (Rupee = "+this.rupee+" paise = "+this.paise+")");
    }

    // Method to subtract Money
    void sub(Money m1,Money m2){
        this.rupee = m1.rupee - m2.rupee;
        this.paise = m1.paise - m2.paise;
        if(this.rupee < 0){
            System.out.println("Your Amount is getting negative");
            System.out.println("Please enter valid amount");
        } else {
            if(this.paise < 0){
                this.rupee--;
                this.paise = this.paise + 100;
            }
        }
        System.out.println("Subtracted Amount = "+this.rupee+"."+this.paise +" (Rupee = "+this.rupee+" paise = "+this.paise+")");
    }

    // Method to convert Money from rupee to usd
    void inrToUsd(Money m){
        double p = this.paise;
        usd = (this.rupee + p/100) * 0.012  ;
        System.out.println("The amount in USD is "+usd+" USD ");
    }

    // Main method
    public static void main(String args[]){
        Money m1 = new Money(4,60);
        m1.printData();
        Money m2 = new Money(30,100);
        m2.printData();

        Money m3 = new Money();
        m3.add(m1,m2);
        

        Money m4 = new Money();
        m4.sub(m1,m2);
        

        m1.inrToUsd(m1); // 4.60 INR = 0.055 USD
        m2.inrToUsd(m2);
        
    }
}
