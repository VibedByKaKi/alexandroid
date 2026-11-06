package com.amazon.clouddrive.cdasdk.aps.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AccountFeature {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("state")
    @Expose
    private String state;

    @Generated
    public AccountFeature() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AccountFeature;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountFeature)) {
            return false;
        }
        AccountFeature accountFeature = (AccountFeature) obj;
        if (!accountFeature.canEqual(this)) {
            return false;
        }
        String name = getName();
        String name2 = accountFeature.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String state = getState();
        String state2 = accountFeature.getState();
        return state != null ? state.equals(state2) : state2 == null;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getState() {
        return this.state;
    }

    @Generated
    public int hashCode() {
        String name = getName();
        int hashCode = name == null ? 43 : name.hashCode();
        String state = getState();
        return ((hashCode + 59) * 59) + (state != null ? state.hashCode() : 43);
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setState(String str) {
        this.state = str;
    }

    @Generated
    public String toString() {
        return "AccountFeature(name=" + getName() + ", state=" + getState() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
