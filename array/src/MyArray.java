/**
 * This program demonstrates a self-defined Array class.
 */
public class MyArray {
    // define an array
    private int[] intArray;
    // define the actual length of an array
    private int elems;
    // define the capacity of an array
    private int length;

    /**
     * Constructs an array that length is 50 by default.
     */
    public MyArray() {
        this.elems = 0;
        this.length = 50;
        this.intArray = new int[this.length];
    }

    /**
     * Constructs an array
     *
     * @param length the capacity of an array
     */
    public MyArray(int length) {
        this.elems = 0;
        this.length = length;
        this.intArray = new int[length];
    }

    /**
     * Gets the actual length of an array.
     *
     * @return the actual length of an array
     */
    public int getSize() {
        return elems;
    }

    /**
     * Traverses elements in an array.
     */
    public void traverseArray() {
        for (int i = 0; i < elems; i++) {
            if (i == 0) {
                System.out.print("[ " + intArray[i] + ", ");
            } else if (i == elems - 1) {
                System.out.print(intArray[i] + " ]");
                System.out.println();
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
    }

    /**
     * Adds new elements to an array.
     * Assuming that the operator will not add duplicate elements.
     * If there are duplicate elements, it will affect the subsequent operations.
     *
     * @param value new element
     * @return added successfully returns true, and added elements exceed the scope to return false
     */
    public boolean add(int value) {
        if (elems == length) {
            return false;
        } else {
            intArray[elems++] = value;
        }
        return true;
    }

    /**
     * Obtains elements based on index.
     *
     * @param index the index of the element
     * @return the element
     */
    public int get(int index) {
        if ((index < 0) || (index >= elems)) {
            System.out.println("The index visited is out of bounds!");
        }
        return intArray[index];
    }

    /**
     * Finds elements based on value.
     *
     * @param targetValue the value of the element
     * @return the index
     */
    public int find(int targetValue) {
        int index;
        for (index = 0; index < elems; index++) {
            if (intArray[index] == targetValue) {
                break;
            }
        }
        if (index == elems) {
            return -1;
        }
        return index;
    }

    /**
     * Deletes elements based on value.
     *
     * @param value the value of the element
     * @return if the value to be deleted does not exist, return false; otherwise return true and delete the element
     */
    public boolean delete(int value) {
        int index = find(value);
        if (index == -1) {
            return false;
        } else {
            if (index == elems - 1) {
                elems--;
            } else {
                for (int i = index; i < elems - 1; i++) {
                    intArray[i] = intArray[i + 1];
                }
                elems--;
            }
            return true;
        }
    }

    /**
     * Changes elements from old value to new value.
     *
     * @param oldValue old value
     * @param newValue new value
     * @return if the value to be modified does not exist, return false; otherwise return true and modify the element
     */
    public boolean modify(int oldValue, int newValue) {
        int index = find(oldValue);
        if (index == -1) {
            System.out.println("Data that needs to be modified does not exist!");
            return false;
        } else {
            intArray[index] = newValue;
            return true;
        }
    }
}
