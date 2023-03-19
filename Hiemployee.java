class employee
{
    public void ename(String name)
    {
        System.out.print(name);
    }
    public void eyear(int year)
    {
        System.out.print(year);
    }
    public void eadd(String add)
    {
        System.out.print(add);
    }
}

public class Hiemployee
{
    public static void main(String[] args)
    {
        System.out.print("Name\t");
        System.out.print("\tYear of joining\t");
        System.out.print("\t\tAddress\t");
        System.out.println();
        employee emp1=new employee();
        emp1.ename("Robert\t\t\t");
        emp1.eyear(1994);
        emp1.eadd("\t\t\t64C-WallsStreet");

        System.out.println();
        employee emp2=new employee();
        emp2.ename("Sam\t\t\t\t");
        emp2.eyear(2000);
        emp2.eadd("\t\t\t68D-WallsStreet");

        System.out.println();
        employee emp3=new employee();
        emp3.ename("John\t\t\t");
        emp3.eyear(1999);
        emp3.eadd("\t\t\t26B-WallsStreet");

    }
}