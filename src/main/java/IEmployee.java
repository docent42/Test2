public interface IEmployee
{
    default boolean addEmployee(Employee employee)
    {

        return false;
    }
}
