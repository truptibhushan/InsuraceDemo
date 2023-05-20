class Person {
    String name;
    int age;
    String gender;
    String race;
    double height;
    double weight;

    public String eat (String foodtype){
        System.out.print ("Person is eating " + foodtype);
        return foodtype;
    }

public static void main(String args[]) {
    Person aPerson=new Person();
    Person bPerson=new Person();
    Person cPerson=new Person();
    aPerson.name="Trupti";
    bPerson.name="Caroline";
    cPerson.name="Olive";
    aPerson.age=34;
    bPerson.age=43;
    cPerson.age=1;
    aPerson.eat("Burger");
    
    
}
}