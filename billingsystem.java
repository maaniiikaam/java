public class billingsystem
{
    public static void main(String[]args)
    {
        int i;
        int[] customerid={101,102,103,104,105};
        String[] customername={"durga","priya","sowmi","sivani","anu"};
        String[] customervehicle={"bike","cycle","car","bus","cycle"};
        for(i=0;i<5;i++)
        {
            System.out.println(customerid[i]);
            System.out.println(customername[i]);
            System.out.println(customervehicle[i]);

        }
    }
}