import java.util.*;

public class Q06 {
    //Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    //6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    //Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));
        tekSayilar(list);
        altiOndortArasiSayilarinKaresi(list);
        tekSayilarinKarelKoklerininToplami(list);
    }
    public static void tekSayilar(List<Integer> list){
        list.stream().filter(t-> t%2!=0).forEach(System.out::println);

    }
   public static void altiOndortArasiSayilarinKaresi(List<Integer> list){

        list.stream().filter(t-> t>=6 & t<=14).map(t-> t*t).forEach(t-> System.out.print(t+" "));

   }
   public static void tekSayilarinKarelKoklerininToplami(List<Integer> list){
      Optional<Double> result =list.stream().filter(t-> t%2!=0).map(Math::sqrt).reduce((t, u) -> t + u);
       System.out.println(result);
   }
}
