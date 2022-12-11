import employees.Manager;
import employees.Member;
import employees.Operator;
import employees.TopManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company
{
    long amountIncome = 0;
    Manager manager;
    Operator operator;
    TopManager topManager;

    public void hire(ArrayList<Member> list, Member member)
    {
        member.getMonthSalary();
        list.add(member);
        if (member instanceof Manager) amountIncome += ((Manager) member).incomeCompany;
    }

    public void hireAll(ArrayList<Member> list, Member member, int amount)
    {
        for (int i = 0; i < amount; i++)
        {
            if (member instanceof Manager)
            {
                member = new Manager();
                member.getMonthSalary();
                list.add(member);
                amountIncome += ((Manager) member).incomeCompany;
            }
            else if (member instanceof TopManager)
            {
                member = new TopManager();
                member.getMonthSalary();
                if (amountIncome > 10000000)
                {
                    ((TopManager) member).bonus = ((TopManager) member).oklad * 2.5;
                    ((TopManager) member).salary = ((TopManager) member).oklad + ((TopManager) member).bonus;
                }
                list.add(member);
            }
            else
            {
                member = new Operator();
                member.getMonthSalary();
                list.add(member);
            }
        }
    }

    public void fire(ArrayList<Member> list, int amount)
    {
        for (int i = 0; i < amount; i++)
        {
            list.remove(list.get(i));
        }
    }

    public void getTopSalaryStaff(int count, ArrayList<Member> list)
    {
        Collections.sort(list, new TopSalaryComparator());
        ArrayList<Member> topSalarys = new ArrayList<>();
        System.out.println("\nHere is " + count + " top salary Staff: \n");
        for (int i = 0; i < count; i++)
        {
            topSalarys.add(list.get(i));
        }
        for (int i = 0; i < count; i++)
        {
            System.out.println(topSalarys.get(i));
        }
    }

    public void getLowestSalaryStaff(int count, ArrayList<Member> list)
    {
        Collections.sort(list, new LowSalaryComparator());
        ArrayList<Member> lowSalarys = new ArrayList<>();
        System.out.println("\nHere is " + count + " lowest salary Staff: \n");
        for (int i = 0; i < count; i++)
        {
            lowSalarys.add(list.get(i));
        }
        for (int i = 0; i < count; i++)
        {
            System.out.println(lowSalarys.get(i));
        }
    }

    public long getIncome()
    {
        return amountIncome;
    }
}
