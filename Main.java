public class Main {
    public static void main(String[] args) {
        Account a=new Account(1122,20000);
        a.setAnnualIntersetRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterset());
        System.out.println(a.getDateCreated());
    }
}