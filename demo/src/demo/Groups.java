package demo;

import java.util.Scanner;
public class Groups
{
    public static void main(String args[])
    {
        System.out.print("Enter roll no. (1-24): ");
        Scanner s = new Scanner(System.in);
        int roll = s.nextInt();

        if(roll==1 || roll==5 || roll==9 || roll==13 || roll==17 || roll==21)
        {
            System.out.println("Sapphire Group");
        }
        else if(roll==2 || roll==6 || roll==10 || roll==14 || roll==18 || roll==22)
        {
            System.out.println("Pearl Group");
        }
        else if(roll==3 || roll==7 || roll==11 || roll==15 || roll==19 || roll==23)
        {
            System.out.println("Ruby Group");
        }
        else if(roll==4 || roll==8 || roll==12 || roll==16 || roll==20 || roll==24)
        {
            System.out.println("Emerald Group");
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}
