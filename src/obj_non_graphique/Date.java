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
	public Date() {
		this.jour = null;
	}
	
	public String toSQLFormat() {
		String ret;
		ret = this.year.toString() + "-" + this.mois.toString() + "-" + this.jour + " "
				+ this.heure.toString()+ ":" + this.minute.toString() + ":" + this.seconde.toString();
		return ret;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSeconde() {
		return seconde;
	}

	public void setSeconde(Integer seconde) {
		this.seconde = seconde;
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
