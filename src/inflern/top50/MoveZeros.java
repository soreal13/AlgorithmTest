package inflern.top50;

public class MoveZeros {

    // Array의 Number와 index를 활용하는 문제

    public static void main(String[] args) {
        // 1
        int[] nums = {0, 3, 2, 0, 8, 5};
        int index = 0;

        // 2
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
                System.out.println("index: "+ index);
            }
        }
        // 3
        while(index<nums.length) {
            nums[index] = 0;
            index++;
        }

        // 4
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
