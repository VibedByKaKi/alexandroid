package com.amazonaws.services.s3.model;

import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AbortIncompleteMultipartUpload implements Serializable {
    private int daysAfterInitiation;

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbortIncompleteMultipartUpload m23766clone() throws CloneNotSupportedException {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e) {
            Single$$ExternalSyntheticBUOutline0.m$1("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.daysAfterInitiation == ((AbortIncompleteMultipartUpload) obj).daysAfterInitiation;
    }

    public int getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    public int hashCode() {
        return this.daysAfterInitiation;
    }

    public void setDaysAfterInitiation(int i) {
        this.daysAfterInitiation = i;
    }

    public AbortIncompleteMultipartUpload withDaysAfterInitiation(int i) {
        setDaysAfterInitiation(i);
        return this;
    }
}
