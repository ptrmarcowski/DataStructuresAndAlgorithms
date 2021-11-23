package Lists;

public class EmployeeNodeDoubly {

    private Employee employee;
    private EmployeeNodeDoubly next;
    private EmployeeNodeDoubly previous;

    public EmployeeNodeDoubly(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeDoubly getNext() {
        return next;
    }

    public void setNext(EmployeeNodeDoubly next) {
        this.next = next;
    }

    public EmployeeNodeDoubly getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNodeDoubly previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
