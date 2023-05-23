package Day07;

public class C02_JavaInnerClasses {

    public static void main(String[] args) {

        C02_OuterClass myOuter = new C02_OuterClass() ;
        C02_OuterClass.InnerClassNormal myInner1 = myOuter.new InnerClassNormal();
        System.out.println(myInner1.yNormal + myOuter.x );  // Outputs 15 (5 + 10)


        /*  If you try to access a private inner class from an outside class, an error occurs:
        Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
        C02_OuterClass.InnClassPrivate myInner2 = myOuter.new InnerClassPrivate();
        System.out.println(myInner2.yPrivate  + myOuter.x );
        */

        C02_OuterClass.InnerClassStatic myImmer3 = new C02_OuterClass.InnerClassStatic();
        System.out.println(myImmer3.yStatic);    // Outputs 5

        C02_OuterClass.InnerClass myInner4 = myOuter.new InnerClass();
        System.out.println(myInner4.myInnerMethod());       // Output 10


    }
}
