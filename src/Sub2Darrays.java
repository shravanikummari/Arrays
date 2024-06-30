public class Sub2Darrays {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j]- array2[i][j];
            }
        }
        System.out.println("Resultant Array:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}