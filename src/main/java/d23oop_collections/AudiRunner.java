package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
        //Engine e = new Engine();//HATA interface lerde obje üretemezsiniz.

        AudiA4 a4 = new AudiA4();
        a4.turbo();//Audi A4 turbo motor kullanir
        a4.esp();//Audi A4 esp fren sistemi kullanir

        AudiS5 s5 = new AudiS5();
        s5.abs();//Audi S5 abs fren sistemi kullanir

        //Engine.price = 5000;

        System.out.println(Engine.fiyat);//300
        System.out.println(AC.fiyat);//200
        System.out.println(Brake.fiyat);//100

        Engine.speed();//çünkü ınterface üzerinden
        a4.power();//object üzerinden default method

    }

}
