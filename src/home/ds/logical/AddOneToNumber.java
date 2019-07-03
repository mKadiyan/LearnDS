package home.ds.logical;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        int carry = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            carry = (arr[i]+carry + 1)/10;
            if(carry !=0){
                arr[i] = 0;
            }else {
                arr[i] = arr[i] +1;
                break;
            }
        }

        if(carry !=0 ){
            int[] newarr = new int[arr.length+1];
            newarr[0] = carry;
            for (int i = 0; i<arr.length; i++){
                newarr[i+1] = arr[i];
            }
            System.out.println(Arrays.toString(newarr));
        }else {
            System.out.println(Arrays.toString(arr));
        }
    }
}
