package com.amazon.alexa.ra.common.metrics;

import com.amazon.clouddrive.model.NodeType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/common/metrics/CoreUiEventMetadataKey;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION", "ATTRIBUTION_TAG", "CONTENT_ID", "DIALOG_REQUEST_ID", "EVENT_REALTIME_MS", "EVENT_VALUE", "FILE_EXTENSION", "FILE_SIZE", "FRAGMENT_PENDING_UPDATE", "FRAGMENT_REVISION", "FRAGMENT_URI", "INITIATOR", "INTERACTION_LABEL", "LATENCY_REALTIME_MS", "MESSAGE_ID", "RESPONSE_TYPE", NodeType.SOURCE, "URL_DOMAIN", "UPLOAD_MODE", "FILE_COUNT", "NODE_COUNT", "RETRY_FILE_COUNT", "ERROR_REASON", "POLL_CYCLE_COUNT", "MUTE_ACTIVE", "CONTEXT_SOURCE", "ERROR_TYPE", "SOURCE_CONTEXT", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CoreUiEventMetadataKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoreUiEventMetadataKey[] $VALUES;
    public static final CoreUiEventMetadataKey ACTION = new CoreUiEventMetadataKey("ACTION", 0);
    public static final CoreUiEventMetadataKey ATTRIBUTION_TAG = new CoreUiEventMetadataKey("ATTRIBUTION_TAG", 1);
    public static final CoreUiEventMetadataKey CONTENT_ID = new CoreUiEventMetadataKey("CONTENT_ID", 2);
    public static final CoreUiEventMetadataKey DIALOG_REQUEST_ID = new CoreUiEventMetadataKey("DIALOG_REQUEST_ID", 3);
    public static final CoreUiEventMetadataKey EVENT_REALTIME_MS = new CoreUiEventMetadataKey("EVENT_REALTIME_MS", 4);
    public static final CoreUiEventMetadataKey EVENT_VALUE = new CoreUiEventMetadataKey("EVENT_VALUE", 5);
    public static final CoreUiEventMetadataKey FILE_EXTENSION = new CoreUiEventMetadataKey("FILE_EXTENSION", 6);
    public static final CoreUiEventMetadataKey FILE_SIZE = new CoreUiEventMetadataKey("FILE_SIZE", 7);
    public static final CoreUiEventMetadataKey FRAGMENT_PENDING_UPDATE = new CoreUiEventMetadataKey("FRAGMENT_PENDING_UPDATE", 8);
    public static final CoreUiEventMetadataKey FRAGMENT_REVISION = new CoreUiEventMetadataKey("FRAGMENT_REVISION", 9);
    public static final CoreUiEventMetadataKey FRAGMENT_URI = new CoreUiEventMetadataKey("FRAGMENT_URI", 10);
    public static final CoreUiEventMetadataKey INITIATOR = new CoreUiEventMetadataKey("INITIATOR", 11);
    public static final CoreUiEventMetadataKey INTERACTION_LABEL = new CoreUiEventMetadataKey("INTERACTION_LABEL", 12);
    public static final CoreUiEventMetadataKey LATENCY_REALTIME_MS = new CoreUiEventMetadataKey("LATENCY_REALTIME_MS", 13);
    public static final CoreUiEventMetadataKey MESSAGE_ID = new CoreUiEventMetadataKey("MESSAGE_ID", 14);
    public static final CoreUiEventMetadataKey RESPONSE_TYPE = new CoreUiEventMetadataKey("RESPONSE_TYPE", 15);
    public static final CoreUiEventMetadataKey SOURCE = new CoreUiEventMetadataKey(NodeType.SOURCE, 16);
    public static final CoreUiEventMetadataKey URL_DOMAIN = new CoreUiEventMetadataKey("URL_DOMAIN", 17);
    public static final CoreUiEventMetadataKey UPLOAD_MODE = new CoreUiEventMetadataKey("UPLOAD_MODE", 18);
    public static final CoreUiEventMetadataKey FILE_COUNT = new CoreUiEventMetadataKey("FILE_COUNT", 19);
    public static final CoreUiEventMetadataKey NODE_COUNT = new CoreUiEventMetadataKey("NODE_COUNT", 20);
    public static final CoreUiEventMetadataKey RETRY_FILE_COUNT = new CoreUiEventMetadataKey("RETRY_FILE_COUNT", 21);
    public static final CoreUiEventMetadataKey ERROR_REASON = new CoreUiEventMetadataKey("ERROR_REASON", 22);
    public static final CoreUiEventMetadataKey POLL_CYCLE_COUNT = new CoreUiEventMetadataKey("POLL_CYCLE_COUNT", 23);
    public static final CoreUiEventMetadataKey MUTE_ACTIVE = new CoreUiEventMetadataKey("MUTE_ACTIVE", 24);
    public static final CoreUiEventMetadataKey CONTEXT_SOURCE = new CoreUiEventMetadataKey("CONTEXT_SOURCE", 25);
    public static final CoreUiEventMetadataKey ERROR_TYPE = new CoreUiEventMetadataKey("ERROR_TYPE", 26);
    public static final CoreUiEventMetadataKey SOURCE_CONTEXT = new CoreUiEventMetadataKey("SOURCE_CONTEXT", 27);

    private static final /* synthetic */ CoreUiEventMetadataKey[] $values() {
        return new CoreUiEventMetadataKey[]{ACTION, ATTRIBUTION_TAG, CONTENT_ID, DIALOG_REQUEST_ID, EVENT_REALTIME_MS, EVENT_VALUE, FILE_EXTENSION, FILE_SIZE, FRAGMENT_PENDING_UPDATE, FRAGMENT_REVISION, FRAGMENT_URI, INITIATOR, INTERACTION_LABEL, LATENCY_REALTIME_MS, MESSAGE_ID, RESPONSE_TYPE, SOURCE, URL_DOMAIN, UPLOAD_MODE, FILE_COUNT, NODE_COUNT, RETRY_FILE_COUNT, ERROR_REASON, POLL_CYCLE_COUNT, MUTE_ACTIVE, CONTEXT_SOURCE, ERROR_TYPE, SOURCE_CONTEXT};
    }

    static {
        CoreUiEventMetadataKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CoreUiEventMetadataKey(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CoreUiEventMetadataKey> getEntries() {
        return $ENTRIES;
    }

    public static CoreUiEventMetadataKey valueOf(String str) {
        return (CoreUiEventMetadataKey) Enum.valueOf(CoreUiEventMetadataKey.class, str);
    }

    public static CoreUiEventMetadataKey[] values() {
        return (CoreUiEventMetadataKey[]) $VALUES.clone();
    }
}
