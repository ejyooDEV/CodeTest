public class 합계구하기 {
  public static void main(String[] orgs) {
    int sum = getRangeSum(10);
    System.out.println(sum);
  }

  private static int getRangeSum(int n) {
    int sum = 0;
    for(int i = 1; i < n; i++) {
      sum += i;
    }
    return sum;
  }
}