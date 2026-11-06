package com.amazon.clouddrive.cdasdk.prompto.photos;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PhotoResponse {

    @SerializedName("cropBox")
    @Expose
    private CropBoxResponse cropBox;

    @SerializedName("height")
    @Expose
    private Integer height;

    @SerializedName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID)
    @Expose
    private String nodeId;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("width")
    @Expose
    private Integer width;

    @Generated
    public PhotoResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PhotoResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhotoResponse)) {
            return false;
        }
        PhotoResponse photoResponse = (PhotoResponse) obj;
        if (!photoResponse.canEqual(this)) {
            return false;
        }
        Integer width = getWidth();
        Integer width2 = photoResponse.getWidth();
        if (width != null ? !width.equals(width2) : width2 != null) {
            return false;
        }
        Integer height = getHeight();
        Integer height2 = photoResponse.getHeight();
        if (height != null ? !height.equals(height2) : height2 != null) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = photoResponse.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = photoResponse.getOwnerId();
        if (ownerId != null ? !ownerId.equals(ownerId2) : ownerId2 != null) {
            return false;
        }
        CropBoxResponse cropBox = getCropBox();
        CropBoxResponse cropBox2 = photoResponse.getCropBox();
        if (cropBox != null ? !cropBox.equals(cropBox2) : cropBox2 != null) {
            return false;
        }
        String url = getUrl();
        String url2 = photoResponse.getUrl();
        return url != null ? url.equals(url2) : url2 == null;
    }

    @Generated
    public CropBoxResponse getCropBox() {
        return this.cropBox;
    }

    @Generated
    public Integer getHeight() {
        return this.height;
    }

    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getUrl() {
        return this.url;
    }

    @Generated
    public Integer getWidth() {
        return this.width;
    }

    @Generated
    public int hashCode() {
        Integer width = getWidth();
        int hashCode = width == null ? 43 : width.hashCode();
        Integer height = getHeight();
        int hashCode2 = ((hashCode + 59) * 59) + (height == null ? 43 : height.hashCode());
        String nodeId = getNodeId();
        int hashCode3 = (hashCode2 * 59) + (nodeId == null ? 43 : nodeId.hashCode());
        String ownerId = getOwnerId();
        int hashCode4 = (hashCode3 * 59) + (ownerId == null ? 43 : ownerId.hashCode());
        CropBoxResponse cropBox = getCropBox();
        int i = hashCode4 * 59;
        int hashCode5 = cropBox == null ? 43 : cropBox.hashCode();
        String url = getUrl();
        return ((i + hashCode5) * 59) + (url != null ? url.hashCode() : 43);
    }

    @Generated
    public void setCropBox(CropBoxResponse cropBoxResponse) {
        this.cropBox = cropBoxResponse;
    }

    @Generated
    public void setHeight(Integer num) {
        this.height = num;
    }

    @Generated
    public void setNodeId(String str) {
        this.nodeId = str;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setUrl(String str) {
        this.url = str;
    }

    @Generated
    public void setWidth(Integer num) {
        this.width = num;
    }

    @Generated
    public String toString() {
        return "PhotoResponse(nodeId=" + getNodeId() + ", ownerId=" + getOwnerId() + ", cropBox=" + getCropBox() + ", width=" + getWidth() + ", height=" + getHeight() + ", url=" + getUrl() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
