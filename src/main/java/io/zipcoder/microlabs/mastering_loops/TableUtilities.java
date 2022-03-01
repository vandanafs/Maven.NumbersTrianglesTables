package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int n, int cols) {
        //n--> number rows
        int result = 0;
        for (int i = 1; i <= n; i++) {  //row n
            for (int j = 1; j <= cols; i++) {  //cols
                result = i * j;


            }
            System.out.println();
        }
        return null;
    }

      //String pattern="";
//      int i=1;
//  while(i<=cols){
//     pattern= printRow(i);
//      i+=1;
//  }
//  return pattern;
//    }

    public static String getLargeMultiplicationTable() {
         return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }

    public static String printRow(int n){
        int i=1;
        String res="";
        String temp="%4d |";
        while(i<=5){  //n col
          //  res=System.out.format("%4d |",n*i);
            //res= temp+n*i;
                  System.out.printf("%4d |",n*i);
           // System.out.printf(res);
            i+=1;

        }
        System.out.println();
        return String.format("%4d |",n*i);
    }

}
