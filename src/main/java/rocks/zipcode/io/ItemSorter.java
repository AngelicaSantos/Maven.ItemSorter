package rocks.zipcode.io;

import com.sun.tools.javac.jvm.Items;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;


    //constructor that will pass value to our class
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items, comparator);
        return items;
    }
}
