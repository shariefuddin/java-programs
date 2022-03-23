import java.util.*;
class Employee{
    int eid;
    String ename;
    String edept;
    int esal;
    String eaddr;
    Employee(int eid,String ename,String edept,int esal,String eaddr)
    {
       this.eid=eid;
       this.ename=ename;
       this.edept=edept;
        this.esal=esal;
       this.eaddr=eaddr;
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
    void working()
    {
        System.out.println("employee working");
    }
    void making()
    {
        this.working();
        System.out.println("employee making");
    }
    
}
class This{
    public static void main(String args[]){
        Employee emp1= new Employee(3590,"sharief","mechanical",25000,"eluru");
       
        System.out.println("Datails of EMP 1");
        System.out.println(emp1.eid+" "+emp1.ename+" "+emp1.edept+" "+emp1.eaddr+" "+emp1.esal);
        emp1.totalSal();
        emp1.making();
        
        Employee emp2= new Employee(4843,"hritha","production",25600,"eluru");
        
        System.out.println("Details of EMP 2");
        System.out.println(emp2.eid+" "+emp2.ename+" "+emp2.edept+" "+emp2.eaddr+" "+emp2.esal);
        emp2.totalSal();
        emp2.working();
    }
}