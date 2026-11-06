package org.codehaus.jackson.io;

import org.codehaus.jackson.SerializableString;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SerializedString implements SerializableString {
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;

    public SerializedString(String str) {
        this._value = str;
    }

    @Override // org.codehaus.jackson.SerializableString
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] quoteAsString = JsonStringEncoder.getInstance().quoteAsString(this._value);
        this._quotedChars = quoteAsString;
        return quoteAsString;
    }

    @Override // org.codehaus.jackson.SerializableString
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] quoteAsUTF8 = JsonStringEncoder.getInstance().quoteAsUTF8(this._value);
        this._quotedUTF8Ref = quoteAsUTF8;
        return quoteAsUTF8;
    }

    @Override // org.codehaus.jackson.SerializableString
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] encodeAsUTF8 = JsonStringEncoder.getInstance().encodeAsUTF8(this._value);
        this._unquotedUTF8Ref = encodeAsUTF8;
        return encodeAsUTF8;
    }

    @Override // org.codehaus.jackson.SerializableString
    public final int charLength() {
        return this._value.length();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    @Override // org.codehaus.jackson.SerializableString
    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final String toString() {
        return this._value;
    }
}
