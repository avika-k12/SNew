import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){
        //Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        //Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Kiwi");

        names.add("Chandler");
        names.add("Joey");
        names.add("Monica");
        names.add("Phoebe");
        names.add("Rachel");
        names.add("Ross");


        //Access elements from the ArrayList
        System.out.println("First fruit: " + fruits.get(0));

        System.out.println("Third friend: " + names.get(2));

        System.out.println();

        //Remove an element from the ArrayList
        fruits.remove("Banana");

        names.remove("Ross");



        //Remove an element by index
        fruits.remove(1);

        names.remove(1);



        //Iterate through the ArrayList
        System.out.println("Fruits in the list: ");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("Friends : ");
        for (String name : names){
            System.out.println(name);
        }

        System.out.println();


        //Check if the ArrayList contains a specific element
        if (fruits.contains("Orange")) {
            System.out.println("The list contains Orange.");
        } else {
            System.out.println("The list does not contain Orange");
        }

        if(names.contains("Gunther")) {
            System.out.println("Gunther is a friend!");
        } else {
            System.out.println("Gunther is not a friend!");
        }

        System.out.println();

        //Get the size of the ArrayList
        System.out.println("Number of fruits in the list: " + fruits.size());

        System.out.println("Number of friends in the list: " + names.size());

        System.out.println();

    }
}
