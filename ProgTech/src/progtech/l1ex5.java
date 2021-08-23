package progtech;

public class l1ex5 {
    public static void main(String[] args){
        //1
        int[] mas = {12,43,12,-65,778,123,32,76};
        int max = mas[0];
        for(int i = 1; i < mas.length; i++)
        {
            if(max < mas[i])
            {
                max = mas[i];
            }
        }
        System.out.println(max);
        System.out.println();
        //2
        int matrix[][] = new int [3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j]=(int)Math.round(Math.random()*10);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        System.out.println();

        int[] mas1 = new int[3];
        int min;
        for (int i = 0; i < 3; i++) {
            min = matrix[i][i];
            for (int j = 0; j < 3; j++)
                if(matrix[j][i] < min)
                    min = matrix[j][i];
            mas1[i] = min;
            System.out.print(mas1[i] + " ");
        }
    }
}
