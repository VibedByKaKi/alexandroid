package matter.tlv;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\n\n\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"MODIFIED_TYPE_MASK", "", "ELEMENT_TYPE_MASK", "SIGNED_INT_TYPE", "UNSIGNED_INT_TYPE", "UTF8_STRING_TYPE", "BYTE_STRING_TYPE", "BOOLEAN_FALSE", "BOOLEAN_TRUE", "FLOATING_POINT_4", "FLOATING_POINT_8", "NULL", "STRUCTURE", "ARRAY", "LIST", "END_OF_CONTAINER", "encodeSize", "size", "", "AlexaMobileAndroidMatter_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TypesKt {
    private static final byte ARRAY = 22;
    private static final byte BOOLEAN_FALSE = 8;
    private static final byte BOOLEAN_TRUE = 9;
    private static final byte BYTE_STRING_TYPE = 16;
    private static final byte ELEMENT_TYPE_MASK = 31;
    private static final byte END_OF_CONTAINER = 24;
    private static final byte FLOATING_POINT_4 = 10;
    private static final byte FLOATING_POINT_8 = 11;
    private static final byte LIST = 23;
    private static final byte MODIFIED_TYPE_MASK = 28;
    private static final byte NULL = 20;
    private static final byte SIGNED_INT_TYPE = 0;
    private static final byte STRUCTURE = 21;
    private static final byte UNSIGNED_INT_TYPE = 4;
    private static final byte UTF8_STRING_TYPE = 12;

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte encodeSize(short s) {
        if (s == 1) {
            return (byte) 0;
        }
        if (s == 2) {
            return (byte) 1;
        }
        if (s == 4) {
            return (byte) 2;
        }
        if (s == 8) {
            return (byte) 3;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(s, "Unexpected size "));
        return (byte) 0;
    }
}
