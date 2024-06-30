public class CountOccurrencesOfSpecificElement {
    public static void main(String[] args) {
        int[] array = {4,2,1,7,7,9,5,7};
        int elementToCount =7;
        int count = 0;
        for (int i = 0; i <array.length; i++){
            if (array[i] == elementToCount) {
                count++;
            }
        }
        System.out.println("number of occurrences of" + elementToCount + "in the array;" + count);
    }
}
