public class Main {
    public static void main (String[]args){
        int maxValue = 0;
        int indexOfValueMax = 0;
        int [] array  = {7, 58, 16, 55, 10};
        for (int i=0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                indexOfValueMax = i;
            }
        }
        System.out.println("Индекс наибольшего элемента:" + +indexOfValueMax);
        }
}

