package employees;

public class TopManager extends Member
{
    public Double bonus;

    @Override
    public Double getMonthSalary()
    {
        oklad = 90000.;
        salary = oklad;
        return salary;
    }

    @Override
    public String toString()
    {
        String formattedDouble = String.format("%.2f", salary);
        return "TOP-Manager: " + formattedDouble;
    }
}
