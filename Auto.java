public class Auto{
	String mark;
	String kytus;
	double mootor = 0;

	public Auto (String mark, String kytus, double mootor){
		this.mark = mark;
		this.kytus = kytus;
		this.mootor = mootor;
	}

	public String getMark(){
		return mark;
	}

	public String getKytus(){
		return kytus;
	}

	public double getMootor(){
		return mootor;
	}

	public String toString(){
		return "Auto mark on: " + getMark() + "\nAuto kasutab kütust: " + getKytus() + "\nAuto mootori suurus on: " + getMootor();
	}
}	