package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LoadEncryptedSharedPrefsErrorEvent extends LoadEncryptedSharedPrefsErrorEvent {
    private final boolean encrypted;
    private final String message;
    private final String packageName;
    private final String preferenceName;
    private final boolean success;

    public AutoValue_LoadEncryptedSharedPrefsErrorEvent(String str, boolean z, String str2, boolean z2, String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null packageName");
            throw null;
        }
        this.packageName = str;
        this.encrypted = z;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null preferenceName");
            throw null;
        }
        this.preferenceName = str2;
        this.success = z2;
        if (str3 != null) {
            this.message = str3;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null message");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoadEncryptedSharedPrefsErrorEvent) {
            LoadEncryptedSharedPrefsErrorEvent loadEncryptedSharedPrefsErrorEvent = (LoadEncryptedSharedPrefsErrorEvent) obj;
            if (this.packageName.equals(loadEncryptedSharedPrefsErrorEvent.getPackageName()) && this.encrypted == loadEncryptedSharedPrefsErrorEvent.getEncrypted() && this.preferenceName.equals(loadEncryptedSharedPrefsErrorEvent.getPreferenceName()) && this.success == loadEncryptedSharedPrefsErrorEvent.getSuccess() && this.message.equals(loadEncryptedSharedPrefsErrorEvent.getMessage())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.LoadEncryptedSharedPrefsErrorEvent
    public boolean getEncrypted() {
        return this.encrypted;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.LoadEncryptedSharedPrefsErrorEvent
    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.LoadEncryptedSharedPrefsErrorEvent
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.LoadEncryptedSharedPrefsErrorEvent
    public String getPreferenceName() {
        return this.preferenceName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.LoadEncryptedSharedPrefsErrorEvent
    public boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.message.hashCode() ^ ((((((((this.packageName.hashCode() ^ 1000003) * 1000003) ^ (this.encrypted ? 1231 : 1237)) * 1000003) ^ this.preferenceName.hashCode()) * 1000003) ^ (this.success ? 1231 : 1237)) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadEncryptedSharedPrefsErrorEvent{packageName=");
        sb.append(this.packageName);
        sb.append(", encrypted=");
        sb.append(this.encrypted);
        sb.append(", preferenceName=");
        sb.append(this.preferenceName);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", message=");
        return a$$ExternalSyntheticOutline0.m(sb, this.message, StringSubstitutor.DEFAULT_VAR_END);
    }
}
