package cn.edu.qdu.fistgame;

//import java.util.Scanner;

public class Person extends Player {
	// �û���������
	Scanner input =new Scanner(System.in);
	public void inputName() {
		setPlayName(input.nextLine());
	}

	public int myFist() {
		// �û�ѡ���ȭ����ʾ��ȭ��������س�ȭֵ��ѡ�����������ѡ��
		int Fist= input.nextInt();
		return Fist;
	}
	public String askContinu(){
		String yn=input.next();
		return yn;
	}
}
