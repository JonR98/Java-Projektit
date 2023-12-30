package data;

public class Muki {
	private int id;//0
	private float tilavuus;//0
	private String valmistaja;//null
	
	public Muki() {
	}

	public Muki(float tilavuus) {
		this.tilavuus=tilavuus;
	}
	public Muki(int id, float tilavuus, String valmistaja) {
		this.id=id;
		this.tilavuus=tilavuus;
		this.valmistaja=valmistaja;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTilavuus() {
		return tilavuus;
	}
	public void setTilavuus(float tilavuus) {
		this.tilavuus = tilavuus;
	}
	public String getValmistaja() {
		return valmistaja;
	}
	public void setValmistaja(String valmistaja) {
		this.valmistaja = valmistaja;
	}
	
}
