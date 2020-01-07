package question0042;

/**
 * 接雨水
 *
 * @author wangyb
 * @since 2020/1/7
 */
public class Soultion1 {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int maxLeft = 0;
        int maxRight = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    result += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    result += maxRight - height[right];
                }
                right--;
            }
        }

        return result;
    }
}
