package io.ktor.network.sockets;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0012\u0010\b\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u0006ø\u0001\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lio/ktor/network/sockets/TypeOfService;", "", "value", "", "constructor-impl", "(I)B", "Lkotlin/UByte;", "(B)B", "intValue", "getIntValue-impl", "(B)I", "getValue", "()B", "B", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class TypeOfService {
    private final byte value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte UNDEFINED = m25248constructorimpl((byte) 0);
    private static final byte IPTOS_LOWCOST = m25248constructorimpl((byte) 2);
    private static final byte IPTOS_RELIABILITY = m25248constructorimpl((byte) 4);
    private static final byte IPTOS_THROUGHPUT = m25248constructorimpl((byte) 8);
    private static final byte IPTOS_LOWDELAY = m25248constructorimpl((byte) 16);

    private /* synthetic */ TypeOfService(byte b) {
        this.value = b;
    }

    @NotNull
    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TypeOfService m25247boximpl(byte b) {
        return new TypeOfService(b);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m25249constructorimpl(int i) {
        return m25248constructorimpl(UByte.m25312constructorimpl((byte) i));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25250equalsimpl(byte b, @Nullable Object obj) {
        return (obj instanceof TypeOfService) && b == ((TypeOfService) obj).m25255unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25251equalsimpl0(byte b, byte b2) {
        throw null;
    }

    /* renamed from: getIntValue-impl, reason: not valid java name */
    public static final int m25252getIntValueimpl(byte b) {
        return b & 255;
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25254toStringimpl(byte b) {
        return "TypeOfService(value=" + UByte.m25356toStringimpl(b) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public boolean equals(Object other) {
        return m25250equalsimpl(this.value, other);
    }

    public final byte getValue() {
        return this.value;
    }

    public int hashCode() {
        return m25253hashCodeimpl(this.value);
    }

    public String toString() {
        return m25254toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m25255unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0016\u0010\f\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lio/ktor/network/sockets/TypeOfService$Companion;", "", "()V", "IPTOS_LOWCOST", "Lio/ktor/network/sockets/TypeOfService;", "getIPTOS_LOWCOST", "()B", "B", "IPTOS_LOWDELAY", "getIPTOS_LOWDELAY", "IPTOS_RELIABILITY", "getIPTOS_RELIABILITY", "IPTOS_THROUGHPUT", "getIPTOS_THROUGHPUT", "UNDEFINED", "getUNDEFINED", "ktor-network"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        public final byte getIPTOS_LOWCOST() {
            return TypeOfService.IPTOS_LOWCOST;
        }

        public final byte getIPTOS_LOWDELAY() {
            return TypeOfService.IPTOS_LOWDELAY;
        }

        public final byte getIPTOS_RELIABILITY() {
            return TypeOfService.IPTOS_RELIABILITY;
        }

        public final byte getIPTOS_THROUGHPUT() {
            return TypeOfService.IPTOS_THROUGHPUT;
        }

        public final byte getUNDEFINED() {
            return TypeOfService.UNDEFINED;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m25248constructorimpl(byte b) {
        return b;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25253hashCodeimpl(byte b) {
        return b;
    }
}
