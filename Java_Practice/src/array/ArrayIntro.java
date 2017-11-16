package array;

/**
 * Created by lalit on 2/8/17.
 */
public class ArrayIntro {
    public static void main(String[] args) {
        ArrayIntro ai = new ArrayIntro();
        ai.calcArray();
    }

    public void calcArray() {
        int[] intArray = new int[3];
        String name[] = new String[3];
        String add[] = new String[3];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        name[0]= "Lalit";
        name[1]= "Harish";
        name[2]= "Manoj";
        add[0]= "Kathmandu";
        add[1]= "Pokhara";
        add[2]= "Chitwan";
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            System.out.println(name[i]);
            System.out.println(add[i]);
        }
    }
}
