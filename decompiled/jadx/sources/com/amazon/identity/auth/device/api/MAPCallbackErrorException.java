package com.amazon.identity.auth.device.api;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPCallbackErrorException extends Exception {
    private static final long serialVersionUID = 1;
    private final MAPError mError;
    private final byte[] mErrorBundleBytes;
    private final String mErrorMessage;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MAPCallbackErrorException(android.os.Bundle r4, com.amazon.identity.auth.device.api.MAPError r5, java.lang.String r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            goto Lb
        L3:
            java.lang.String r0 = "com.amazon.dcp.sso.ErrorMessage"
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto Ld
        Lb:
            r0 = 0
            goto L2b
        Ld:
            java.lang.String r1 = "com.amazon.dcp.sso.ErrorCode"
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L2b
            java.lang.String r2 = " ("
            java.lang.StringBuilder r0 = defpackage.a$$ExternalSyntheticOutline0.m1m(r0, r2)
            int r1 = r4.getInt(r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L2b:
            r3.<init>(r0)
            if (r4 == 0) goto L31
            goto L36
        L31:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L36:
            if (r5 == 0) goto L3b
            r3.mError = r5
            goto L4d
        L3b:
            com.amazon.identity.auth.device.api.MAPError$CommonError r5 = com.amazon.identity.auth.device.api.MAPError.CommonError.INTERNAL_ERROR
            int r5 = r5.getErrorCode()
            java.lang.String r0 = "com.amazon.map.error.errorCode"
            int r5 = r4.getInt(r0, r5)
            com.amazon.identity.auth.device.api.MAPError r5 = com.amazon.identity.auth.device.api.MAPError.getErrorFromValue(r5)
            r3.mError = r5
        L4d:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L56
            r3.mErrorMessage = r6
            goto L60
        L56:
            java.lang.String r5 = "com.amazon.map.error.errorMessage"
            java.lang.String r6 = "An internal error occurs!"
            java.lang.String r5 = r4.getString(r5, r6)
            r3.mErrorMessage = r5
        L60:
            android.os.Parcel r5 = android.os.Parcel.obtain()
            r5.writeBundle(r4)     // Catch: java.lang.Throwable -> L71
            byte[] r4 = r5.marshall()     // Catch: java.lang.Throwable -> L71
            r3.mErrorBundleBytes = r4     // Catch: java.lang.Throwable -> L71
            r5.recycle()
            return
        L71:
            r3 = move-exception
            r5.recycle()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.auth.device.api.MAPCallbackErrorException.<init>(android.os.Bundle, com.amazon.identity.auth.device.api.MAPError, java.lang.String):void");
    }

    public MAPError getError() {
        return this.mError;
    }

    @FireOsSdk
    public Bundle getErrorBundle() {
        Parcel obtain = Parcel.obtain();
        try {
            byte[] bArr = this.mErrorBundleBytes;
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return obtain.readBundle();
        } finally {
            obtain.recycle();
        }
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    @FireOsSdk
    public MAPCallbackErrorException(Bundle bundle) {
        this(bundle, null, null);
    }
}
