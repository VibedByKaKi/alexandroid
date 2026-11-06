package com.amazon.tarazed.type;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/type/RequestType;", "", "(Ljava/lang/String;I)V", "CSA_VIEW", "P2P_VIEW", "P2P_SHARE", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RequestType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RequestType CSA_VIEW = new RequestType("CSA_VIEW", 0);
    public static final RequestType P2P_VIEW = new RequestType("P2P_VIEW", 1);
    public static final RequestType P2P_SHARE = new RequestType("P2P_SHARE", 2);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{CSA_VIEW, P2P_VIEW, P2P_SHARE};
    }

    static {
        RequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private RequestType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RequestType> getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/type/RequestType$Companion;", "", "()V", "fromString", "Lcom/amazon/tarazed/type/RequestType;", "source", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRequestType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestType.kt\ncom/amazon/tarazed/type/RequestType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,14:1\n1282#2,2:15\n*S KotlinDebug\n*F\n+ 1 RequestType.kt\ncom/amazon/tarazed/type/RequestType$Companion\n*L\n10#1:15,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final RequestType fromString(@Nullable String source) {
            for (RequestType requestType : RequestType.values()) {
                if (Intrinsics.areEqual(requestType.name(), source)) {
                    return requestType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
