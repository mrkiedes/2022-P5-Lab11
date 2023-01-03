public class Temp {

    public static void main(String args[]){

        int array[] = new int[10];

        // Display all values in an array
        System.out.println("Values before the change.");
        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }

        // Example on changing all values to 10 in an array
        for(int k = 0; k < array.length; k++) {
            array[k] = 10;
        }
        System.out.println("Values after the change.");
        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
}
