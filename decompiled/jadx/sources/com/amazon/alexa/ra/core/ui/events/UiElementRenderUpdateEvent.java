package com.amazon.alexa.ra.core.ui.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.chrome.ui.events.ChromeRenderUpdateEvent;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.data.model.DisplaySize;
import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import com.amazon.alexa.ra.core.data.model.VisibleScrollableInfo;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "Lcom/amazon/alexa/ra/chrome/ui/events/ChromeRenderUpdateEvent;", "<init>", "()V", "OnFollowUpPillsRendered", "OnStarterPillRendered", "OnSuggestionPillsRendered", "OnUpdateVisibleItemsInfo", "OnUpdateConversationScreenSize", "OnConversationUiInitialRender", "OnKeyboardShown", "OnAttachmentRenderingComplete", "OnFirstVisualResponseRendered", "OnClientPreambleRendered", "OnTextFieldFocusFailed", "OnMostVisibleRootFragmentChanged", "OnConversationsRenderedForHistoryScreenIngress", "OnFragmentsRenderedForConversationScreenIngress", "OnRequestFragmentRendered", "OnResponseFragmentRevisionRendered", "OnResponseFragmentRevisionRenderedMissingRelation", "OnResponseFragmentRevisionRenderedPostIdle", "OnLastFragmentRendered", "OnAgentTextFragmentDispatched", "OnAgentTextMarkdownComposing", "OnAgentTextAnimationComplete", "OnAgentTextDisposedWhileStreaming", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextAnimationComplete;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextDisposedWhileStreaming;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextFragmentDispatched;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextMarkdownComposing;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAttachmentRenderingComplete;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnClientPreambleRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnConversationUiInitialRender;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnConversationsRenderedForHistoryScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnFirstVisualResponseRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnFollowUpPillsRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnFragmentsRenderedForConversationScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnKeyboardShown;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnLastFragmentRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnMostVisibleRootFragmentChanged;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnRequestFragmentRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnResponseFragmentRevisionRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnResponseFragmentRevisionRenderedMissingRelation;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnResponseFragmentRevisionRenderedPostIdle;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnStarterPillRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnSuggestionPillsRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnTextFieldFocusFailed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnUpdateConversationScreenSize;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnUpdateVisibleItemsInfo;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class UiElementRenderUpdateEvent extends ChromeRenderUpdateEvent {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextDisposedWhileStreaming;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", "dialogRequestId", FragmentMetaData.PENDING_UPDATE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getFragmentUri", "()Ljava/lang/String;", "getDialogRequestId", "getPendingUpdate", "()Z", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAgentTextDisposedWhileStreaming extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @Nullable
        private final String dialogRequestId;

        @NotNull
        private final String fragmentUri;
        private final boolean pendingUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAgentTextDisposedWhileStreaming(@NotNull String str, @Nullable String str2, boolean z) {
            super(null);
            str.getClass();
            this.fragmentUri = str;
            this.dialogRequestId = str2;
            this.pendingUpdate = z;
        }

        @Nullable
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final String getFragmentUri() {
            return this.fragmentUri;
        }

        public final boolean getPendingUpdate() {
            return this.pendingUpdate;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAttachmentRenderingComplete;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "uploadedMediaInfo", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "renderingCompleteTimestamp", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;J)V", "getUploadedMediaInfo", "()Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "getRenderingCompleteTimestamp", "()J", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAttachmentRenderingComplete extends UiElementRenderUpdateEvent {
        public static final int $stable = LocalMediaInfo.$stable;
        private final long renderingCompleteTimestamp;

        @NotNull
        private final LocalMediaInfo uploadedMediaInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAttachmentRenderingComplete(@NotNull LocalMediaInfo localMediaInfo, long j) {
            super(null);
            localMediaInfo.getClass();
            this.uploadedMediaInfo = localMediaInfo;
            this.renderingCompleteTimestamp = j;
        }

        public final long getRenderingCompleteTimestamp() {
            return this.renderingCompleteTimestamp;
        }

        @NotNull
        public final LocalMediaInfo getUploadedMediaInfo() {
            return this.uploadedMediaInfo;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnClientPreambleRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "clientPreambleRenderedTimestamp", "", "<init>", "(J)V", "getClientPreambleRenderedTimestamp", "()J", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClientPreambleRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;
        private final long clientPreambleRenderedTimestamp;

        public OnClientPreambleRendered(long j) {
            super(null);
            this.clientPreambleRenderedTimestamp = j;
        }

        public final long getClientPreambleRenderedTimestamp() {
            return this.clientPreambleRenderedTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnConversationUiInitialRender;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "referer", "", "startTimestamp", "", "conversationId", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getReferer", "()Ljava/lang/String;", "getStartTimestamp", "()J", "getConversationId", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnConversationUiInitialRender extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        @NotNull
        private final String referer;
        private final long startTimestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnConversationUiInitialRender(@NotNull String str, long j, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.referer = str;
            this.startTimestamp = j;
            this.conversationId = str2;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getReferer() {
            return this.referer;
        }

        public final long getStartTimestamp() {
            return this.startTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnConversationsRenderedForHistoryScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "renderTimestamp", "", "<init>", "(J)V", "getRenderTimestamp", "()J", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnConversationsRenderedForHistoryScreenIngress extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;
        private final long renderTimestamp;

        public OnConversationsRenderedForHistoryScreenIngress(long j) {
            super(null);
            this.renderTimestamp = j;
        }

        public final long getRenderTimestamp() {
            return this.renderTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnFirstVisualResponseRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "visualResponseRenderedTimestamp", "", "<init>", "(J)V", "getVisualResponseRenderedTimestamp", "()J", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFirstVisualResponseRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;
        private final long visualResponseRenderedTimestamp;

        public OnFirstVisualResponseRendered(long j) {
            super(null);
            this.visualResponseRenderedTimestamp = j;
        }

        public final long getVisualResponseRenderedTimestamp() {
            return this.visualResponseRenderedTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnFollowUpPillsRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", "<init>", "(Ljava/lang/String;)V", "getFragmentUri", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFollowUpPillsRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        private final String fragmentUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFollowUpPillsRendered(@NotNull String str) {
            super(null);
            str.getClass();
            this.fragmentUri = str;
        }

        @NotNull
        public final String getFragmentUri() {
            return this.fragmentUri;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnFragmentsRenderedForConversationScreenIngress;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "renderTimestamp", "", "<init>", "(J)V", "getRenderTimestamp", "()J", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnFragmentsRenderedForConversationScreenIngress extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;
        private final long renderTimestamp;

        public OnFragmentsRenderedForConversationScreenIngress(long j) {
            super(null);
            this.renderTimestamp = j;
        }

        public final long getRenderTimestamp() {
            return this.renderTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnKeyboardShown;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnKeyboardShown extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnKeyboardShown INSTANCE = new OnKeyboardShown();

        private OnKeyboardShown() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnLastFragmentRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLastFragmentRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnLastFragmentRendered INSTANCE = new OnLastFragmentRendered();

        private OnLastFragmentRendered() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnMostVisibleRootFragmentChanged;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "mostVisibleRootFragment", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;)V", "getMostVisibleRootFragment", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnMostVisibleRootFragmentChanged extends UiElementRenderUpdateEvent {
        public static final int $stable = 8;

        @NotNull
        private final FragmentData mostVisibleRootFragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMostVisibleRootFragmentChanged(@NotNull FragmentData fragmentData) {
            super(null);
            fragmentData.getClass();
            this.mostVisibleRootFragment = fragmentData;
        }

        @NotNull
        public final FragmentData getMostVisibleRootFragment() {
            return this.mostVisibleRootFragment;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnRequestFragmentRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "renderTimestamp", "", "<init>", "(J)V", "getRenderTimestamp", "()J", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRequestFragmentRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;
        private final long renderTimestamp;

        public OnRequestFragmentRendered(long j) {
            super(null);
            this.renderTimestamp = j;
        }

        public final long getRenderTimestamp() {
            return this.renderTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnResponseFragmentRevisionRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "fragmentData", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;)V", "getFragmentData", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnResponseFragmentRevisionRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 8;

        @NotNull
        private final FragmentData fragmentData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnResponseFragmentRevisionRendered(@NotNull FragmentData fragmentData) {
            super(null);
            fragmentData.getClass();
            this.fragmentData = fragmentData;
        }

        @NotNull
        public final FragmentData getFragmentData() {
            return this.fragmentData;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnResponseFragmentRevisionRenderedMissingRelation;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "fragmentData", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;)V", "getFragmentData", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnResponseFragmentRevisionRenderedMissingRelation extends UiElementRenderUpdateEvent {
        public static final int $stable = 8;

        @NotNull
        private final FragmentData fragmentData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnResponseFragmentRevisionRenderedMissingRelation(@NotNull FragmentData fragmentData) {
            super(null);
            fragmentData.getClass();
            this.fragmentData = fragmentData;
        }

        @NotNull
        public final FragmentData getFragmentData() {
            return this.fragmentData;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnResponseFragmentRevisionRenderedPostIdle;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "fragmentData", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;)V", "getFragmentData", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnResponseFragmentRevisionRenderedPostIdle extends UiElementRenderUpdateEvent {
        public static final int $stable = 8;

        @NotNull
        private final FragmentData fragmentData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnResponseFragmentRevisionRenderedPostIdle(@NotNull FragmentData fragmentData) {
            super(null);
            fragmentData.getClass();
            this.fragmentData = fragmentData;
        }

        @NotNull
        public final FragmentData getFragmentData() {
            return this.fragmentData;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnStarterPillRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "uri", "", "<init>", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStarterPillRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        private final String uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnStarterPillRendered(@NotNull String str) {
            super(null);
            str.getClass();
            this.uri = str;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnSuggestionPillsRendered;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "ingressTimestamp", "", "renderTimestamp", "<init>", "(JJ)V", "getIngressTimestamp", "()J", "getRenderTimestamp", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSuggestionPillsRendered extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;
        private final long ingressTimestamp;
        private final long renderTimestamp;

        public OnSuggestionPillsRendered(long j, long j2) {
            super(null);
            this.ingressTimestamp = j;
            this.renderTimestamp = j2;
        }

        public final long getIngressTimestamp() {
            return this.ingressTimestamp;
        }

        public final long getRenderTimestamp() {
            return this.renderTimestamp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnTextFieldFocusFailed;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTextFieldFocusFailed extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        public static final OnTextFieldFocusFailed INSTANCE = new OnTextFieldFocusFailed();

        private OnTextFieldFocusFailed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnUpdateConversationScreenSize;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "displaySize", "Lcom/amazon/alexa/ra/core/data/model/DisplaySize;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/DisplaySize;)V", "getDisplaySize", "()Lcom/amazon/alexa/ra/core/data/model/DisplaySize;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUpdateConversationScreenSize extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @NotNull
        private final DisplaySize displaySize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateConversationScreenSize(@NotNull DisplaySize displaySize) {
            super(null);
            displaySize.getClass();
            this.displaySize = displaySize;
        }

        @NotNull
        public final DisplaySize getDisplaySize() {
            return this.displaySize;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnUpdateVisibleItemsInfo;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "visibleScrollableInfo", "Lcom/amazon/alexa/ra/core/data/model/VisibleScrollableInfo;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/VisibleScrollableInfo;)V", "getVisibleScrollableInfo", "()Lcom/amazon/alexa/ra/core/data/model/VisibleScrollableInfo;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUpdateVisibleItemsInfo extends UiElementRenderUpdateEvent {
        public static final int $stable = 8;

        @NotNull
        private final VisibleScrollableInfo visibleScrollableInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateVisibleItemsInfo(@NotNull VisibleScrollableInfo visibleScrollableInfo) {
            super(null);
            visibleScrollableInfo.getClass();
            this.visibleScrollableInfo = visibleScrollableInfo;
        }

        @NotNull
        public final VisibleScrollableInfo getVisibleScrollableInfo() {
            return this.visibleScrollableInfo;
        }
    }

    public /* synthetic */ UiElementRenderUpdateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiElementRenderUpdateEvent() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextAnimationComplete;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", FragmentMetaData.REVISION, "", "dialogRequestId", FragmentMetaData.PENDING_UPDATE, "", "displayHint", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getFragmentUri", "()Ljava/lang/String;", "getRevision", "()I", "getDialogRequestId", "getPendingUpdate", "()Z", "getDisplayHint", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAgentTextAnimationComplete extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @Nullable
        private final String dialogRequestId;

        @Nullable
        private final String displayHint;

        @NotNull
        private final String fragmentUri;
        private final boolean pendingUpdate;
        private final int revision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAgentTextAnimationComplete(@NotNull String str, int i, @Nullable String str2, boolean z, @Nullable String str3) {
            super(null);
            str.getClass();
            this.fragmentUri = str;
            this.revision = i;
            this.dialogRequestId = str2;
            this.pendingUpdate = z;
            this.displayHint = str3;
        }

        @Nullable
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final String getDisplayHint() {
            return this.displayHint;
        }

        @NotNull
        public final String getFragmentUri() {
            return this.fragmentUri;
        }

        public final boolean getPendingUpdate() {
            return this.pendingUpdate;
        }

        public final int getRevision() {
            return this.revision;
        }

        public /* synthetic */ OnAgentTextAnimationComplete(String str, int i, String str2, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, z, (i2 & 16) != 0 ? null : str3);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextFragmentDispatched;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", FragmentMetaData.REVISION, "", "dialogRequestId", FragmentMetaData.PENDING_UPDATE, "", "displayHint", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getFragmentUri", "()Ljava/lang/String;", "getRevision", "()I", "getDialogRequestId", "getPendingUpdate", "()Z", "getDisplayHint", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAgentTextFragmentDispatched extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @Nullable
        private final String dialogRequestId;

        @Nullable
        private final String displayHint;

        @NotNull
        private final String fragmentUri;
        private final boolean pendingUpdate;
        private final int revision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAgentTextFragmentDispatched(@NotNull String str, int i, @Nullable String str2, boolean z, @Nullable String str3) {
            super(null);
            str.getClass();
            this.fragmentUri = str;
            this.revision = i;
            this.dialogRequestId = str2;
            this.pendingUpdate = z;
            this.displayHint = str3;
        }

        @Nullable
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final String getDisplayHint() {
            return this.displayHint;
        }

        @NotNull
        public final String getFragmentUri() {
            return this.fragmentUri;
        }

        public final boolean getPendingUpdate() {
            return this.pendingUpdate;
        }

        public final int getRevision() {
            return this.revision;
        }

        public /* synthetic */ OnAgentTextFragmentDispatched(String str, int i, String str2, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, z, (i2 & 16) != 0 ? null : str3);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent$OnAgentTextMarkdownComposing;", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", FragmentMetaData.REVISION, "", "dialogRequestId", FragmentMetaData.PENDING_UPDATE, "", "displayHint", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getFragmentUri", "()Ljava/lang/String;", "getRevision", "()I", "getDialogRequestId", "getPendingUpdate", "()Z", "getDisplayHint", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAgentTextMarkdownComposing extends UiElementRenderUpdateEvent {
        public static final int $stable = 0;

        @Nullable
        private final String dialogRequestId;

        @Nullable
        private final String displayHint;

        @NotNull
        private final String fragmentUri;
        private final boolean pendingUpdate;
        private final int revision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAgentTextMarkdownComposing(@NotNull String str, int i, @Nullable String str2, boolean z, @Nullable String str3) {
            super(null);
            str.getClass();
            this.fragmentUri = str;
            this.revision = i;
            this.dialogRequestId = str2;
            this.pendingUpdate = z;
            this.displayHint = str3;
        }

        @Nullable
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @Nullable
        public final String getDisplayHint() {
            return this.displayHint;
        }

        @NotNull
        public final String getFragmentUri() {
            return this.fragmentUri;
        }

        public final boolean getPendingUpdate() {
            return this.pendingUpdate;
        }

        public final int getRevision() {
            return this.revision;
        }

        public /* synthetic */ OnAgentTextMarkdownComposing(String str, int i, String str2, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, z, (i2 & 16) != 0 ? null : str3);
        }
    }
}
