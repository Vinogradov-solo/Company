import employees.Member;

import java.util.Comparator;

public class LowSalaryComparator implements Comparator<Member>
{
    @Override
    public int compare(Member o1, Member o2)
    {
        return (int) (o1.salary - o2.salary);
    }
}
