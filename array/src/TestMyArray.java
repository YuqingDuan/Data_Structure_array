/**
 * This program demonstrates a test of MyArray class.
 */
public class TestMyArray {
    public static void main(String[] args) {
        // create a self encapsulated array structure with an array size of 4
        MyArray array = new MyArray(4);
        // add four elements 1, 2, 3 and 4 respectively
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        // traverse and print elements in an array
        array.traverseArray();

        // get element that index is 0
        int i = array.get(0);
        System.out.println("i: " + i);

        // delete element that value is 4
        array.delete(4);

        // change 3 to 33
        array.modify(3, 33);

        // reprint the array
        array.traverseArray();
    }
}
