package fsd.oct.assignment1;

public class Program5 {
    public static void main(String[] args) {
//        ------------------------------ Program 5 ------------------------------
        int q=14;
        for(int i=0;i<q;i++){
          for(int j=0;j<q; j++){
              if(i==0||i==(q-1)||i+j<=(q-1)/2||i-j>=(q-1)/2) {
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
          }
          System.out.println();
        }

    }
}
