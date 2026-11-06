package com.amazon.clouddrive.cdasdk.prompto.profiles;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.photos.PhotoResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Avatar {

    @SerializedName("color")
    @Expose
    private String color;

    @SerializedName("photo")
    @Expose
    private PhotoResponse photo;

    @Generated
    public Avatar() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Avatar;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        if (!avatar.canEqual(this)) {
            return false;
        }
        PhotoResponse photo = getPhoto();
        PhotoResponse photo2 = avatar.getPhoto();
        if (photo != null ? !photo.equals(photo2) : photo2 != null) {
            return false;
        }
        String color = getColor();
        String color2 = avatar.getColor();
        return color != null ? color.equals(color2) : color2 == null;
    }

    @Generated
    public String getColor() {
        return this.color;
    }

    @Generated
    public PhotoResponse getPhoto() {
        return this.photo;
    }

    @Generated
    public int hashCode() {
        PhotoResponse photo = getPhoto();
        int hashCode = photo == null ? 43 : photo.hashCode();
        String color = getColor();
        return ((hashCode + 59) * 59) + (color != null ? color.hashCode() : 43);
    }

    @Generated
    public void setColor(String str) {
        this.color = str;
    }

    @Generated
    public void setPhoto(PhotoResponse photoResponse) {
        this.photo = photoResponse;
    }

    @Generated
    public String toString() {
        return "Avatar(photo=" + getPhoto() + ", color=" + getColor() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
