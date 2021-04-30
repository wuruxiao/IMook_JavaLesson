import java.util.Scanner;

public class CharDemo {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char item = s.charAt(0);
        boolean hadPrint = false;
        in.close();
        switch (item) {
            case 'a':
                System.out.println("元音字母 " + item);
                hadPrint = true;
                break;
                
            case 'e':
                System.out.println("元音字母 " + item);
                hadPrint = true;
                break;

            case 'i':
                System.out.println("元音字母 " + item);
                hadPrint = true;
                break;

            case 'o':
                System.out.println("元音字母 " + item);
                hadPrint = true;
                break;

            case 'u':
                System.out.println("元音字母 " + item);
                hadPrint = true;
                break;
        
            default:
                break;
        }

        if(!hadPrint)
            System.out.println("不是元音字母");

    }
}
