package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Address {

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("countryCode")
    @Expose
    private String countryCode;

    @SerializedName("county")
    @Expose
    private String county;

    @SerializedName("district")
    @Expose
    private String district;

    @SerializedName("landmark")
    @Expose
    private String landmark;

    @SerializedName("latitude")
    @Expose
    private Double latitude;

    @SerializedName("longitude")
    @Expose
    private Double longitude;

    @SerializedName("state")
    @Expose
    private String state;

    @Generated
    public Address() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Address;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        if (!address.canEqual(this)) {
            return false;
        }
        Double latitude = getLatitude();
        Double latitude2 = address.getLatitude();
        if (latitude != null ? !latitude.equals(latitude2) : latitude2 != null) {
            return false;
        }
        Double longitude = getLongitude();
        Double longitude2 = address.getLongitude();
        if (longitude != null ? !longitude.equals(longitude2) : longitude2 != null) {
            return false;
        }
        String country = getCountry();
        String country2 = address.getCountry();
        if (country != null ? !country.equals(country2) : country2 != null) {
            return false;
        }
        String state = getState();
        String state2 = address.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        String county = getCounty();
        String county2 = address.getCounty();
        if (county != null ? !county.equals(county2) : county2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = address.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String district = getDistrict();
        String district2 = address.getDistrict();
        if (district != null ? !district.equals(district2) : district2 != null) {
            return false;
        }
        String landmark = getLandmark();
        String landmark2 = address.getLandmark();
        if (landmark != null ? !landmark.equals(landmark2) : landmark2 != null) {
            return false;
        }
        String countryCode = getCountryCode();
        String countryCode2 = address.getCountryCode();
        return countryCode != null ? countryCode.equals(countryCode2) : countryCode2 == null;
    }

    @Generated
    public String getCity() {
        return this.city;
    }

    @Generated
    public String getCountry() {
        return this.country;
    }

    @Generated
    public String getCountryCode() {
        return this.countryCode;
    }

    @Generated
    public String getCounty() {
        return this.county;
    }

    @Generated
    public String getDistrict() {
        return this.district;
    }

    @Generated
    public String getLandmark() {
        return this.landmark;
    }

    @Generated
    public Double getLatitude() {
        return this.latitude;
    }

    @Generated
    public Double getLongitude() {
        return this.longitude;
    }

    @Generated
    public String getState() {
        return this.state;
    }

    @Generated
    public int hashCode() {
        Double latitude = getLatitude();
        int hashCode = latitude == null ? 43 : latitude.hashCode();
        Double longitude = getLongitude();
        int hashCode2 = ((hashCode + 59) * 59) + (longitude == null ? 43 : longitude.hashCode());
        String country = getCountry();
        int hashCode3 = (hashCode2 * 59) + (country == null ? 43 : country.hashCode());
        String state = getState();
        int hashCode4 = (hashCode3 * 59) + (state == null ? 43 : state.hashCode());
        String county = getCounty();
        int hashCode5 = (hashCode4 * 59) + (county == null ? 43 : county.hashCode());
        String city = getCity();
        int hashCode6 = (hashCode5 * 59) + (city == null ? 43 : city.hashCode());
        String district = getDistrict();
        int hashCode7 = (hashCode6 * 59) + (district == null ? 43 : district.hashCode());
        String landmark = getLandmark();
        int i = hashCode7 * 59;
        int hashCode8 = landmark == null ? 43 : landmark.hashCode();
        String countryCode = getCountryCode();
        return ((i + hashCode8) * 59) + (countryCode != null ? countryCode.hashCode() : 43);
    }

    @Generated
    public void setCity(String str) {
        this.city = str;
    }

    @Generated
    public void setCountry(String str) {
        this.country = str;
    }

    @Generated
    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    @Generated
    public void setCounty(String str) {
        this.county = str;
    }

    @Generated
    public void setDistrict(String str) {
        this.district = str;
    }

    @Generated
    public void setLandmark(String str) {
        this.landmark = str;
    }

    @Generated
    public void setLatitude(Double d) {
        this.latitude = d;
    }

    @Generated
    public void setLongitude(Double d) {
        this.longitude = d;
    }

    @Generated
    public void setState(String str) {
        this.state = str;
    }

    @Generated
    public String toString() {
        return "Address(country=" + getCountry() + ", state=" + getState() + ", county=" + getCounty() + ", city=" + getCity() + ", district=" + getDistrict() + ", landmark=" + getLandmark() + ", latitude=" + getLatitude() + ", longitude=" + getLongitude() + ", countryCode=" + getCountryCode() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
