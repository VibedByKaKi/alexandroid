package com.amazon.alexa.ra.apl.deepbrowse.extensions;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/extensions/BackType;", "", "<init>", "(Ljava/lang/String;I)V", "COUNT", "ID", "INDEX", "Companion", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BackType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final BackType COUNT = new BackType("COUNT", 0);
    public static final BackType ID = new BackType("ID", 1);
    public static final BackType INDEX = new BackType("INDEX", 2);

    private static final /* synthetic */ BackType[] $values() {
        return new BackType[]{COUNT, ID, INDEX};
    }

    static {
        BackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private BackType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BackType> getEntries() {
        return $ENTRIES;
    }

    public static BackType valueOf(String str) {
        return (BackType) Enum.valueOf(BackType.class, str);
    }

    public static BackType[] values() {
        return (BackType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/extensions/BackType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/apl/deepbrowse/extensions/BackType;", "value", "", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeepBrowseBackExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepBrowseBackExtension.kt\ncom/amazon/alexa/ra/apl/deepbrowse/extensions/BackType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,149:1\n1137#2,2:150\n*S KotlinDebug\n*F\n+ 1 DeepBrowseBackExtension.kt\ncom/amazon/alexa/ra/apl/deepbrowse/extensions/BackType$Companion\n*L\n48#1:150,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BackType from(@Nullable String value) {
            if (value == null) {
                return BackType.COUNT;
            }
            for (BackType backType : BackType.values()) {
                if (StringsKt.equals(backType.name(), value, true)) {
                    return backType;
                }
            }
            PathKt$$ExternalSyntheticBUOutline0.m("Array contains no element matching the predicate.");
            return null;
        }

        private Companion() {
        }
    }
}
