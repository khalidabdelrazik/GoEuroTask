package com.goeuro.app.models;
                
// TODO: Auto-generated Javadoc
/**
 * The Class GeoPosition.
 */
public class GeoPosition
{
	
	/**
	 * Instantiates a new geo position.
	 */
	public GeoPosition() {
		// TODO Auto-generated constructor stub
	}
    
    /** The longitude. */
    private double longitude;

    /** The latitude. */
    private double latitude;

    /**
     * Gets the longitude.
     *
     * @return the longitude
     */
    public double getLongitude ()
    {
        return longitude;
    }

    /**
     * Sets the longitude.
     *
     * @param longitude the new longitude
     */
    public void setLongitude (double longitude)
    {
        this.longitude = longitude;
    }

    /**
     * Gets the latitude.
     *
     * @return the latitude
     */
    public double getLatitude ()
    {
        return latitude;
    }

    /**
     * Sets the latitude.
     *
     * @param latitude the new latitude
     */
    public void setLatitude (double latitude)
    {
        this.latitude = latitude;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return longitude + "," + latitude;
    }
}
			
			