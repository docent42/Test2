
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeTest extends Assert
{
    private static Department marketing = new Department();

    @Before
    public void setUp() {

    }
    @Test
    public void addNewEmpFalse()
    {
       Employee testEmp = new Employee("420119","Иванов","Иван","Иванович","наладчик");
       boolean actual = marketing.addNewEmp(testEmp);
       boolean expected = false;
       assertEquals(expected,actual);
    }
    @Test
    public void addNewEmpTrue()
    {
        Employee testEmp = new Employee("421546","Сидоров","Сидор","Сидорович","электрик");
        boolean actual = marketing.addNewEmp(testEmp);
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    public void deleteEmp()
    {
        marketing.deleteEmp("421546");
        boolean actual = marketing.listEmp()
                .stream()
                .anyMatch(employee -> employee.getId().equals("421546"));
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    public void listEmpsBySurname()
    {
        List<Employee> expList = new ArrayList<>();
        List<Employee> actList = marketing.listEmpsBySurname("Иванов");

        expList.add(new Employee("420118","Иванов","Иван","Иванович","сварщик"));
        //expList.get(0).setFio(expList.get(0).getFio() + expList.get(0).getPosition());
        expList.add(new Employee("420123","Иванов","Иван","Петрович","дворник"));
        //expList.get(1).setFio(expList.get(1).getFio() + expList.get(1).getPosition());
        expList.add(new Employee("420117","Иванов","Николай","Иванович","плотник"));
        expList.add(new Employee("420119","Иванов","Олег","Петрович","плотник"));

        assertEquals(expList,actList);
    }
    @Test
    public void listEmpsByPosition()
    {
        List<Employee> expList = new ArrayList<>();
        List<Employee> actList = marketing.listEmpsByPosition("плотник");

        expList.add(new Employee("420117","Иванов","Николай","Иванович","плотник"));
        expList.add(new Employee("420119","Иванов","Олег","Петрович","плотник"));
        expList.add(new Employee("420121","Петров","Иван","Сидорович","плотник"));

        assertEquals(expList,actList);
    }
}
