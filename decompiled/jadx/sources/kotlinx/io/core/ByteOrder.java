package kotlinx.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BIG_ENDIAN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lkotlinx/io/core/ByteOrder;", "", "nioOrder", "Ljava/nio/ByteOrder;", "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "getNioOrder", "()Ljava/nio/ByteOrder;", "BIG_ENDIAN", "LITTLE_ENDIAN", "Companion", "kotlinx-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class ByteOrder {
    private static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ByteOrder LITTLE_ENDIAN;

    /* renamed from: native, reason: not valid java name */
    private static final ByteOrder f354native;

    @NotNull
    private final java.nio.ByteOrder nioOrder;

    static {
        ByteOrder orderOf;
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byteOrder.getClass();
        ByteOrder byteOrder2 = new ByteOrder("BIG_ENDIAN", 0, byteOrder);
        BIG_ENDIAN = byteOrder2;
        java.nio.ByteOrder byteOrder3 = java.nio.ByteOrder.LITTLE_ENDIAN;
        byteOrder3.getClass();
        ByteOrder byteOrder4 = new ByteOrder("LITTLE_ENDIAN", 1, byteOrder3);
        LITTLE_ENDIAN = byteOrder4;
        $VALUES = new ByteOrder[]{byteOrder2, byteOrder4};
        INSTANCE = new Companion(null);
        java.nio.ByteOrder nativeOrder = java.nio.ByteOrder.nativeOrder();
        nativeOrder.getClass();
        orderOf = ByteOrderJVMKt.orderOf(nativeOrder);
        f354native = orderOf;
    }

    private ByteOrder(String str, int i, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) $VALUES.clone();
    }

    @NotNull
    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/io/core/ByteOrder$Companion;", "", "()V", "native", "Lkotlinx/io/core/ByteOrder;", "nativeOrder", "of", "nioOrder", "Ljava/nio/ByteOrder;", "kotlinx-io"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final ByteOrder nativeOrder() {
            return ByteOrder.f354native;
        }

        @NotNull
        public final ByteOrder of(@NotNull java.nio.ByteOrder nioOrder) {
            ByteOrder orderOf;
            nioOrder.getClass();
            orderOf = ByteOrderJVMKt.orderOf(nioOrder);
            return orderOf;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
