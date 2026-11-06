package com.amazon.alexa.client.alexaservice.dialog.cache;

import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_CachedUtterance extends CachedUtterance {
    private final String dialogId;
    private final long timestamp;
    private final String transcript;

    public AutoValue_CachedUtterance(String str, String str2, long j) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null transcript");
            throw null;
        }
        this.transcript = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogId");
            throw null;
        }
        this.dialogId = str2;
        this.timestamp = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CachedUtterance) {
            CachedUtterance cachedUtterance = (CachedUtterance) obj;
            if (this.transcript.equals(cachedUtterance.getTranscript()) && this.dialogId.equals(cachedUtterance.getDialogId()) && this.timestamp == cachedUtterance.getTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.cache.CachedUtterance
    @NonNull
    public String getDialogId() {
        return this.dialogId;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.cache.CachedUtterance
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.cache.CachedUtterance
    @NonNull
    public String getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        int hashCode = (((this.transcript.hashCode() ^ 1000003) * 1000003) ^ this.dialogId.hashCode()) * 1000003;
        long j = this.timestamp;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedUtterance{transcript=");
        sb.append(this.transcript);
        sb.append(", dialogId=");
        sb.append(this.dialogId);
        sb.append(", timestamp=");
        return a$$ExternalSyntheticOutline0.m(this.timestamp, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
