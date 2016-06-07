package com.goeuro.com.goeuro.models;
                
public class Country
{
    private int countryId;

    private boolean inEurope;

    private int locationId;

    private String countryCode;

    private String iata_airport_code;

    private String type;

    private String country;

    private boolean coreCountry;

    private GeoPosition geo_position;

    private String distance;

    private int _id;

    private Names names;

    private String name;

    private String fullName;

    private AlternativeNames alternativeNames;

    private String key;

    public Country() {
		// TODO Auto-generated constructor stub
	}

    public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public boolean isInEurope() {
		return inEurope;
	}

	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIata_airport_code() {
		return iata_airport_code;
	}

	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isCoreCountry() {
		return coreCountry;
	}

	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	public GeoPosition getGeoPosition() {
		return geo_position;
	}

	public void setGeoPosition(GeoPosition geoPosition) {
		this.geo_position = geoPosition;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public Names getNames() {
		return names;
	}

	public void setNames(Names names) {
		this.names = names;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public AlternativeNames getAlternativeNames() {
		return alternativeNames;
	}

	public void setAlternativeNames(AlternativeNames alternativeNames) {
		this.alternativeNames = alternativeNames;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
    public String toString()
    {
        return "ClassPojo [countryId = "+countryId+", inEurope = "+inEurope+", locationId = "+locationId+", countryCode = "+countryCode+", iata_airport_code = "+iata_airport_code+", type = "+type+", country = "+country+", coreCountry = "+coreCountry+", geo_position = "+geo_position+", distance = "+distance+", _id = "+_id+", names = "+names+", name = "+name+", fullName = "+fullName+", alternativeNames = "+alternativeNames+", key = "+key+"]";
    }
}
			