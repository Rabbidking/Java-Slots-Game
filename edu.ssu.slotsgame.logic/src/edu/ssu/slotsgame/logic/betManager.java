//John Bickel
//2/1/17
//ETEC2401-01
//Lab 2 - SlotsGame

package edu.ssu.slotsgame.logic;

public class betManager {
    
    int currentBet;
    int MIN_BET;
    int MAX_BET;
    
    betManager(){
        
        this.currentBet = 1;
        this.MIN_BET = 1;
        this.MAX_BET = 10;
        
    }
    
    void increaseBet(){
        
        this.currentBet = this.currentBet + 1;
		if (this.currentBet >= MAX_BET)
		{
			this.currentBet = 10;
		}
        
    }
    
    void decreaseBet()
	{
		this.currentBet = this.MIN_BET - 1;
		if (this.currentBet <= 1)
		{
			this.currentBet = 1;
		}
	}

}