package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class AeroPorto {
	
	private double dimensioneSqMeters;
	private double dimensioneSqMetersIntatti;
	
	public void setDimensioneSqMeters(double i) {
		this.dimensioneSqMeters = i;
		this.dimensioneSqMetersIntatti = i;
	}

	public double getDimensioneSqMeters() {
		return this.dimensioneSqMeters;
	}

	public double getDimensioneSqMetersNonDistrutta() {
		if(this.dimensioneSqMetersIntatti < 0) {
			return 0;
		} else {
			return this.dimensioneSqMetersIntatti;
		}
	}

	public void addMetriQuadriDistrutti(double d) {
		this.dimensioneSqMetersIntatti -= d;
	}

}
