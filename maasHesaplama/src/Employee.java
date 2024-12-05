public class Employee {
    String name;
    double salary;
    int workHour;
    int hireYear;

    Employee(String name , double salary, int workHour , int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax=0;
        if (this.salary<1000) {
            System.out.println("Verginiz yoktur.");
        }
        else if (this.salary>1000){
          tax= this.salary*0.03;
        }
        return tax;

    }

    double bonus() {
       int extraHour=0;
        if (this.workHour>40) {
            extraHour = this.workHour-40;

        }
        return extraHour*30;
    }

    double raiseSalary() {
       double raiseSalary=0;
       int year=2024-this.hireYear;
        if (year<10) {
            raiseSalary= this.salary*0.005;
        } else if (year>10 && year<20) {
            raiseSalary= this.salary*0.10;
        } else if (year>20) {
            raiseSalary= this.salary*0.15;
        }
             return raiseSalary;
    }

    void string() {



        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = this.salary - tax + bonus; // Vergi ve bonusla maaş
        double finalSalary = totalSalary + raise; // Zam dahil maaş

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHour);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş: " + totalSalary);
        System.out.println("Toplam Maaş: " + finalSalary);

    }





}




