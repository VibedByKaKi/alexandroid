package com.amazon.crypto.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Base64 {
    private Base64() {
        UtilityInstanceAttempt.in(this);
    }

    public static String base64FromBase64Url(@NonNull String str) {
        return BitVector$$ExternalSyntheticOutline0.m(str.replace('-', SignatureVisitor.EXTENDS).replace('_', '/'), new String(new char[4 - (str.length() % 4)]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "="));
    }

    public static byte[] decode(@Nullable byte[] bArr) throws IllegalArgumentException {
        return bArr == null ? bArr : android.util.Base64.decode(bArr, 2);
    }

    @Nullable
    public static byte[] encode(@Nullable byte[] bArr) {
        return bArr == null ? bArr : android.util.Base64.encode(bArr, 2);
    }
}
