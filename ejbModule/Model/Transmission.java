package Model;

public class Transmission {
	
	TransmissionType transmissionType;
	
	private int serialNumber;
	@Column(name="serialNumber")
	public int getserialNumber() {
		return serialNumber;
	}

	public void setPower(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}
