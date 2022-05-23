import java.util.*;

public class PersonMain {
    public static void printPersons(ArrayList<Person> persons){
        for(Person person: persons){
            System.out.println(person + " \n");
        }
    }
    public static void main(String[] args){

    //Part 1    
    Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
    Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
    
    System.out.println(ada);
    System.out.println(esko);

    //Part 2
    /*Method using inherited toString Method using superclass peron:*/
    Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(ollie);
    System.out.println("Study credits " + ollie.credits());
    ollie.study();
    System.out.println("Study credits " + ollie.credits());

    //Part 3
    Student olly = new Student("Olly", "6831 Hollywood Blvd. Los Angeles 90028");
    System.out.println(olly);
    olly.study();
    System.out.println(olly);

    //Part 4
    Teacher adda = new Teacher("Adda Lovelace", "24 Maddox St. London W1S 2QN", 1200);
    Teacher eskko = new Teacher("Eskko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
    System.out.println(adda);
    System.out.println(eskko);

    Student ozzie = new Student("Ozzie", "6831 Hollywood Blvd. Los Angeles 90028");
    int i = 0;
    while (i < 25) {
    ozzie.study();
    i = i + 1;
    }
    System.out.println(ozzie);

    //Part 5
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Teacher("Hector Gonzalez", "2230 Morehead St. Charlotte, NC 28204", 8200));
    persons.add(new Student("Tahirah Farrer-Bradley", "1500 Noneya Lane, Charlotte, NC 28216"));

    printPersons(persons);

    
}
}
