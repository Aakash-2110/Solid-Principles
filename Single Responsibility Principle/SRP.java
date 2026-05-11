class Employee
{
    private String name;
    private int salary;
    public String getname()
    {
        return name; 
    }
    public int getsalary()
    {
        return salary;
    }
    Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }
}
class GenerateReport{
    public void generate(Employee emp)
    {
        System.out.println("Generating report for " + emp.getname());
    }
}
class SalaryCalcualtion{
    public void calculate(Employee emp)
    {
        System.out.println("Salary of "+ emp.getname() + " is " + emp.getsalary() * 0.2);
    }
}
class SRP{
    public static void main(String[] args)
    {
        Employee emp = new Employee("John",100000);
        GenerateReport gr = new GenerateReport();
        SalaryCalcualtion sc = new SalaryCalcualtion();
        gr.generate(emp);
        sc.calculate(emp);
    }
}