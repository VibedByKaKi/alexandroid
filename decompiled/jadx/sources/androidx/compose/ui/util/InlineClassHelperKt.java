package androidx.compose.ui.util;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b¨\u0006\u000e"}, d2 = {"packFloats", "", "val1", "", "val2", "unpackFloat1", "value", "unpackAbsFloat1", "unpackFloat2", "unpackAbsFloat2", "packInts", "", "unpackInt1", "unpackInt2", "ui-util"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,92:1\n22#2:93\n22#2:94\n22#2:95\n22#2:96\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n60#1:93\n65#1:94\n70#1:95\n75#1:96\n*E\n"})
/* loaded from: classes13.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long packInts(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final float unpackAbsFloat1(long j) {
        return Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackAbsFloat2(long j) {
        return Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat1(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float unpackFloat2(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }
}
