package array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {

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

}
