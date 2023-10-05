package sqrt;

public class sqrt {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int left = 1, right = x;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        sqrt sqr = new sqrt();
        int x = 144;
        System.out.println(sqr.mySqrt(x));
    }
}
