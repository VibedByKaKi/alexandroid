package com.amazon.alexa.assistant.ui.conversation;

import android.os.SystemClock;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UiOptionsBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.utils.RouteHelper;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001DB\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0016HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009f\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010?\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006E"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ConversationUIState;", "", RouteHelper.PARAMETER_PAGE, "Lcom/amazon/alexa/assistant/ui/conversation/ConversationPage;", "conversationId", "", "startingState", "Lcom/amazon/alexa/assistant/ui/conversation/StartingState;", "targetFragmentTimestamp", UiOptionsBundleKeys.HINT_TEXT, "hintTextOperation", "Lcom/amazon/alexa/assistant/ui/conversation/HintTextOperation;", "suggestionTheme", "Lcom/amazon/alexa/assistant/ui/conversation/SuggestionTheme;", "enableSpeechResponseAlways", "", "enterAnimationType", "Lcom/amazon/alexa/assistant/ui/conversation/EnterAnimationType;", "shareInUri", RouteHelper.PARAMETER_OPEN_SHARE_SHEET_ON_LAUNCH, "referer", "startTimestamp", "", "universalPrivacyCode", "<init>", "(Lcom/amazon/alexa/assistant/ui/conversation/ConversationPage;Ljava/lang/String;Lcom/amazon/alexa/assistant/ui/conversation/StartingState;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/ui/conversation/HintTextOperation;Lcom/amazon/alexa/assistant/ui/conversation/SuggestionTheme;ZLcom/amazon/alexa/assistant/ui/conversation/EnterAnimationType;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;)V", "getPage", "()Lcom/amazon/alexa/assistant/ui/conversation/ConversationPage;", "getConversationId", "()Ljava/lang/String;", "getStartingState", "()Lcom/amazon/alexa/assistant/ui/conversation/StartingState;", "getTargetFragmentTimestamp", "getHintText", "getHintTextOperation", "()Lcom/amazon/alexa/assistant/ui/conversation/HintTextOperation;", "getSuggestionTheme", "()Lcom/amazon/alexa/assistant/ui/conversation/SuggestionTheme;", "getEnableSpeechResponseAlways", "()Z", "getEnterAnimationType", "()Lcom/amazon/alexa/assistant/ui/conversation/EnterAnimationType;", "getShareInUri", "getOpenShareSheetOnLaunch", "getReferer", "getStartTimestamp", "()J", "getUniversalPrivacyCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ConversationUIState {
    public static final int $stable = 0;

    @Nullable
    private final String conversationId;
    private final boolean enableSpeechResponseAlways;

    @NotNull
    private final EnterAnimationType enterAnimationType;

    @Nullable
    private final String hintText;

    @NotNull
    private final HintTextOperation hintTextOperation;
    private final boolean openShareSheetOnLaunch;

    @NotNull
    private final ConversationPage page;

    @NotNull
    private final String referer;

    @Nullable
    private final String shareInUri;
    private final long startTimestamp;

    @NotNull
    private final StartingState startingState;

    @NotNull
    private final SuggestionTheme suggestionTheme;

    @Nullable
    private final String targetFragmentTimestamp;

    @Nullable
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0007J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010*\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0007J\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ConversationUIState$Builder;", "", "<init>", "()V", RouteHelper.PARAMETER_PAGE, "Lcom/amazon/alexa/assistant/ui/conversation/ConversationPage;", "conversationId", "", "startingState", "Lcom/amazon/alexa/assistant/ui/conversation/StartingState;", "targetFragmentTimestamp", UiOptionsBundleKeys.HINT_TEXT, "hintTextOperation", "Lcom/amazon/alexa/assistant/ui/conversation/HintTextOperation;", "suggestionTheme", "Lcom/amazon/alexa/assistant/ui/conversation/SuggestionTheme;", "enableSpeechResponseAlways", "", "enterAnimationType", "Lcom/amazon/alexa/assistant/ui/conversation/EnterAnimationType;", "shareInUri", RouteHelper.PARAMETER_OPEN_SHARE_SHEET_ON_LAUNCH, "referer", "startTimestamp", "", "universalPrivacyCode", "setPage", "setConversationId", "setStartingState", "setTargetFragmentTimestamp", "setHintText", "setHintTextOperation", "setSuggestionTheme", "setEnableSpeechResponseAlways", "enable", "setEnterAnimationType", "setShareInUri", "uri", "setOpenShareSheetOnLaunch", "open", "setReferer", "setStartTimestamp", "setUniversalPrivacyCode", "code", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/assistant/ui/conversation/ConversationUIState;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationUIState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationUIState.kt\ncom/amazon/alexa/assistant/ui/conversation/ConversationUIState$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private String conversationId;
        private boolean enableSpeechResponseAlways;

        @Nullable
        private String hintText;
        private boolean openShareSheetOnLaunch;

        @Nullable
        private String shareInUri;

        @Nullable
        private String targetFragmentTimestamp;

        @Nullable
        private String universalPrivacyCode;

        @NotNull
        private ConversationPage page = ConversationPage.CONVERSATION;

        @NotNull
        private StartingState startingState = StartingState.TEXT;

        @NotNull
        private HintTextOperation hintTextOperation = HintTextOperation.SHOW;

        @NotNull
        private SuggestionTheme suggestionTheme = SuggestionTheme.ADULT;

        @NotNull
        private EnterAnimationType enterAnimationType = EnterAnimationType.NONE;

        @NotNull
        private String referer = "UNKNOWN";
        private long startTimestamp = SystemClock.elapsedRealtime();

        @NotNull
        public final ConversationUIState build() {
            return new ConversationUIState(this.page, this.conversationId, this.startingState, this.targetFragmentTimestamp, this.hintText, this.hintTextOperation, this.suggestionTheme, this.enableSpeechResponseAlways, this.enterAnimationType, this.shareInUri, this.openShareSheetOnLaunch, this.referer, this.startTimestamp, this.universalPrivacyCode);
        }

        @NotNull
        public final Builder setConversationId(@Nullable String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        @NotNull
        public final Builder setEnableSpeechResponseAlways(boolean enable) {
            this.enableSpeechResponseAlways = enable;
            return this;
        }

        @NotNull
        public final Builder setEnterAnimationType(@NotNull EnterAnimationType enterAnimationType) {
            enterAnimationType.getClass();
            this.enterAnimationType = enterAnimationType;
            return this;
        }

        @NotNull
        public final Builder setHintText(@Nullable String hintText) {
            this.hintText = hintText;
            return this;
        }

        @NotNull
        public final Builder setHintTextOperation(@NotNull HintTextOperation hintTextOperation) {
            hintTextOperation.getClass();
            this.hintTextOperation = hintTextOperation;
            return this;
        }

        @NotNull
        public final Builder setOpenShareSheetOnLaunch(boolean open) {
            this.openShareSheetOnLaunch = open;
            return this;
        }

        @NotNull
        public final Builder setPage(@NotNull ConversationPage page) {
            page.getClass();
            this.page = page;
            return this;
        }

        @NotNull
        public final Builder setReferer(@NotNull String referer) {
            referer.getClass();
            this.referer = referer;
            return this;
        }

        @NotNull
        public final Builder setShareInUri(@Nullable String uri) {
            this.shareInUri = uri;
            return this;
        }

        @NotNull
        public final Builder setStartTimestamp(long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        @NotNull
        public final Builder setStartingState(@NotNull StartingState startingState) {
            startingState.getClass();
            this.startingState = startingState;
            return this;
        }

        @NotNull
        public final Builder setSuggestionTheme(@NotNull SuggestionTheme suggestionTheme) {
            suggestionTheme.getClass();
            this.suggestionTheme = suggestionTheme;
            return this;
        }

        @NotNull
        public final Builder setTargetFragmentTimestamp(@Nullable String targetFragmentTimestamp) {
            this.targetFragmentTimestamp = targetFragmentTimestamp;
            return this;
        }

        @NotNull
        public final Builder setUniversalPrivacyCode(@Nullable String code) {
            this.universalPrivacyCode = code;
            return this;
        }
    }

    public /* synthetic */ ConversationUIState(ConversationPage conversationPage, String str, StartingState startingState, String str2, String str3, HintTextOperation hintTextOperation, SuggestionTheme suggestionTheme, boolean z, EnterAnimationType enterAnimationType, String str4, boolean z2, String str5, long j, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConversationPage.CONVERSATION : conversationPage, (i & 2) != 0 ? null : str, (i & 4) != 0 ? StartingState.TEXT : startingState, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? HintTextOperation.SHOW : hintTextOperation, (i & 64) != 0 ? SuggestionTheme.ADULT : suggestionTheme, (i & 128) != 0 ? false : z, (i & 256) != 0 ? EnterAnimationType.NONE : enterAnimationType, (i & 512) != 0 ? null : str4, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? "UNKNOWN" : str5, (i & 4096) != 0 ? SystemClock.elapsedRealtime() : j, (i & 8192) != 0 ? null : str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ConversationPage getPage() {
        return this.page;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getShareInUri() {
        return this.shareInUri;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getOpenShareSheetOnLaunch() {
        return this.openShareSheetOnLaunch;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getReferer() {
        return this.referer;
    }

    /* renamed from: component13, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StartingState getStartingState() {
        return this.startingState;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTargetFragmentTimestamp() {
        return this.targetFragmentTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final HintTextOperation getHintTextOperation() {
        return this.hintTextOperation;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final SuggestionTheme getSuggestionTheme() {
        return this.suggestionTheme;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnableSpeechResponseAlways() {
        return this.enableSpeechResponseAlways;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final EnterAnimationType getEnterAnimationType() {
        return this.enterAnimationType;
    }

    @NotNull
    public final ConversationUIState copy(@NotNull ConversationPage page, @Nullable String conversationId, @NotNull StartingState startingState, @Nullable String targetFragmentTimestamp, @Nullable String hintText, @NotNull HintTextOperation hintTextOperation, @NotNull SuggestionTheme suggestionTheme, boolean enableSpeechResponseAlways, @NotNull EnterAnimationType enterAnimationType, @Nullable String shareInUri, boolean openShareSheetOnLaunch, @NotNull String referer, long startTimestamp, @Nullable String universalPrivacyCode) {
        page.getClass();
        startingState.getClass();
        hintTextOperation.getClass();
        suggestionTheme.getClass();
        enterAnimationType.getClass();
        referer.getClass();
        return new ConversationUIState(page, conversationId, startingState, targetFragmentTimestamp, hintText, hintTextOperation, suggestionTheme, enableSpeechResponseAlways, enterAnimationType, shareInUri, openShareSheetOnLaunch, referer, startTimestamp, universalPrivacyCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationUIState)) {
            return false;
        }
        ConversationUIState conversationUIState = (ConversationUIState) other;
        return this.page == conversationUIState.page && Intrinsics.areEqual(this.conversationId, conversationUIState.conversationId) && this.startingState == conversationUIState.startingState && Intrinsics.areEqual(this.targetFragmentTimestamp, conversationUIState.targetFragmentTimestamp) && Intrinsics.areEqual(this.hintText, conversationUIState.hintText) && this.hintTextOperation == conversationUIState.hintTextOperation && this.suggestionTheme == conversationUIState.suggestionTheme && this.enableSpeechResponseAlways == conversationUIState.enableSpeechResponseAlways && this.enterAnimationType == conversationUIState.enterAnimationType && Intrinsics.areEqual(this.shareInUri, conversationUIState.shareInUri) && this.openShareSheetOnLaunch == conversationUIState.openShareSheetOnLaunch && Intrinsics.areEqual(this.referer, conversationUIState.referer) && this.startTimestamp == conversationUIState.startTimestamp && Intrinsics.areEqual(this.universalPrivacyCode, conversationUIState.universalPrivacyCode);
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    public final boolean getEnableSpeechResponseAlways() {
        return this.enableSpeechResponseAlways;
    }

    @NotNull
    public final EnterAnimationType getEnterAnimationType() {
        return this.enterAnimationType;
    }

    @Nullable
    public final String getHintText() {
        return this.hintText;
    }

    @NotNull
    public final HintTextOperation getHintTextOperation() {
        return this.hintTextOperation;
    }

    public final boolean getOpenShareSheetOnLaunch() {
        return this.openShareSheetOnLaunch;
    }

    @NotNull
    public final ConversationPage getPage() {
        return this.page;
    }

    @NotNull
    public final String getReferer() {
        return this.referer;
    }

    @Nullable
    public final String getShareInUri() {
        return this.shareInUri;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final StartingState getStartingState() {
        return this.startingState;
    }

    @NotNull
    public final SuggestionTheme getSuggestionTheme() {
        return this.suggestionTheme;
    }

    @Nullable
    public final String getTargetFragmentTimestamp() {
        return this.targetFragmentTimestamp;
    }

    @Nullable
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public int hashCode() {
        int hashCode = this.page.hashCode() * 31;
        String str = this.conversationId;
        int hashCode2 = (this.startingState.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.targetFragmentTimestamp;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hintText;
        int hashCode4 = (this.enterAnimationType.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.enableSpeechResponseAlways, (this.suggestionTheme.hashCode() + ((this.hintTextOperation.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31, 31)) * 31;
        String str4 = this.shareInUri;
        int m = BitVector$$ExternalSyntheticOutline0.m(this.startTimestamp, ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.openShareSheetOnLaunch, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.referer), 31);
        String str5 = this.universalPrivacyCode;
        return m + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ConversationPage conversationPage = this.page;
        String str = this.conversationId;
        StartingState startingState = this.startingState;
        String str2 = this.targetFragmentTimestamp;
        String str3 = this.hintText;
        HintTextOperation hintTextOperation = this.hintTextOperation;
        SuggestionTheme suggestionTheme = this.suggestionTheme;
        boolean z = this.enableSpeechResponseAlways;
        EnterAnimationType enterAnimationType = this.enterAnimationType;
        String str4 = this.shareInUri;
        boolean z2 = this.openShareSheetOnLaunch;
        String str5 = this.referer;
        long j = this.startTimestamp;
        String str6 = this.universalPrivacyCode;
        StringBuilder sb = new StringBuilder("ConversationUIState(page=");
        sb.append(conversationPage);
        sb.append(", conversationId=");
        sb.append(str);
        sb.append(", startingState=");
        sb.append(startingState);
        sb.append(", targetFragmentTimestamp=");
        sb.append(str2);
        sb.append(", hintText=");
        sb.append(str3);
        sb.append(", hintTextOperation=");
        sb.append(hintTextOperation);
        sb.append(", suggestionTheme=");
        sb.append(suggestionTheme);
        sb.append(", enableSpeechResponseAlways=");
        sb.append(z);
        sb.append(", enterAnimationType=");
        sb.append(enterAnimationType);
        sb.append(", shareInUri=");
        sb.append(str4);
        sb.append(", openShareSheetOnLaunch=");
        sb.append(z2);
        sb.append(", referer=");
        sb.append(str5);
        sb.append(", startTimestamp=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j, ", universalPrivacyCode=", str6, sb);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public ConversationUIState(@NotNull ConversationPage conversationPage, @Nullable String str, @NotNull StartingState startingState, @Nullable String str2, @Nullable String str3, @NotNull HintTextOperation hintTextOperation, @NotNull SuggestionTheme suggestionTheme, boolean z, @NotNull EnterAnimationType enterAnimationType, @Nullable String str4, boolean z2, @NotNull String str5, long j, @Nullable String str6) {
        conversationPage.getClass();
        startingState.getClass();
        hintTextOperation.getClass();
        suggestionTheme.getClass();
        enterAnimationType.getClass();
        str5.getClass();
        this.page = conversationPage;
        this.conversationId = str;
        this.startingState = startingState;
        this.targetFragmentTimestamp = str2;
        this.hintText = str3;
        this.hintTextOperation = hintTextOperation;
        this.suggestionTheme = suggestionTheme;
        this.enableSpeechResponseAlways = z;
        this.enterAnimationType = enterAnimationType;
        this.shareInUri = str4;
        this.openShareSheetOnLaunch = z2;
        this.referer = str5;
        this.startTimestamp = j;
        this.universalPrivacyCode = str6;
    }

    public ConversationUIState() {
        this(null, null, null, null, null, null, null, false, null, null, false, null, 0L, null, 16383, null);
    }
}
