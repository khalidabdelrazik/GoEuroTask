package com.goeuro.com.goeuro.models;
                
public class GeoPosition
{
	public GeoPosition() {
		// TODO Auto-generated constructor stub
	}
    private double longitude;

    private double latitude;

    public double getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (double longitude)
    {
        this.longitude = longitude;
    }

    public double getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (double latitude)
    {
        this.latitude = latitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [longitude = "+longitude+", latitude = "+latitude+"]";
    }
}
			
			