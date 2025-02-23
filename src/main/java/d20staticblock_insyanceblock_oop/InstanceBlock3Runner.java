package d20staticblock_insyanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();

        // Araba rengi : Siyah
        // Araba yakıt türü : Benzin

        InstanceBlock3 car2 = new InstanceBlock3();
        // Araba rengi : Siyah
        // Araba yakıt türü : Benzin
        // bunların ikisininde parametresi boş olduğu için boş parametreli olanları yazdırdı
        //Ancak renk ve takıt türü constructorlarla özelleştirilebilir
        InstanceBlock3 car3 = new InstanceBlock3("kırmızı" ,"dizel");
        //sadece obje oluşturunca bir şey yazdırmadı sout deyip ekleyince yazdırdı obje oluşturup colorı çaırınca renk yüklendi
        System.out.println("Araba rengi : " + car3.color);
        System.out.println("Araba yakıt türü : " +car3.fuelType);
        //Araba rengi : kırmızı
        //Araba yakıt türü : dizel
    }


}
