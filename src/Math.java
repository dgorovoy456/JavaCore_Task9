public class Math {
    final static double pI =3.14;

    public static int findMin (int[] arr) {

        int min=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr.length>arr[i]) {
                min=arr[i];
            }
        }
        return min;
    }
    public static int findMax (int[] arr) {
        int max=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]>arr.length) {
                max=arr[i];
            }
        }
        return max;
    }
    public static double areaOfCircle (double radius) {
        double area= pI*radius*radius;


                return area;
    }

}

