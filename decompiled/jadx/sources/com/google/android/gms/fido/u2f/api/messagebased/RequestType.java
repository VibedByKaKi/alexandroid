package com.google.android.gms.fido.u2f.api.messagebased;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public enum RequestType {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");

    private final String zzb;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UnsupportedRequestTypeException extends Exception {
        public UnsupportedRequestTypeException(@NonNull String str) {
            super("Unsupported request type ".concat(String.valueOf(str)));
        }
    }

    RequestType(String str) {
        this.zzb = str;
    }

    @NonNull
    public static RequestType fromString(@NonNull String str) throws UnsupportedRequestTypeException {
        for (RequestType requestType : values()) {
            if (str.equals(requestType.zzb)) {
                return requestType;
            }
        }
        throw new UnsupportedRequestTypeException(str);
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzb;
    }
}
