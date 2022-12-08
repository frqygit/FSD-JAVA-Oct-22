package fsd.oct.assignment1;

public class Program3 {
    public static void main(String[] args) {
//        ------------------------------ Program 3 ------------------------------------
        int m=14;
        for(int i=0;i<=m;i++){
          for(int j=0;j<=m; j++){
              if(i==0||j==0||i==m||j==m||i+j<=(m)/2||j-i>=(m)/2) {
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
          }
          System.out.println();
      }

    }
}
