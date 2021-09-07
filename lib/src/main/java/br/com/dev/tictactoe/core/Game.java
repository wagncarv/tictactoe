package br.com.dev.tictactoe.core;

import br.com.dev.tictactoe.Constants;
import br.com.dev.tictactoe.ui.UI;

public class Game {
	
	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		UI.printGameTitle();
		
		board.print();
		
	}

}
