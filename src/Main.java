import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{public static void main(String[] args){
        Scanner afreFWEgttg324rgwgw=new Scanner(System.in);
        while (true){System.out.print("\u001B[32m"+"Для входа в программу введите любой символ (кроме нуля), для выхода из программы введите 0: "+"\u001B[0m");
            String dverFWvre4587jrhg=afreFWEgttg324rgwgw.next();
            if (dverFWvre4587jrhg.equals("0")){System.out.println("\u001B[30m"+"Выход из программы..."+"\u001B[0m");
                break;}
            FJAGsWRwr24FFrf24 rfRFee3RGrr=new FJAGsWRwr24FFrf24(afreFWEgttg324rgwgw);
            rfRFee3RGrr.Efww44rfwjnekei4875kh23h344R3rRG3();}
        afreFWEgttg324rgwgw.close();double frxevwvwevwev=0; double ERCGRERTEEB=frxevwvwevwev+0;if(ERCGRERTEEB!=0){System.out.print(ERCGRERTEEB);}}}
class FJAGsWRwr24FFrf24{public Scanner ffww234efFrrr;
    public FJAGsWRwr24FFrf24(Scanner ffww234efFrrr){this.ffww234efFrrr=ffww234efFrrr;}
    public void Efww44rfwjnekei4875kh23h344R3rRG3(){
        try{System.out.println("\u001B[36m"+"Введите числа с количеством цифр в интервале от 1 до 19."+"\u001B[0m");
            System.out.print("\u001B[34m"+"Введите число A: "+"\u001B[0m");
            long rgcwgwgwcwc=ffww234efFrrr.nextLong();
            System.out.print("\u001B[34m"+"Введите число B: "+"\u001B[0m");
            long ffjcnlrguhehgcegw=ffww234efFrrr.nextLong();
            long DFCRGWGERTGERTHDE=Ffwfh45rhvvhrRTHVR46THrgdg55uh5y5y5u564htetECe455y(rgcwgwgwcwc);
            System.out.println("\u001B[37m"+"Количество цифр в числе A: "+"\u001B[0m"+"\u001B[33m"+DFCRGWGERTGERTHDE+"\u001B[0m");
            long REERGEWGTGTGWT=Ffwfh45rhvvhrRTHVR46THrgdg55uh5y5y5u564htetECe455y(ffjcnlrguhehgcegw);
            System.out.println("\u001B[37m"+"Количество цифр в числе B: "+"\u001B[0m"+"\u001B[33m"+REERGEWGTGTGWT+"\u001B[0m");
            if(DFCRGWGERTGERTHDE>REERGEWGTGTGWT) {
                int rvkrverjhvrkjhbvwjerhbvwjbvwvbw=Math.toIntExact(DFCRGWGERTGERTHDE-REERGEWGTGTGWT);
                System.out.println("\u001B[35m"+"Цифр в числе A больше на "+"\u001B[0m"+"\u001B[33m"+rvkrverjhvrkjhbvwjerhbvwjbvwvbw+"\u001B[0m");
            }else if(DFCRGWGERTGERTHDE<REERGEWGTGTGWT){
                int rgkjehrgkerjhgekrjghekjrghekjgh=Math.toIntExact(REERGEWGTGTGWT-DFCRGWGERTGERTHDE);
                System.out.println("\u001B[35m"+"Цифр в числе B больше на "+"\u001B[0m"+"\u001B[33m"+rgkjehrgkerjhgekrjghekjrghekjgh+"\u001B[0m");
            }else{System.out.println("\u001B[35m"+"Количество цифр в числах равны!"+"\u001B[0m");}
        }catch(InputMismatchException e){
            System.out.println("\u001B[31m"+"\nОшибка: некорректный ввод! Введите корректные значения!"+"\u001B[0m");
            ffww234efFrrr.nextLine();}}
    static long Ffwfh45rhvvhrRTHVR46THrgdg55uh5y5y5u564htetECe455y(long FGRWCGWECercgewcg45235){
        if(FGRWCGWECercgewcg45235==0){return 1;}
        return (long) (Math.log10(Math.abs(FGRWCGWECercgewcg45235))+1);}}
/*
--------------------------------
Та же программа с простым кодом:
--------------------------------
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.print("\u001B[32m" + "Для входа в программу введите любой символ (кроме нуля), для выхода из программы введите 0: " + "\u001B[0m");
            String symbol = number.next();
            if (symbol.equals("0")) {
                System.out.println("\u001B[30m" + "Выход из программы..." + "\u001B[0m");
                break;
            }
            try {
                System.out.println("\u001B[36m" + "Введите числа с количеством цифр в интервале от 1 до 19." + "\u001B[0m");
                System.out.print("\u001B[34m" + "Введите число A: " + "\u001B[0m");
                long A = number.nextLong();
                System.out.print("\u001B[34m" + "Введите число B: " + "\u001B[0m");
                long B = number.nextLong();

                long numberA = NumberOfDigits(A);
                System.out.println("\u001B[37m" + "Количество цифр в числе A: " + "\u001B[0m" + "\u001B[33m" + numberA + "\u001B[0m");
                long numberB = NumberOfDigits(B);
                System.out.println("\u001B[37m" + "Количество цифр в числе B: " + "\u001B[0m" + "\u001B[33m" + numberB + "\u001B[0m");

                if (numberA > numberB) {
                    long difference = numberA - numberB;
                    System.out.println("\u001B[35m" + "Цифр в числе A больше на " + "\u001B[0m" + "\u001B[33m" + difference + "\u001B[0m");
                } else if (numberA < numberB) {
                    long difference = numberB - numberA;
                    System.out.println("\u001B[35m" + "Цифр в числе B больше на " + "\u001B[0m" + "\u001B[33m" + difference + "\u001B[0m");
                } else {
                    System.out.println("\u001B[35m" + "Количество цифр в числах равны!" + "\u001B[0m");
                }
            } catch (InputMismatchException e) {
                System.out.println("\u001B[31m" + "\nОшибка: некорректный ввод! Введите корректные значения!" + "\u001B[0m");
                number.nextLine();
            }
        }
    }
    static long NumberOfDigits(long numberC) {
        if (numberC == 0) {
            return 1;
        }
        return (long) (Math.log10(Math.abs(numberC)) + 1);
    }
}
 */