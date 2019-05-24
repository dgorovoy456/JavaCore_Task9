public class Calculator {

    public static double calcPi (int n) {
        double pI=0;
        double denominator=1;

        for (int i = 1; i< n ; i++) {
            if (i%2==0) {
                pI=pI+(1/denominator);
            }
            else {
                pI=pI-(1/denominator);
            }
            denominator =denominator+2;
            }
        pI=pI*4;
return pI;




    }

}
