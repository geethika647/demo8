//PRIVATE PUBLIC THROUGH FOR LOOP
import java.util.Scanner;
class Trainer
{
private int tid;
public void setTid(int tid)
{
this.tid=tid;
}
public int getTid()
{
return this.tid;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer()
{
this.tid=0;
}
}
class Test1
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter Teacher ID:");
int tidin=scob.nextInt();
Trainer sob=new Trainer(tidin);
System.out.println("tid:"+sob.getTid());
}
}

