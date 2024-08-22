
package practice2;

import java.util.Scanner;
public class GPA {
    public static void main(String[]args){
        System.out.print("Enter the mark:");
        
        Scanner input=new Scanner(System.in);
        
        int mark=input.nextInt();
        
    if(mark>=0 && mark<=40)
        System.out.print("GPA F");
    else if(mark>=40 && mark<=44)
        System.out.print("GPA E");

    else if(mark>=45 && mark<=49)
        System.out.print("GPA D");

        else if(mark>=50 && mark<=54)
        System.out.print("GPA C");

        else if(mark>=55 && mark<=59)
        System.out.print("GPA C+");

        else if(mark>=60 && mark<=64)
        System.out.print("GPA B");

        else if(mark>=65 && mark<=69)
        System.out.print("GPA B+");

        else if(mark>=70 && mark<=74)
        System.out.print("GPA A-");

        else if(mark>=75 && mark<=79)
        System.out.print("GPA A");

        else if(mark>=80 && mark<=100)
        System.out.print("GPA A+");

        else
            System.out.print("Error!");

        
    }
    
}
