public class CarFactory {


    public static Car getCar(String name){
        if (name.equals("Audi"))
            return new Audi();
        else if(name.equals("BMW"))
            return new BMW();
        else
            return null;


    }
}
