public class Employee extends Person {
    public Date hireDate;


    public Employee() {
        this("no name", new Date());
    }


    public Employee (String name, Date hireDate){
        if(name == null || hireDate == null){
            System.out.println("Missing important informations");
            System.exit(0);
        } else {
           // this.name = OtherPerson.name;
            this.hireDate = new Date();
        }
    }
    public Employee (Employee otherEmployee){

    }
}
