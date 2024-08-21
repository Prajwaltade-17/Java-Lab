import java.util.Scanner;

class Person
{
 int date,month,year;
 float height;
 float weight;
  String city;

         Person()
            {
              this.date=17;
              this.month=12;
              this.year=2003;
              this.height=169;
              this.weight=52;
              this.city="nandani";
             }
          int calage()
           {
             int current_year=2024;
             int age=current_year-year;
             return age;
            }

}

class Employee extends Person{
    int EmpId;
    float salary;
   
      Employee(int EmpId,float salary)
     {
       this.EmpId=EmpId;
       this.salary=salary;
      }
    double caltax()
     {
     double tax=salary*0.05;
      return salary-tax;
      }
}

class Student extends Person
{
   int rollno;
   int phy,chem,math;
  
    Student(int rollno,int phy,int chem,int math)
    {
       this.rollno=rollno;
       this.phy=phy;
       this.chem=chem;
       this.math=math;   
     }
  float calavg()
     {
      float avg=(phy+chem+math)/3;
      return avg;
     }
    public static void main(String args[])
      {
        Employee em = new Employee(50,500000);
        Student st =new Student(3,50,60,70);
        System.out.println("Date of birth:"+em.date+" "+em.month+" "+em.year);
               System.out.println("age:"+em.calage());
                   System.out.println("Height:"+em.height );
                  System.out.println("Weight:"+em.height);
                  System.out.println("City:"+em.city);
                  System.out.println("Employee Id:"+em.EmpId);
                  System.out.println("Salary:"+em.salary);

                  System.out.println("Tax:"+em.caltax());
                  System.out.println("Rollno:"+st.rollno);
                  System.out.println("Average:"+st.calavg());
}
}


