package src;

/**
 * SoftServe
 Create class Fruit (field "name") which implements two interfaces: IJuiceable (method makeJuice()) and  ISliceable (method makeSlices()). When we call these methods for Fruit – it should return string “Juice from Name_of_Fruit” (or “Slices of Name_of_Fruit”). Class Fresh consists of two containers: Juices and Slices. By calling method addToJuices() (or addToSlices()) we may add new Fruit to these containers. By calling method makeFresh() we may produce all Freshes (Juices and Slices).

 Which hierarchy of classes is the best for solving this problem?
 Write short code to demonstrate your solution.
 Your code should include class (interface) aggregation or inheritance, should use collections or generics, should implement exception handling.


 #2

 Method machining(...) in Report class prints information about employee and sends email. Please refactor this code by extracting each task into separate method. Propose the other solutions for improving quality of the code.
 //public class App  implements IJuiceable, ISuiceable {
 //    String name;
 //    public List<App> juices = new ArrayList<App>();
 //    public List<App> slices = new ArrayList<App>();
 //
 //    public void makeJuice() {
 //        System.out.println("Juice from Name_of_Fruit");
 //    }
 //
 //    public void makeSlices() {
 //        System.out.println("Slices of Name_of_Fruit");
 //    }
 //
 //    public List<App> makeFresh() {
 //        List<App> result = new ArrayList<App>();
 //        for (int i = 0; i < juices.size(); i++) {
 //            result.add(juices.get(i));
 //        }
 //        for (int i = 0; i < slices.size(); i++) {
 //            result.add(slices.get(i));
 //        }
 //        return result;
 //    }
 //
 //
 //    class Juices {
 //
 //
 //        public void addToJuices(App fruit) {
 //            juices.add(fruit);
 //        }
 //    }
 //
 //    class Slices {
 //
 //
 //        public void addToSlices(App fruit) {
 //            slices.add(fruit);
 //        }
 //    }
 //}
 //interface IJuiceable {
 //    void makeJuice();
 //}
 //
 //interface ISuiceable {
 //    void makeSlices();
 //}
 **/

public class Main {
}
