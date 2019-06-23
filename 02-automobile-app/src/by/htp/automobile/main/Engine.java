package by.htp.automobile.main;

public class Engine {
	
	private int horsePower;
	private String typeEngine;
	
	public Engine(int horsePower, String typeEngine) {
		 this.horsePower = horsePower;
		 this.typeEngine = typeEngine;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getTypeEngine() {
		return typeEngine;
	}

	public void setTypeEngine(String typeEngine) {
		this.typeEngine = typeEngine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horsePower;
		result = prime * result + ((typeEngine == null) ? 0 : typeEngine.hashCode());
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
		Engine other = (Engine) obj;
		if (horsePower != other.horsePower)
			return false;
		if (typeEngine == null) {
			if (other.typeEngine != null)
				return false;
		} else if (!typeEngine.equals(other.typeEngine))
			return false;
		return true;
	}

}


