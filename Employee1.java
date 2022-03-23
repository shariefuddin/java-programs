import java.util.*;
class Employee{
    int eid;
    String ename;
    String edept;
    int esal;
    String eaddr;
    Employee(int id,String name,String dept,int sal,String add)
    {
        eid=id;
        ename=name;
        edept=dept;
        esal=sal;
        eaddr=add;
    }
    void totalSal(){
        int grosssal,HRA,DA;
        if (esal>=10000 && esal<=20000){
            HRA=(esal*20)/100;
            DA=(esal*45)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else if (esal>20000 && esal<=40000){
            HRA=(esal*25)/100;
            DA=(esal*20)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else {
            HRA=(esal*30)/100;
            DA=(esal*30)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        } 
    }
    Employee()
    {
        
    }
    Employee(int id)
    {
        eid=id;
    }
}
class Employee1{
    public static void main(String args[]){
        Employee emp1= new Employee(3590,"sharief","mechanical",25000,"eluru");
       
        System.out.println("Datails of EMP 1");
        System.out.println(emp1.eid+" "+emp1.ename+" "+emp1.edept+" "+emp1.eaddr+" "+emp1.esal);
        emp1.totalSal();
        
        Employee emp2= new Employee(5460);
        
        System.out.println("Details of EMP 2");
        System.out.println(emp2.eid+" "+emp2.ename+" "+emp2.edept+" "+emp2.eaddr+" "+emp2.esal);
        emp2.totalSal();
    }
}