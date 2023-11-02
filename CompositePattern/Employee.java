package CompositePattern;

public interface Employee {

    Employee getChild(int i);

    int getId();

    public int getID();

    public String getName();

    public double getSalary();

    public void Print();

    public void add(Employee employee);

    void print();

    public void remove(Employee employee);

    public Employee getInstance(int i);

}
