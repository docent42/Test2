import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

class Department implements IEmployee
{
    Department()
    {
        staff.add(new Employee("420117","Иванов","Николай","Иванович","плотник"));
        staff.add(new Employee("420118","Иванов","Иван","Иванович","сварщик"));
        staff.add(new Employee("420119","Иванов","Олег","Петрович","плотник"));
        staff.add(new Employee("420121","Петров","Иван","Сидорович","плотник"));
        staff.add(new Employee("420123","Иванов","Иван","Петрович","дворник"));

    }
    List<Employee> listEmp()
    {
        return staff;
    }

}
