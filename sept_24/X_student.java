package sept_24;

class Student {
    String id;
    String name;
    Student(String id , String name){
        this.id=id;
        this.name=name;
    }
    void diaplay(){
        System.out.println("Info from stud");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}
public class  X_student extends  Student{
    String cname;
    int salary;
    X_student(String id, String name,String cname,int salary) {
        super(id, name);
        this.cname=cname;
        this.salary=salary;
    }

    public static void main(String args[]){
        X_student xStudent = new X_student("AS145","Jay","TCS",50000);
        xStudent.show();
    }

    void show(){
        System.out.println("Info from X_stud");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Company : "+cname);
        System.out.println("Salary: "+salary);
    }

}
