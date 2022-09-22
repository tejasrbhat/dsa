package dsa;

/**
 * Given an integer x, return true if x is palindrome integer.
 * 
 * An integer is a palindrome when it reads the same backward as forward.
 * 
 * For example, 121 is a palindrome while 123 is not.
 * 
 * @author Tejas Bhat
 *
 */
public class Palindrome {

  public boolean isPalindrome(int num) {
    if (num < 0 || (num != 0 && num % 10 == 0)) {
      return false;
    }
    int res = 0;
    while (num > res) {
      res = res * 10 + num % 10;
      num /= 10;
    }
    return (num == res || num == res / 10);
  }

}
