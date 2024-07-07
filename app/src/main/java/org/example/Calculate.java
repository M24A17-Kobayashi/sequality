package org.example;

public class Calculate {
  // return x + y
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumOfRange(int x, int y) {
    // xからyまでの総和を求める
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOfOdd(int x, int y) {
    // xからyまでの奇数の総和を求める
    int sum = 0;
    if (x % 2 == 0) {
      x += 1;
    }
    for (int i = x; i <= y; i += 2) {
      sum += i;
    }
    return sum;
  }

  public int sumOfEven(int x, int y) {
    // xからyまでの偶数の総和を求める
    int sum = 0;
    if (x % 2 == 1) {
      x += 1;
    }
    for (int i = x; i <= y; i += 2) {
      sum += i;
    }
    return sum;
  }

  public double ave(int x, int y) {
    // return average
    double ave = 0;
    ave = (x + y) / 2.0;
    return ave;
  }

  public double aveOfRange(int x, int y) {
    // xからyまでの総和の平均を返す
    double ave = 0;
    int sum = 0;
    int len = 0;

    for (int i = x; i <= y; i++) {
      sum += i;
      len += 1;
    }
    ave = sum / (double) len;

    return ave;
  }

}
