 
package Power_x_n;
import java.util.*;
public class Power_x_n_ { 
    public static double myPow(double x, int n) {
        double ans = 1.0;
        for(int i = 0; i<n; i++){
            ans = ans * x;
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println(myPow(2,10));
    }
}
    

