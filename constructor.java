import java.util.Scanner;

class employee{
  private String name;
 private int id;
  private double salary;
 employee(int E_id,String E_name,double E_salary)

{
 this.name=E_name;
 this.id=E_id;
 this.salary=E_salary;
}
 
void setName(String Name)
{
this.name=Name;
}
void setId(int Id)
{
this.id=Id;
}
void setsalary(double salary)
{
this.salary=salary;
}
String getName()
{
return name;
}
int getId()
{
return id;
}
double getSalary()
{
return salary;
}

void raisesalary()
{
this.salary=salary*1.10;
}
}
class constructor{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  String Emname;
  int Emid;
  double Emsalary;
  System.out.println("Enter your Data");
    System.out.println("Name: ");
    Emname=sc.next();
     System.out.println("Id: "); 
     Emid=sc.nextInt();
      System.out.println("salary: ");
      Emsalary=sc.nextDouble();
  employee em= new employee(Emid,Emname,Emsalary);
    System.out.println("Name:"+em.getName());
  System.out.println("Id:"+em.getId());
   System.out.println("salary:"+em.getSalary());

 em.raisesalary();
  System.out.println("Updated salary:"+em.getSalary());
  }
}
  
