package cn.edu.qdu.fistgame;

//import java.util.Scanner;

public class Person extends Player {
	// 用户输入姓名
	Scanner input =new Scanner(System.in);
	public void inputName() {
		setPlayName(input.nextLine());
	}

	public int myFist() {
		// 用户选择出拳，显示出拳结果，返回出拳值，选择错误则重新选择
		int Fist= input.nextInt();
		return Fist;
	}
	public String askContinu(){
		String yn=input.next();
		return yn;
	}
}
