package employees;

public class Operator extends Member
{
    @Override
    public Double getMonthSalary()
    {
        oklad = 45000.;
        salary = oklad;
        return salary;
    }

    @Override
    public String toString()
    {
        String formattedDouble = String.format("%.2f", salary);
        return "Operator: " + formattedDouble;
    }
}
