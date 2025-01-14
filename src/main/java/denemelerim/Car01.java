package denemelerim;

public class Car01 {
    //1-variable’lar olusturalim (pasif ozellikler)
    String brand = "Audi";
    String model = "A4";
    int year = 2025;
    boolean hybrid = false;

    //2-method'lar olusturalim (aktif ozellikler)
    //static yaparsak değişkenleri de static yapmak gerekir o sebeple static yapmadık.(sabit bir değer kullanmayacağız)
    public void action (){ System.out.println(brand + " hızlı hareket eder");
    }
    public void stop (){
        System.out.println(model + " güvenli bir şekilde durur");
    }





}
