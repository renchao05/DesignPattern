package com.renchao.command;

public class RemoteController {

	// 开 按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;

	// 执行撤销的命令
	Command undoCommand;

	// 构造器，完成对按钮初始化
	public RemoteController() {
		onCommands = new Command[5];	//初始化5，代表可以命令5个设备
		offCommands = new Command[5];

		for (int i = 0; i < 5; i++) {
			onCommands[i] = new NullCommand();	//空命令
			offCommands[i] = new NullCommand();
		}
	}

	// 给我们的按钮设置你需要的命令
	public void setCommand(int receiver, Command onCommand, Command offCommand) {
		onCommands[receiver] = onCommand;
		offCommands[receiver] = offCommand;
	}

	// 按下 开 按钮
	public void onButtonWasPushed(int receiver) { // receiver 0
		// 找到你按下的开的按钮， 并调用对应方法
		onCommands[receiver].execute();
		// 记录这次的操作，用于撤销
		undoCommand = onCommands[receiver];

	}

	// 按下 关 按钮
	public void offButtonWasPushed(int receiver) { // receiver 0
		// 找到你按下的关的按钮， 并调用对应方法
		offCommands[receiver].execute();
		// 记录这次的操作，用于撤销
		undoCommand = offCommands[receiver];

	}
	
	// 按下撤销按钮
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
