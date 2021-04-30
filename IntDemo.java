import java.util.Scanner;

public class IntDemo {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int item = in.nextInt();
        in.close();
        if(item % 5 == 0 && item % 7 == 0)  
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
