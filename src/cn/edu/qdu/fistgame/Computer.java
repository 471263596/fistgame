package cn.edu.qdu.fistgame;

import java.util.Random;
//import java.util.Scanner;

public class Computer extends Player {

	public void inputName() {
		// �û�ѡ����Ե�������ѡ�����������ѡ��
		// Scanner input =new Scanner(System.in);
        String[] name={"����","��Ȩ","�ܲ�"};
		int i = input.nextInt();
		setPlayName(name[i-1]);

	}

	public int myFist() {
		// ���������ȭ����ʾ��ȭ��������س�ȭֵ
		Random rand = new Random();
		int Fist = rand.nextInt(3) + 1;
		return Fist;
	}

}
