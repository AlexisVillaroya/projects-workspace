package module1;

import java.util.Objects;

public class Currency {
	
	private static final double USD_EUR = 1.1293309843; 
	private static final double USD_GBP = 1.333669418; 
	private static final double USD_MXN = 0.0458905516; 
	
	private double value;
	private String name;
	
	public Currency(double value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public double ConvertCurrencyToDollar(Currency c) {
		double ret = 0;
		
		if(!this.equals(c)) {
			System.out.println("Same currency");
		}else {
			switch(this.name)
			{
				case "EUR":
					ret = this.value *= USD_EUR;
				case "GBP":
					ret = this.value *= USD_GBP;
				case "MXN":
					ret = this.value *= USD_MXN;
			}
		}
		
		return ret;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
	}

	@Override
	public String toString() {
		return "Currency [value=" + value + ", name=" + name + "]";
	}
}
