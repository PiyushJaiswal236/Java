package oct_3;

public class StaffDemo {
    public static void main(String[] args) {
        OfficeStaff staff1 = new OfficeStaff(1, "Jay", "IT");
        OfficeStaff staff2 = new OfficeStaff(2, "Vijay", "IT");
        staff1.display();
        staff2.display();
    }
}
//Define an abstract class Staff with protected members id and name. Define a parameterized constructor.
// Define one subclass OfficeStaff with member department. Create n objects of OfficeStaff and display all details.
abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void display();
}

class OfficeStaff extends Staff {
    protected String Department;

    OfficeStaff(int id, String name, String department){
        super(id, name);
        this.Department = department;
    }

    public void display ()
    {
        System.out.println("Office Staff Details");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Department : "+Department);
    }
}