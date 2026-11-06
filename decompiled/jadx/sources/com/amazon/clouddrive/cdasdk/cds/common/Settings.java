package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Settings {

    @SerializedName(PhotoSearchCategory.FAVORITE)
    @Expose
    private Boolean favorite;

    @SerializedName("hidden")
    @Expose
    private Boolean hidden;

    @Generated
    public Settings() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Settings;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) obj;
        if (!settings.canEqual(this)) {
            return false;
        }
        Boolean favorite = getFavorite();
        Boolean favorite2 = settings.getFavorite();
        if (favorite != null ? !favorite.equals(favorite2) : favorite2 != null) {
            return false;
        }
        Boolean hidden = getHidden();
        Boolean hidden2 = settings.getHidden();
        return hidden != null ? hidden.equals(hidden2) : hidden2 == null;
    }

    @Generated
    public Boolean getFavorite() {
        return this.favorite;
    }

    @Generated
    public Boolean getHidden() {
        return this.hidden;
    }

    @Generated
    public int hashCode() {
        Boolean favorite = getFavorite();
        int hashCode = favorite == null ? 43 : favorite.hashCode();
        Boolean hidden = getHidden();
        return ((hashCode + 59) * 59) + (hidden != null ? hidden.hashCode() : 43);
    }

    @Generated
    public void setFavorite(Boolean bool) {
        this.favorite = bool;
    }

    @Generated
    public void setHidden(Boolean bool) {
        this.hidden = bool;
    }

    @Generated
    public String toString() {
        return "Settings(favorite=" + getFavorite() + ", hidden=" + getHidden() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
