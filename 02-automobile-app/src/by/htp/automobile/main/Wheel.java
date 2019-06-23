package by.htp.automobile.main;

public class Wheel {
	
	private int numberAxis;
	private String side;

	
	public Wheel(int numberAxis, String side) {
		 this.numberAxis = numberAxis;
		 this.side = side;
	}

	public int getNumberAxis() {
		return numberAxis;
	}

	public void setNumberAxis(int numberAxis) {
		this.numberAxis = numberAxis;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberAxis;
		result = prime * result + ((side == null) ? 0 : side.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (numberAxis != other.numberAxis)
			return false;
		if (side == null) {
			if (other.side != null)
				return false;
		} else if (!side.equals(other.side))
			return false;
		return true;
	}
}

