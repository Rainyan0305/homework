public class JPA403 {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,5,6}};
        int B[][] = {{7,8,9},{10,11,12}};
        int C[][] = new int[2][3];
        System.out.printf("陣列A的內容為(3x3):\n");
        show(A);
        System.out.printf("陣列B的內容為(3x3):\n");
        show(B);
        add(A, B,C);
        System.out.printf("陣列A+B=C，陣列C的內容為(3x3):\n");
        show(C);
        
        
    }
    public static void add(int Array1[][],int Array2[][],int Array3[][]) {
        for(int i=0;i<2;i++){
         for(int j=0;j<3;j++){
          Array3[i][j]=Array1[i][j]+Array2[i][j];
         }
        }
       }   
       public static void show(int Array[][]) {
        for(int i=0;i<2;i++){
         for(int j=0;j<3;j++){
          System.out.printf("%02d ",Array[i][j]);
         }
         System.out.printf("%n");
        }
       }
      }
