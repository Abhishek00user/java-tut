import java.util.*;
class Employee{
    private int empId;
    private String empName;
    private double salary;
    private String department;

    public Employee(int empId, String empName, double salary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }
    public int getEmpId(){return empId;}
    public String getEmpName(){return empName;}
    public double getSalary(){return salary;}   
    public String getDepartment(){return department;}
}
public class solution {
    public static double findAverageSalary(Employee[] employees,String department){
        double sum = 0;
        int count = 0;
        for(Employee e : employees){
            if(e.getDepartment().equalsIgnoreCase(department)){
                sum += e.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : sum/count; // sum not used as salaries may exist but sum can be 0 
    }
    public static Employee[] findEmployeesWithSalaryAbove(Employee[] employees,double salary){
        List<Employee> ls = new ArrayList<>(); //careful here
        for(Employee e:employees){
            if(e.getSalary() > salary){
                ls.add(e);
            }
        }
        if(ls.size() ==  0) return null;
        Collections.sort(ls,(a,b)-> (int)(a.getSalary() - b.getSalary())); // sort by sal ascending
        return ls.toArray(new Employee[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] employees = new Employee[n]; // don't forget to intialize the array
        for(int i =0;i<n;i++){
            int b = sc.nextInt();
            sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            String e = sc.nextLine();
            employees[i] = new Employee(b,c,d,e); // careful here
        }
        String dept = sc.nextLine();
        double sal = sc.nextDouble();
        double avgSalary = findAverageSalary(employees,dept);
        if(avgSalary > 0){
            System.out.println(avgSalary);
        }
        else{
            System.out.println("no employees");
        }

        Employee[] res = findEmployeesWithSalaryAbove(employees, sal);
        if(res != null){
            for(Employee e : res){
                System.out.println(e.getEmpId());
            }
        }
        else{
            System.out.println("no employee with salary above average");
        }
        sc.close();
    }
}
