package d20staticblock_insyanceblock_oop;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.println(Student.stdName);//Ali Can

        Student ali = new Student(); //bu objeyi oluşturdupumuz için age 18 yazdırabildik static olmadığı içi age obje oluşturmak zorundayız.
        System.out.println(ali.age);//18

        Student.staticMethod();//Ben static bir metodum
        ali.nonStaticMethod();//Ben non-static bir methodum




    }
}
