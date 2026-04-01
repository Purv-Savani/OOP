class Employee
{
    String name="Rahul";
    String department="IT";

    void displayDetails()
    {
        System.out.println("Name="+name);
        System.out.println("Department="+department);
    }
}

class Manager extends Employee
{
    int teamSize=5;

    void displayDetails()
    {
        System.out.println("Name="+name);
        System.out.println("Department="+department);
        System.out.println("Team Size="+teamSize);
    }
}

class Main
{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.displayDetails();

        Employee m=new Manager();
        m.displayDetails();
    }
  }
