package com.amazon.alexa.ra.core.ui.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.ra.core.data.model.SmartActionsFeedbackType;
import com.amazon.alexa.ra.core.ui.enums.PaginationDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "Lcom/amazon/alexa/ra/core/ui/events/IngressUserInitiatedActionEvent;", "<init>", "()V", "OnFeedbackSubmitted", "OnSmartActionsFeedbackSubmitted", "OnClearErrorBanner", "OnLoadMoreFragments", "OnRetryPaginatedGetFragments", "OnRetryIngressGetFragments", "OnScrollToBottomClicked", "OnManualScrollDetected", "OnMarginScrollDetected", "UserInitiatedIngressEvent", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnClearErrorBanner;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnFeedbackSubmitted;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnLoadMoreFragments;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnManualScrollDetected;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnMarginScrollDetected;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnRetryIngressGetFragments;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnRetryPaginatedGetFragments;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnScrollToBottomClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnSmartActionsFeedbackSubmitted;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UserInitiatedActionEvent extends IngressUserInitiatedActionEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnClearErrorBanner;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "screen", "", "<init>", "(Ljava/lang/String;)V", "getScreen", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClearErrorBanner extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final String screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnClearErrorBanner(@NotNull String str) {
            super(null);
            str.getClass();
            this.screen = str;
        }

        @NotNull
        public final String getScreen() {
            return this.screen;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnFeedbackSubmitted;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "selectedFragmentId", "", "selectedOption", "", Constants.SubmitFeedback.REQUEST_FEEDBACK_TYPE, "", "feedbackText", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "getSelectedFragmentId", "()Ljava/lang/String;", "getSelectedOption", "()I", "getFeedbackType", "()Z", "getFeedbackText", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFeedbackSubmitted extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final String feedbackText;
        private final boolean feedbackType;

        @NotNull
        private final String selectedFragmentId;
        private final int selectedOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFeedbackSubmitted(@NotNull String str, int i, boolean z, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.selectedFragmentId = str;
            this.selectedOption = i;
            this.feedbackType = z;
            this.feedbackText = str2;
        }

        @NotNull
        public final String getFeedbackText() {
            return this.feedbackText;
        }

        public final boolean getFeedbackType() {
            return this.feedbackType;
        }

        @NotNull
        public final String getSelectedFragmentId() {
            return this.selectedFragmentId;
        }

        public final int getSelectedOption() {
            return this.selectedOption;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnLoadMoreFragments;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "direction", "Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;", "<init>", "(Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;)V", "getDirection", "()Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLoadMoreFragments extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final PaginationDirection direction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadMoreFragments(@NotNull PaginationDirection paginationDirection) {
            super(null);
            paginationDirection.getClass();
            this.direction = paginationDirection;
        }

        @NotNull
        public final PaginationDirection getDirection() {
            return this.direction;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnManualScrollDetected;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnManualScrollDetected extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnManualScrollDetected INSTANCE = new OnManualScrollDetected();

        private OnManualScrollDetected() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnMarginScrollDetected;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMarginScrollDetected extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnMarginScrollDetected INSTANCE = new OnMarginScrollDetected();

        private OnMarginScrollDetected() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnRetryIngressGetFragments;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryIngressGetFragments extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnRetryIngressGetFragments INSTANCE = new OnRetryIngressGetFragments();

        private OnRetryIngressGetFragments() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnRetryPaginatedGetFragments;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "direction", "Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;", "<init>", "(Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;)V", "getDirection", "()Lcom/amazon/alexa/ra/core/ui/enums/PaginationDirection;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryPaginatedGetFragments extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final PaginationDirection direction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRetryPaginatedGetFragments(@NotNull PaginationDirection paginationDirection) {
            super(null);
            paginationDirection.getClass();
            this.direction = paginationDirection;
        }

        @NotNull
        public final PaginationDirection getDirection() {
            return this.direction;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnSmartActionsFeedbackSubmitted;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "fragmentId", "", Constants.SubmitFeedback.REQUEST_FEEDBACK_TYPE, "Lcom/amazon/alexa/ra/core/data/model/SmartActionsFeedbackType;", "selectedOptionIndex", "", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/SmartActionsFeedbackType;I)V", "getFragmentId", "()Ljava/lang/String;", "getFeedbackType", "()Lcom/amazon/alexa/ra/core/data/model/SmartActionsFeedbackType;", "getSelectedOptionIndex", "()I", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSmartActionsFeedbackSubmitted extends UserInitiatedActionEvent {
        public static final int $stable = 0;

        @NotNull
        private final SmartActionsFeedbackType feedbackType;

        @NotNull
        private final String fragmentId;
        private final int selectedOptionIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSmartActionsFeedbackSubmitted(@NotNull String str, @NotNull SmartActionsFeedbackType smartActionsFeedbackType, int i) {
            super(null);
            str.getClass();
            smartActionsFeedbackType.getClass();
            this.fragmentId = str;
            this.feedbackType = smartActionsFeedbackType;
            this.selectedOptionIndex = i;
        }

        @NotNull
        public final SmartActionsFeedbackType getFeedbackType() {
            return this.feedbackType;
        }

        @NotNull
        public final String getFragmentId() {
            return this.fragmentId;
        }

        public final int getSelectedOptionIndex() {
            return this.selectedOptionIndex;
        }
    }

    public /* synthetic */ UserInitiatedActionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserInitiatedActionEvent() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "ingressTimestamp", "", "referrer", "", "<init>", "(JLjava/lang/String;)V", "getIngressTimestamp", "()J", "getReferrer", "()Ljava/lang/String;", "OnConversationScreenIngress", "OnConversationHistoryScreenIngress", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent$OnConversationHistoryScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent$OnConversationScreenIngress;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UserInitiatedIngressEvent extends UserInitiatedActionEvent {
        public static final int $stable = 0;
        private final long ingressTimestamp;

        @NotNull
        private final String referrer;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent$OnConversationHistoryScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent;", "ingressTimestamp", "", "referrer", "", "<init>", "(JLjava/lang/String;)V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnConversationHistoryScreenIngress extends UserInitiatedIngressEvent {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnConversationHistoryScreenIngress(long j, @NotNull String str) {
                super(j, str, null);
                str.getClass();
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent$OnConversationScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$UserInitiatedIngressEvent;", "ingressTimestamp", "", "referrer", "", "conversationId", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OnConversationScreenIngress extends UserInitiatedIngressEvent {
            public static final int $stable = 0;

            @NotNull
            private final String conversationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnConversationScreenIngress(long j, @NotNull String str, @NotNull String str2) {
                super(j, str, null);
                str.getClass();
                str2.getClass();
                this.conversationId = str2;
            }

            @NotNull
            public final String getConversationId() {
                return this.conversationId;
            }
        }

        private UserInitiatedIngressEvent(long j, String str) {
            super(null);
            this.ingressTimestamp = j;
            this.referrer = str;
        }

        public final long getIngressTimestamp() {
            return this.ingressTimestamp;
        }

        @NotNull
        public final String getReferrer() {
            return this.referrer;
        }

        public /* synthetic */ UserInitiatedIngressEvent(long j, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R/\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent$OnScrollToBottomClicked;", "Lcom/amazon/alexa/ra/core/ui/events/UserInitiatedActionEvent;", "currentItemCount", "", "isAlreadyAtBottom", "", "scrollToIndex", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "getCurrentItemCount", "Lkotlin/Function0;", "simpleScroll", "<init>", "(IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "()I", "()Z", "getScrollToIndex", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getGetCurrentItemCount", "()Lkotlin/jvm/functions/Function0;", "getSimpleScroll", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnScrollToBottomClicked extends UserInitiatedActionEvent {
        public static final int $stable = 8;
        private final int currentItemCount;

        @NotNull
        private final Function0<Integer> getCurrentItemCount;
        private final boolean isAlreadyAtBottom;

        @NotNull
        private final Function2<Integer, Continuation<? super Unit>, Object> scrollToIndex;

        @Nullable
        private final Function0<Unit> simpleScroll;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnScrollToBottomClicked(int i, boolean z, @NotNull Function2<? super Integer, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function0<Integer> function0, @Nullable Function0<Unit> function02) {
            super(null);
            function2.getClass();
            function0.getClass();
            this.currentItemCount = i;
            this.isAlreadyAtBottom = z;
            this.scrollToIndex = function2;
            this.getCurrentItemCount = function0;
            this.simpleScroll = function02;
        }

        public final int getCurrentItemCount() {
            return this.currentItemCount;
        }

        @NotNull
        public final Function0<Integer> getGetCurrentItemCount() {
            return this.getCurrentItemCount;
        }

        @NotNull
        public final Function2<Integer, Continuation<? super Unit>, Object> getScrollToIndex() {
            return this.scrollToIndex;
        }

        @Nullable
        public final Function0<Unit> getSimpleScroll() {
            return this.simpleScroll;
        }

        /* renamed from: isAlreadyAtBottom, reason: from getter */
        public final boolean getIsAlreadyAtBottom() {
            return this.isAlreadyAtBottom;
        }

        public /* synthetic */ OnScrollToBottomClicked(int i, boolean z, Function2 function2, Function0 function0, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z, function2, function0, (i2 & 16) != 0 ? null : function02);
        }
    }
}
