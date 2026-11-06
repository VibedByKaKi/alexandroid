package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoProperties {

    @SerializedName("audioBitrate")
    @Expose
    private Double audioBitrate;

    @SerializedName("audioChannelLayout")
    @Expose
    private String audioChannelLayout;

    @SerializedName("audioChannels")
    @Expose
    private Integer audioChannels;

    @SerializedName("audioCodec")
    @Expose
    private String audioCodec;

    @SerializedName("audioSampleRate")
    @Expose
    private Double audioSampleRate;

    @SerializedName("bitrate")
    @Expose
    private Double bitrate;

    @SerializedName("creationDate")
    @Expose
    private String creationDate;

    @SerializedName("duration")
    @Expose
    private Double duration;

    @SerializedName("encoder")
    @Expose
    private String encoder;

    @SerializedName("height")
    @Expose
    private Integer height;

    @SerializedName("location")
    @Expose
    private String location;

    @SerializedName("make")
    @Expose
    private String make;

    @SerializedName("model")
    @Expose
    private String model;

    @SerializedName("rotate")
    @Expose
    private Integer rotate;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("videoBitrate")
    @Expose
    private Double videoBitrate;

    @SerializedName("videoCodec")
    @Expose
    private String videoCodec;

    @SerializedName("videoFrameRate")
    @Expose
    private Double videoFrameRate;

    @SerializedName("width")
    @Expose
    private Integer width;

    @Generated
    public VideoProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof VideoProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoProperties)) {
            return false;
        }
        VideoProperties videoProperties = (VideoProperties) obj;
        if (!videoProperties.canEqual(this)) {
            return false;
        }
        Integer height = getHeight();
        Integer height2 = videoProperties.getHeight();
        if (height != null ? !height.equals(height2) : height2 != null) {
            return false;
        }
        Integer width = getWidth();
        Integer width2 = videoProperties.getWidth();
        if (width != null ? !width.equals(width2) : width2 != null) {
            return false;
        }
        Double duration = getDuration();
        Double duration2 = videoProperties.getDuration();
        if (duration != null ? !duration.equals(duration2) : duration2 != null) {
            return false;
        }
        Double videoBitrate = getVideoBitrate();
        Double videoBitrate2 = videoProperties.getVideoBitrate();
        if (videoBitrate != null ? !videoBitrate.equals(videoBitrate2) : videoBitrate2 != null) {
            return false;
        }
        Double videoFrameRate = getVideoFrameRate();
        Double videoFrameRate2 = videoProperties.getVideoFrameRate();
        if (videoFrameRate != null ? !videoFrameRate.equals(videoFrameRate2) : videoFrameRate2 != null) {
            return false;
        }
        Double audioBitrate = getAudioBitrate();
        Double audioBitrate2 = videoProperties.getAudioBitrate();
        if (audioBitrate != null ? !audioBitrate.equals(audioBitrate2) : audioBitrate2 != null) {
            return false;
        }
        Double audioSampleRate = getAudioSampleRate();
        Double audioSampleRate2 = videoProperties.getAudioSampleRate();
        if (audioSampleRate != null ? !audioSampleRate.equals(audioSampleRate2) : audioSampleRate2 != null) {
            return false;
        }
        Integer audioChannels = getAudioChannels();
        Integer audioChannels2 = videoProperties.getAudioChannels();
        if (audioChannels != null ? !audioChannels.equals(audioChannels2) : audioChannels2 != null) {
            return false;
        }
        Double bitrate = getBitrate();
        Double bitrate2 = videoProperties.getBitrate();
        if (bitrate != null ? !bitrate.equals(bitrate2) : bitrate2 != null) {
            return false;
        }
        Integer rotate = getRotate();
        Integer rotate2 = videoProperties.getRotate();
        if (rotate != null ? !rotate.equals(rotate2) : rotate2 != null) {
            return false;
        }
        String creationDate = getCreationDate();
        String creationDate2 = videoProperties.getCreationDate();
        if (creationDate != null ? !creationDate.equals(creationDate2) : creationDate2 != null) {
            return false;
        }
        String videoCodec = getVideoCodec();
        String videoCodec2 = videoProperties.getVideoCodec();
        if (videoCodec != null ? !videoCodec.equals(videoCodec2) : videoCodec2 != null) {
            return false;
        }
        String audioCodec = getAudioCodec();
        String audioCodec2 = videoProperties.getAudioCodec();
        if (audioCodec != null ? !audioCodec.equals(audioCodec2) : audioCodec2 != null) {
            return false;
        }
        String audioChannelLayout = getAudioChannelLayout();
        String audioChannelLayout2 = videoProperties.getAudioChannelLayout();
        if (audioChannelLayout != null ? !audioChannelLayout.equals(audioChannelLayout2) : audioChannelLayout2 != null) {
            return false;
        }
        String location = getLocation();
        String location2 = videoProperties.getLocation();
        if (location != null ? !location.equals(location2) : location2 != null) {
            return false;
        }
        String make = getMake();
        String make2 = videoProperties.getMake();
        if (make != null ? !make.equals(make2) : make2 != null) {
            return false;
        }
        String model = getModel();
        String model2 = videoProperties.getModel();
        if (model != null ? !model.equals(model2) : model2 != null) {
            return false;
        }
        String encoder = getEncoder();
        String encoder2 = videoProperties.getEncoder();
        if (encoder != null ? !encoder.equals(encoder2) : encoder2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = videoProperties.getTitle();
        return title != null ? title.equals(title2) : title2 == null;
    }

    @Generated
    public Double getAudioBitrate() {
        return this.audioBitrate;
    }

    @Generated
    public String getAudioChannelLayout() {
        return this.audioChannelLayout;
    }

    @Generated
    public Integer getAudioChannels() {
        return this.audioChannels;
    }

    @Generated
    public String getAudioCodec() {
        return this.audioCodec;
    }

    @Generated
    public Double getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @Generated
    public Double getBitrate() {
        return this.bitrate;
    }

    @Generated
    public String getCreationDate() {
        return this.creationDate;
    }

    @Generated
    public Double getDuration() {
        return this.duration;
    }

    @Generated
    public String getEncoder() {
        return this.encoder;
    }

    @Generated
    public Integer getHeight() {
        return this.height;
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
    public String getModel() {
        return this.model;
    }

    @Generated
    public Integer getRotate() {
        return this.rotate;
    }

    @Generated
    public String getTitle() {
        return this.title;
    }

    @Generated
    public Double getVideoBitrate() {
        return this.videoBitrate;
    }

    @Generated
    public String getVideoCodec() {
        return this.videoCodec;
    }

    @Generated
    public Double getVideoFrameRate() {
        return this.videoFrameRate;
    }

    @Generated
    public Integer getWidth() {
        return this.width;
    }

    @Generated
    public int hashCode() {
        Integer height = getHeight();
        int hashCode = height == null ? 43 : height.hashCode();
        Integer width = getWidth();
        int hashCode2 = ((hashCode + 59) * 59) + (width == null ? 43 : width.hashCode());
        Double duration = getDuration();
        int hashCode3 = (hashCode2 * 59) + (duration == null ? 43 : duration.hashCode());
        Double videoBitrate = getVideoBitrate();
        int hashCode4 = (hashCode3 * 59) + (videoBitrate == null ? 43 : videoBitrate.hashCode());
        Double videoFrameRate = getVideoFrameRate();
        int hashCode5 = (hashCode4 * 59) + (videoFrameRate == null ? 43 : videoFrameRate.hashCode());
        Double audioBitrate = getAudioBitrate();
        int hashCode6 = (hashCode5 * 59) + (audioBitrate == null ? 43 : audioBitrate.hashCode());
        Double audioSampleRate = getAudioSampleRate();
        int hashCode7 = (hashCode6 * 59) + (audioSampleRate == null ? 43 : audioSampleRate.hashCode());
        Integer audioChannels = getAudioChannels();
        int hashCode8 = (hashCode7 * 59) + (audioChannels == null ? 43 : audioChannels.hashCode());
        Double bitrate = getBitrate();
        int hashCode9 = (hashCode8 * 59) + (bitrate == null ? 43 : bitrate.hashCode());
        Integer rotate = getRotate();
        int hashCode10 = (hashCode9 * 59) + (rotate == null ? 43 : rotate.hashCode());
        String creationDate = getCreationDate();
        int hashCode11 = (hashCode10 * 59) + (creationDate == null ? 43 : creationDate.hashCode());
        String videoCodec = getVideoCodec();
        int hashCode12 = (hashCode11 * 59) + (videoCodec == null ? 43 : videoCodec.hashCode());
        String audioCodec = getAudioCodec();
        int hashCode13 = (hashCode12 * 59) + (audioCodec == null ? 43 : audioCodec.hashCode());
        String audioChannelLayout = getAudioChannelLayout();
        int hashCode14 = (hashCode13 * 59) + (audioChannelLayout == null ? 43 : audioChannelLayout.hashCode());
        String location = getLocation();
        int hashCode15 = (hashCode14 * 59) + (location == null ? 43 : location.hashCode());
        String make = getMake();
        int hashCode16 = (hashCode15 * 59) + (make == null ? 43 : make.hashCode());
        String model = getModel();
        int hashCode17 = (hashCode16 * 59) + (model == null ? 43 : model.hashCode());
        String encoder = getEncoder();
        int i = hashCode17 * 59;
        int hashCode18 = encoder == null ? 43 : encoder.hashCode();
        String title = getTitle();
        return ((i + hashCode18) * 59) + (title != null ? title.hashCode() : 43);
    }

    @Generated
    public void setAudioBitrate(Double d) {
        this.audioBitrate = d;
    }

    @Generated
    public void setAudioChannelLayout(String str) {
        this.audioChannelLayout = str;
    }

    @Generated
    public void setAudioChannels(Integer num) {
        this.audioChannels = num;
    }

    @Generated
    public void setAudioCodec(String str) {
        this.audioCodec = str;
    }

    @Generated
    public void setAudioSampleRate(Double d) {
        this.audioSampleRate = d;
    }

    @Generated
    public void setBitrate(Double d) {
        this.bitrate = d;
    }

    @Generated
    public void setCreationDate(String str) {
        this.creationDate = str;
    }

    @Generated
    public void setDuration(Double d) {
        this.duration = d;
    }

    @Generated
    public void setEncoder(String str) {
        this.encoder = str;
    }

    @Generated
    public void setHeight(Integer num) {
        this.height = num;
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
    public void setModel(String str) {
        this.model = str;
    }

    @Generated
    public void setRotate(Integer num) {
        this.rotate = num;
    }

    @Generated
    public void setTitle(String str) {
        this.title = str;
    }

    @Generated
    public void setVideoBitrate(Double d) {
        this.videoBitrate = d;
    }

    @Generated
    public void setVideoCodec(String str) {
        this.videoCodec = str;
    }

    @Generated
    public void setVideoFrameRate(Double d) {
        this.videoFrameRate = d;
    }

    @Generated
    public void setWidth(Integer num) {
        this.width = num;
    }

    @Generated
    public String toString() {
        return "VideoProperties(height=" + getHeight() + ", width=" + getWidth() + ", creationDate=" + getCreationDate() + ", duration=" + getDuration() + ", videoCodec=" + getVideoCodec() + ", videoBitrate=" + getVideoBitrate() + ", videoFrameRate=" + getVideoFrameRate() + ", audioCodec=" + getAudioCodec() + ", audioBitrate=" + getAudioBitrate() + ", audioSampleRate=" + getAudioSampleRate() + ", audioChannels=" + getAudioChannels() + ", audioChannelLayout=" + getAudioChannelLayout() + ", bitrate=" + getBitrate() + ", rotate=" + getRotate() + ", location=" + getLocation() + ", make=" + getMake() + ", model=" + getModel() + ", encoder=" + getEncoder() + ", title=" + getTitle() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
