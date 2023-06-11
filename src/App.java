import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //<KDL> variable;
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        String str = input.nextLine();

        System.out.println("n = " + n);
        System.out.println("Chuoi vua nhap la: "+str);
        System.out.println("Em be Giay rat xinh gai");
    }
}
