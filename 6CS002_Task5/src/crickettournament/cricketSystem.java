package crickettournament;

import crickettournament.cricketSystem;

public class cricketSystem implements Comparable<cricketSystem> {

	private int teamNo;
	private String teamName;
	private int nfPlayer;
	private int nfTestMatched;
	private int wonTestMatched;
	private int lostTest;
	private int drawTest;
	private int totalTestPoints;
	private int totalTestWickets;
	
	private int nfOnedayMatched;
	private int wonOnedayMatched;
	private int lostOneday;
	private int drawOneay;
	private int totalOnedayPoints;
	private int totalOnedayWickets;
	
	private int nfTwentyMatched;
	private int wonTwentyMatched;
	private int lostTwenty;    
	private int drawTwenty;
	private int totalTwentyPoints;
	private int totalTwentyWickets;
	

	public cricketSystem(int teamNo, String teamName,int nfPlayer, int nfTestMatched, int wonTestMatched, int totalTestPoints ) {
		this.teamNo = teamNo;
		this.teamName = teamName;
		this.nfPlayer = nfPlayer;
		this.nfTestMatched = nfTestMatched;
		this.wonTestMatched = wonTestMatched;
		this.totalTestPoints = totalTestPoints;
		
}


	
	
		public int getTeamNo() {
		return teamNo;
	}


	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getNfPlayer() {
		return nfPlayer;
	}


	public void setNfPlayer(int nfPlayer) {
		this.nfPlayer = nfPlayer;
	}


	public int getNfTestMatched() {
		return nfTestMatched;
	}


	public void setNfTestMatched(int nfTestMatched) {
		this.nfTestMatched = nfTestMatched;
	}


	public int getWonTestMatched() {
		return wonTestMatched;
	}


	public void setWonTestMatched(int wonTestMatched) {
		this.wonTestMatched = wonTestMatched;
	}


	public int getLostTest() {
		return lostTest;
	}


	public void setLostTest(int lostTest) {
		this.lostTest = lostTest;
	}


	public int getDrawTest() {
		return drawTest;
	}


	public void setDrawTest(int drawTest) {
		this.drawTest = drawTest;
	}


	public int getTotalTestPoints() {
		return totalTestPoints;
	}


	public void setTotalTestPoints(int totalTestPoints) {
		this.totalTestPoints = totalTestPoints;
	}


	public int getTotalTestWickets() {
		return totalTestWickets;
	}


	public void setTotalTestWickets(int totalTestWickets) {
		this.totalTestWickets = totalTestWickets;
	}


	public int getNfOnedayMatched() {
		return nfOnedayMatched;
	}


	public void setNfOnedayMatched(int nfOnedayMatched) {
		this.nfOnedayMatched = nfOnedayMatched;
	}


	public int getWonOnedayMatched() {
		return wonOnedayMatched;
	}


	public void setWonOnedayMatched(int wonOnedayMatched) {
		this.wonOnedayMatched = wonOnedayMatched;
	}


	public int getLostOneday() {
		return lostOneday;
	}


	public void setLostOneday(int lostOneday) {
		this.lostOneday = lostOneday;
	}


	public int getDrawOneay() {
		return drawOneay;
	}


	public void setDrawOneay(int drawOneay) {
		this.drawOneay = drawOneay;
	}


	public int getTotalOnedayPoints() {
		return totalOnedayPoints;
	}


	public void setTotalOnedayPoints(int totalOnedayPoints) {
		this.totalOnedayPoints = totalOnedayPoints;
	}


	public int getTotalOnedayWickets() {
		return totalOnedayWickets;
	}


	public void setTotalOnedayWickets(int totalOnedayWickets) {
		this.totalOnedayWickets = totalOnedayWickets;
	}


	public int getNfTwentyMatched() {
		return nfTwentyMatched;
	}


	public void setNfTwentyMatched(int nfTwentyMatched) {
		this.nfTwentyMatched = nfTwentyMatched;
	}


	public int getWonTwentyMatched() {
		return wonTwentyMatched;
	}


	public void setWonTwentyMatched(int wonTwentyMatched) {
		this.wonTwentyMatched = wonTwentyMatched;
	}


	public int getLostTwenty() {
		return lostTwenty;
	}


	public void setLostTwenty(int lostTwenty) {
		this.lostTwenty = lostTwenty;
	}


	public int getDrawTwenty() {
		return drawTwenty;
	}


	public void setDrawTwenty(int drawTwenty) {
		this.drawTwenty = drawTwenty;
	}


	public int getTotalTwentyPoints() {
		return totalTwentyPoints;
	}


	public void setTotalTwentyPoints(int totalTwentyPoints) {
		this.totalTwentyPoints = totalTwentyPoints;
	}


	public int getTotalTwentyWickets() {
		return totalTwentyWickets;
	}


	public void setTotalTwentyWickets(int totalTwentyWickets) {
		this.totalTwentyWickets = totalTwentyWickets;
	}
	public String toString() {
		return teamNo+"  "+teamName+"       "+nfPlayer+"         "+nfTestMatched + "   " +wonTestMatched+"  "+totalTestPoints;
		}
	@Override
	public int compareTo(cricketSystem arg) {
		// TODO Auto-generated method stub
		return 0;
	}









}
