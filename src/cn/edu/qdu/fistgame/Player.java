package cn.edu.qdu.fistgame;

import java.util.Scanner;

public abstract class Player {
	private String playName;//�������
	private int winningTimes;//Ӯ�Ĵ���
	Scanner input =new Scanner(System.in);
	
	public abstract int myFist();//��������ȭ
	public abstract void inputName();//��������������
	
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
}
