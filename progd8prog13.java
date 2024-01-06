//PRIVATE PUBLIC THROUGH FOR LOOP
import java.util.Scanner;
class Trainer
{
private int tid;
private String tname;
private String tcourse;
private double tfees;
public void setTid(int tid)
{
this.tid=tid;
}
public void setTname(String tname)
{
this.tname=tname;
}
public void setTcourse(String tcourse)
{
this.tcourse=tcourse;
}
public void setTfees(double tfees)
{
this.tfees=tfees;
}
public int getTid()
{
return this.tid;
}
public String getTname()
{
return this.tname;
}
public String getTcourse()
{
return this.tcourse;
}
public double getTfees()
{
return this.tfees;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer(String tname)
{
this.tname=tname;
}
public Trainer()
{
this.tid=0;
this.tname=" ";
this.tcourse=" ";
this.tfees=0;
}
}
class Test2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
Trainer []ob=new Trainer[5];
for(int i=0;i<5;i++)
{
ob[i]=new Trainer();
ob[i].setTid(scob.nextInt());
ob[i].setTname(scob.next());
ob[i].setTcourse(scob.next());
ob[i].setTfees(scob.nextDouble());
}
for(int j=0;j<5;j++)
{
System.out.println("ID:"+ob[j].getTid());
System.out.println("NAME:"+ob[j].getTname());
System.out.println("COURSE:"+ob[j].getTcourse());
System.out.println("FEES:"+ob[j].getTfees());
}
}
}


