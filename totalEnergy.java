package revision;

import java.util.Scanner;

public class lec1 {
	public static int totalEnergy(int initialEnergy, int rate,int timeN) {
		int answer =0;
		answer = ((timeN)*(2*initialEnergy + (timeN-1)*rate))/2;
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int initialEnergy = scn.nextInt();
		int rate = scn.nextInt();
		int timeN = scn.nextInt();
		int result = totalEnergy(initialEnergy, rate, timeN);
		System.out.println(result);
	}
}
