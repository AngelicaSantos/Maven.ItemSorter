package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;


/**
 * @author leon on 30/01/2019.
 */

//parameterized means you will be adding a type value into the diamond
// hit control I to bring up pop-up of what you want to implement

public class IdComparator implements Comparator<Item> {
    public int compare(Item o1, Item o2) {
        //compare the two id's
        return Long.compare(o1.getId(),o2.getId());
    }

}
