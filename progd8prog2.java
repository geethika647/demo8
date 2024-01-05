//JAVA PROGRAM TO IILUSTRATE THE USE OF STATIC VARIABLE WHICH IS SHARED WITH ALL THE OBJECTS
class Counter
{
static int count=0;//will get memory only once and retain its value
Counter()
{
count++;//incrementing the value of static variable
System.out.println(count);
}
public static void main(String ags[])
//creatimg objects
{
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}
