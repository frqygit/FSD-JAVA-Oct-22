package ai.ineuron.assignment1;

public class Program1 {
    public static void main(String[] args) {
//        ------------------------------ Program 1 ------------------------------
        int a=5;
        for (int i = 0; i < a; i++) {
//            *************** I ***************
            for (int j = 0; j < a; j++) {
                if(i==0||i==a-1||j==(a-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

//            *************** N ***************
            for (int j = 0; j < a; j++) {
                if(j==0||j==a-1||i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print(" ");
//            *************** E ***************
            for (int j = 0; j < a; j++) {
                if(i==0||i==a-1||i==(a-1)/2||j==0){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print(" ");
//              *************** U ***************
            for (int j = 0; j < a; j++) {
                if(((j==0||j==a-1)&&i!=a-1)||(j>0&&i==a-1&&j<a-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print(" ");
//              *************** R ***************
            for (int j = 0; j < a; j++) {
                if((i==0&&j<a-1)||j==0||(j==a-1&&i>0&&i<(a-1)/2)||(i==(a-1)/2&&j<a-1)||i-j==(a-1)/2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print(" ");
//              *************** O ***************
            for (int j = 0; j < a; j++) {
                if(j==0&&i>0&&i<a-1||i==0&&j>0&&j<a-1||j==a-1&&i>0&&i<a-1||i==a-1&&j>0&&j<a-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.print(" ");
//              *************** N ***************
            for (int j = 0; j < a; j++) {
                if(j==0 || j==a-1||i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
