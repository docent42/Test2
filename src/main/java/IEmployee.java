import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface IEmployee
{
    ArrayList<Employee> staff = new ArrayList<>();

    default boolean addNewEmp(Employee employee)
    {
        boolean flag = staff.stream().anyMatch(existEmployee -> existEmployee.toString().equals(employee.toString()));
        if (flag)
            return false;
        else {
                staff.add(employee);
                return true;
            }
    }

    default List<Employee> listEmpsBySurname(String surname)
    {
        return staff
                .stream()
                .filter(employee -> employee.getSurName().equals(surname))
                .limit(10)
                .collect(Collectors
                        .groupingBy(employee -> employee.getFirstName() + employee.getSurName()))
                .values().stream()
                .peek(list -> {
                    if (list.size() > 1)
                        list.forEach(employee -> employee.setFio(employee.toString()  + employee.getPosition()));
                })
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    default List<Employee> listEmpsByPosition (String position)
    {
        return staff.stream()
                .filter(employee -> employee.getPosition().equals(position))
                .sorted()
                .limit(10)
                .collect(Collectors.toList());
    }
    default void deleteEmp(String id)
    {
        for (int i = 0;i < staff.size();i++)
            if (staff.get(i).getId().equals(id))
            {
                staff.remove(i);
                break;
            }
    }

}
