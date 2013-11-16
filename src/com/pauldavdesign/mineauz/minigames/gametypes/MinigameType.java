package com.pauldavdesign.mineauz.minigames.gametypes;

public enum MinigameType {
	SINGLEPLAYER("Singleplayer"),
	FREE_FOR_ALL("Free For All"),
	TEAMS("Teams"),
	TREASURE_HUNT("Treasure Hunt");
	
	private String name;
	
	private MinigameType(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
