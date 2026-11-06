package com.amazon.alexa.api.compat.model.conversation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadTransition;", "", "source", "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;", "elapsedRealtimeMs", "", "<init>", "(Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;J)V", "getSource", "()Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;", "getElapsedRealtimeMs", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConversationLoadTransition {
    public static final int $stable = 0;
    private final long elapsedRealtimeMs;

    @Nullable
    private final ConversationLoadSource source;

    public ConversationLoadTransition(@Nullable ConversationLoadSource conversationLoadSource, long j) {
        this.source = conversationLoadSource;
        this.elapsedRealtimeMs = j;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ConversationLoadTransition)) {
            return false;
        }
        ConversationLoadTransition conversationLoadTransition = (ConversationLoadTransition) other;
        return this.source == conversationLoadTransition.source && this.elapsedRealtimeMs == conversationLoadTransition.elapsedRealtimeMs;
    }

    public final long getElapsedRealtimeMs() {
        return this.elapsedRealtimeMs;
    }

    @Nullable
    public final ConversationLoadSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return Objects.hash(this.source, Long.valueOf(this.elapsedRealtimeMs));
    }
}
