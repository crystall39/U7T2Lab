import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(10);
        array.add(5);
        array.add(24);
        System.out.println(array);

        // George
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(10);
        nums1.add(5);
        nums1.add(24);
        System.out.println(nums1);

        // Margaret
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        Integer int1 = new Integer(10);
        Integer int2 = new Integer(5);
        Integer int3 = new Integer(24);
        nums2.add(int1);
        nums2.add(int2);
        nums2.add(int3);
        System.out.println(nums2);

        // Prediciton
        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);

        System.out.println(numList);

    }
}
