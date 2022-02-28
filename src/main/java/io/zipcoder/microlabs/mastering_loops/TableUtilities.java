package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int n, int cols) {
        int i=1;
        String st="";
        while(1<=cols) {
            //System.out.println("%4d",n * i);
            i=i+1;
            st= Integer.toString(i);
        }
        System.out.println();
        return st;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
