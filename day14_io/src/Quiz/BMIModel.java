package Quiz;

import java.io.Serializable;

public class BMIModel {

}

class BMI implements Serializable {
	protected String name;
	protected Double weight;
	protected Double heigth;
	protected Double bmi;




	public BMI( String name, Double heigth, Double weigth ) {
		this.name = name;
		this.weight = weigth;
		this.heigth = heigth;
		setBmi();

	}


	@Override
	public String toString() {
		return name + "님의 BMI지수는 "
				+ String.format("%.2f 입니다.", bmi);
	}

	// getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
//		System.out.println(this.name + " " + name);
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}


	public void setWeight(Double weight) {
//		System.out.println(this.weight + " " + weight);
		this.weight = weight;
	}


	public Double getHeigth() {
		return heigth;
	}


	public void setHeigth(Double heigth) {
//		System.out.println(this.heigth + " " + heigth);
		this.heigth = heigth;
	}


	public Double getBmi() {
		return bmi;
	}


	public void setBmi() {
		bmi = ( weight / ( (heigth / 100.0) * ( heigth / 100.0)) );
	}


}
