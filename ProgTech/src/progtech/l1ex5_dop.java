package progtech;

public class l1ex5_dop {
    public static void main(String[] args){

        int matrix[][] = new int [3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j]=(int)Math.round(Math.random()*10);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(matrix[3-1-j][3-1-i] + " ");
            System.out.println();
        }

    }
}
