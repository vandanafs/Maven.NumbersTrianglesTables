package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int n, int cols) {



        //2nd way

        String temp="";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cols; j++) {
                temp+=String.format("%3d |", i * j);
            }
             temp+="\n";
        }
        return temp;

   }




        public static String getLargeMultiplicationTable () {
            return getMultiplicationTable(10);
        }

        public static String getMultiplicationTable ( int tableSize){
              String temp="";
            for (int i = 1; i <= tableSize; i++) {
                for (int j = 1; j <= tableSize; j++) {
                    temp +=String.format("%3d |", i * j);
                }
                temp+="\n";
            }
            return temp;
        }



    public static String printRow(int n){
        int i=1;
        String res="";

        while(i<=5){  //n col
            res=String.format("%4d |",n*i);
                  i+=1;

        }
        res+="\n";
     //   System.out.println();
        return res;
    }

}
