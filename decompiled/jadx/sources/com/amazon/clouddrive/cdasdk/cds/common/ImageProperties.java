package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ImageProperties {

    @SerializedName("apertureValue")
    @Expose
    private String apertureValue;

    @SerializedName(AmazonPhotosConstants.CAPTURE_MODE_KEY)
    @Expose
    private String captureMode;

    @SerializedName("colorSpace")
    @Expose
    private String colorSpace;

    @SerializedName("dateTime")
    @Expose
    private String dateTime;

    @SerializedName("dateTimeDigitized")
    @Expose
    private String dateTimeDigitized;

    @SerializedName("dateTimeOriginal")
    @Expose
    private String dateTimeOriginal;

    @SerializedName("exposureMode")
    @Expose
    private String exposureMode;

    @SerializedName("exposureProgram")
    @Expose
    private String exposureProgram;

    @SerializedName("exposureTime")
    @Expose
    private String exposureTime;

    @SerializedName("flash")
    @Expose
    private String flash;

    @SerializedName("focalLength")
    @Expose
    private String focalLength;

    @SerializedName("gpsDateStamp")
    @Expose
    private String gpsDateStamp;

    @SerializedName("gpsTimeStamp")
    @Expose
    private String gpsTimeStamp;

    @SerializedName("height")
    @Expose
    private Integer height;

    @SerializedName("isoSpeedRatings")
    @Expose
    private String isoSpeedRatings;

    @SerializedName("location")
    @Expose
    private String location;

    @SerializedName("make")
    @Expose
    private String make;

    @SerializedName("meteringMode")
    @Expose
    private String meteringMode;

    @SerializedName(ModelSourceWrapper.ORIENTATION)
    @Expose
    private String orientation;

    @SerializedName("resolutionUnit")
    @Expose
    private String resolutionUnit;

    @SerializedName("sensingMethod")
    @Expose
    private String sensingMethod;

    @SerializedName("sharpness")
    @Expose
    private String sharpness;

    @SerializedName("software")
    @Expose
    private String software;

    @SerializedName("subSecTime")
    @Expose
    private String subSecTime;

    @SerializedName("subSecTimeDigitized")
    @Expose
    private String subSecTimeDigitized;

    @SerializedName("subSecTimeOriginal")
    @Expose
    private String subSecTimeOriginal;

    @SerializedName("whiteBalance")
    @Expose
    private String whiteBalance;

    @SerializedName("width")
    @Expose
    private Integer width;

    @SerializedName("xResolution")
    @Expose
    private String xResolution;

    @SerializedName("yResolution")
    @Expose
    private String yResolution;

    @Generated
    public ImageProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ImageProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageProperties)) {
            return false;
        }
        ImageProperties imageProperties = (ImageProperties) obj;
        if (!imageProperties.canEqual(this)) {
            return false;
        }
        Integer height = getHeight();
        Integer height2 = imageProperties.getHeight();
        if (height != null ? !height.equals(height2) : height2 != null) {
            return false;
        }
        Integer width = getWidth();
        Integer width2 = imageProperties.getWidth();
        if (width != null ? !width.equals(width2) : width2 != null) {
            return false;
        }
        String make = getMake();
        String make2 = imageProperties.getMake();
        if (make != null ? !make.equals(make2) : make2 != null) {
            return false;
        }
        String isoSpeedRatings = getIsoSpeedRatings();
        String isoSpeedRatings2 = imageProperties.getIsoSpeedRatings();
        if (isoSpeedRatings != null ? !isoSpeedRatings.equals(isoSpeedRatings2) : isoSpeedRatings2 != null) {
            return false;
        }
        String exposureTime = getExposureTime();
        String exposureTime2 = imageProperties.getExposureTime();
        if (exposureTime != null ? !exposureTime.equals(exposureTime2) : exposureTime2 != null) {
            return false;
        }
        String apertureValue = getApertureValue();
        String apertureValue2 = imageProperties.getApertureValue();
        if (apertureValue != null ? !apertureValue.equals(apertureValue2) : apertureValue2 != null) {
            return false;
        }
        String dateTimeOriginal = getDateTimeOriginal();
        String dateTimeOriginal2 = imageProperties.getDateTimeOriginal();
        if (dateTimeOriginal != null ? !dateTimeOriginal.equals(dateTimeOriginal2) : dateTimeOriginal2 != null) {
            return false;
        }
        String flash = getFlash();
        String flash2 = imageProperties.getFlash();
        if (flash != null ? !flash.equals(flash2) : flash2 != null) {
            return false;
        }
        String focalLength = getFocalLength();
        String focalLength2 = imageProperties.getFocalLength();
        if (focalLength != null ? !focalLength.equals(focalLength2) : focalLength2 != null) {
            return false;
        }
        String dateTime = getDateTime();
        String dateTime2 = imageProperties.getDateTime();
        if (dateTime != null ? !dateTime.equals(dateTime2) : dateTime2 != null) {
            return false;
        }
        String dateTimeDigitized = getDateTimeDigitized();
        String dateTimeDigitized2 = imageProperties.getDateTimeDigitized();
        if (dateTimeDigitized != null ? !dateTimeDigitized.equals(dateTimeDigitized2) : dateTimeDigitized2 != null) {
            return false;
        }
        String software = getSoftware();
        String software2 = imageProperties.getSoftware();
        if (software != null ? !software.equals(software2) : software2 != null) {
            return false;
        }
        String orientation = getOrientation();
        String orientation2 = imageProperties.getOrientation();
        if (orientation != null ? !orientation.equals(orientation2) : orientation2 != null) {
            return false;
        }
        String colorSpace = getColorSpace();
        String colorSpace2 = imageProperties.getColorSpace();
        if (colorSpace != null ? !colorSpace.equals(colorSpace2) : colorSpace2 != null) {
            return false;
        }
        String meteringMode = getMeteringMode();
        String meteringMode2 = imageProperties.getMeteringMode();
        if (meteringMode != null ? !meteringMode.equals(meteringMode2) : meteringMode2 != null) {
            return false;
        }
        String exposureProgram = getExposureProgram();
        String exposureProgram2 = imageProperties.getExposureProgram();
        if (exposureProgram != null ? !exposureProgram.equals(exposureProgram2) : exposureProgram2 != null) {
            return false;
        }
        String exposureMode = getExposureMode();
        String exposureMode2 = imageProperties.getExposureMode();
        if (exposureMode != null ? !exposureMode.equals(exposureMode2) : exposureMode2 != null) {
            return false;
        }
        String sharpness = getSharpness();
        String sharpness2 = imageProperties.getSharpness();
        if (sharpness != null ? !sharpness.equals(sharpness2) : sharpness2 != null) {
            return false;
        }
        String whiteBalance = getWhiteBalance();
        String whiteBalance2 = imageProperties.getWhiteBalance();
        if (whiteBalance != null ? !whiteBalance.equals(whiteBalance2) : whiteBalance2 != null) {
            return false;
        }
        String sensingMethod = getSensingMethod();
        String sensingMethod2 = imageProperties.getSensingMethod();
        if (sensingMethod != null ? !sensingMethod.equals(sensingMethod2) : sensingMethod2 != null) {
            return false;
        }
        String xResolution = getXResolution();
        String xResolution2 = imageProperties.getXResolution();
        if (xResolution != null ? !xResolution.equals(xResolution2) : xResolution2 != null) {
            return false;
        }
        String yResolution = getYResolution();
        String yResolution2 = imageProperties.getYResolution();
        if (yResolution != null ? !yResolution.equals(yResolution2) : yResolution2 != null) {
            return false;
        }
        String resolutionUnit = getResolutionUnit();
        String resolutionUnit2 = imageProperties.getResolutionUnit();
        if (resolutionUnit != null ? !resolutionUnit.equals(resolutionUnit2) : resolutionUnit2 != null) {
            return false;
        }
        String gpsTimeStamp = getGpsTimeStamp();
        String gpsTimeStamp2 = imageProperties.getGpsTimeStamp();
        if (gpsTimeStamp != null ? !gpsTimeStamp.equals(gpsTimeStamp2) : gpsTimeStamp2 != null) {
            return false;
        }
        String location = getLocation();
        String location2 = imageProperties.getLocation();
        if (location != null ? !location.equals(location2) : location2 != null) {
            return false;
        }
        String captureMode = getCaptureMode();
        String captureMode2 = imageProperties.getCaptureMode();
        if (captureMode != null ? !captureMode.equals(captureMode2) : captureMode2 != null) {
            return false;
        }
        String subSecTimeOriginal = getSubSecTimeOriginal();
        String subSecTimeOriginal2 = imageProperties.getSubSecTimeOriginal();
        if (subSecTimeOriginal != null ? !subSecTimeOriginal.equals(subSecTimeOriginal2) : subSecTimeOriginal2 != null) {
            return false;
        }
        String subSecTimeDigitized = getSubSecTimeDigitized();
        String subSecTimeDigitized2 = imageProperties.getSubSecTimeDigitized();
        if (subSecTimeDigitized != null ? !subSecTimeDigitized.equals(subSecTimeDigitized2) : subSecTimeDigitized2 != null) {
            return false;
        }
        String subSecTime = getSubSecTime();
        String subSecTime2 = imageProperties.getSubSecTime();
        if (subSecTime != null ? !subSecTime.equals(subSecTime2) : subSecTime2 != null) {
            return false;
        }
        String gpsDateStamp = getGpsDateStamp();
        String gpsDateStamp2 = imageProperties.getGpsDateStamp();
        return gpsDateStamp != null ? gpsDateStamp.equals(gpsDateStamp2) : gpsDateStamp2 == null;
    }

    @Generated
    public String getApertureValue() {
        return this.apertureValue;
    }

    @Generated
    public String getCaptureMode() {
        return this.captureMode;
    }

    @Generated
    public String getColorSpace() {
        return this.colorSpace;
    }

    @Generated
    public String getDateTime() {
        return this.dateTime;
    }

    @Generated
    public String getDateTimeDigitized() {
        return this.dateTimeDigitized;
    }

    @Generated
    public String getDateTimeOriginal() {
        return this.dateTimeOriginal;
    }

    @Generated
    public String getExposureMode() {
        return this.exposureMode;
    }

    @Generated
    public String getExposureProgram() {
        return this.exposureProgram;
    }

    @Generated
    public String getExposureTime() {
        return this.exposureTime;
    }

    @Generated
    public String getFlash() {
        return this.flash;
    }

    @Generated
    public String getFocalLength() {
        return this.focalLength;
    }

    @Generated
    public String getGpsDateStamp() {
        return this.gpsDateStamp;
    }

    @Generated
    public String getGpsTimeStamp() {
        return this.gpsTimeStamp;
    }

    @Generated
    public Integer getHeight() {
        return this.height;
    }

    @Generated
    public String getIsoSpeedRatings() {
        return this.isoSpeedRatings;
    }

    @Generated
    public String getLocation() {
        return this.location;
    }

    @Generated
    public String getMake() {
        return this.make;
    }

    @Generated
    public String getMeteringMode() {
        return this.meteringMode;
    }

    @Generated
    public String getOrientation() {
        return this.orientation;
    }

    @Generated
    public String getResolutionUnit() {
        return this.resolutionUnit;
    }

    @Generated
    public String getSensingMethod() {
        return this.sensingMethod;
    }

    @Generated
    public String getSharpness() {
        return this.sharpness;
    }

    @Generated
    public String getSoftware() {
        return this.software;
    }

    @Generated
    public String getSubSecTime() {
        return this.subSecTime;
    }

    @Generated
    public String getSubSecTimeDigitized() {
        return this.subSecTimeDigitized;
    }

    @Generated
    public String getSubSecTimeOriginal() {
        return this.subSecTimeOriginal;
    }

    @Generated
    public String getWhiteBalance() {
        return this.whiteBalance;
    }

    @Generated
    public Integer getWidth() {
        return this.width;
    }

    @Generated
    public String getXResolution() {
        return this.xResolution;
    }

    @Generated
    public String getYResolution() {
        return this.yResolution;
    }

    @Generated
    public int hashCode() {
        Integer height = getHeight();
        int hashCode = height == null ? 43 : height.hashCode();
        Integer width = getWidth();
        int hashCode2 = ((hashCode + 59) * 59) + (width == null ? 43 : width.hashCode());
        String make = getMake();
        int hashCode3 = (hashCode2 * 59) + (make == null ? 43 : make.hashCode());
        String isoSpeedRatings = getIsoSpeedRatings();
        int hashCode4 = (hashCode3 * 59) + (isoSpeedRatings == null ? 43 : isoSpeedRatings.hashCode());
        String exposureTime = getExposureTime();
        int hashCode5 = (hashCode4 * 59) + (exposureTime == null ? 43 : exposureTime.hashCode());
        String apertureValue = getApertureValue();
        int hashCode6 = (hashCode5 * 59) + (apertureValue == null ? 43 : apertureValue.hashCode());
        String dateTimeOriginal = getDateTimeOriginal();
        int hashCode7 = (hashCode6 * 59) + (dateTimeOriginal == null ? 43 : dateTimeOriginal.hashCode());
        String flash = getFlash();
        int hashCode8 = (hashCode7 * 59) + (flash == null ? 43 : flash.hashCode());
        String focalLength = getFocalLength();
        int hashCode9 = (hashCode8 * 59) + (focalLength == null ? 43 : focalLength.hashCode());
        String dateTime = getDateTime();
        int hashCode10 = (hashCode9 * 59) + (dateTime == null ? 43 : dateTime.hashCode());
        String dateTimeDigitized = getDateTimeDigitized();
        int hashCode11 = (hashCode10 * 59) + (dateTimeDigitized == null ? 43 : dateTimeDigitized.hashCode());
        String software = getSoftware();
        int hashCode12 = (hashCode11 * 59) + (software == null ? 43 : software.hashCode());
        String orientation = getOrientation();
        int hashCode13 = (hashCode12 * 59) + (orientation == null ? 43 : orientation.hashCode());
        String colorSpace = getColorSpace();
        int hashCode14 = (hashCode13 * 59) + (colorSpace == null ? 43 : colorSpace.hashCode());
        String meteringMode = getMeteringMode();
        int hashCode15 = (hashCode14 * 59) + (meteringMode == null ? 43 : meteringMode.hashCode());
        String exposureProgram = getExposureProgram();
        int hashCode16 = (hashCode15 * 59) + (exposureProgram == null ? 43 : exposureProgram.hashCode());
        String exposureMode = getExposureMode();
        int hashCode17 = (hashCode16 * 59) + (exposureMode == null ? 43 : exposureMode.hashCode());
        String sharpness = getSharpness();
        int hashCode18 = (hashCode17 * 59) + (sharpness == null ? 43 : sharpness.hashCode());
        String whiteBalance = getWhiteBalance();
        int hashCode19 = (hashCode18 * 59) + (whiteBalance == null ? 43 : whiteBalance.hashCode());
        String sensingMethod = getSensingMethod();
        int hashCode20 = (hashCode19 * 59) + (sensingMethod == null ? 43 : sensingMethod.hashCode());
        String xResolution = getXResolution();
        int hashCode21 = (hashCode20 * 59) + (xResolution == null ? 43 : xResolution.hashCode());
        String yResolution = getYResolution();
        int hashCode22 = (hashCode21 * 59) + (yResolution == null ? 43 : yResolution.hashCode());
        String resolutionUnit = getResolutionUnit();
        int hashCode23 = (hashCode22 * 59) + (resolutionUnit == null ? 43 : resolutionUnit.hashCode());
        String gpsTimeStamp = getGpsTimeStamp();
        int hashCode24 = (hashCode23 * 59) + (gpsTimeStamp == null ? 43 : gpsTimeStamp.hashCode());
        String location = getLocation();
        int hashCode25 = (hashCode24 * 59) + (location == null ? 43 : location.hashCode());
        String captureMode = getCaptureMode();
        int hashCode26 = (hashCode25 * 59) + (captureMode == null ? 43 : captureMode.hashCode());
        String subSecTimeOriginal = getSubSecTimeOriginal();
        int hashCode27 = (hashCode26 * 59) + (subSecTimeOriginal == null ? 43 : subSecTimeOriginal.hashCode());
        String subSecTimeDigitized = getSubSecTimeDigitized();
        int hashCode28 = (hashCode27 * 59) + (subSecTimeDigitized == null ? 43 : subSecTimeDigitized.hashCode());
        String subSecTime = getSubSecTime();
        int i = hashCode28 * 59;
        int hashCode29 = subSecTime == null ? 43 : subSecTime.hashCode();
        String gpsDateStamp = getGpsDateStamp();
        return ((i + hashCode29) * 59) + (gpsDateStamp != null ? gpsDateStamp.hashCode() : 43);
    }

    @Generated
    public void setApertureValue(String str) {
        this.apertureValue = str;
    }

    @Generated
    public void setCaptureMode(String str) {
        this.captureMode = str;
    }

    @Generated
    public void setColorSpace(String str) {
        this.colorSpace = str;
    }

    @Generated
    public void setDateTime(String str) {
        this.dateTime = str;
    }

    @Generated
    public void setDateTimeDigitized(String str) {
        this.dateTimeDigitized = str;
    }

    @Generated
    public void setDateTimeOriginal(String str) {
        this.dateTimeOriginal = str;
    }

    @Generated
    public void setExposureMode(String str) {
        this.exposureMode = str;
    }

    @Generated
    public void setExposureProgram(String str) {
        this.exposureProgram = str;
    }

    @Generated
    public void setExposureTime(String str) {
        this.exposureTime = str;
    }

    @Generated
    public void setFlash(String str) {
        this.flash = str;
    }

    @Generated
    public void setFocalLength(String str) {
        this.focalLength = str;
    }

    @Generated
    public void setGpsDateStamp(String str) {
        this.gpsDateStamp = str;
    }

    @Generated
    public void setGpsTimeStamp(String str) {
        this.gpsTimeStamp = str;
    }

    @Generated
    public void setHeight(Integer num) {
        this.height = num;
    }

    @Generated
    public void setIsoSpeedRatings(String str) {
        this.isoSpeedRatings = str;
    }

    @Generated
    public void setLocation(String str) {
        this.location = str;
    }

    @Generated
    public void setMake(String str) {
        this.make = str;
    }

    @Generated
    public void setMeteringMode(String str) {
        this.meteringMode = str;
    }

    @Generated
    public void setOrientation(String str) {
        this.orientation = str;
    }

    @Generated
    public void setResolutionUnit(String str) {
        this.resolutionUnit = str;
    }

    @Generated
    public void setSensingMethod(String str) {
        this.sensingMethod = str;
    }

    @Generated
    public void setSharpness(String str) {
        this.sharpness = str;
    }

    @Generated
    public void setSoftware(String str) {
        this.software = str;
    }

    @Generated
    public void setSubSecTime(String str) {
        this.subSecTime = str;
    }

    @Generated
    public void setSubSecTimeDigitized(String str) {
        this.subSecTimeDigitized = str;
    }

    @Generated
    public void setSubSecTimeOriginal(String str) {
        this.subSecTimeOriginal = str;
    }

    @Generated
    public void setWhiteBalance(String str) {
        this.whiteBalance = str;
    }

    @Generated
    public void setWidth(Integer num) {
        this.width = num;
    }

    @Generated
    public void setXResolution(String str) {
        this.xResolution = str;
    }

    @Generated
    public void setYResolution(String str) {
        this.yResolution = str;
    }

    @Generated
    public String toString() {
        return "ImageProperties(make=" + getMake() + ", isoSpeedRatings=" + getIsoSpeedRatings() + ", exposureTime=" + getExposureTime() + ", apertureValue=" + getApertureValue() + ", dateTimeOriginal=" + getDateTimeOriginal() + ", flash=" + getFlash() + ", focalLength=" + getFocalLength() + ", dateTime=" + getDateTime() + ", dateTimeDigitized=" + getDateTimeDigitized() + ", software=" + getSoftware() + ", orientation=" + getOrientation() + ", colorSpace=" + getColorSpace() + ", meteringMode=" + getMeteringMode() + ", exposureProgram=" + getExposureProgram() + ", exposureMode=" + getExposureMode() + ", sharpness=" + getSharpness() + ", whiteBalance=" + getWhiteBalance() + ", sensingMethod=" + getSensingMethod() + ", xResolution=" + getXResolution() + ", yResolution=" + getYResolution() + ", resolutionUnit=" + getResolutionUnit() + ", gpsTimeStamp=" + getGpsTimeStamp() + ", height=" + getHeight() + ", width=" + getWidth() + ", location=" + getLocation() + ", captureMode=" + getCaptureMode() + ", subSecTimeOriginal=" + getSubSecTimeOriginal() + ", subSecTimeDigitized=" + getSubSecTimeDigitized() + ", subSecTime=" + getSubSecTime() + ", gpsDateStamp=" + getGpsDateStamp() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
