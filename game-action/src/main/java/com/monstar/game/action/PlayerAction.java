package com.monstar.game.action;

import com.monstar.game.service.PlayerService;
import com.monstar.game.service.impl.PlayerServiceImpl;
import com.monstar.game.util.GameUtil;

public class PlayerAction {

	PlayerService playerService = new PlayerServiceImpl();
	
	public void create(String pname) {
		
		GameUtil.printCurrTime();
		System.out.println(getClass() + " = " + pname);
		
		playerService.create(pname);
	}
}
