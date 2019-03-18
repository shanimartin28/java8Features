/**
 * Method references help to point to methods by their names.
 * A method reference is described using "::" symbol
 * A method reference can be used to point the following types of methods −
 *
 * Static methods
 * Instance methods
 * Constructors using new operator (TreeSet::new)
 */

import java.util.List;
import java.util.ArrayList;

public class Java8MethodReferences {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List names = new ArrayList();

        names.add("B");
        names.add("Be");
        names.add("Bes");
        names.add("Best");
        names.add("Bestseller");

        names.forEach(System.out::println);

    }

}
