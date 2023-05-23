package Day07;

public class C02_OuterClass {

    int  x = 10 ;

    class InnerClassNormal{

        int yNormal = 5 ;
    }

    private class InnerClassPrivate {

        int yPrivate = 5 ;
    }

    static class InnerClassStatic {
        int yStatic = 5 ;
    }

    class InnerClass {

        public int myInnerMethod () {
            return x ;
        }
    }
}
