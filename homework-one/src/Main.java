public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Manager("Семен", 30, true, "Томь", "Manager", 100000, 4);
        employees[1] = new SaleManager("Глеб", 25, false, "Томь", "Sale Manager", 80000, 500000, 10);
        employees[2] = new WageEmployee("Вася", 28, false, "Томь", "Wage Employee", 50000, 160, 50);
        employees[3] = new Manager("Петя", 45, true, "Томь", "Manager", 120000, 5);
        employees[4] = new SaleManager("Анна", 35, true, "Томь", "Sale Manager", 85000, 600000, 12);
        employees[5] = new WageEmployee("Лена", 40, true, "Томь", "Wage Employee", 60000, 180, 55);
        employees[6] = new Manager("Иван", 50, true, "Томь", "Manager", 110000, 3);
        employees[7] = new SaleManager("Катя", 32, true, "Томь", "Sale Manager", 90000, 700000, 15);
        employees[8] = new WageEmployee("Илья", 29, false, "Томь", "Wage Employee", 52000, 150, 45);
        employees[9] = new Manager("Семен", 38, true, "Томь", "Manager", 105000, 6);

        PersonApp.displayAllEmployees(employees);
        System.out.println("Total Expenses: " + PersonApp.calculateTotalExpenses(employees));

        SaleManager[] salesManagers = {
                (SaleManager) employees[1],
                (SaleManager) employees[4],
                (SaleManager) employees[7]
        };
        System.out.println("Итого: " + PersonApp.calculateTotalIncome(salesManagers));

        Employee target = new Manager("Семен", 30, true, "Томь", "Manager", 100000, 4);
        System.out.println("Итого сотрудников: " + PersonApp.findEmployee(employees, target));
    }
    }
