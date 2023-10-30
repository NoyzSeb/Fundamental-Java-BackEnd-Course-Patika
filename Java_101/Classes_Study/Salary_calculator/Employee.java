package Java_101.Classes_Study.Salary_calculator;

public class Employee {
    String name,surName;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,String surName,int salary,int workHours, int hireYear){
        this.name=name;
        this.surName=surName;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){
        int firstSalary=this.salary;
        raiseSalary();
        bonus();
        if(this.salary>=1000){
            this.salary*=0.97;
        }
        System.out.println("Tax\t:"+ (firstSalary-this.salary));

    }

    void bonus(){
        int firstSalary=this.salary;
        if(this.workHours>40){
            this.salary+= (this.workHours - 40)*30;
        }
        System.out.println("Bonus\t:"+ (this.salary-firstSalary));
    }

    void raiseSalary(){
        int firstSalary=this.salary;
        int year=2021-this.hireYear;
        if(year<10){
            this.salary*=1.05;
        }else if(year<20){
            this.salary*=1.10;
        }else{
            this.salary*=1.15;
        }
        System.out.println("Salary Raise\t:"+(this.salary-firstSalary));
    }
    
    void ToString(){
       
       System.out.println("Name\t:" + this.name
       +"\n"+"SurName\t:" + this.surName
       +"\n"+"Salary\t:" + this.salary
       +"\n"+"WorkHours\t:" + this.workHours
       +"\n"+"HireYear\t:" + this.hireYear);
       
       tax();

       

    }

}
