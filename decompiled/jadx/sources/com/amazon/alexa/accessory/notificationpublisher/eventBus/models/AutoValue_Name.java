package com.amazon.alexa.accessory.notificationpublisher.eventBus.models;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_Name extends Name {

    @Nullable
    private final String firstName;

    @Nullable
    private final String lastName;

    public AutoValue_Name(@Nullable String str, @Nullable String str2) {
        this.firstName = str;
        this.lastName = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Name) {
            Name name = (Name) obj;
            String str = this.firstName;
            if (str != null ? str.equals(name.getFirstName()) : name.getFirstName() == null) {
                String str2 = this.lastName;
                if (str2 != null ? str2.equals(name.getLastName()) : name.getLastName() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.Name
    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.eventBus.models.Name
    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.lastName;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Name{firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        return a$$ExternalSyntheticOutline0.m(sb, this.lastName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
