package androidx.javascriptengine;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Base64;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Message {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
    private final byte[] mArrayBuffer;
    private final String mString;
    private final int mType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Type {
    }

    private Message(String str) {
        Objects.requireNonNull(str);
        this.mString = str;
        this.mArrayBuffer = null;
        this.mType = 0;
    }

    public static Message createArrayBufferMessage(byte[] bArr) {
        return new Message(bArr);
    }

    public static Message createStringMessage(String str) {
        return new Message(str);
    }

    public byte[] getArrayBuffer() {
        if (this.mType != 1) {
            throw new MessageTypeMismatchException("Message type is not an array buffer");
        }
        byte[] bArr = this.mArrayBuffer;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    public String getString() {
        if (this.mType != 0) {
            throw new MessageTypeMismatchException("Message type is not a string");
        }
        String str = this.mString;
        Objects.requireNonNull(str);
        return str;
    }

    public int getType() {
        return this.mType;
    }

    public String toString() {
        int i = this.mType;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("(string=");
            return a$$ExternalSyntheticOutline0.m(sb, this.mString, MarkdownConstants.RIGHT_PARENTHESIS);
        }
        if (i != 1) {
            throw new UnsupportedOperationException("Unsupported message type: " + getType());
        }
        return super.toString() + "(arrayBuffer=" + Base64.getEncoder().encodeToString(this.mArrayBuffer) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    private Message(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.mString = null;
        this.mArrayBuffer = bArr;
        this.mType = 1;
    }
}
