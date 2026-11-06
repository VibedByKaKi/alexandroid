package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import com.amazon.alexa.accessory.notificationpublisher.conversation.capability.model.ExtractedIntent;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "", "logLabel", "", "getLogLabel", "()Ljava/lang/String;", "Provided", "Affirmed", "Declined", "Undetermined", UploadWorker.FAILED_PREFIX, "Cancelled", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Affirmed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Cancelled;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Declined;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Failed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Provided;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Undetermined;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CaptureTurnOutcome {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Affirmed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Affirmed implements CaptureTurnOutcome {

        @NotNull
        public static final Affirmed INSTANCE = new Affirmed();

        private Affirmed() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Affirmed);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return 1348774964;
        }

        @NotNull
        public String toString() {
            return "Affirmed";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Cancelled;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cancelled implements CaptureTurnOutcome {

        @NotNull
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cancelled);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return 2039550751;
        }

        @NotNull
        public String toString() {
            return "Cancelled";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Declined;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Declined implements CaptureTurnOutcome {

        @NotNull
        public static final Declined INSTANCE = new Declined();

        private Declined() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Declined);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return 1311350944;
        }

        @NotNull
        public String toString() {
            return "Declined";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getLogLabel(@NotNull CaptureTurnOutcome captureTurnOutcome) {
            if (captureTurnOutcome instanceof Provided) {
                return "provided";
            }
            if (Intrinsics.areEqual(captureTurnOutcome, Affirmed.INSTANCE)) {
                return "affirmed";
            }
            if (Intrinsics.areEqual(captureTurnOutcome, Declined.INSTANCE)) {
                return "declined";
            }
            if (captureTurnOutcome instanceof Undetermined) {
                return a$$ExternalSyntheticOutline0.m("undetermined(", ((Undetermined) captureTurnOutcome).getReason().getLogLabel(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (captureTurnOutcome instanceof Failed) {
                return a$$ExternalSyntheticOutline0.m("failed(", ((Failed) captureTurnOutcome).getCause().getLabel(), MarkdownConstants.RIGHT_PARENTHESIS);
            }
            if (Intrinsics.areEqual(captureTurnOutcome, Cancelled.INSTANCE)) {
                return AuthorizationDelegateAdapter.FAILURE_CANCELLED;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Failed;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "cause", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/TurnFailureCause;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/TurnFailureCause;)V", "getCause", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/TurnFailureCause;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed implements CaptureTurnOutcome {

        @NotNull
        private final TurnFailureCause cause;

        public Failed(@NotNull TurnFailureCause turnFailureCause) {
            turnFailureCause.getClass();
            this.cause = turnFailureCause;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, TurnFailureCause turnFailureCause, int i, Object obj) {
            if ((i & 1) != 0) {
                turnFailureCause = failed.cause;
            }
            return failed.copy(turnFailureCause);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TurnFailureCause getCause() {
            return this.cause;
        }

        @NotNull
        public final Failed copy(@NotNull TurnFailureCause cause) {
            cause.getClass();
            return new Failed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && this.cause == ((Failed) other).cause;
        }

        @NotNull
        public final TurnFailureCause getCause() {
            return this.cause;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(cause=" + this.cause + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Provided;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "intent", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;)V", "getIntent", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/capability/model/ExtractedIntent;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Provided implements CaptureTurnOutcome {

        @NotNull
        private final ExtractedIntent intent;

        public Provided(@NotNull ExtractedIntent extractedIntent) {
            extractedIntent.getClass();
            this.intent = extractedIntent;
        }

        public static /* synthetic */ Provided copy$default(Provided provided, ExtractedIntent extractedIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                extractedIntent = provided.intent;
            }
            return provided.copy(extractedIntent);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ExtractedIntent getIntent() {
            return this.intent;
        }

        @NotNull
        public final Provided copy(@NotNull ExtractedIntent intent) {
            intent.getClass();
            return new Provided(intent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Provided) && Intrinsics.areEqual(this.intent, ((Provided) other).intent);
        }

        @NotNull
        public final ExtractedIntent getIntent() {
            return this.intent;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        @NotNull
        public String toString() {
            return "Provided(intent=" + this.intent + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome$Undetermined;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/CaptureTurnOutcome;", "reason", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "<init>", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;)V", "getReason", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/audio/capturing/UnclearReason;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Undetermined implements CaptureTurnOutcome {

        @NotNull
        private final UnclearReason reason;

        public Undetermined(@NotNull UnclearReason unclearReason) {
            unclearReason.getClass();
            this.reason = unclearReason;
        }

        public static /* synthetic */ Undetermined copy$default(Undetermined undetermined, UnclearReason unclearReason, int i, Object obj) {
            if ((i & 1) != 0) {
                unclearReason = undetermined.reason;
            }
            return undetermined.copy(unclearReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final UnclearReason getReason() {
            return this.reason;
        }

        @NotNull
        public final Undetermined copy(@NotNull UnclearReason reason) {
            reason.getClass();
            return new Undetermined(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Undetermined) && Intrinsics.areEqual(this.reason, ((Undetermined) other).reason);
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.CaptureTurnOutcome
        @NotNull
        public String getLogLabel() {
            return DefaultImpls.getLogLabel(this);
        }

        @NotNull
        public final UnclearReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Undetermined(reason=" + this.reason + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @NotNull
    String getLogLabel();
}
