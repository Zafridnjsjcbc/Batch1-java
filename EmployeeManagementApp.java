public class EmployeeManagementApp
{
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", 50000.0);
        Manager manager = new Manager(2, "Robin", 80000.0, 10000.0);

        System.out.println("Employee ID:" + employee.getId());
        System.out.println("Employee Name" + employee.getName());

        System.out.println(""+manager.getName());
        System.out.println("Manager Salary:"+ manager.calculateTotalSalary());
    }
}

class Employee
{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}

class Manager extends Employee
{
    private double bonus;
    public Manager(int id, String name, double salary,double bonus)
    {
        super(id, name, salary); // to invoke the constructor of its superclass
        this.bonus=bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double calculateTotalSalary()
    {
        return getSalary()+bonus;
    }
}


