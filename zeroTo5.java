package code;

import java.util.*;
public class zeroto5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-->0) {
			int sum =0;
			int n = scn.nextInt();
			Integer[] arr = new Integer[n];
			for(int i=0;i<n;i++) {
				arr[i] = scn.nextInt();
			}
			Arrays.sort(arr);
			boolean flag = false;
			for(int i=0;i<n;i++) {
				int cnt = count9(arr[i]);
				if(cnt !=0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				Arrays.sort(arr);
				sum = arr[n-1]+arr[n-2]+arr[n-3];
				System.out.println(sum);
			}else {
				sortBySetBitCount(arr, n);
				sum = arr[n-1];
				int l = 2;
				if(count9(arr[n-2])!=0) {
					sum +=arr[n-2];
					l--;
				}
				if(count9(arr[n-3])!=0) {
					sum +=arr[n-3];
					l--;
				}
				if(l==0) {
					System.out.println(sum);
				}else {
					while(l!=0) {
						Arrays.sort(arr);
						int len = arr.length-1;
						while(len!=0) {
							if(count9(arr[len])==0) {
								sum+=arr[len];
								l--;
							}
							if(l==0) {
								break;
							}
							len--;
						}
					}
					System.out.println(sum);
				}
				
			}
			
		}
	}
	private static Integer[] sortBySetBitCount(Integer[] arr, int n)
	    {
	        Arrays.sort(arr, new Comparator<Integer>() {
	            @Override
	            public int compare(Integer arg0, Integer arg1)
	            {
	                int c1 = count9(arg0);
	                int c2 = count9(arg1);
	                if (c1 >= c2)
	                    return 1;
	                else
	                    return -1;
	            }
	        });
	        return arr;
	    }
	public static int count9(int n) {
		int cnt =0;
		while(n>0) {
			if(n%10==9) {
				cnt++;
			}
			n/=10;
		}
		return cnt;
	}

}
