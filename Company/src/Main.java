import employees.Manager;
import employees.Member;
import employees.Operator;
import employees.TopManager;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        /* Программа работает с вычислениями зарплат внутри компании.
        В ней можно:
        •	найм одного сотрудника — hire(),
        •	найм списка сотрудников – hireAll(),
        •	увольнение сотрудника – fire(),
        •	получение значения дохода компании – getIncome().

        Есть топ-менеджеры — зарплата складывается из фиксированной части и бонуса
        в виде 5% от заработанных для компании денег.
        Количество заработанных денег для компании генерируется случайным образом от 115 000 до 140 000 рублей.

        Менеджеры — зарплата складывается из фиксированной части и бонуса
        в виде 150% от заработной платы, если доход компании более 10 млн рублей.

        Операторы — зарплата складывается только из фиксированной части.
        */

        System.out.println("\nHello, this is my Company. Staff:\n180 Operators;\n80 Managers;\n10 TOP-Managers.");
        Company myCompany = new Company();
        ArrayList<Member> myEmployees = new ArrayList<>();

        myCompany.hireAll(myEmployees, new Operator(), 180);
        myCompany.hireAll(myEmployees, new Manager(), 80);
        myCompany.hireAll(myEmployees, new TopManager(), 10);

        myCompany.getTopSalaryStaff(10, myEmployees);
        myCompany.getLowestSalaryStaff(10, myEmployees);

        System.out.println("\nLet`s fire 50% of staff.\nNow let`s again watch of salary`s rating.");
        myCompany.fire(myEmployees, (myEmployees.size() / 2));

        myCompany.getTopSalaryStaff(10, myEmployees);
        myCompany.getLowestSalaryStaff(10, myEmployees);
    }
}
