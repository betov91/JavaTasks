public class ObatainingTheInteger {

    public static void main(String[] args){

        double num;
        long ipart;
        double fpart;

        num = 2.3d;
        ipart = (long) num;
        fpart = num - ipart;

        System.out.println("Integer part " + ipart);
        System.out.println("Fractional part " + fpart );



    }
}
