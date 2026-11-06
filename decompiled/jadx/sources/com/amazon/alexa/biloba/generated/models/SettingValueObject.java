package com.amazon.alexa.biloba.generated.models;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SettingValueObject {

    @SerializedName("value")
    private Object value = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.value, ((SettingValueObject) obj).value);
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value);
    }

    public void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("class SettingValueObject {\n    value: "), toIndentedString(this.value), "\n}");
    }

    public SettingValueObject value(Object obj) {
        this.value = obj;
        return this;
    }
}
