package hm_for_lesson_6;

public class RubberArray {
    private int[] array;

    public RubberArray() {
        array = new int[0];
    }

    public void add(int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
    }
    // * add(int index, int value)
    public void add(int index,int value){
        int[] newArray = new int[array.length +1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        array = newArray;

    }
// * addAll(int... values)
    public void addAll(int values[]){
        int[] newArray = new int[array.length + values.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(values, 0, newArray, array.length , values.length);
        array = newArray;
    }




    public int get(int index) {
        return array[index];
    }

    public void remove(int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
