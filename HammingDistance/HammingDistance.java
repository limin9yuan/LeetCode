package LeetCode.HammingDistance;

/**
 * Created by limin on 6/7/2017.
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y){
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        HammingDistance hd = new HammingDistance();
        int result = hd.hammingDistance(x, y);
        System.out.println(result);
    }
}
