// Given a string, does "xyz" appear in the middle of the string?
// To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.


// First attempt:

//   public static boolean xyzMiddle(String str) {
//      int forward = 0;
//      int reverse = 0;
//      for (int i = 0; i < str.length(); i++) {
//          if (str.charAt(i) != 'x') {
//          forward++;
//          }
//          else break;
//          }
//      for (int j = str.length() -1; j >= 0; j--) {
//          if (str.charAt(j) != 'z') {
//          reverse++;
//          }
//          else break;
//      }
//      return (Math.abs(forward - reverse) <= 1);
//}

// Second Attempt;

//    public static boolean xyzMiddle(String str) {
//        if (str.length() %2 != 0 && str.length() >= 5) {
//            int cenDist = Math.abs(str.length() + 1)/2;
//            return (str.substring(cenDist -2, cenDist +3).contains("xyz"));
//        }
//        if (str.length() %2 == 0 && str.length() >= 6) {
//            int cenDist = str.length()/2;
//            return (str.substring(cenDist -1,cenDist +3).contains("xyz"));
//
//        }
//        if (str.length() <= 4 && str.contains("xyz")) {
//          return true;
//        }
//        else return false;
//
//}

// Third / successful attempt

public class XYZMiddle {
    public static boolean xyzMiddle(String str) {
        if (str.length() %2 != 0 && str.length() >= 5) {
            int cenDist = Math.abs(str.length() - 1)/2;
            return (str.substring(cenDist -1, cenDist +3).contains("xyz") &&
                    str.substring(cenDist -2, cenDist +2).contains("xyz"));
        }
        if (str.length() %2 == 0 && str.length() >= 6) {
            int cenDist = (str.length()/2) -1;
            return (str.substring(cenDist -1,cenDist +3).contains("xyz"));

        }
        else return str.length() <= 4 && str.contains("xyz");
    }
}
