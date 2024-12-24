
package fi.lab.animals;
/**
 * Leevi Mört 2207722
 */
/**
 *
 * @author koskioli
 */
public class ZooProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zoo zoo = new Zoo();
        zoo.print();
        // zoo.add(new Animal()); // Animal is abstract class --> cannot be instantiated
        Animal a = new Tiger("Teuvo", new Date(1,2,2000), 300, "siberian");
        Animal b =new Shark("Kullervo", new Date(4, 8, 1945), 600, "iso kala");
        zoo.add(a);
        zoo.add(b);
        a.move(); // polymorphistic call: Tiger.move()
        b.utter(); // polymorphistic call: Tiger.utter()
        zoo.add(new Shark());
        zoo.add(new Tiger());
        zoo.print();
        zoo.printSortedByAge();
        zoo.printSortedByName();
        String n = "Teuvo";
        a = zoo.remove(n);
        if(a != null)
            System.out.println("Removed by name '"+n+"': "+a);
        else
            System.out.println("No animal '"+n+"' found!");
        zoo.print();
    }
    
}
