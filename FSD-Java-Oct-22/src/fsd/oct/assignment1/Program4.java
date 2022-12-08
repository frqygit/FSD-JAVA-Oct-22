package fsd.oct.assignment1;

public class Program4 {
    public static void main(String[] args) {
//        ------------------------------ Program 4 ------------------------------
        int p=14;
        for(int i=0;i<p;i++){
          for(int j=0;j<p; j++){
              if((i>(p-1)/2&&(i-j>(p-1)/2||i+j>(p-1)+(p-1)/2))||i==(p-1)) {
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
          }
          System.out.println();
        }
    }
}
