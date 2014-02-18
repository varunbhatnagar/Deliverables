package bean;

public class Location {
	private int locationId;
	private String locationName;
	private String locationAddLine1;
	private String locationAddLine2;
	private String locationCity;
	private String locationState;
	private String locationPinCode;
	private String locationMobileNo;
										//Bean class for filling and throwing data info for an object
							//of the type Location (mostly corresponding to Location table attributes)

	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationAddLine1() {
		return locationAddLine1;
	}
	public void setLocationAddLine1(String locationAddLine1) {
		this.locationAddLine1 = locationAddLine1;
	}
	public String getLocationAddLine2() {
		return locationAddLine2;
	}
	public void setLocationAddLine2(String locationAddLine2) {
		this.locationAddLine2 = locationAddLine2;
	}
	public String getLocationCity() {
		return locationCity;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getLocationState() {
		return locationState;
	}
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	public String getLocationPinCode() {
		return locationPinCode;
	}
	public void setLocationPinCode(String locationPinCode) {
		this.locationPinCode = locationPinCode;
	}
	public String getLocationMobileNo() {
		return locationMobileNo;
	}
	public void setLocationMobileNo(String locationMobileNo) {
		this.locationMobileNo = locationMobileNo;
	}


}
