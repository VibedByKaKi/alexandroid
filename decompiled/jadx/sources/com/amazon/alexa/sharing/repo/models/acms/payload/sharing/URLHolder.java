package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class URLHolder {
    private String origin;
    private String url;

    public URLHolder(String str, String str2) {
        this.url = str;
        this.origin = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            URLHolder uRLHolder = (URLHolder) obj;
            if (Objects.equals(this.url, uRLHolder.url) && Objects.equals(this.origin, uRLHolder.origin)) {
                return true;
            }
        }
        return false;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.origin);
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("URLHolder{url='");
        sb.append(this.url);
        sb.append("', origin='");
        return a$$ExternalSyntheticOutline0.m(sb, this.origin, "'}");
    }

    public URLHolder() {
        this(null, null);
    }
}
