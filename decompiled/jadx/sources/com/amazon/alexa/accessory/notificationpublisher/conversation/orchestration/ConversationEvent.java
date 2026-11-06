package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent;", "", "Captured", "LinePlayed", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent$Captured;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent$LinePlayed;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConversationEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent$Captured;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent;", "outcome", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;)V", "getOutcome", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Captured implements ConversationEvent {

        @NotNull
        private final CaptureTurnOutcome outcome;

        public Captured(@NotNull CaptureTurnOutcome captureTurnOutcome) {
            captureTurnOutcome.getClass();
            this.outcome = captureTurnOutcome;
        }

        public static /* synthetic */ Captured copy$default(Captured captured, CaptureTurnOutcome captureTurnOutcome, int i, Object obj) {
            if ((i & 1) != 0) {
                captureTurnOutcome = captured.outcome;
            }
            return captured.copy(captureTurnOutcome);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CaptureTurnOutcome getOutcome() {
            return this.outcome;
        }

        @NotNull
        public final Captured copy(@NotNull CaptureTurnOutcome outcome) {
            outcome.getClass();
            return new Captured(outcome);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Captured) && Intrinsics.areEqual(this.outcome, ((Captured) other).outcome);
        }

        @NotNull
        public final CaptureTurnOutcome getOutcome() {
            return this.outcome;
        }

        public int hashCode() {
            return this.outcome.hashCode();
        }

        @NotNull
        public String toString() {
            return "Captured(outcome=" + this.outcome + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent$LinePlayed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/ConversationEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinePlayed implements ConversationEvent {

        @NotNull
        public static final LinePlayed INSTANCE = new LinePlayed();

        private LinePlayed() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LinePlayed);
        }

        public int hashCode() {
            return 1248373013;
        }

        @NotNull
        public String toString() {
            return "LinePlayed";
        }
    }
}
