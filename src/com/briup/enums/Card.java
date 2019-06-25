package com.briup.enums;

import java.util.ArrayList;
import java.util.List;

public class Card {

	public enum Rank{
		DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIgHT,NINE,JACK,QUEEN,KING,ACE
	}
	public enum Suit{
		CLUBS,DIAMONDS,HEARTS,SPADES
	}
	
	private final Rank rank;
	private final Suit suit;
	
	private Card(Rank rank,Suit suit){
		this.rank = rank;
		this.suit = suit;
	}
	public Rank getRand(){return rank;}
	public Suit getSuit(){return suit;}
	public String toString(){return rank+" of "+suit;}
	
	private static final List<Card> protoDeck = new ArrayList<Card>();
	
	static{
		for(Suit suit:Suit.values()){
			for(Rank rank : Rank.values()){
				protoDeck.add(new Card(rank, suit));
			}
		}
	}
	
	public static ArrayList<Card> newDeck(){
		return new ArrayList<Card>(protoDeck);
	}
}
