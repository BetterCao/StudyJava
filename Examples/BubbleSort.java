/*
 *冒泡排序
 *作者：tiamo_cao
 *创建时间：2018.07.30
 */

public class BubbleSort{
	public static void main(String args[]){
		int a[] = {23,3,5,77,8,9,1};
		int len = a.length;
		int t;
		for(int i=0;i<len-1;i++){	//轮数，len - 1
			for(int j=0;j<len-1;j++){	//每一轮，相邻的数两两比较，最大的排到最后
				if(a[j]>a[j+1]){
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i=0;i<len;i++){
			System.out.println(a[i]);
		}
	}
}
