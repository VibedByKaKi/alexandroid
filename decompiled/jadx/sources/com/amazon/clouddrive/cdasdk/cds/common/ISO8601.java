package com.amazon.clouddrive.cdasdk.cds.common;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ISO8601 {

    @NonNull
    @SerializedName("value")
    @Expose
    private String value;

    public ISO8601() {
        this.value = "";
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ISO8601;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ISO8601)) {
            return false;
        }
        ISO8601 iso8601 = (ISO8601) obj;
        if (!iso8601.canEqual(this)) {
            return false;
        }
        String value = getValue();
        String value2 = iso8601.getValue();
        return value != null ? value.equals(value2) : value2 == null;
    }

    @NonNull
    @Generated
    public String getValue() {
        return this.value;
    }

    @Generated
    public int hashCode() {
        String value = getValue();
        return 59 + (value == null ? 43 : value.hashCode());
    }

    @Generated
    public void setValue(@NonNull String str) {
        if (str != null) {
            this.value = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("value is marked non-null but is null");
        }
    }

    @Generated
    public String toString() {
        return "ISO8601(value=" + getValue() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ISO8601(@NonNull String str) {
        this.value = str;
    }
}
