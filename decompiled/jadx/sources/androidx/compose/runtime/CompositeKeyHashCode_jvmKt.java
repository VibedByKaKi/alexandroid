package androidx.compose.runtime;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003*\u00060\u0001j\u0002`\u0003H\u0086\b\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0080\b\u001a!\u0010\t\u001a\u00020\u0001*\u00060\u0001j\u0002`\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0080\b\u001a!\u0010\f\u001a\u00020\u0001*\u00060\u0001j\u0002`\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0080\b\u001a!\u0010\r\u001a\u00020\u0001*\u00060\u0001j\u0002`\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0080\b\u001a%\u0010\r\u001a\u00020\u0001*\u00060\u0001j\u0002`\u00032\n\u0010\n\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0080\b\"\u000e\u0010\u000e\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0010"}, d2 = {"CompositeKeyHashCode", "", "toLong", "Landroidx/compose/runtime/CompositeKeyHashCode;", "toString", "", "radix", "", "initial", "compoundWith", "segment", "shift", "unCompoundWith", "bottomUpCompoundWith", "CompositeKeyHashSizeBits", "EmptyCompositeKeyHashCode", SmartFragmentContent.RUNTIME}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositeKeyHashCode.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n*L\n1#1,49:1\n35#2:50\n27#2:51\n35#2:52\n35#2:53\n*S KotlinDebug\n*F\n+ 1 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n*L\n33#1:50\n36#1:51\n39#1:52\n44#1:53\n*E\n"})
/* loaded from: classes13.dex */
public final class CompositeKeyHashCode_jvmKt {
    public static final int CompositeKeyHashSizeBits = 64;
    public static final long EmptyCompositeKeyHashCode = 0;

    public static final long CompositeKeyHashCode(int i) {
        return i;
    }

    public static final long bottomUpCompoundWith(long j, int i, int i2) {
        return j ^ Long.rotateLeft(i, i2);
    }

    public static final long compoundWith(long j, int i, int i2) {
        return Long.rotateLeft(j, i2) ^ i;
    }

    @NotNull
    public static final String toString(long j, int i) {
        String l = Long.toString(j, CharsKt.checkRadix(i));
        l.getClass();
        return l;
    }

    public static final long unCompoundWith(long j, int i, int i2) {
        return Long.rotateRight(j ^ i, i2);
    }

    public static final long bottomUpCompoundWith(long j, long j2, int i) {
        return j ^ Long.rotateLeft(j2, i);
    }

    public static final long toLong(long j) {
        return j;
    }
}
