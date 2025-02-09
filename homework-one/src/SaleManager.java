public class SaleManager extends Employee{
    double totalSales;
    private double bonus;

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Bonus: " + bonus);
    }

    public double calculateSalary() {
        return baseSalary + (totalSales * (bonus / 100));
    }
}
