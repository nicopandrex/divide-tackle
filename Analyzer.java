// jdh CS 3240A / CS 5240A Fall 2026

public class Analyzer {
  int[] values;

  public Analyzer(int[] values) {
    // implement this
  }

  public int[] findMaxDiff() {
    // implement this

  }

  public int[] findMaxDiffRec(int startIndex, int endIndex) {
    // implement this
  } // findMaxDiffRec()

  public int[] findMaxDiffBF() {
    // implement this

    int best1 = 0;
    int best2 = 0;
    int diff = 0;

    for (int i = 0; i < values.length; i ++){
      for (int j = 0; i < values.legnth; j++){
        if (values[j] - values[i] > diff){
          diff = values[j] - values[i];

          best1 = i;
          best2 = j;
        }
      }
    }
    int[] result = new int[2];
    result[0] = best1;
    result[1] = best2;

    return result;
  } // findMaxDiffBF()

} // class Analyzer
