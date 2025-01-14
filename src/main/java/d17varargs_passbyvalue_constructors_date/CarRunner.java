package d17varargs_passbyvalue_constructors_date;

public class CarRunner {
    public static void main(String[] args) {
        //4- Car class’indan bir object uretelim

        Car c1 = new Car("BMW" , "3.20", 2023,false);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.action();
        c1.stop();
        //5- Car class'a donup, constructor olusturalim
        //10- Baska bir object uretelim ve direkt objeyi yazdiralim

        Car c2 = new Car("Audi","A4",2018, false);
        System.out.println(c1);
        System.out.println(c2);
        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //toString methodu
        //sag tik >> Generate >> toString() >> istedigin degiskenleri sec >> ok
        //16- Yeni bir object uretelim
        Car c3 = new Car("Tofas", "Sahin");
        System.out.println(c3);

        //9- Default Car() icine parametre girelim



    }
}
