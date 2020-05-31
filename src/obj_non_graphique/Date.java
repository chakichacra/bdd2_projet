package obj_non_graphique;

public class Date {
	private Integer jour;
	private Integer mois;
	private Integer year;
	private Integer heure;
	private Integer minute;
	private Integer seconde;
	
	public Date(String str) {
		String[] strList = str.split(" ");
		String[] splitHour = strList[1].split(":");
		String[] splitDate = strList[0].split("-");
		
		this.jour = Integer.parseInt(splitDate[2]);
		this.mois = Integer.parseInt(splitDate[1]);
		this.year = Integer.parseInt(splitDate[0]);
		
		this.heure = Integer.parseInt(splitHour[0]);
		this.minute = Integer.parseInt(splitHour[1]);
		this.seconde = Integer.parseInt(splitHour[2]);
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
