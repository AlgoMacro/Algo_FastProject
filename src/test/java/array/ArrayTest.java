package array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

import static array.ArrayAlgo.sort;

public class ArrayTest {

    @Test
    public void testArr() {
        /*int[] arr = {1,2,3,4};*/
        int[] arr = new int[]{4,2,3,4};
        /*int i = 0;*/
        /*int[] arr1 = new int[4];
        arr1 = new int[]{3, 4, 5, 6};*/
        for(int i:arr){
            System.out.println("值："+i);
        }
        Integer[] arr0 = new Integer[]{1,2,6,8,9};
        Arrays.asList(arr0).forEach(i-> System.out.println(i));
    }

    @Test
    public void arrCopy(){
        Integer[] arr1 = {1,2,3,4,5,3,6,23,7,9};
        Integer[] arr2 = {6,7,8,9,10};
        //拷贝前三个
        Integer[] arr3 = new Integer[3];
        arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];
        System.out.println("arr3="+Arrays.toString(arr3));
        //2:Arrays.copyof
        Integer[] arr4 = Arrays.copyOf(arr1,3);
        System.out.println("arr4="+Arrays.toString(arr4));
        //Arrays.copyofRange
        Integer[] arr03 = Arrays.copyOfRange(arr1,arr1.length-3,arr1.length);
        System.out.println("arr03="+Arrays.toString(arr03));
        //1-3位
        Integer[] arr13 = Arrays.copyOfRange(arr1,0,2);
        System.out.println("arr13="+Arrays.toString(arr13));

        //arr2 后三位至arr1的后三位
        System.arraycopy(arr2,arr2.length-3,arr1,arr1.length-3,3);
        System.out.println("arr1:"+Arrays.toString(arr1));

    }

    @Test
    public void testFill() {
        int[] arr = new int[10];
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }*/
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));
        /*for (int i = arr.length-3; i < arr.length; i++) {
            arr[i] = 3;
        }*/
        Arrays.fill(arr,arr.length-3,arr.length,3);
        System.out.println(Arrays.toString(arr));


    }

    @Test
    public void testSort() {
        int[] arr = new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testDuoWei() {
        //多维数组第一维必须有赋值
        String[][] users = new String[5][];
        //编码 姓名 性别 年龄
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "男";
        users[0][3] = "25";

        users[1] = new String[3];
        users[0][0] = "001";
        users[0][1] = "李四";
        users[0][2] = "女";
        //users[0][3] = "25";
        System.out.println(users);
        System.out.println(Arrays.toString(users));
        /*for (int i = 0; i < users.length; i++) {
            System.out.println(Arrays.toString(users[i]));
        }
        for(String[] user:users){
            System.out.println(Arrays.toString(user));
        }*/
        Arrays.asList(users).forEach(user-> System.out.println(Arrays.toString(user)));

    }

    @Test
    public void testCase1() {
        int[] num = {2,3,11,7};
        int target = 9;
        int[][] result = new int[6][2];
        int count = 0;
        for(int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if(num[i]+num[j] == target){
                    result[count][0] = i;
                    result[count][1] = j;
                    count++;
                }

            }
        }
        //System.out.println();
        Arrays.asList(result).forEach(flag -> System.out.println(Arrays.toString(flag)));
    }

    public int[] twoSum(int[] nums,int targer){
        for(int i=0;i<nums.length-1;i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==targer){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums,int target){
        System.out.println("排序前顺序："+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序后顺序："+Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]>9 || nums[j]>9){
                    return null;
                }else{
                    if (nums[i]+nums[j]==9){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return null;
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2,7,23,63,5,9,10};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2(nums,target)));
    }

    @Test
    public void testSortMain() {
        int[] nums = {9,3,5,7,2,4,1};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
