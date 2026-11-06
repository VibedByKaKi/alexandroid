package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WebMessageCompat {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
    private final byte[] mArrayBuffer;
    private final WebMessagePortCompat[] mPorts;
    private final String mString;
    private final int mType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Type {
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.mArrayBuffer = bArr;
        this.mString = null;
        this.mPorts = webMessagePortCompatArr;
        this.mType = 1;
    }

    private void checkType(int i) {
        if (i == this.mType) {
            return;
        }
        Room$$ExternalSyntheticBUOutline0.m$1("Wrong data accessor type detected. ", typeToString(this.mType), " expected, but got ", typeToString(i));
    }

    private String typeToString(int i) {
        return i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public byte[] getArrayBuffer() {
        checkType(1);
        Objects.requireNonNull(this.mArrayBuffer);
        return this.mArrayBuffer;
    }

    public String getData() {
        checkType(0);
        return this.mString;
    }

    public WebMessagePortCompat[] getPorts() {
        return this.mPorts;
    }

    public int getType() {
        return this.mType;
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.mString = str;
        this.mArrayBuffer = null;
        this.mPorts = webMessagePortCompatArr;
        this.mType = 0;
    }

    public WebMessageCompat(byte[] bArr) {
        this(bArr, (WebMessagePortCompat[]) null);
    }

    public WebMessageCompat(String str) {
        this(str, (WebMessagePortCompat[]) null);
    }
}
