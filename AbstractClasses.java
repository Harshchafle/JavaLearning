public abstract class AbstractClasses {

    abstract void display();
    abstract void showData();
    
    public static void main(String args[]){
        // AbstractClasses obj1 = new AbstractClasses(); // error: AbstractClasses is abstract; cannot be instantiated
        ExtendAbstract obj1 = new ExtendAbstract();
        obj1.display();
        obj1.showData();
    }
}

class ExtendAbstract extends AbstractClasses{
    void display(){
        System.out.println("hello this is abstract class");
    }

    void showData(){
        System.out.println("This is showData method in Extended class of Abstract Class");
    }
}





