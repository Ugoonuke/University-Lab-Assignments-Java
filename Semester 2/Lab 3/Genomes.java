import java.util.Scanner;
public class regEx{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(matches(a) == true) System.out.println("True");
        else System.out.println("False");
    }
    public static boolean matches(String a){
        if(a.matches("(c|g|a|t)*") == false) return false;
        else return true;
    }
}
