package com.amazon.rtvi.capture.interfaces;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/rtvi/capture/interfaces/ExpectVisualContext;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "TRUE", "FALSE", "Companion", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExpectVisualContext {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExpectVisualContext[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int value;
    public static final ExpectVisualContext UNKNOWN = new ExpectVisualContext("UNKNOWN", 0, 0);
    public static final ExpectVisualContext TRUE = new ExpectVisualContext("TRUE", 1, 1);
    public static final ExpectVisualContext FALSE = new ExpectVisualContext("FALSE", 2, 2);

    private static final /* synthetic */ ExpectVisualContext[] $values() {
        return new ExpectVisualContext[]{UNKNOWN, TRUE, FALSE};
    }

    static {
        ExpectVisualContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private ExpectVisualContext(String str, int i, int i2) {
        this.value = i2;
    }

    @JvmStatic
    @NotNull
    public static final ExpectVisualContext fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    @NotNull
    public static EnumEntries<ExpectVisualContext> getEntries() {
        return $ENTRIES;
    }

    public static ExpectVisualContext valueOf(String str) {
        return (ExpectVisualContext) Enum.valueOf(ExpectVisualContext.class, str);
    }

    public static ExpectVisualContext[] values() {
        return (ExpectVisualContext[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/capture/interfaces/ExpectVisualContext$Companion;", "", "<init>", "()V", "fromValue", "Lcom/amazon/rtvi/capture/interfaces/ExpectVisualContext;", "value", "", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExpectVisualContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpectVisualContext.kt\ncom/amazon/rtvi/capture/interfaces/ExpectVisualContext$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n295#2,2:43\n*S KotlinDebug\n*F\n+ 1 ExpectVisualContext.kt\ncom/amazon/rtvi/capture/interfaces/ExpectVisualContext$Companion\n*L\n39#1:43,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ExpectVisualContext fromValue(int value) {
            Object obj;
            Iterator<E> it2 = ExpectVisualContext.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((ExpectVisualContext) obj).getValue() == value) {
                    break;
                }
            }
            ExpectVisualContext expectVisualContext = (ExpectVisualContext) obj;
            return expectVisualContext == null ? ExpectVisualContext.UNKNOWN : expectVisualContext;
        }

        private Companion() {
        }
    }
}
