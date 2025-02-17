/**
 *
 * @author supan
 */
class Base{
    public int x;
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("This is a Base and setting X now");
        this.x=x;
    }
   public void displayBase(){
        System.out.println("This is a constructor");
   }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }
    
    public void setY(int y){
        this.y=y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //Creating an Object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
       
        //Creating an object of Derived class
        Derived d = new Derived();
        d.setY(50);
        System.out.println(d.getY());
    }
}
