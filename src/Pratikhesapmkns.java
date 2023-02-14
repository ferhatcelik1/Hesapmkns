import java.util.Scanner;
public class Pratikhesapmkns {
    public static void main(String[] args){

       double n1 ,n2;
       int select;

       Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı girin :");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        n2 = input.nextInt();
        System.out.println("asagidaki islemlerden birini seciniz");
        System.out.println( "1 toplama \n 2 çıkarma\n 3 çarpma \n 4 bölme");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case  2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case  4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("yanlış girdiniz");
        }

    }

}
