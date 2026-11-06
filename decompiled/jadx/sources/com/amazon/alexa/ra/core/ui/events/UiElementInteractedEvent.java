package com.amazon.alexa.ra.core.ui.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.ra.core.data.fragments.Artifact;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001c !\"#$%&'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "", "<init>", "()V", "OnStopButtonPressed", "OnCopyButtonClicked", "OnTextSelectionMenuShown", "OnCopyMenuClicked", "OnShareButtonClicked", "OnDownloadButtonClicked", "OnResponseLongPress", "OnUrlClicked", "OnLearnMoreClicked", "OnLearnMoreClickedDeleteConversation", "OnFeedbackOptionClicked", "OnStorageAlertDialogDismissed", "OnStorageManageButtonClicked", "OnActionBarShown", "OnAttachButtonClicked", "OnCameraButtonClicked", "OnScreenShareButtonClicked", "OnFlipCameraButtonClicked", "OnTranscriptToggleClicked", "OnMuteButtonClicked", "OnCancelButtonPressed", "OnLiveModeFtueActiveChanged", "OnLiveModeFtueAudioPlay", "OnLiveModeFtueAudioStop", "OnMaliciousUrlAlertDismissed", "OnPromptCardEnableNowClicked", "OnPromptCardMaybeLaterClicked", "OnAlexaPlusUpsellBannerDismissed", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnActionBarShown;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnAlexaPlusUpsellBannerDismissed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnAttachButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCameraButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCancelButtonPressed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCopyButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCopyMenuClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnDownloadButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnFeedbackOptionClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnFlipCameraButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLearnMoreClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLearnMoreClickedDeleteConversation;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLiveModeFtueActiveChanged;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLiveModeFtueAudioPlay;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLiveModeFtueAudioStop;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnMaliciousUrlAlertDismissed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnMuteButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnPromptCardEnableNowClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnPromptCardMaybeLaterClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnResponseLongPress;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnScreenShareButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnShareButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnStopButtonPressed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnStorageAlertDialogDismissed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnStorageManageButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnTextSelectionMenuShown;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnTranscriptToggleClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnUrlClicked;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UiElementInteractedEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnActionBarShown;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "isUserFragment", "", "<init>", "(Z)V", "()Z", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnActionBarShown extends UiElementInteractedEvent {
        public static final int $stable = 0;
        private final boolean isUserFragment;

        public OnActionBarShown(boolean z) {
            super(null);
            this.isUserFragment = z;
        }

        /* renamed from: isUserFragment, reason: from getter */
        public final boolean getIsUserFragment() {
            return this.isUserFragment;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnAlexaPlusUpsellBannerDismissed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAlexaPlusUpsellBannerDismissed extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnAlexaPlusUpsellBannerDismissed INSTANCE = new OnAlexaPlusUpsellBannerDismissed();

        private OnAlexaPlusUpsellBannerDismissed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnAttachButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAttachButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        public OnAttachButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCameraButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCameraButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnCameraButtonClicked INSTANCE = new OnCameraButtonClicked();

        private OnCameraButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCancelButtonPressed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCancelButtonPressed extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnCancelButtonPressed INSTANCE = new OnCancelButtonPressed();

        private OnCancelButtonPressed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCopyMenuClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCopyMenuClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnCopyMenuClicked INSTANCE = new OnCopyMenuClicked();

        private OnCopyMenuClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnDownloadButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "artifact", "Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/Artifact;)V", "getArtifact", "()Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDownloadButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 8;

        @Nullable
        private final Artifact artifact;

        public OnDownloadButtonClicked(@Nullable Artifact artifact) {
            super(null);
            this.artifact = artifact;
        }

        @Nullable
        public final Artifact getArtifact() {
            return this.artifact;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnFeedbackOptionClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", Constants.SubmitFeedback.REQUEST_FEEDBACK_TYPE, "", "<init>", "(Z)V", "getFeedbackType", "()Z", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFeedbackOptionClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;
        private final boolean feedbackType;

        public OnFeedbackOptionClicked(boolean z) {
            super(null);
            this.feedbackType = z;
        }

        public final boolean getFeedbackType() {
            return this.feedbackType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnFlipCameraButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFlipCameraButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnFlipCameraButtonClicked INSTANCE = new OnFlipCameraButtonClicked();

        private OnFlipCameraButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLearnMoreClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLearnMoreClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnLearnMoreClicked INSTANCE = new OnLearnMoreClicked();

        private OnLearnMoreClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLearnMoreClickedDeleteConversation;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLearnMoreClickedDeleteConversation extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnLearnMoreClickedDeleteConversation INSTANCE = new OnLearnMoreClickedDeleteConversation();

        private OnLearnMoreClickedDeleteConversation() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLiveModeFtueActiveChanged;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", VoiceChatContract.COLUMN_IS_ACTIVE, "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLiveModeFtueActiveChanged extends UiElementInteractedEvent {
        public static final int $stable = 0;
        private final boolean isActive;

        public OnLiveModeFtueActiveChanged(boolean z) {
            super(null);
            this.isActive = z;
        }

        public static /* synthetic */ OnLiveModeFtueActiveChanged copy$default(OnLiveModeFtueActiveChanged onLiveModeFtueActiveChanged, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onLiveModeFtueActiveChanged.isActive;
            }
            return onLiveModeFtueActiveChanged.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final OnLiveModeFtueActiveChanged copy(boolean isActive) {
            return new OnLiveModeFtueActiveChanged(isActive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnLiveModeFtueActiveChanged) && this.isActive == ((OnLiveModeFtueActiveChanged) other).isActive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            return Automotive$$ExternalSyntheticOutline0.m("OnLiveModeFtueActiveChanged(isActive=", MarkdownConstants.RIGHT_PARENTHESIS, this.isActive);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLiveModeFtueAudioPlay;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLiveModeFtueAudioPlay extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnLiveModeFtueAudioPlay INSTANCE = new OnLiveModeFtueAudioPlay();

        private OnLiveModeFtueAudioPlay() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnLiveModeFtueAudioStop;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLiveModeFtueAudioStop extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnLiveModeFtueAudioStop INSTANCE = new OnLiveModeFtueAudioStop();

        private OnLiveModeFtueAudioStop() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnMaliciousUrlAlertDismissed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMaliciousUrlAlertDismissed extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnMaliciousUrlAlertDismissed INSTANCE = new OnMaliciousUrlAlertDismissed();

        private OnMaliciousUrlAlertDismissed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnMuteButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMuteButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnMuteButtonClicked INSTANCE = new OnMuteButtonClicked();

        private OnMuteButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnPromptCardEnableNowClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnPromptCardEnableNowClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnPromptCardEnableNowClicked INSTANCE = new OnPromptCardEnableNowClicked();

        private OnPromptCardEnableNowClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnPromptCardMaybeLaterClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnPromptCardMaybeLaterClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnPromptCardMaybeLaterClicked INSTANCE = new OnPromptCardMaybeLaterClicked();

        private OnPromptCardMaybeLaterClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnResponseLongPress;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnResponseLongPress extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnResponseLongPress INSTANCE = new OnResponseLongPress();

        private OnResponseLongPress() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnScreenShareButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnScreenShareButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnScreenShareButtonClicked INSTANCE = new OnScreenShareButtonClicked();

        private OnScreenShareButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnStopButtonPressed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStopButtonPressed extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnStopButtonPressed INSTANCE = new OnStopButtonPressed();

        private OnStopButtonPressed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnStorageAlertDialogDismissed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStorageAlertDialogDismissed extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnStorageAlertDialogDismissed INSTANCE = new OnStorageAlertDialogDismissed();

        private OnStorageAlertDialogDismissed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnStorageManageButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStorageManageButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnStorageManageButtonClicked INSTANCE = new OnStorageManageButtonClicked();

        private OnStorageManageButtonClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnTextSelectionMenuShown;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTextSelectionMenuShown extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnTextSelectionMenuShown INSTANCE = new OnTextSelectionMenuShown();

        private OnTextSelectionMenuShown() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnTranscriptToggleClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTranscriptToggleClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnTranscriptToggleClicked INSTANCE = new OnTranscriptToggleClicked();

        private OnTranscriptToggleClicked() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnUrlClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUrlClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUrlClicked(@NotNull String str) {
            super(null);
            str.getClass();
            this.url = str;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ UiElementInteractedEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiElementInteractedEvent() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnCopyButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "copyText", "", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCopyText", "()Ljava/lang/String;", "getFragmentUri", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCopyButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 0;

        @Nullable
        private final String copyText;

        @Nullable
        private final String fragmentUri;

        public OnCopyButtonClicked(@Nullable String str, @Nullable String str2) {
            super(null);
            this.copyText = str;
            this.fragmentUri = str2;
        }

        @Nullable
        public final String getCopyText() {
            return this.copyText;
        }

        @Nullable
        public final String getFragmentUri() {
            return this.fragmentUri;
        }

        public /* synthetic */ OnCopyButtonClicked(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent$OnShareButtonClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "artifact", "Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/Artifact;Ljava/lang/String;)V", "getArtifact", "()Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", "getFragmentUri", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnShareButtonClicked extends UiElementInteractedEvent {
        public static final int $stable = 8;

        @Nullable
        private final Artifact artifact;

        @Nullable
        private final String fragmentUri;

        public OnShareButtonClicked(@Nullable Artifact artifact, @Nullable String str) {
            super(null);
            this.artifact = artifact;
            this.fragmentUri = str;
        }

        @Nullable
        public final Artifact getArtifact() {
            return this.artifact;
        }

        @Nullable
        public final String getFragmentUri() {
            return this.fragmentUri;
        }

        public /* synthetic */ OnShareButtonClicked(Artifact artifact, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(artifact, (i & 2) != 0 ? null : str);
        }
    }
}
