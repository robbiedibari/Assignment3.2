public class Person {
    private String name;

    public Person(){
        this.name = name;
    }

    public Person (Person otherPerson){
        if(otherPerson == null) {
            System.out.println("invalid name");
        } else{
            this.name = otherPerson.name;

        }
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        if(name == null){
            System.out.println("invalid name");
            System.exit(0);
        }
        this.name = name;
    }
    public String toString(){
        return getName() ;
    }

    public boolean equals(Person otherPerson){
        return name.equals(otherPerson.getName());
    }

}
