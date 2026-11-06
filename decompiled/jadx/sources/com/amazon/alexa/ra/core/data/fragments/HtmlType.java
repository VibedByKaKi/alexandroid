package com.amazon.alexa.ra.core.data.fragments;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/HtmlType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MCP_APP", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class HtmlType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HtmlType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final HtmlType MCP_APP = new HtmlType("MCP_APP", 0, "mcp-app");

    @NotNull
    private final String value;

    private static final /* synthetic */ HtmlType[] $values() {
        return new HtmlType[]{MCP_APP};
    }

    static {
        HtmlType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private HtmlType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<HtmlType> getEntries() {
        return $ENTRIES;
    }

    public static HtmlType valueOf(String str) {
        return (HtmlType) Enum.valueOf(HtmlType.class, str);
    }

    public static HtmlType[] values() {
        return (HtmlType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/HtmlType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/HtmlType;", "value", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFragmentData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentData.kt\ncom/amazon/alexa/ra/core/data/fragments/HtmlType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1375:1\n1#2:1376\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HtmlType from(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it2 = HtmlType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (StringsKt.equals(((HtmlType) obj).getValue(), value, true)) {
                    break;
                }
            }
            return (HtmlType) obj;
        }

        private Companion() {
        }
    }
}
