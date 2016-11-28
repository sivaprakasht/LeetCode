/**
 * Created by sthiyag on 11/25/2016.
 */
public class TwoSum {

    public int[] solution(int[] nums, int target) {
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            index[0] = i;
            for(int j=i+1;j<nums.length;j++){
                index[1] = j;
                if(target == (nums[i] + nums[j])){
                    return index;
                }
            }
        }
        return index;
    }

    public static void main(String a[]){
        TwoSum twoSum = new TwoSum();
        int[] nums = {6,2,7,8,9};
        int[] index = twoSum.solution(nums,9);
        System.out.println(index[0] + ", " + index[1]);
    }
}
