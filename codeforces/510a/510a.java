import java.util.Scanner;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c = sc.nextInt();
        
        boolean last = true;
        
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.print("#");
                }
                System.out.println("");
            }else{
                for(int j=0;j<c;j++){
                    if((j==0 && last==false) || (j==c-1 && last==true)){
                        System.out.print("#");
                        
                    }else{
                        System.out.print(".");
                    }
                }
                last = !last;
                System.out.println("");
            }
        }
        
    }
}