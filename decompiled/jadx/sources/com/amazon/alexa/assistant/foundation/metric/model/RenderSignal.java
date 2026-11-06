package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignal;", "", "<init>", "(Ljava/lang/String;I)V", "USER_REQUEST_RENDERED", "USER_NAVIGATED_AWAY", "REMOTE_VISUAL_RESPONSE_RENDERED", "REMOTE_VISUAL_RESPONSE_RENDER_STARTED", "REMOTE_VISUAL_PREAMBLE_RENDER_STARTED", "REMOTE_VISUAL_PREAMBLE_RENDERED", "LOCAL_VISUAL_ERROR_RENDERED", "LOCAL_VISUAL_RESPONSE_RENDERED", "SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED", "SUGGESTION_CONTAINER_FRAGMENT_RECEIVED", "REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION", "REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION", "REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION", "REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION", "REMOTE_VISUAL_AGENT_FRAGMENT_PARSED", "REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED", "REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING", "REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE", "ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RenderSignal {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RenderSignal[] $VALUES;
    public static final RenderSignal USER_REQUEST_RENDERED = new RenderSignal("USER_REQUEST_RENDERED", 0);
    public static final RenderSignal USER_NAVIGATED_AWAY = new RenderSignal("USER_NAVIGATED_AWAY", 1);
    public static final RenderSignal REMOTE_VISUAL_RESPONSE_RENDERED = new RenderSignal("REMOTE_VISUAL_RESPONSE_RENDERED", 2);
    public static final RenderSignal REMOTE_VISUAL_RESPONSE_RENDER_STARTED = new RenderSignal("REMOTE_VISUAL_RESPONSE_RENDER_STARTED", 3);
    public static final RenderSignal REMOTE_VISUAL_PREAMBLE_RENDER_STARTED = new RenderSignal("REMOTE_VISUAL_PREAMBLE_RENDER_STARTED", 4);
    public static final RenderSignal REMOTE_VISUAL_PREAMBLE_RENDERED = new RenderSignal("REMOTE_VISUAL_PREAMBLE_RENDERED", 5);
    public static final RenderSignal LOCAL_VISUAL_ERROR_RENDERED = new RenderSignal("LOCAL_VISUAL_ERROR_RENDERED", 6);
    public static final RenderSignal LOCAL_VISUAL_RESPONSE_RENDERED = new RenderSignal("LOCAL_VISUAL_RESPONSE_RENDERED", 7);
    public static final RenderSignal SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED = new RenderSignal("SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED", 8);
    public static final RenderSignal SUGGESTION_CONTAINER_FRAGMENT_RECEIVED = new RenderSignal("SUGGESTION_CONTAINER_FRAGMENT_RECEIVED", 9);
    public static final RenderSignal REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION = new RenderSignal("REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION", 10);
    public static final RenderSignal REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION = new RenderSignal("REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION", 11);
    public static final RenderSignal REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION = new RenderSignal("REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION", 12);
    public static final RenderSignal REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION = new RenderSignal("REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION", 13);
    public static final RenderSignal REMOTE_VISUAL_AGENT_FRAGMENT_PARSED = new RenderSignal("REMOTE_VISUAL_AGENT_FRAGMENT_PARSED", 14);
    public static final RenderSignal REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED = new RenderSignal("REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED", 15);
    public static final RenderSignal REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING = new RenderSignal("REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING", 16);
    public static final RenderSignal REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE = new RenderSignal("REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE", 17);
    public static final RenderSignal ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE = new RenderSignal("ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE", 18);

    private static final /* synthetic */ RenderSignal[] $values() {
        return new RenderSignal[]{USER_REQUEST_RENDERED, USER_NAVIGATED_AWAY, REMOTE_VISUAL_RESPONSE_RENDERED, REMOTE_VISUAL_RESPONSE_RENDER_STARTED, REMOTE_VISUAL_PREAMBLE_RENDER_STARTED, REMOTE_VISUAL_PREAMBLE_RENDERED, LOCAL_VISUAL_ERROR_RENDERED, LOCAL_VISUAL_RESPONSE_RENDERED, SUGGESTION_CONTAINER_CONTENT_FRAGMENT_RECEIVED, SUGGESTION_CONTAINER_FRAGMENT_RECEIVED, REMOTE_VISUAL_RESPONSE_RENDERED_MISSING_RELATION, REMOTE_VISUAL_RESPONSE_RENDER_STARTED_MISSING_RELATION, REMOTE_VISUAL_PREAMBLE_RENDER_STARTED_MISSING_RELATION, REMOTE_VISUAL_PREAMBLE_RENDERED_MISSING_RELATION, REMOTE_VISUAL_AGENT_FRAGMENT_PARSED, REMOTE_VISUAL_PREAMBLE_FRAGMENT_PARSED, REMOTE_VISUAL_RESPONSE_DISPOSED_WHILE_STREAMING, REMOTE_VISUAL_RESPONSE_RECOMPOSED_AFTER_DISPOSE, ADDFRAGMENTS_AGENT_TEXT_MARKDOWN_ANIMATION_COMPLETE};
    }

    static {
        RenderSignal[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RenderSignal(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RenderSignal> getEntries() {
        return $ENTRIES;
    }

    public static RenderSignal valueOf(String str) {
        return (RenderSignal) Enum.valueOf(RenderSignal.class, str);
    }

    public static RenderSignal[] values() {
        return (RenderSignal[]) $VALUES.clone();
    }
}
