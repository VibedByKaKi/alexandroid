package com.amazon.alexa.smarthomecameras.model;

import android.text.TextUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SessionId {
    private final String sessionId;

    private SessionId(String str) {
        this.sessionId = str;
    }

    @Nullable
    public static SessionId create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new SessionId(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionId) {
            return this.sessionId.equals(((SessionId) obj).sessionId);
        }
        return false;
    }

    public final String getValue() {
        return this.sessionId;
    }

    public int hashCode() {
        return Objects.hash(this.sessionId);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("SessionId{sessionId='"), this.sessionId, "'}");
    }
}
