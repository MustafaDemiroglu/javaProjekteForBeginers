package Day03;

public class C04_javaBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("");

        for (int i2=0; i2 < 10; i2++ ) {
            if (i2==4) {
                continue;
            }
            System.out.println(i2);
        }

        System.out.println("");

        int i3=0;
        while (i3<10) {
            System.out.println(i3);
            i3++;
            if (i3==4) {
                break;
            }
        }

        System.out.println("");

        int i4=0;
        while (i4<10) {
            System.out.println(i4);
            i4++;
            if (i4 == 4) {
                continue;
            }
        }
    }
}
