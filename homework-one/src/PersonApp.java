public class PersonApp {
    public static void displayAllEmployees(Employee[] employees) {
        if (employees != null) {
            for (Employee e : employees) {
                if (e != null) {
                    e.display();
                    System.out.println();
                }
            }
        }
    }

    public static double calculateTotalExpenses(Employee[] employees) {
        double totalExpenses = 0;
        if (employees != null) {
            for (Employee e : employees) {
                if (e instanceof Manager) {
                    totalExpenses += ((Manager) e).calculateSalary();
                } else if (e instanceof SaleManager) {
                    totalExpenses += ((SaleManager) e).calculateSalary();
                } else if (e instanceof WageEmployee) {
                    totalExpenses += ((WageEmployee) e).calculateSalary();
                }
            }
        }
        return totalExpenses;
    }

    public static double calculateTotalIncome(SaleManager[] salesManagers) {
        double totalIncome = 0;
        if (salesManagers != null) {
            for (SaleManager sm : salesManagers) {
                if (sm != null) {
                    totalIncome += sm.totalSales;
                }
            }
        }
        return totalIncome;
    }
    public static boolean findEmployee(Employee[] employees, Employee target) {
        if (employees != null && target != null) {
            for (Employee e : employees) {
                if (e.equals(target)) {
                    return true;
                }
            }
        }
        return false;
    }
}
