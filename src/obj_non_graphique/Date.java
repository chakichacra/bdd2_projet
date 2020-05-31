package obj_non_graphique;

public class Date {
	private Integer jour;
	private Integer mois;
	private Integer heure;
	private Integer minute;
	
	public Date(String str) {
		System.out.println(str);
	}
	
	public String getString() {
		String ret;
		ret = this.jour.toString() + "/" + this.mois.toString() +
				" " + this.heure + ":" + this.minute.toString();
		return ret;
	}

	public Integer getJour() {
		return jour;
	}

	public void setJour(Integer jour) {
		this.jour = jour;
	}

	public Integer getMois() {
		return mois;
	}

	public void setMois(Integer mois) {
		this.mois = mois;
	}

	public Integer getHeure() {
		return heure;
	}

	public void setHeure(Integer heure) {
		this.heure = heure;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

}
