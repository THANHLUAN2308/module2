public class Programer extends Employee {
    int bonus = 10000;
    public static void main(String args[]) {
        Programer p = new Programer();
        System.out.println("Luong Lap trinh vien la:" + p.salary);
        System.out.println("Bonus cua Lap trinh vien la:" + p.bonus);
    }
}
