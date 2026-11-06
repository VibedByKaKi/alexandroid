package com.google.android.gms.fido.u2f.api.messagebased;

import androidx.annotation.NonNull;
import com.google.android.gms.fido.u2f.api.messagebased.RequestType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public enum ResponseType {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");

    private final String zzb;

    ResponseType(String str) {
        this.zzb = str;
    }

    @NonNull
    public static ResponseType getResponseTypeForRequestType(@NonNull RequestType requestType) throws RequestType.UnsupportedRequestTypeException {
        if (requestType == null) {
            throw new RequestType.UnsupportedRequestTypeException(null);
        }
        int ordinal = requestType.ordinal();
        if (ordinal == 0) {
            return REGISTER;
        }
        if (ordinal == 1) {
            return SIGN;
        }
        throw new RequestType.UnsupportedRequestTypeException(requestType.toString());
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzb;
    }
}
