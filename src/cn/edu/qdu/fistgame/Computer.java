package cn.edu.qdu.fistgame;

import java.util.Random;
//import java.util.Scanner;

public class Computer extends Player {

	public void inputName() {
		// 用户选择电脑的姓名，选择错误则重新选择
		// Scanner input =new Scanner(System.in);
        String[] name={"刘备","孙权","曹操"};
		int i = input.nextInt();
		setPlayName(name[i-1]);

	}

	public int myFist() {
		// 电脑随机出拳，显示出拳结果，返回出拳值
		Random rand = new Random();
		int Fist = rand.nextInt(3) + 1;
		return Fist;
	}

}
