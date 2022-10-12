class Employee
{
int empno;
String name;
String designation;
float Salary;
void setdata(int eno,String n, String d,float Sal)
{
empno=eno;
name=n;
designation=d;
Salary=Sal;
}
void getdata()
{
System.out.println("Employee No:"+empno);
System.out.println("Employee Name:"+name);
System.out.println("designation:"+designation);
System.out.println("Salary:"+Salary);
}
}
class Empdemo
{
public static void main(String args[])
{
Employee e=new Employee();
e.setdata(15 ,"Priyanka", "Administrator", 30000);
System.out.println("Employee information is:");
e.getdata();
}
}