package com.amazon.alexa.ra.core.metrics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/Breadcrumb;", "", "<init>", "(Ljava/lang/String;I)V", "PAYLOAD_DESERIALIZED_IN_UI", "BROADCAST_DELIVERED", "BROADCAST_NO_RECEIVER", "EXTRACTED_FROM_INTENT", "DROPPED_WRONG_CONVERSATION", "TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC", "CONVERSATION_CHANGED_FRAGMENTS_CLEARED", "FRAGMENT_PARSING_STARTED", "FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA", "FRAGMENT_ADDED_TO_TREE", "FRAGMENT_UPDATED_HIGHER_REVISION", "FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION", "FRAGMENT_SKIPPED_EXPIRED", "FRAGMENT_FILTERED_BEFORE_RENDER", "TEXT_DISPATCHED_TO_LAZYCOLUMN", "TEXT_ENTERED_RESPONSE_COMPOSABLE", "TEXT_MARKDOWN_COMPOSING", "TEXT_MARKDOWN_ANIMATION_COMPLETE", "TEXT_DISPOSED_WHILE_STREAMING", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Breadcrumb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Breadcrumb[] $VALUES;
    public static final Breadcrumb PAYLOAD_DESERIALIZED_IN_UI = new Breadcrumb("PAYLOAD_DESERIALIZED_IN_UI", 0);
    public static final Breadcrumb BROADCAST_DELIVERED = new Breadcrumb("BROADCAST_DELIVERED", 1);
    public static final Breadcrumb BROADCAST_NO_RECEIVER = new Breadcrumb("BROADCAST_NO_RECEIVER", 2);
    public static final Breadcrumb EXTRACTED_FROM_INTENT = new Breadcrumb("EXTRACTED_FROM_INTENT", 3);
    public static final Breadcrumb DROPPED_WRONG_CONVERSATION = new Breadcrumb("DROPPED_WRONG_CONVERSATION", 4);
    public static final Breadcrumb TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC = new Breadcrumb("TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC", 5);
    public static final Breadcrumb CONVERSATION_CHANGED_FRAGMENTS_CLEARED = new Breadcrumb("CONVERSATION_CHANGED_FRAGMENTS_CLEARED", 6);
    public static final Breadcrumb FRAGMENT_PARSING_STARTED = new Breadcrumb("FRAGMENT_PARSING_STARTED", 7);
    public static final Breadcrumb FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA = new Breadcrumb("FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA", 8);
    public static final Breadcrumb FRAGMENT_ADDED_TO_TREE = new Breadcrumb("FRAGMENT_ADDED_TO_TREE", 9);
    public static final Breadcrumb FRAGMENT_UPDATED_HIGHER_REVISION = new Breadcrumb("FRAGMENT_UPDATED_HIGHER_REVISION", 10);
    public static final Breadcrumb FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION = new Breadcrumb("FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION", 11);
    public static final Breadcrumb FRAGMENT_SKIPPED_EXPIRED = new Breadcrumb("FRAGMENT_SKIPPED_EXPIRED", 12);
    public static final Breadcrumb FRAGMENT_FILTERED_BEFORE_RENDER = new Breadcrumb("FRAGMENT_FILTERED_BEFORE_RENDER", 13);
    public static final Breadcrumb TEXT_DISPATCHED_TO_LAZYCOLUMN = new Breadcrumb("TEXT_DISPATCHED_TO_LAZYCOLUMN", 14);
    public static final Breadcrumb TEXT_ENTERED_RESPONSE_COMPOSABLE = new Breadcrumb("TEXT_ENTERED_RESPONSE_COMPOSABLE", 15);
    public static final Breadcrumb TEXT_MARKDOWN_COMPOSING = new Breadcrumb("TEXT_MARKDOWN_COMPOSING", 16);
    public static final Breadcrumb TEXT_MARKDOWN_ANIMATION_COMPLETE = new Breadcrumb("TEXT_MARKDOWN_ANIMATION_COMPLETE", 17);
    public static final Breadcrumb TEXT_DISPOSED_WHILE_STREAMING = new Breadcrumb("TEXT_DISPOSED_WHILE_STREAMING", 18);

    private static final /* synthetic */ Breadcrumb[] $values() {
        return new Breadcrumb[]{PAYLOAD_DESERIALIZED_IN_UI, BROADCAST_DELIVERED, BROADCAST_NO_RECEIVER, EXTRACTED_FROM_INTENT, DROPPED_WRONG_CONVERSATION, TOKEN_MISMATCH_TRIGGERED_CLOUD_RESYNC, CONVERSATION_CHANGED_FRAGMENTS_CLEARED, FRAGMENT_PARSING_STARTED, FRAGMENT_JSON_PARSED_TO_FRAGMENTDATA, FRAGMENT_ADDED_TO_TREE, FRAGMENT_UPDATED_HIGHER_REVISION, FRAGMENT_SKIPPED_SAME_OR_LOWER_REVISION, FRAGMENT_SKIPPED_EXPIRED, FRAGMENT_FILTERED_BEFORE_RENDER, TEXT_DISPATCHED_TO_LAZYCOLUMN, TEXT_ENTERED_RESPONSE_COMPOSABLE, TEXT_MARKDOWN_COMPOSING, TEXT_MARKDOWN_ANIMATION_COMPLETE, TEXT_DISPOSED_WHILE_STREAMING};
    }

    static {
        Breadcrumb[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Breadcrumb(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Breadcrumb> getEntries() {
        return $ENTRIES;
    }

    public static Breadcrumb valueOf(String str) {
        return (Breadcrumb) Enum.valueOf(Breadcrumb.class, str);
    }

    public static Breadcrumb[] values() {
        return (Breadcrumb[]) $VALUES.clone();
    }
}
