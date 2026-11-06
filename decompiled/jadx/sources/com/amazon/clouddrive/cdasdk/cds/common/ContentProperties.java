package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ContentProperties {

    @SerializedName("address")
    @Expose
    private Address address;

    @SerializedName("contentDate")
    @Expose
    private ISO8601 contentDate;

    @SerializedName("contentSignatures")
    @Expose
    private List<ContentSignature> contentSignatures;

    @SerializedName("contentType")
    @Expose
    private String contentType;

    @SerializedName("document")
    @Expose
    private DocumentProperties document;

    @SerializedName("extension")
    @Expose
    private String extension;

    @SerializedName("image")
    @Expose
    private ImageProperties image;

    @SerializedName("locationId")
    @Expose
    private String locationId;

    @SerializedName(SierraContentProviderContract.MD5_VALUE)
    @Expose
    private String md5;

    @SerializedName("size")
    @Expose
    private Long size;

    @SerializedName("version")
    @Expose
    private Long version;

    @SerializedName("video")
    @Expose
    private VideoProperties video;

    @Generated
    public ContentProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ContentProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentProperties)) {
            return false;
        }
        ContentProperties contentProperties = (ContentProperties) obj;
        if (!contentProperties.canEqual(this)) {
            return false;
        }
        Long version = getVersion();
        Long version2 = contentProperties.getVersion();
        if (version != null ? !version.equals(version2) : version2 != null) {
            return false;
        }
        Long size = getSize();
        Long size2 = contentProperties.getSize();
        if (size != null ? !size.equals(size2) : size2 != null) {
            return false;
        }
        String md5 = getMd5();
        String md52 = contentProperties.getMd5();
        if (md5 != null ? !md5.equals(md52) : md52 != null) {
            return false;
        }
        String contentType = getContentType();
        String contentType2 = contentProperties.getContentType();
        if (contentType != null ? !contentType.equals(contentType2) : contentType2 != null) {
            return false;
        }
        String extension = getExtension();
        String extension2 = contentProperties.getExtension();
        if (extension != null ? !extension.equals(extension2) : extension2 != null) {
            return false;
        }
        ISO8601 contentDate = getContentDate();
        ISO8601 contentDate2 = contentProperties.getContentDate();
        if (contentDate != null ? !contentDate.equals(contentDate2) : contentDate2 != null) {
            return false;
        }
        ImageProperties image = getImage();
        ImageProperties image2 = contentProperties.getImage();
        if (image != null ? !image.equals(image2) : image2 != null) {
            return false;
        }
        VideoProperties video = getVideo();
        VideoProperties video2 = contentProperties.getVideo();
        if (video != null ? !video.equals(video2) : video2 != null) {
            return false;
        }
        DocumentProperties document = getDocument();
        DocumentProperties document2 = contentProperties.getDocument();
        if (document != null ? !document.equals(document2) : document2 != null) {
            return false;
        }
        String locationId = getLocationId();
        String locationId2 = contentProperties.getLocationId();
        if (locationId != null ? !locationId.equals(locationId2) : locationId2 != null) {
            return false;
        }
        Address address = getAddress();
        Address address2 = contentProperties.getAddress();
        if (address != null ? !address.equals(address2) : address2 != null) {
            return false;
        }
        List<ContentSignature> contentSignatures = getContentSignatures();
        List<ContentSignature> contentSignatures2 = contentProperties.getContentSignatures();
        return contentSignatures != null ? contentSignatures.equals(contentSignatures2) : contentSignatures2 == null;
    }

    @Generated
    public Address getAddress() {
        return this.address;
    }

    @Generated
    public ISO8601 getContentDate() {
        return this.contentDate;
    }

    @Generated
    public List<ContentSignature> getContentSignatures() {
        return this.contentSignatures;
    }

    @Generated
    public String getContentType() {
        return this.contentType;
    }

    @Generated
    public DocumentProperties getDocument() {
        return this.document;
    }

    @Generated
    public String getExtension() {
        return this.extension;
    }

    @Generated
    public ImageProperties getImage() {
        return this.image;
    }

    @Generated
    public String getLocationId() {
        return this.locationId;
    }

    @Generated
    public String getMd5() {
        return this.md5;
    }

    @Generated
    public Long getSize() {
        return this.size;
    }

    @Generated
    public Long getVersion() {
        return this.version;
    }

    @Generated
    public VideoProperties getVideo() {
        return this.video;
    }

    @Generated
    public int hashCode() {
        Long version = getVersion();
        int hashCode = version == null ? 43 : version.hashCode();
        Long size = getSize();
        int hashCode2 = ((hashCode + 59) * 59) + (size == null ? 43 : size.hashCode());
        String md5 = getMd5();
        int hashCode3 = (hashCode2 * 59) + (md5 == null ? 43 : md5.hashCode());
        String contentType = getContentType();
        int hashCode4 = (hashCode3 * 59) + (contentType == null ? 43 : contentType.hashCode());
        String extension = getExtension();
        int hashCode5 = (hashCode4 * 59) + (extension == null ? 43 : extension.hashCode());
        ISO8601 contentDate = getContentDate();
        int hashCode6 = (hashCode5 * 59) + (contentDate == null ? 43 : contentDate.hashCode());
        ImageProperties image = getImage();
        int hashCode7 = (hashCode6 * 59) + (image == null ? 43 : image.hashCode());
        VideoProperties video = getVideo();
        int hashCode8 = (hashCode7 * 59) + (video == null ? 43 : video.hashCode());
        DocumentProperties document = getDocument();
        int hashCode9 = (hashCode8 * 59) + (document == null ? 43 : document.hashCode());
        String locationId = getLocationId();
        int hashCode10 = (hashCode9 * 59) + (locationId == null ? 43 : locationId.hashCode());
        Address address = getAddress();
        int i = hashCode10 * 59;
        int hashCode11 = address == null ? 43 : address.hashCode();
        List<ContentSignature> contentSignatures = getContentSignatures();
        return ((i + hashCode11) * 59) + (contentSignatures != null ? contentSignatures.hashCode() : 43);
    }

    @Generated
    public void setAddress(Address address) {
        this.address = address;
    }

    @Generated
    public void setContentDate(ISO8601 iso8601) {
        this.contentDate = iso8601;
    }

    @Generated
    public void setContentSignatures(List<ContentSignature> list) {
        this.contentSignatures = list;
    }

    @Generated
    public void setContentType(String str) {
        this.contentType = str;
    }

    @Generated
    public void setDocument(DocumentProperties documentProperties) {
        this.document = documentProperties;
    }

    @Generated
    public void setExtension(String str) {
        this.extension = str;
    }

    @Generated
    public void setImage(ImageProperties imageProperties) {
        this.image = imageProperties;
    }

    @Generated
    public void setLocationId(String str) {
        this.locationId = str;
    }

    @Generated
    public void setMd5(String str) {
        this.md5 = str;
    }

    @Generated
    public void setSize(Long l) {
        this.size = l;
    }

    @Generated
    public void setVersion(Long l) {
        this.version = l;
    }

    @Generated
    public void setVideo(VideoProperties videoProperties) {
        this.video = videoProperties;
    }

    @Generated
    public String toString() {
        return "ContentProperties(version=" + getVersion() + ", md5=" + getMd5() + ", size=" + getSize() + ", contentType=" + getContentType() + ", extension=" + getExtension() + ", contentDate=" + getContentDate() + ", image=" + getImage() + ", video=" + getVideo() + ", document=" + getDocument() + ", locationId=" + getLocationId() + ", address=" + getAddress() + ", contentSignatures=" + getContentSignatures() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
