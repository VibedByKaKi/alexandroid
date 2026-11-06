package org.bouncycastle.asn1;

/* loaded from: classes11.dex */
public class OIDTokenizer {
    private int index = 0;
    private String oid;

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
