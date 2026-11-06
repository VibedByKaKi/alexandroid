package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LocationInfo {

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("countryIso3Code")
    @Expose
    private String countryIso3Code;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("stateCode")
    @Expose
    private String stateCode;

    @Generated
    public LocationInfo() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof LocationInfo;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationInfo)) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) obj;
        if (!locationInfo.canEqual(this)) {
            return false;
        }
        String state = getState();
        String state2 = locationInfo.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        String stateCode = getStateCode();
        String stateCode2 = locationInfo.getStateCode();
        if (stateCode != null ? !stateCode.equals(stateCode2) : stateCode2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = locationInfo.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String country = getCountry();
        String country2 = locationInfo.getCountry();
        if (country != null ? !country.equals(country2) : country2 != null) {
            return false;
        }
        String countryIso3Code = getCountryIso3Code();
        String countryIso3Code2 = locationInfo.getCountryIso3Code();
        return countryIso3Code != null ? countryIso3Code.equals(countryIso3Code2) : countryIso3Code2 == null;
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
    public String getCountryIso3Code() {
        return this.countryIso3Code;
    }

    @Generated
    public String getState() {
        return this.state;
    }

    @Generated
    public String getStateCode() {
        return this.stateCode;
    }

    @Generated
    public int hashCode() {
        String state = getState();
        int hashCode = state == null ? 43 : state.hashCode();
        String stateCode = getStateCode();
        int hashCode2 = ((hashCode + 59) * 59) + (stateCode == null ? 43 : stateCode.hashCode());
        String city = getCity();
        int hashCode3 = (hashCode2 * 59) + (city == null ? 43 : city.hashCode());
        String country = getCountry();
        int i = hashCode3 * 59;
        int hashCode4 = country == null ? 43 : country.hashCode();
        String countryIso3Code = getCountryIso3Code();
        return ((i + hashCode4) * 59) + (countryIso3Code != null ? countryIso3Code.hashCode() : 43);
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
    public void setCountryIso3Code(String str) {
        this.countryIso3Code = str;
    }

    @Generated
    public void setState(String str) {
        this.state = str;
    }

    @Generated
    public void setStateCode(String str) {
        this.stateCode = str;
    }

    @Generated
    public String toString() {
        return "LocationInfo(state=" + getState() + ", stateCode=" + getStateCode() + ", city=" + getCity() + ", country=" + getCountry() + ", countryIso3Code=" + getCountryIso3Code() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
