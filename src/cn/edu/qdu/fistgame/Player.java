package cn.edu.qdu.fistgame;

import java.util.Scanner;

public abstract class Player {
	private String playName;//玩家姓名
	private int winningTimes;//赢的次数
	
	public abstract int myFist();//方法：出拳
	public abstract void inputName();//方法：输入姓名
	
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
