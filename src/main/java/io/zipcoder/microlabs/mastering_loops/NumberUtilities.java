package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String even="";
        for(int i=start; i<stop; i++){

            if(i%2==0){
                System.out.println(String.valueOf(i));
               even+=String.valueOf(i);
            }
        }

        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd="";
        for(int i=start; i<stop; i++){

            if(i%2!=0){
                System.out.println(String.valueOf(i));
                odd+=String.valueOf(i);
            }
        }

        return odd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {


        return null;
    }

    public static String getRange(int start) {
        String range="";
        for(int i=0; i<start;i++){
            String str=String.valueOf(i);
            range+=str;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range="";
        for(int i=start; i<stop;i++){
            String str=String.valueOf(i);
            range+=str;

        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range="";
        for(int i=start; i<stop; i+=step){
            String str=String.valueOf(i);
            range+=str;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
