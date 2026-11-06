package com.amazon.alexa.assistant.session.interactionmodel.model;

import com.amazon.alexa.assistant.capability.interactionmodel.InteractionModelCapabilityAgent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState;", "", "<init>", "()V", "dialogRequestId", "", "getDialogRequestId", "()Ljava/lang/String;", InteractionModelCapabilityAgent.REQUEST_PROCESSING_STARTED, InteractionModelCapabilityAgent.REQUEST_PROCESSING_COMPLETED, "RequestProcessingCancelled", "RequestProcessingStartedNoDialog", "RequestProcessingCompletedNoDialog", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingCancelled;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingCompleted;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingCompletedNoDialog;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingStarted;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingStartedNoDialog;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class InteractionModelRequestProcessingState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingCancelled;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestProcessingCancelled extends InteractionModelRequestProcessingState {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestProcessingCancelled(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ RequestProcessingCancelled copy$default(RequestProcessingCancelled requestProcessingCancelled, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestProcessingCancelled.dialogRequestId;
            }
            return requestProcessingCancelled.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final RequestProcessingCancelled copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new RequestProcessingCancelled(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestProcessingCancelled) && Intrinsics.areEqual(this.dialogRequestId, ((RequestProcessingCancelled) other).dialogRequestId);
        }

        @Override // com.amazon.alexa.assistant.session.interactionmodel.model.InteractionModelRequestProcessingState
        @NotNull
        public String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RequestProcessingCancelled(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingCompleted;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestProcessingCompleted extends InteractionModelRequestProcessingState {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestProcessingCompleted(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ RequestProcessingCompleted copy$default(RequestProcessingCompleted requestProcessingCompleted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestProcessingCompleted.dialogRequestId;
            }
            return requestProcessingCompleted.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final RequestProcessingCompleted copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new RequestProcessingCompleted(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestProcessingCompleted) && Intrinsics.areEqual(this.dialogRequestId, ((RequestProcessingCompleted) other).dialogRequestId);
        }

        @Override // com.amazon.alexa.assistant.session.interactionmodel.model.InteractionModelRequestProcessingState
        @NotNull
        public String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RequestProcessingCompleted(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingCompletedNoDialog;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState;", "messageId", "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "dialogRequestId", "getDialogRequestId", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestProcessingCompletedNoDialog extends InteractionModelRequestProcessingState {

        @NotNull
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestProcessingCompletedNoDialog(@NotNull String str) {
            super(null);
            str.getClass();
            this.messageId = str;
        }

        public static /* synthetic */ RequestProcessingCompletedNoDialog copy$default(RequestProcessingCompletedNoDialog requestProcessingCompletedNoDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestProcessingCompletedNoDialog.messageId;
            }
            return requestProcessingCompletedNoDialog.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @NotNull
        public final RequestProcessingCompletedNoDialog copy(@NotNull String messageId) {
            messageId.getClass();
            return new RequestProcessingCompletedNoDialog(messageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestProcessingCompletedNoDialog) && Intrinsics.areEqual(this.messageId, ((RequestProcessingCompletedNoDialog) other).messageId);
        }

        @Override // com.amazon.alexa.assistant.session.interactionmodel.model.InteractionModelRequestProcessingState
        @NotNull
        public String getDialogRequestId() {
            return this.messageId;
        }

        @NotNull
        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RequestProcessingCompletedNoDialog(messageId=", this.messageId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingStarted;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestProcessingStarted extends InteractionModelRequestProcessingState {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestProcessingStarted(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ RequestProcessingStarted copy$default(RequestProcessingStarted requestProcessingStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestProcessingStarted.dialogRequestId;
            }
            return requestProcessingStarted.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final RequestProcessingStarted copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new RequestProcessingStarted(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestProcessingStarted) && Intrinsics.areEqual(this.dialogRequestId, ((RequestProcessingStarted) other).dialogRequestId);
        }

        @Override // com.amazon.alexa.assistant.session.interactionmodel.model.InteractionModelRequestProcessingState
        @NotNull
        public String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RequestProcessingStarted(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState$RequestProcessingStartedNoDialog;", "Lcom/amazon/alexa/assistant/session/interactionmodel/model/InteractionModelRequestProcessingState;", "messageId", "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "dialogRequestId", "getDialogRequestId", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestProcessingStartedNoDialog extends InteractionModelRequestProcessingState {

        @NotNull
        private final String messageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestProcessingStartedNoDialog(@NotNull String str) {
            super(null);
            str.getClass();
            this.messageId = str;
        }

        public static /* synthetic */ RequestProcessingStartedNoDialog copy$default(RequestProcessingStartedNoDialog requestProcessingStartedNoDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestProcessingStartedNoDialog.messageId;
            }
            return requestProcessingStartedNoDialog.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @NotNull
        public final RequestProcessingStartedNoDialog copy(@NotNull String messageId) {
            messageId.getClass();
            return new RequestProcessingStartedNoDialog(messageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestProcessingStartedNoDialog) && Intrinsics.areEqual(this.messageId, ((RequestProcessingStartedNoDialog) other).messageId);
        }

        @Override // com.amazon.alexa.assistant.session.interactionmodel.model.InteractionModelRequestProcessingState
        @NotNull
        public String getDialogRequestId() {
            return this.messageId;
        }

        @NotNull
        public final String getMessageId() {
            return this.messageId;
        }

        public int hashCode() {
            return this.messageId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RequestProcessingStartedNoDialog(messageId=", this.messageId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ InteractionModelRequestProcessingState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getDialogRequestId();

    private InteractionModelRequestProcessingState() {
    }
}
