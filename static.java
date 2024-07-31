class mobile
{
String brand;
int price;
static String name; 

void show()
{
System.out.println("brand:"+brand);
System.out.println("price:"+price);
System.out.println("name:"+name);
}
}
class Static
{
public static void main(String args[])
  {
   mobile m1=new mobile();
   mobile m2=new mobile();
   m1.brand="apple";
   m1.price=100000;
   m1.name="iphone";   
   m2.brand="samsung";
   m2.price=75000;
   m2.name="android";
   
  
 m1.show();
 m2.show();
}
}

   