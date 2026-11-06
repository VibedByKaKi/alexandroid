package com.amazon.tarazed.event;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.amazon.clouddrive.model.NodeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/tarazed/event/EventMetadataKey;", "", "(Ljava/lang/String;I)V", "SESSION_ID", CredentialProviderBaseController.REQUEST_TAG, "SESSION_TYPE", NodeType.SOURCE, "CONFIRMED_BY", "SKIP_END_SESSION", "PREVIOUS_FROM_STATE", "SESSION_INFO", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EventMetadataKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventMetadataKey[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final EventMetadataKey SESSION_INFO;

    @NotNull
    private static final List<EventMetadataKey> sensitiveKeys;
    public static final EventMetadataKey SESSION_ID = new EventMetadataKey("SESSION_ID", 0);
    public static final EventMetadataKey REQUEST_TYPE = new EventMetadataKey(CredentialProviderBaseController.REQUEST_TAG, 1);
    public static final EventMetadataKey SESSION_TYPE = new EventMetadataKey("SESSION_TYPE", 2);
    public static final EventMetadataKey SOURCE = new EventMetadataKey(NodeType.SOURCE, 3);
    public static final EventMetadataKey CONFIRMED_BY = new EventMetadataKey("CONFIRMED_BY", 4);
    public static final EventMetadataKey SKIP_END_SESSION = new EventMetadataKey("SKIP_END_SESSION", 5);
    public static final EventMetadataKey PREVIOUS_FROM_STATE = new EventMetadataKey("PREVIOUS_FROM_STATE", 6);

    private static final /* synthetic */ EventMetadataKey[] $values() {
        return new EventMetadataKey[]{SESSION_ID, REQUEST_TYPE, SESSION_TYPE, SOURCE, CONFIRMED_BY, SKIP_END_SESSION, PREVIOUS_FROM_STATE, SESSION_INFO};
    }

    static {
        EventMetadataKey eventMetadataKey = new EventMetadataKey("SESSION_INFO", 7);
        SESSION_INFO = eventMetadataKey;
        EventMetadataKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        sensitiveKeys = CollectionsKt.listOf(eventMetadataKey);
    }

    private EventMetadataKey(String str, int i) {
    }

    @NotNull
    public static EnumEntries<EventMetadataKey> getEntries() {
        return $ENTRIES;
    }

    public static EventMetadataKey valueOf(String str) {
        return (EventMetadataKey) Enum.valueOf(EventMetadataKey.class, str);
    }

    public static EventMetadataKey[] values() {
        return (EventMetadataKey[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/tarazed/event/EventMetadataKey$Companion;", "", "()V", "sensitiveKeys", "", "Lcom/amazon/tarazed/event/EventMetadataKey;", "getSensitiveKeys", "()Ljava/util/List;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<EventMetadataKey> getSensitiveKeys() {
            return EventMetadataKey.sensitiveKeys;
        }

        private Companion() {
        }
    }
}
