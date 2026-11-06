package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_Announcement extends Announcement {
    private final String value;

    public AutoValue_Announcement(String str) {
        if (str != null) {
            this.value = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null value");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Announcement) {
            return this.value.equals(((Announcement) obj).getValue());
        }
        return false;
    }

    @Override // com.amazon.alexa.externalnotifications.capability.models.StronglyTypedString
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Announcement{value="), this.value, StringSubstitutor.DEFAULT_VAR_END);
    }
}
