package com.amazon.alexa.biloba.generated.models;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LocalizedDateTime {

    @SerializedName("date")
    private String date = null;

    @SerializedName("time")
    private String time = null;

    @SerializedName("zone")
    private String zone = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public LocalizedDateTime date(String str) {
        this.date = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocalizedDateTime localizedDateTime = (LocalizedDateTime) obj;
            if (Objects.equals(this.date, localizedDateTime.date) && Objects.equals(this.time, localizedDateTime.time) && Objects.equals(this.zone, localizedDateTime.zone)) {
                return true;
            }
        }
        return false;
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public String getZone() {
        return this.zone;
    }

    public int hashCode() {
        return Objects.hash(this.date, this.time, this.zone);
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setZone(String str) {
        this.zone = str;
    }

    public LocalizedDateTime time(String str) {
        this.time = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class LocalizedDateTime {\n    date: ");
        sb.append(toIndentedString(this.date));
        sb.append("\n    time: ");
        sb.append(toIndentedString(this.time));
        sb.append("\n    zone: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.zone), "\n}");
    }

    public LocalizedDateTime zone(String str) {
        this.zone = str;
        return this;
    }
}
