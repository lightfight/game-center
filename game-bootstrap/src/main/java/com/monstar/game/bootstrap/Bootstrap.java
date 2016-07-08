package com.monstar.game.bootstrap;

import java.util.Scanner;

import com.monstar.game.action.PlayerAction;

public class Bootstrap {

	static PlayerAction action = new PlayerAction();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cmd; // 命令名称
		while (true) {
			
			System.out.print("cmd>");
			cmd = input.next();
			
			if (cmd.equals("stop")) {
				input.close();
				System.exit(0);
			}else {
				action.create(cmd);
			}
		}
	}

}
