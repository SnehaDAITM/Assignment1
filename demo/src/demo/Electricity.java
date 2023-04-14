package demo;

import java.util.Scanner;
public class Electricity
{
    public static void main(String args[])
    {
        double charge;
        System.out.print("Enter unit: ");
        Scanner s = new Scanner(System.in);
        int unit = s.nextInt();

        if(unit<=100)
        {
            charge = 1.2*unit;
            System.out.println(charge);
        }
        else if(unit>=100 && unit<=300)
        {
            charge = 2*unit;
            System.out.println(charge);
        }
        else
        {
            charge = 3*unit;
            System.out.println(charge);
        }

    }
}
