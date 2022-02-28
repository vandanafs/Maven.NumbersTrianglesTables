package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
         StringBuilder triangle=new StringBuilder(numberOfRows);
         for(int i=1;i<numberOfRows; i++){
              triangle.append(getRow(i));
               triangle.append("\n");
         }
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        String star="";
        System.out.println(numberOfStars);
        //star="*****";
        for(int i=0; i<numberOfStars;i++){
            //star = star + "*";
            star+="*";

        }
        return star;
    }

    public static String getSmallTriangle( ) {
  StringBuilder smallTri=new StringBuilder(4);
  for(int i=1; i<5;i++){
      smallTri.append(getRow(i));
      smallTri.append("\n");
        }
    return  smallTri.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder smallTri=new StringBuilder(9);
        for(int i=1; i<10;i++){
            smallTri.append(getRow(i));
            smallTri.append("\n");
        }
        return  smallTri.toString();

    }
}
