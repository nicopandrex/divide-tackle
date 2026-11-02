// jdh CS 3240A / CS 5240A Fall 2026

public class Main {
  public static void main(String args[]) {
    testOne();
    testTwo();
  }

  public static void testOne() {
    int[] vals = {
250, 244, 242, 247, 245, 243, 240, 242, 242, 246, 247, 251, 256, 260, 265, 271, 274, 275, 279, 283, 288, 283, 281, 280, 276, 270, 266, 262, 258, 253, 250, 245, 245, 245, 243, 243, 242, 245, 245, 251, 256, 260, 266, 272, 274, 279, 285, 281, 279, 280,
286, 292, 293, 293, 294, 299, 300, 300, 302, 307, 307, 309, 310, 314, 315, 320, 321, 325, 328, 328, 334, 334, 338, 342, 342, 343, 347, 348, 354, 354, 360, 362, 362, 362, 364, 369, 369, 369, 373, 377, 381, 386, 389, 395, 395, 400, 404, 410, 413, 418,
423, 423, 425, 428, 428, 429, 433, 433, 439, 443, 446, 446, 451, 452, 457, 461, 467, 471, 471, 471, 476, 476, 481, 486, 487, 491, 497, 503, 503, 504, 505, 505, 509, 510, 506, 500, 499, 495, 489, 485, 483, 481, 487, 490, 492, 495, 498, 497, 493, 490,
496, 497, 503, 509, 515, 515, 520, 520, 515, 513, 510, 507, 501, 496, 496, 492, 493, 496, 501, 502, 505, 507, 501, 498, 495, 500, 504, 509, 512, 512, 513, 513, 514, 517, 514, 508, 502, 497, 497, 496, 493, 487, 481, 476, 471, 466, 461, 458, 452, 452
};
    Analyzer analyzer = new Analyzer(vals);
    int[] maxDiffInd = analyzer.findMaxDiff();
    System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);

    System.out.println("brute force:");
    maxDiffInd = analyzer.findMaxDiffBF();
    System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);
  } // testOne()

  //--------------------------------------------------

  public static void testTwo() {
    int[] vals = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    Analyzer analyzer = new Analyzer(vals);
    int[] maxDiffInd = analyzer.findMaxDiff();
    System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);

    System.out.println("brute force:");
    maxDiffInd = analyzer.findMaxDiffBF();
    System.out.println(maxDiffInd[0] + " " + maxDiffInd[1]);
  } // testTwo()




} // class Main
