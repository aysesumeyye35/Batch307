package d22oop;

public class ChildClass extends ParentClass{

     @Override
     public Integer multiply(Integer a, Integer b){
         //Parent classın çarpma methodunu çağıralım
         super.multiply(a, b);
         Integer sonuc = super.multiply(a, b);

         //Ek islevsellik katalım. Sonuca 10 ekleyerek genisletelim
         return sonuc + 10 ;

     }


}
