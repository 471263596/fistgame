package cn.edu.qdu.fistgame;


public class Judge {
	static Judge judge = new Judge();// 实例化来调用此类方法及参数
	private Computer computer = new Computer();
	private Person person = new Person();
	private int total = 0;// 比赛总局数

	public static void main(String[] args) {
		judge.startGame();// 开始游戏的菜单及说明
		judge.askName();// 询问电脑及用户姓名
		judge.playGame();// 猜拳游戏内容

		
	}

	public void startGame() {
		// 开始游戏的菜单及说明
		System.out.println("\t******************");
		System.out.println("\t**   猜拳，开始   **");
		System.out.println("\t******************\n");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
	}

	public void askName() {
		// 询问电脑及用户姓名
		System.out.print("请选择对方角色（1：刘备 2.孙权 3.曹操）：");
		computer.inputName();

		System.out.print("请输入你的姓名：");
		person.inputName();
		System.out.println(person.getPlayName() + "  VS  " + computer.getPlayName() + " 对战\n");
	}

	public void playGame() {
		// 猜拳游戏内容
		String yn = null;
		do {
			System.out.print("请出拳：1.剪刀 2.石头 3.布（输入相应数字）：");
			int a = person.myFist();
			int b = computer.myFist();
			if (b == 1) {
				System.out.println(computer.getPlayName() + "出拳：剪刀");
			} else if (b == 2) {
				System.out.println(computer.getPlayName() + "出拳：石头");
			} else {
				System.out.println(computer.getPlayName() + "出拳：布");
			}
			if ((a > b && (a != 3 || b != 1)) || (a == 1 && b == 3)) {
				System.out.println("结果是：你赢了！");
				person.setWinningTimes(person.getWinningTimes() + 1);
			} else if (a == b ) {
				System.out.println("结果是：平局...");
			} else {
				System.out.println("结果是：(●'◡'●)你输了，真笨！");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.println("\n");
			System.out.print("是否开始下一轮（y/n）:");
	    	yn=person.askContinu();
        	System.out.println("--------------------------------------------------------");

		} while (yn.equals("y"));
		if (yn.equals("n")) {
			judge.finalResult();// 宣布游戏结果
		}

	}

	public void finalResult() {
		// 宣布游戏结果
		System.out.println(computer.getPlayName() + "  VS  " + person.getPlayName());
		System.out.println("对战次数：" + total+"\n");
		System.out.println("姓名\t得分");
		System.out.println(person.getPlayName() + "\t" + person.getWinningTimes());
		System.out.println(computer.getPlayName() + "\t" + computer.getWinningTimes()+"\n");
		if (person.getWinningTimes() < computer.getWinningTimes()) {
			System.out.println("结果：呵呵，笨笨，下次加油啊！");
		} else if (person.getWinningTimes() > computer.getWinningTimes()) {
			System.out.println("结果：(*@ο@*)~你真棒");
		} else {
			System.out.println("结果：不相上下，再接再厉");
		}
		System.out.println("--------------------------------------------------------");

	}
}
