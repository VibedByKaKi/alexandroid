package com.amazon.alexa.biloba.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FallAlert {
    private boolean isOTGFall = false;
    private String fallLocationMessage = null;
    private Geolocation fallLocation = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FallAlert fallAlert = (FallAlert) obj;
            if (Boolean.valueOf(this.isOTGFall).equals(Boolean.valueOf(fallAlert.isOTGFall)) && Objects.equals(this.fallLocationMessage, fallAlert.fallLocationMessage) && Objects.equals(this.fallLocation, fallAlert.fallLocation)) {
                return true;
            }
        }
        return false;
    }

    public FallAlert fallLocation(Geolocation geolocation) {
        this.fallLocation = geolocation;
        return this;
    }

    public FallAlert fallLocationMessage(String str) {
        this.fallLocationMessage = str;
        return this;
    }

    public Geolocation getFallLocation() {
        return this.fallLocation;
    }

    public String getFallLocationMessage() {
        return this.fallLocationMessage;
    }

    public boolean getIsOTGFall() {
        return this.isOTGFall;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isOTGFall), this.fallLocationMessage, this.fallLocation);
    }

    public FallAlert isOTGFall(boolean z) {
        this.isOTGFall = z;
        return this;
    }

    public void setFallLocation(Geolocation geolocation) {
        this.fallLocation = geolocation;
    }

    public void setFallLocationMessage(String str) {
        this.fallLocationMessage = str;
    }

    public void setIsOTGFall(boolean z) {
        this.isOTGFall = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class OnTheGoFall {\n    isOTGFall: ");
        sb.append(toIndentedString(Boolean.valueOf(this.isOTGFall)));
        sb.append("\n    fallLocationMessage: ");
        sb.append(toIndentedString(this.fallLocationMessage));
        sb.append("\n    fallLocation: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.fallLocation), "\n}");
    }
}
