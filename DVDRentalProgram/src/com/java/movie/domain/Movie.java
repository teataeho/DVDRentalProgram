package com.java.movie.domain;

public class Movie {

	private int serialNumber;
	private String movieName;
	private String nation;
	private int pubYear;
	private int charge;
	private boolean rental;
	
	public Movie() {
	
	}

	public Movie(int serialNumber, String movieName, String nation,int pubYear, boolean rental, int charge) {
		super();
		this.serialNumber = serialNumber;
		this.movieName = movieName;
		this.nation = nation;
		this.pubYear = pubYear;
		this.charge = charge;
		this.rental = rental;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public boolean isRental() {
		return rental;
	}

	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	@Override
    public String toString() {
        String rental = this.rental ? "대여중" : "대여가능";
        return
                "## DVD번호: " + serialNumber +
                ", 영화명: " + movieName +
                ", 국가명: " + nation +
                ", 발매연도: " + pubYear + "년" +
                ", 대여료: " + charge + "원" +
                ", 대여상태: " + rental;
    }
	
}
