class Student
{
int rollno;
String name;
String section;
int marks;
String address;

void reading()
{
System.out.println(name+" reading");
}
void writing()
{
System.out.println(name+" Writing");
}

}
class Main
{
public static void main(String args[])
{
Student std1=new Student();
std1.rollno=123;
std1.name="sharif";
std1.section="A";
std1.marks=75;
std1.address="vijayawada";

System.out.println("Student 1 informatio");
System.out.println(std1.rollno+std1.name+std1.section+std1.marks+std1.address);
std1.reading();
std1.writing();
Student std2=new Student();
std2.rollno=345;
std2.name="saikiran";
std2.section="b";
std2.marks=90;
std2.address="hyd";
System.out.println("Student 2 informatio");
System.out.println(std2.rollno+std2.name+std2.section+std2.marks+std2.address);
std2.reading();
std2.writing();


}
}