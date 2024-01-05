//PRIVATE PUBLIC THROUGH FOR LOOP
import java.util.Scanner;
class Employe
{
private int eid;
private String name;
private String department;
public void setEid(int eid)
{
this.eid=eid;
}
public void setName(String name)
{
this.name=name;
}
public void setDepartment(String department)
{
this.department=department;
}
public   int getEid()
{
return  this.eid;
}
public   String getName()
{
return this.name;
}
public String getDepartment()
{
return this.department;
}
}
class Testarray2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
Employe[] eob=new Employe[3];
for(int i=0;i<3;i++)
{
eob[i]=new Employe();
eob[i].setEid(scob.nextInt());
eob[i].setName(scob.next());
eob[i].setDepartment(scob.next());
}
System.out.println("Details are:\n");
for(int j=0;j<3;j++)
{
System.out.println("EID:"+eob[j].getEid());
System.out.println("Name:"+eob[j].getName());
System.out.println("Department:"+eob[j].getDepartment());
}
}
}
