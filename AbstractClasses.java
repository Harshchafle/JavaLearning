public abstract class AbstractClasses {
    abstract void display();
    public static void main(String args[]){
        // AbstractClasses obj1 = new AbstractClasses(); // error: AbstractClasses is abstract; cannot be instantiated
        ExtendAbstract obj1 = new ExtendAbstract();
        obj1.display();
    }
}

class ExtendAbstract extends AbstractClasses{
    void display(){
        System.out.println("hello this is abstract class");
    }
}



