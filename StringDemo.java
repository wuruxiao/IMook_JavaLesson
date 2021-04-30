public class StringDemo {
    
    public static void main(String[] args){
        //define a bool-type variable which is true and print it
        boolean flag = true;
        System.out.println("flag=" + flag);

        //define a string-type varible which is "hello world" and print it
        String str = "hello world";
        System.out.println("str=" + str);

        //define a string-type varible which is nullstr, copy the value of str and print str1
        String str1 = "";
        str1 = str;
        System.out.println("str1=" + str1);
    }
}
