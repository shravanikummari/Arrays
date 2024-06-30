public class Adding2Darrays {
        public static void main(String[] args) {
            int[][] arr={{92,17,10},
                         {42,35,64},
                         {37,84,29}};

            int[][] arr2={{10,11,12},
                          {13,14,15},
                          {16,17,18}};

            int rows=arr.length;
            int col=arr[0].length;

            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr2[i][j]+arr[i][j]+" ");
                }
                System.out.println();
            }

        }}
