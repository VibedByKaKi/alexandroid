package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class BCLoadStoreParameter implements KeyStore.LoadStoreParameter {
    private final InputStream in;
    private final OutputStream out;
    private final KeyStore.ProtectionParameter protectionParameter;

    public BCLoadStoreParameter(InputStream inputStream, OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this.in = inputStream;
        this.out = outputStream;
        this.protectionParameter = protectionParameter;
    }

    public InputStream getInputStream() {
        if (this.out == null) {
            return this.in;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("parameter configured for storage OutputStream present");
        return null;
    }

    public OutputStream getOutputStream() {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            return outputStream;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("parameter not configured for storage - no OutputStream");
        return null;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public BCLoadStoreParameter(InputStream inputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(inputStream, null, protectionParameter);
    }

    public BCLoadStoreParameter(InputStream inputStream, char[] cArr) {
        this(inputStream, new KeyStore.PasswordProtection(cArr));
    }

    public BCLoadStoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(null, outputStream, protectionParameter);
    }

    public BCLoadStoreParameter(OutputStream outputStream, char[] cArr) {
        this(outputStream, new KeyStore.PasswordProtection(cArr));
    }
}
