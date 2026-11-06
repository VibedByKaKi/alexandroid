package com.amazon.alexa.ra.sdk.capability;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/SmartFragmentCommandType;", "", "<init>", "(Ljava/lang/String;I)V", "EXECUTE", "PRESSED", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SmartFragmentCommandType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SmartFragmentCommandType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SmartFragmentCommandType EXECUTE = new SmartFragmentCommandType("EXECUTE", 0);
    public static final SmartFragmentCommandType PRESSED = new SmartFragmentCommandType("PRESSED", 1);

    private static final /* synthetic */ SmartFragmentCommandType[] $values() {
        return new SmartFragmentCommandType[]{EXECUTE, PRESSED};
    }

    static {
        SmartFragmentCommandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private SmartFragmentCommandType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SmartFragmentCommandType> getEntries() {
        return $ENTRIES;
    }

    public static SmartFragmentCommandType valueOf(String str) {
        return (SmartFragmentCommandType) Enum.valueOf(SmartFragmentCommandType.class, str);
    }

    public static SmartFragmentCommandType[] values() {
        return (SmartFragmentCommandType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/SmartFragmentCommandType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/sdk/capability/SmartFragmentCommandType;", "value", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationCapabilityData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationCapabilityData.kt\ncom/amazon/alexa/ra/sdk/capability/SmartFragmentCommandType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n295#2,2:231\n*S KotlinDebug\n*F\n+ 1 ConversationCapabilityData.kt\ncom/amazon/alexa/ra/sdk/capability/SmartFragmentCommandType$Companion\n*L\n105#1:231,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SmartFragmentCommandType from(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it2 = SmartFragmentCommandType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (StringsKt.equals(((SmartFragmentCommandType) obj).name(), value, true)) {
                    break;
                }
            }
            return (SmartFragmentCommandType) obj;
        }

        private Companion() {
        }
    }
}
