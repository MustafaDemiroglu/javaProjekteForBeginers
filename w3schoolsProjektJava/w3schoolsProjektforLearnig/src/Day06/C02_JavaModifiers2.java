package Day06;

abstract class C02_JavaModifiers2 {
    public String fname = "Kamile" ;
    public int age = 20 ;
    public abstract void study() ;      // abstract method
}

class Student extends C02_JavaModifiers2 {
    public int graduationYear = 2018 ;
    public void study () {      // the body of the abstract method is provide here
        System.out.println("study all day long");
    }
}
