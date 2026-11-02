// jdh CS 3240A / CS 5240A Fall 2026

public class Analyzer {
  int[] values;

public Analyzer(int[] values) {
  int n = values.length;
  int size = 1;
  //pad out array
  while (size < n) {
    size *= 2;
  }
  this.values = new int[size];
  for (int i = 0; i < size; i++) {
    if (i < n) {
      this.values[i] = values[i];
    } else {
      this.values[i] = values[n - 1];
    }
  }
}

  public int[] findMaxDiff() {
    // implement this

    return findMaxDiffRec(0, values.length - 1);

  }

  public int[] findMaxDiffRec(int startIndex, int endIndex) {
    // implement this
    if (endIndex - startIndex == 1){//n=2 base case
      if (values[startIndex] >= values[endIndex]){
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        return result;
      }
      int[] result = new int[2];

      result[0] = startIndex;
      result[1] = endIndex;
      return result;
    } 

    //recusrive case
    //mid
    int m = startIndex + (endIndex - startIndex + 1) / 2;

    //left half
    int[] left = findMaxDiffRec(startIndex, m-1);

    //right half
    int[] right = findMaxDiffRec(m, endIndex);


    //merge

    int smallestIndex = startIndex;

    for(int i = startIndex; i < m; i++){

      if (values[i] < values[smallestIndex]){
        smallestIndex = i;

    }
  }

  int largestIndex = m;

  for (int j = m; j<= endIndex; j++){
    if (values[j] > values[largestIndex]){
      largestIndex = j;
    }
  }

  int[] merge = new int[2];
  merge[0] = smallestIndex;
  merge[1] = largestIndex;


  int leftDiff = values[left[1]] - values[left[0]];
  int rightDiff = values[right[1]] - values[right[0]];

  int mergeDiff = values[largestIndex] - values[smallestIndex];

  //take the best difference

  if (mergeDiff <=0 && leftDiff <=0 && rightDiff <=0 ){
    int[] result = new int[2];
    result[0] = 0;
    result[1] = 0;

    return result;
  }
  if (leftDiff >= rightDiff && leftDiff >= mergeDiff) {
      return left;
    }
  
  if (rightDiff >= mergeDiff) {
    return right;
  }
  return merge;

  } // findMaxDiffRec()

  public int[] findMaxDiffBF() {
    // implement this

    int best1 = 0;
    int best2 = 0;
    int diff = 0;

    for (int i = 0; i < values.length; i ++){
      for (int j = i+1; j < values.length; j++){
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
