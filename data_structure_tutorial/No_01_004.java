package data_structure_tutorial;

// 所有奇数长度子数组的和

public class No_01_004 {
    public int SumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=1;i<=arr.length;i++){
            if(i%2!=0)
            {
                sum+=sumints(arr,0,i);
            }
        }
        return sum;
    }
    public int sumints(int[] ints,int index,int len){
        int res=0;
        for(int i=index;i<len+index;i++)
        {
            res+=ints[i];
        }
        if(ints.length>=index+len+1) {
            res+=sumints(ints,index+1,len);
        }
        return res;
    }
}
