package com.amazon.alexa.api.compat.model.conversation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot;", "", "transitions", "", "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadTransition;", FragmentMetaData.REVISION, "", "<init>", "(Ljava/util/List;J)V", "getTransitions", "()Ljava/util/List;", "getRevision", "()J", "latestSource", "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;", "getLatestSource$AlexaMobileAndroidVoiceSDKApiCompatModel_release", "()Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;", "sourceAt", "elapsedRealtimeMs", "sourceAt$AlexaMobileAndroidVoiceSDKApiCompatModel_release", "appended", "transition", "appended$AlexaMobileAndroidVoiceSDKApiCompatModel_release", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationLoadSourceSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationLoadSourceSnapshot.kt\ncom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n543#2,6:55\n*S KotlinDebug\n*F\n+ 1 ConversationLoadSourceSnapshot.kt\ncom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot\n*L\n33#1:55,6\n*E\n"})
/* loaded from: classes16.dex */
public final class ConversationLoadSourceSnapshot {
    public static final int MAX_TRANSITIONS = 16;
    private final long revision;

    @NotNull
    private final List<ConversationLoadTransition> transitions;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ConversationLoadSourceSnapshot EMPTY = new ConversationLoadSourceSnapshot(CollectionsKt.emptyList(), 0);

    public ConversationLoadSourceSnapshot(@NotNull List<ConversationLoadTransition> list, long j) {
        list.getClass();
        this.transitions = list;
        this.revision = j;
    }

    @NotNull
    public final ConversationLoadSourceSnapshot appended$AlexaMobileAndroidVoiceSDKApiCompatModel_release(@NotNull ConversationLoadTransition transition) {
        transition.getClass();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.takeLast(CollectionsKt.plus((Collection<? extends ConversationLoadTransition>) this.transitions, transition), 16));
        unmodifiableList.getClass();
        return new ConversationLoadSourceSnapshot(unmodifiableList, this.revision + 1);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ConversationLoadSourceSnapshot)) {
            return false;
        }
        ConversationLoadSourceSnapshot conversationLoadSourceSnapshot = (ConversationLoadSourceSnapshot) other;
        return Intrinsics.areEqual(this.transitions, conversationLoadSourceSnapshot.transitions) && this.revision == conversationLoadSourceSnapshot.revision;
    }

    @Nullable
    public final ConversationLoadSource getLatestSource$AlexaMobileAndroidVoiceSDKApiCompatModel_release() {
        ConversationLoadTransition conversationLoadTransition = (ConversationLoadTransition) CollectionsKt.lastOrNull((List) this.transitions);
        if (conversationLoadTransition != null) {
            return conversationLoadTransition.getSource();
        }
        return null;
    }

    public final long getRevision() {
        return this.revision;
    }

    @NotNull
    public final List<ConversationLoadTransition> getTransitions() {
        return this.transitions;
    }

    public int hashCode() {
        return Objects.hash(this.transitions, Long.valueOf(this.revision));
    }

    @Nullable
    public final ConversationLoadSource sourceAt$AlexaMobileAndroidVoiceSDKApiCompatModel_release(long elapsedRealtimeMs) {
        ConversationLoadTransition conversationLoadTransition;
        List<ConversationLoadTransition> list = this.transitions;
        ListIterator<ConversationLoadTransition> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                conversationLoadTransition = null;
                break;
            }
            conversationLoadTransition = listIterator.previous();
            if (conversationLoadTransition.getElapsedRealtimeMs() <= elapsedRealtimeMs) {
                break;
            }
        }
        ConversationLoadTransition conversationLoadTransition2 = conversationLoadTransition;
        if (conversationLoadTransition2 != null) {
            return conversationLoadTransition2.getSource();
        }
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot$Companion;", "", "<init>", "()V", "MAX_TRANSITIONS", "", SimbaEventProcessor.SOURCE_EMPTY, "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot;", "getEMPTY", "()Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationLoadSourceSnapshot getEMPTY() {
            return ConversationLoadSourceSnapshot.EMPTY;
        }

        private Companion() {
        }
    }
}
