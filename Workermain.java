package LAB5;

abstract class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public abstract double computePay(int units);
}


class DailyWorker extends Worker {
    public DailyWorker(String name, double dailyRate) {
        super(name, dailyRate);
    }

    @Override
    public double computePay(int daysWorked) {
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double weeklySalary) {
        super(name, weeklySalary);
    }

    @Override
    public double computePay(int weeksWorked) {
        return weeksWorked * salaryRate;
    }
}

public class Workermain {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Ramesh", 100);   
        Worker salariedWorker = new SalariedWorker("Mukesh", 10000); 

        int daysWorked = 5;  
        int weeksWorked = 1; 

        System.out.println(dailyWorker.name + "'s weekly pay: ₹" + dailyWorker.computePay(daysWorked));
        System.out.println(salariedWorker.name + "'s weekly pay: ₹" + salariedWorker.computePay(weeksWorked));
    }
}