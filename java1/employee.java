

public class employee {
    String name;
    int id;
    double salary;
    String address;
    int age;
        public employee(String name, int id, double salary,String address,int age){
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.address = address;
            this.age=age;
        }
        public void displayInfo(){

            System.out.println("Employee ID :" +id);
            System.out.println("Employee Name :" +name);
            System.out.println("Salary: $" + salary);
            System.out.println("Address :" +address);
            System.out.println("Age :" +age);
        }
        public static void main(String[] args){
            employee emp1 = new employee("john",1234,2000,"Hubbali",10);
            emp1.displayInfo();
        }
    }