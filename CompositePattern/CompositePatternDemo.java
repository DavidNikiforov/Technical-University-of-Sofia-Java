package CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee emp1 = new Cashier(101, "Sohan Kumar", 20000.00);
        Employee emp2 = new Cashier(102, "Mohan Kumar", 20000.00);
        Employee emp3 = new Accountant(103, "Seema Mahiwal", 30000.00);
        Employee manager1 = new BankManager(100, "Sohan Kumar", 100000.00);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);

        manager1.print();
    }
}
