
public class Multiplier {

  public int recursiveMultiply(int x, int y) {
    // n = 32 
    return (int) multiplyRec(x, y, 32);
  } 

  public long multiplyRec(long x, long y, int n) {
    //base case
    if (n <= 2){
      return x * y;
    }

    int half = n / 2;
    long mask = (1 << half) - 1; //creating the bit mask

    
    long x1 = x >>> half;  //most significant bits           
    long x0 = x & mask;    //least significant bits

    
    long y1 = y >>> half; //most significant
    long y0 = y & mask; // least significant

    //step 1 from slides
    long xSum = x1 + x0; 
    long ySum = y1 + y0;

    //step 2 from slides
    long p = multiplyRec(xSum, ySum, half);

    // step 3 on slides
    long x1y1 = multiplyRec(x1, y1, half);

    // step 4 on slides
    long x0y0 = multiplyRec(x0, y0, half);

    //Final step from the slides
    return (x1y1 << n) + ((p - x1y1 - x0y0) << half) + x0y0;
  } 

} 