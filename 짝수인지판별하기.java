import java.util.*;

public class 짝수인지판별하기 {
  public static void main(String[] orgs) {
    System.out.print("숫자 입력 : ");
    Scanner sc = new Scanner(System.in);
    String userInput_s = sc.next();

    if (!isNumeric(userInput_s)) {
      System.out.println("입력값을 확인하세요. 양수만 가능합니다.");
      return;
    }

    int userInput_i = Integer.parseInt(userInput_s);
    boolean result = isEven(userInput_i);

    if (result) {
      System.out.println("짝수");
    }
    else {
      System.out.println("홀수");
    }
  }

  private static boolean isEven(int a) {
    if (a % 2 == 0) return true;
    else return false;
  }

  public static boolean isNumeric(String str) {
    return str.matches("\\^[1-9][0-9]*$");  // 숫자만 허용. 음수나 소수점 없음
  }
}