/*
 *选择排序
 *作者：tiamo_cao
 *创建时间：2018.07.30
 */

public class SelectionSort{
	public static void main(String args[]){
		int a[] = {23,3,5,77,8,9,1};
		int len = a.length;
		int t;
		for(int i=0;i<len-1;i++){
			int min = i;	//最小标志
			for(int j=i+1;j<len;j++){
				if(a[j]<a[min]){	//同一轮中，比较两个数，找到较小的，和其他数继续比，将这一轮中最小数的下标设为最小标志
					min = j;
				}
			}
			if(min!=i){
				t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
		}
		for(int i=0;i<len;i++){
			System.out.println(a[i]);
		}
	}
}
