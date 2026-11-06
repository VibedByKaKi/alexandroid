package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class OIDTokenizer {
    private int index = 0;
    private final String oid;

    public OIDTokenizer(String str) {
        this.oid = str;
    }

    public boolean hasMoreTokens() {
        return this.index != -1;
    }

    public String nextToken() {
        int i = this.index;
        if (i == -1) {
            return null;
        }
        int indexOf = this.oid.indexOf(46, i);
        String str = this.oid;
        if (indexOf == -1) {
            String substring = str.substring(this.index);
            this.index = -1;
            return substring;
        }
        String substring2 = str.substring(this.index, indexOf);
        this.index = indexOf + 1;
        return substring2;
    }
}
