package d20staticblock_insyanceblock_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //Example 3: In a car factory, each car is black in colour and the fuel type is petrol.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)


    public  String color;//bunlar değişken oluşturmaktır
    public String fuelType;
    //İnstance block - Bu class tan her object oluşturulduğunda çalışır
    {
        color = "Siyah"; //Her otomobil varsayılan olarak siyah renkte başlar
        fuelType = "Benzin";//Her otomobil varsayılan yakıt türü olarak benzin olarak ayarlanır
    }
    public  InstanceBlock3(){//constructor oluşturmaktır bu
        System.out.println("Araba rengi : " + color);
        System.out.println("Araba yakıt türü : " + fuelType);
    }
    public InstanceBlock3(String color, String fuelType){//yukarıdaki parametresiz constructor burada parametreli oluşturuyoruz
        // buradaki color ı kulllıanma ben sana dışarıdan göndereceğim demektir this.color yazmak
        this.color = color;// Constructor tarafından sağlanan renkle örneği başlat
        this.fuelType = fuelType;// Constructor tarafından sağlanan yakıt türüyle örneği başlat
   // burdaki color ı kullanma bn sana runnerdan color göndereceğim demek
    }

}
