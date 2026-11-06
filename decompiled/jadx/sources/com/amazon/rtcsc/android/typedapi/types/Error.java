package com.amazon.rtcsc.android.typedapi.types;

import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Error {

    @NonNull
    private String code;

    @NonNull
    private String message;

    public Error(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("code is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("message is marked non-null but is null");
            throw null;
        }
        this.code = str;
        this.message = str2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Error;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        if (!error.canEqual(this)) {
            return false;
        }
        String code = getCode();
        String code2 = error.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = error.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    @NonNull
    public String getCode() {
        return this.code;
    }

    @NonNull
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String code = getCode();
        int hashCode = code == null ? 43 : code.hashCode();
        String message = getMessage();
        return ((hashCode + 59) * 59) + (message != null ? message.hashCode() : 43);
    }
}
