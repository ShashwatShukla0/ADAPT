package assignment.two;

import java.util.*;
class employee {
  public int getSalary(int salary){
    salary = 0;
    return salary;
  }
}
class Manager extends employee {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        salary += incentive;
        return salary;
    }
}

class Labour extends employee {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        salary += overtime;
        return salary;
    }
}
class Assignment2Q2 {
  public static void main(String []args){
    Labour l1 = new Labour();
    Manager m1 = new Manager();
    System.out.print("Total salary: Rs."+(l1.getSalary(2000)+m1.getSalary(5000)));
  }

		

	}


