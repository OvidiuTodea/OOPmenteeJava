package main;

public class Imobil {
	
	private String tipCasa;
	private int nrEtaje;
	private double pret;
	
	public Imobil() {
		
	}
	
	public Imobil(String tipCasa, int nrEtaje, double pret) {
		this.tipCasa = tipCasa;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}
	
	public Imobil(String tipCasa, double pret) {
		this.tipCasa = tipCasa;
		this.pret = pret;
		
	}
	
	public String getTipCasa() {
		return this.tipCasa;
	}
	public void setTipCasa(String tipCasa) {
		this.tipCasa = tipCasa;
	}
	
	
	public int getNrEtaje() {
		return this.nrEtaje;
	}
	public void setNrEtaje(int nrEtaje) {
		this.nrEtaje = nrEtaje;
	}
	
	
	public double getPret() {
		return this.pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}

}
