class vehicle
{
    String brand;
}
class car extends vehicle
{
    String model;
    String colour;
}
public class test
{
    public static void main(String[]args)
    {
        car mycar=new car();
        mycar.brand="ford vehicle";
        mycar.model="mercedes";
        mycar.colour="silver";
        System.out.println("brand:"+mycar.brand);
        System.out.println("model:"+mycar.model);
        System.out.println("colour:"+mycar.colour);

    }
}

