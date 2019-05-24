public class Calculator {

    public static double calcPi (int n) {
        double pI=4;
        double result=0;

        for (int i = 1; i<= n ; i++) {
            pI=n/pI;
            n=n-2;
            result= pI*-1;




            }


return result;




    }

}
