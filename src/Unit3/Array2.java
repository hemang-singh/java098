package Unit3;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        int a[][]= new int[2][3];
        int b[][]= new int[2][3];
        int c[][]= new int[2][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i<b.length;i++){
            for(int j=0; j<b[0].length;j++){
                b[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i<c.length;i++){
            for(int j=0; j<c[0].length;j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
    }
}

