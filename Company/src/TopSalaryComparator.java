import employees.Member;

import java.util.Comparator;

public class TopSalaryComparator implements Comparator<Member>
{
    @Override
    public int compare(Member o1, Member o2)
    {
        return (int) (o2.salary - o1.salary);
    }
}
