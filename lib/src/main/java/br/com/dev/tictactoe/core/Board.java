package br.com.dev.tictactoe.core;

import br.com.dev.tictactoe.Constants;
import br.com.dev.tictactoe.ui.UI;

public class Board {
	private char[][] matrix;
	
	public Board() {
		matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();
	}
	
	public void clear() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
			
		}
	}
		
	
	public void print() {
		UI.printNewLine();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));
				if(j < matrix[i].length - 1) UI.printTextWithNoNewLine("  |  ");
			}
			UI.printNewLine();
			if(i < matrix[i].length - 1) UI.printText("--------------");
			
		}
		
	}
	
	public boolean isFull(){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == ' ') return false;
			}
			
		}
		return true;
	}
		
	
	public boolean play(Player player, Move move) {
		int i = move.getI();
		int j = move.getJ();
		
		//TODO checar se jogador ganhou
		matrix[i][j] = player.getSymbol();
		return false;
	}

}
