class Main {
    public static void main(String[] args) {
      int[][] matrix = new int[3][4];
      for(int i = 0; i<matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
          matrix[i][j] = i * j;
        }
      }
      print2d(matrix);
  
      int[] rowSum = new int[matrix.length];
      int[] colSum = new int[matrix[0].length];
  
      int sum;
      for (int i = 0; i < matrix.length; i++){
        sum = 0;
        for(int j = 0; j < matrix[i].length; j++){
          sum += matrix[i][j];
        }
        rowSum[i] = sum;
      }
      for (int i = 0; i < matrix[0].length; i++){
        sum = 0;
        for(int j = 0; j < matrix.length; j++){
          sum += matrix[j][i];
        }
        colSum[i] = sum;
      }
      for (int i = 0; i < rowSum.length; i++){
        System.out.print(rowSum[i] + " ");
      }
      System.out.println();
      for(int i = 0; i < colSum.length; i++)
        System.out.print(colSum[i] + " ");
    }
    public static void print2d(int[][] mat){
      for(int i = 0; i<mat.length; i++){
        for(int j = 0; j < mat[i].length; j++){
          System.out.print(mat[i][j] + "\t");
        }
        System.out.print("\n");
      }
    }
  }