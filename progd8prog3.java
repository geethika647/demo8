// JAVA STATIC METHOD
//ONLY STATIC METHOD CAN ACESS THE STATIC VARIABLE AND CAN MAKE CHANGES
class Student8
{
int rollno;
String name;
static String college="MTIE";
static void change()
{
college="MTIET";
}
Student8(int i,String n)
{
rollno=i;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
Student8 s1=new Student8(111,"karan");
Student8 s2=new Student8(222,"aryan");
s1.display();
s2.display();
Student8.change();
Student8 s3=new Student8(333,"tom");
s1.display();
s2.display();
s3.display();
}
}
