public class Staff extends Employee{
    String title;
    public Staff(String title,String office,double salary,String name,String address,String phonenumber,String emailaddress){
        super(office, salary, name, address, phonenumber, emailaddress);
        this.title=title;
    }

    @Override
    public String toString() {
        return "Staff"+"\t"+name;
    }
}
