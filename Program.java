import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Zhoda zhoda = new MojaZhoda();
        Scanner in = new Scanner(System.in);

        int prve = in.nextInt();
        int druhe = in.nextInt();

        System.out.println(zhoda.spolocnaCislica(prve, druhe));

        System.out.println(zhoda.spolocnaCislica(12, 23));
        System.out.println(zhoda.spolocnaCislica(12, 43));
        System.out.println(zhoda.spolocnaCislica(12, 44));
    }

}
