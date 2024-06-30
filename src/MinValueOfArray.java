public class MinValueOfArray {
    public static void main(String[] args){
        int[] array={54,53,83,92,72};
        int min = array[0];
        for (int i=1; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("minimum number of the array:"+min);
    }


}
