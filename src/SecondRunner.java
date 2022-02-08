import java.util.ArrayList;
import java.util.Arrays;

public class SecondRunner
{
    public static void main(String[] args)
    {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        System.out.println("I'm making a change here!");
        System.out.println("Hello World!");
    }
}
