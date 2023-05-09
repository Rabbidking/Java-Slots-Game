//John Bickel
//2/1/17
//ETEC2401-01
//Lab 2 - SlotsGame

package edu.ssu.slotsgame.logic;

public class EduSsuSlotsgameLogic {
    public static void main(String[] args) {
        betManager betManager = new betManager();
		// Test 1: increaseBet increases currentBet_ by one
		// assume MIN_BET < MAX_BET
		betManager.currentBet = betManager.MIN_BET;
		betManager.increaseBet();
		
		String failStr = "Test 1 (increaseBet): FAILED " + 
		"(currentBet was " + betManager.currentBet + ", should have been " + 
		(betManager.MIN_BET + 1)+")";
		assert (betManager.currentBet == betManager.MIN_BET + 1) : failStr;
		
		String passStr = "Test 1 (increaseBet): PASSED " + 
		"(currentBet was increased by 1)";
		System.out.println(passStr);
                
                // Test 2: Test that increaseBet will not increase currentBet
                // if it’s already the maximum allowed.
                betManager.currentBet = betManager.MAX_BET;
                betManager.increaseBet();
                
                String failStr2 = "Test 2 (don't increaseBet over MAX_BET): FAILED " +
                "(currentBet was " + betManager.currentBet + ", should have been " +
                (betManager.MAX_BET - 1)+")";
                assert (betManager.currentBet == betManager.MAX_BET - 1) : failStr2;
                
                String passStr2 = "Test 2 (don't increaseBet over MAX_BET): PASSED " +
                "(currentBet did not exceed MAX_BET)";
                System.out.println(passStr2);
                
                // Test 3: decreaseBet decreases bet by 1
                betManager.decreaseBet();
                
                String failStr3 = "Test 3 (decreaseBet) : FAILED " +
                "(currentBet was " + betManager.currentBet + ", should have been " +
                (betManager.MIN_BET - 1) +")";
                assert (betManager.currentBet == betManager.currentBet - 1): failStr3;
                
                String passStr3 = "Test 3 (decreaseBet): PASSED " + 
                "(currentBet was decreased by 1)";
                System.out.println(passStr3);
                
                // Test 4: decreaseBet will not decrease currentBet if it's
                // already at the minimum
                betManager.currentBet = betManager.MIN_BET;
                betManager.decreaseBet();
                
                String failStr4 = "Test 4 (don't decreaseBet over MIN_BET): FAILED " +
                "(currentBet was " + betManager.currentBet + ", should have been " +
                (betManager.MIN_BET + 1)+")";
                assert (betManager.currentBet == betManager.MIN_BET + 1) : failStr4;
                
                String passStr4 = "Test 4 (don't decreaseBet over MIN_BET): PASSED " +
                "(currentBet did not exceed MIN_BET)";
                System.out.println(passStr4);
    }
    
}
