package com.amazonaws.services.s3.internal.crypto;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
class SecuredCEK {
    private final byte[] encrypted;
    private final String keyWrapAlgorithm;
    private final Map<String, String> matdesc;

    public SecuredCEK(byte[] bArr, String str, Map<String, String> map) {
        this.encrypted = bArr;
        this.keyWrapAlgorithm = str;
        this.matdesc = Collections.unmodifiableMap(new TreeMap(map));
    }

    public byte[] getEncrypted() {
        return this.encrypted;
    }

    public String getKeyWrapAlgorithm() {
        return this.keyWrapAlgorithm;
    }

    public Map<String, String> getMaterialDescription() {
        return this.matdesc;
    }
}
