import java.util.Scanner;
import static java.lang.Math.*;
class Package
{
public static void main(String args[])
  {

    Scanner sc=new Scanner(System.in);
 System.out.println("1.Arithmatic opertaion");
      System.out.println("2.statistical operation");
           System.out.println("3.Trignometric operation");
 
      System.out.println("enter choice");
    int a=sc.nextInt();
     
  
    switch(a)
          {
         case 1:
         System.out.println("Arithmatic operation");
         System.out.println("no1");
         int no1=sc.nextInt();
         System.out.println("no2");
         int no2=sc.nextInt();
         int add=no1+no2;
        int substract=no1-no2;
       int  product=no1*no2;
       double division=no1/no2;
         System.out.println("Addition:"+add);
            System.out.println("substraction:"+substract);
            System.out.println("Multiplication:"+product);
            System.out.println("Quetient:"+division);
                  break;
        case 2:
         System.out.println("statistical operation");
        System.out.println("e");
         int e=sc.nextInt();
         System.out.println("b");
         int b=sc.nextInt();
         System.out.println("c");
         int c=sc.nextInt();
         System.out.println("d");
         int d=sc.nextInt();
       int total=e+b+c+d;
       double average=total/4;
        System.out.println("Average:"+average);
         break;
 
        case 3:
        System.out.println("Trignometric operation");
        System.out.println("radians");
         int radians=sc.nextInt();
         System.out.println("sine:"+Math.sin(radians));
         System.out.println("cosine:"+Math.cos(radians));
         System.out.println("tangent:"+Math.tan(radians));
              break;
      
         case 4:
         System.out.println("Exit");
         break;
         }
      
    

  }
}