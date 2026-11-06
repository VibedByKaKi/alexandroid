package com.amazon.alexa.ra.core.data.fragments;

import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/OnPressType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "SEND_EVENT", "INVOKE_OPERATION", "TEXT_MESSAGE", "OPEN_URL", "EXPAND", "CONVERSATION_STARTER", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class OnPressType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnPressType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final OnPressType SEND_EVENT = new OnPressType("SEND_EVENT", 0, SmartFragmentEventProcessor.EVENT_SEND_EVENT);
    public static final OnPressType INVOKE_OPERATION = new OnPressType("INVOKE_OPERATION", 1, "InvokeOperation");
    public static final OnPressType TEXT_MESSAGE = new OnPressType("TEXT_MESSAGE", 2, "TextMessage");
    public static final OnPressType OPEN_URL = new OnPressType("OPEN_URL", 3, SmartFragmentEventProcessor.EVENT_OPEN_URL);
    public static final OnPressType EXPAND = new OnPressType("EXPAND", 4, "Expand");
    public static final OnPressType CONVERSATION_STARTER = new OnPressType("CONVERSATION_STARTER", 5, "ConversationStarter");

    private static final /* synthetic */ OnPressType[] $values() {
        return new OnPressType[]{SEND_EVENT, INVOKE_OPERATION, TEXT_MESSAGE, OPEN_URL, EXPAND, CONVERSATION_STARTER};
    }

    static {
        OnPressType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private OnPressType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static EnumEntries<OnPressType> getEntries() {
        return $ENTRIES;
    }

    public static OnPressType valueOf(String str) {
        return (OnPressType) Enum.valueOf(OnPressType.class, str);
    }

    public static OnPressType[] values() {
        return (OnPressType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/OnPressType$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/fragments/OnPressType;", "type", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFragmentData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentData.kt\ncom/amazon/alexa/ra/core/data/fragments/OnPressType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1375:1\n1#2:1376\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnPressType from(@NotNull String type) {
            OnPressType onPressType;
            type.getClass();
            OnPressType[] values = OnPressType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    onPressType = null;
                    break;
                }
                onPressType = values[i];
                if (Intrinsics.areEqual(onPressType.getType(), type)) {
                    break;
                }
                i++;
            }
            return onPressType == null ? OnPressType.SEND_EVENT : onPressType;
        }

        private Companion() {
        }
    }
}
