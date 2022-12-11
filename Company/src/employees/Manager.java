package employees;

public class Manager extends Member
{
    public Double incomeCompany = Math.random() * (140000. - 115000) + 115000.;

    @Override
    public String toString()
    {
        String formattedDouble = String.format("%.2f", salary);
        return "Manager: " + formattedDouble;
    }

    @Override
    public Double getMonthSalary()
    {
        oklad = 60000.;
        salary = oklad + incomeCompany * 0.1;

        return salary;
    }
}
