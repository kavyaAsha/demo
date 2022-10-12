class student
{
private int rollnumber;
protected void getnumber(int n)
{
rollnumber=n;
}
protected void putnumber()
{
System.out.println("ROLLNO:"rollnumber);
}
}
class test extends student
{
protected float marks,marks2;
protected void getmarks(float m1,float m2)
{
marks1=m1;
marks2=m2;
}
protected void marks()
{
System.out.println("marks obtained");
System.out.println("marks1:"+marks1);
System.out.println("marks2:"+marks2);
}
}
class result extends test
{
float total;
float display()
{
total=marks1+marks2;
putnumber();
putmarks();
System.out.println("total marks"=total);
}
}
class multilevel
{
public static void main(strings args[])
{
result syudent1=new result();
student1.getnumber(1234);
student1.getmarks(27.5f,33.0f);
student1.display();
}
}