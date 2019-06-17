package rocks.zipcode.io.Pricesorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {
    @Test
    public void test1() {
        // given
        Item item3 = new Item(0L, "Apple", 5.3);
        Item item2 = new Item(1L, "Banana", 18.9);
        Item item1 = new Item(2L, "Cherry", 0.03);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item3, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Item item3 = new Item(3L, "Apple", 1.0);
        Item item2 = new Item(4L, "Banana", 1.5);
        Item item1 = new Item(5L, "Cherry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Item item3 = new Item(10L, "Apple", -5.0);
        Item item2 = new Item(15L, "Banana", -1.5);
        Item item1 = new Item(16L, "Cherry", -6.2);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item3, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        // given
        Item item3 = new Item(10L, "Apple", Double.NaN);
        Item item2 = new Item(15L, "Banana", -1.5);
        Item item1 = new Item(16L, "Cherry", -6.2);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

}
