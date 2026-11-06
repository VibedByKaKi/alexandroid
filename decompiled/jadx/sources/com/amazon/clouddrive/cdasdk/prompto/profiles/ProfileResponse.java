package com.amazon.clouddrive.cdasdk.prompto.profiles;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.Names;
import com.amazon.clouddrive.cdasdk.prompto.photos.PhotoResponse;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProfileResponse {

    @SerializedName("avatar")
    @Expose
    private Avatar avatar;

    @SerializedName("avatarNodeId")
    @Expose
    private String avatarNodeId;

    @SerializedName("avatarPhoto")
    @Expose
    private PhotoResponse avatarPhoto;

    @SerializedName(BizMetricsConstants.CUSTOMER_ID)
    @Expose
    private String customerId;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("names")
    @Expose
    private Names names;

    @Generated
    public ProfileResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ProfileResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileResponse)) {
            return false;
        }
        ProfileResponse profileResponse = (ProfileResponse) obj;
        if (!profileResponse.canEqual(this)) {
            return false;
        }
        String customerId = getCustomerId();
        String customerId2 = profileResponse.getCustomerId();
        if (customerId != null ? !customerId.equals(customerId2) : customerId2 != null) {
            return false;
        }
        String name = getName();
        String name2 = profileResponse.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        Names names = getNames();
        Names names2 = profileResponse.getNames();
        if (names != null ? !names.equals(names2) : names2 != null) {
            return false;
        }
        String avatarNodeId = getAvatarNodeId();
        String avatarNodeId2 = profileResponse.getAvatarNodeId();
        if (avatarNodeId != null ? !avatarNodeId.equals(avatarNodeId2) : avatarNodeId2 != null) {
            return false;
        }
        PhotoResponse avatarPhoto = getAvatarPhoto();
        PhotoResponse avatarPhoto2 = profileResponse.getAvatarPhoto();
        if (avatarPhoto != null ? !avatarPhoto.equals(avatarPhoto2) : avatarPhoto2 != null) {
            return false;
        }
        Avatar avatar = getAvatar();
        Avatar avatar2 = profileResponse.getAvatar();
        return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
    }

    @Generated
    public Avatar getAvatar() {
        return this.avatar;
    }

    @Generated
    public String getAvatarNodeId() {
        return this.avatarNodeId;
    }

    @Generated
    public PhotoResponse getAvatarPhoto() {
        return this.avatarPhoto;
    }

    @Generated
    public String getCustomerId() {
        return this.customerId;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public Names getNames() {
        return this.names;
    }

    @Generated
    public int hashCode() {
        String customerId = getCustomerId();
        int hashCode = customerId == null ? 43 : customerId.hashCode();
        String name = getName();
        int hashCode2 = ((hashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
        Names names = getNames();
        int hashCode3 = (hashCode2 * 59) + (names == null ? 43 : names.hashCode());
        String avatarNodeId = getAvatarNodeId();
        int hashCode4 = (hashCode3 * 59) + (avatarNodeId == null ? 43 : avatarNodeId.hashCode());
        PhotoResponse avatarPhoto = getAvatarPhoto();
        int i = hashCode4 * 59;
        int hashCode5 = avatarPhoto == null ? 43 : avatarPhoto.hashCode();
        Avatar avatar = getAvatar();
        return ((i + hashCode5) * 59) + (avatar != null ? avatar.hashCode() : 43);
    }

    @Generated
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    @Generated
    public void setAvatarNodeId(String str) {
        this.avatarNodeId = str;
    }

    @Generated
    public void setAvatarPhoto(PhotoResponse photoResponse) {
        this.avatarPhoto = photoResponse;
    }

    @Generated
    public void setCustomerId(String str) {
        this.customerId = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setNames(Names names) {
        this.names = names;
    }

    @Generated
    public String toString() {
        return "ProfileResponse(customerId=" + getCustomerId() + ", name=" + getName() + ", names=" + getNames() + ", avatarNodeId=" + getAvatarNodeId() + ", avatarPhoto=" + getAvatarPhoto() + ", avatar=" + getAvatar() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
