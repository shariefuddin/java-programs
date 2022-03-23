import java.util.*;
class Student
{
int rollno;
String name;
String section;
int marks;
String address;
//constructor overloading
Student(int r,String n,String s,int m,String a)
{
rollno=r;
name=n;
section=s;
marks=m;
address=a;
}
Student()
{
}
Student(int r)
{
rollno=r;
}

void display()
{
System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"+address);
}
void reading()
{
System.out.println(name+" reading");
}
void writing()
{
    
System.out.println(name+" Writing");
}

}
class Student1
{
public static void main(String args[])
{
Student std1=new Student(123,"lalitha","A",90,"vijayawada");

System.out.println("Student 1 informatio");
std1.display();
std1.reading();
std1.writing();
Student std2=new Student(345);
System.out.println("Student 2 informatio");
std2.display();
std2.reading();
std2.writing();
Student std3=new Student();
System.out.println("Student 3 informatio");
std3.display();
std3.reading();
std3.writing();


}
}