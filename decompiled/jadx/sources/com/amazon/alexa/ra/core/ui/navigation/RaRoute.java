package com.amazon.alexa.ra.core.ui.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.event.serializer.handlers.RouteDataHandler;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.data.model.InputBarUiConfig;
import com.amazon.alexa.ra.core.data.model.SuggestionUiTheme;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.core.ui.navigation.RaRoute;
import com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.utils.RouteHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0019\u001a\u001bB\u0085\u0001\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012j\b\u0002\u0010\u0005\u001ad\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J.\u0010\u0018\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012Rv\u0010\u0005\u001ad\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute;", "", "route", "", "fullRoute", "getBehavior", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", RouteDataHandler.CURRENT_ROUTE_KEY, "Landroid/os/Bundle;", "currentArgs", "existingRouteFromBackstack", "existingArgsFromBackstack", "Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute$RouteBehavior;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "getRoute", "()Ljava/lang/String;", "getFullRoute", "getGetBehavior$ui_core_release", "()Lkotlin/jvm/functions/Function4;", "getFullyQualifiedRoute", "getInitialRoute", "getRouteBehavior", "RaRouteData", "Companion", "RouteBehavior", "Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute$RaRouteData;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class RaRoute {
    public static final int $stable = 0;

    @NotNull
    public static final String CAMERA_PERMISSION = "camera_permission";

    @NotNull
    public static final String CONVERSATION = "conversation";

    @NotNull
    public static final String CONVERSATION_ARG_CONVERSATION_ID = "conversationId";

    @NotNull
    private static final String CONVERSATION_ARG_CONVERSATION_ID_DEEPLINK = "{conversationId}";

    @NotNull
    public static final String CONVERSATION_ARG_ENABLE_SPEECH_RESPONSE_ALWAYS = "enableSpeechResponseAlways";

    @NotNull
    private static final String CONVERSATION_ARG_ENABLE_SPEECH_RESPONSE_ALWAYS_DEEPLINK = "{enableSpeechResponseAlways}";

    @NotNull
    public static final String CONVERSATION_ARG_ENTER_ANIMATION_TYPE = "enterAnimationType";

    @NotNull
    private static final String CONVERSATION_ARG_ENTER_ANIMATION_TYPE_DEEPLINK = "{enterAnimationType}";

    @NotNull
    public static final String CONVERSATION_ARG_HIDE_ATTACH_BUTTON = "hideAttachButton";

    @NotNull
    private static final String CONVERSATION_ARG_HIDE_ATTACH_BUTTON_DEEPLINK = "{hideAttachButton}";

    @NotNull
    public static final String CONVERSATION_ARG_HIDE_CONTEXTUAL_MENU = "hideContextualMenu";

    @NotNull
    private static final String CONVERSATION_ARG_HIDE_CONTEXTUAL_MENU_DEEPLINK = "{hideContextualMenu}";

    @NotNull
    public static final String CONVERSATION_ARG_HIDE_OVERFLOW_MENU = "hideOverflowMenu";

    @NotNull
    private static final String CONVERSATION_ARG_HIDE_OVERFLOW_MENU_DEEPLINK = "{hideOverflowMenu}";

    @NotNull
    public static final String CONVERSATION_ARG_HINT = "hint";

    @NotNull
    private static final String CONVERSATION_ARG_HINT_DEEPLINK = "{hint}";

    @NotNull
    public static final String CONVERSATION_ARG_HINT_OPERATION = "hintOperation";

    @NotNull
    private static final String CONVERSATION_ARG_HINT_OPERATION_DEEPLINK = "{hintOperation}";

    @NotNull
    public static final String CONVERSATION_ARG_ITEM_ID = "itemId";

    @NotNull
    private static final String CONVERSATION_ARG_ITEM_ID_DEEPLINK = "{itemId}";

    @NotNull
    public static final String CONVERSATION_ARG_REFERER = "referer";

    @NotNull
    private static final String CONVERSATION_ARG_REFERER_DEEPLINK = "{referer}";

    @NotNull
    public static final String CONVERSATION_ARG_SHARE_IN_URI = "uri";

    @NotNull
    private static final String CONVERSATION_ARG_SHARE_IN_URI_DEEPLINK = "{uri}";

    @NotNull
    public static final String CONVERSATION_ARG_STARTING_STATE = "startingState";

    @NotNull
    private static final String CONVERSATION_ARG_STARTING_STATE_DEEPLINK = "{startingState}";

    @NotNull
    public static final String CONVERSATION_ARG_START_TIME_STAMP = "startTimestamp";

    @NotNull
    private static final String CONVERSATION_ARG_START_TIME_STAMP_DEEPLINK = "{startTimestamp}";

    @NotNull
    public static final String CONVERSATION_ARG_SUGGESTION_THEME = "suggestionTheme";

    @NotNull
    private static final String CONVERSATION_ARG_SUGGESTION_THEME_DEEPLINK = "{suggestionTheme}";

    @NotNull
    public static final String CONVERSATION_ARG_TARGET_FRAGMENT_TIMESTAMP = "targetFragmentTimestamp";

    @NotNull
    private static final String CONVERSATION_ARG_TARGET_FRAGMENT_TIME_DEEPLINK = "{targetFragmentTimestamp}";

    @NotNull
    public static final String CONVERSATION_ARG_UNIVERSAL_PRIVACY_CODE = "universalPrivacyCode";

    @NotNull
    private static final String CONVERSATION_ARG_UNIVERSAL_PRIVACY_CODE_DEEPLINK = "{universalPrivacyCode}";

    @NotNull
    public static final String CONVERSATION_FULL_ROUTE = "conversation/{referer}/{startTimestamp}?conversationId={conversationId}&hint={hint}&startingState={startingState}&uri={uri}&hintOperation={hintOperation}&universalPrivacyCode={universalPrivacyCode}&enterAnimationType={enterAnimationType}&targetFragmentTimestamp={targetFragmentTimestamp}&suggestionTheme={suggestionTheme}&hideAttachButton={hideAttachButton}&hideOverflowMenu={hideOverflowMenu}&hideContextualMenu={hideContextualMenu}&enableSpeechResponseAlways={enableSpeechResponseAlways}&itemId={itemId}";

    @NotNull
    public static final String CONVERSATION_HISTORY = "history";

    @NotNull
    public static final String CONVERSATION_HISTORY_FULL_ROUTE = "history/{referer}/{startTimestamp}";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_REFERER = "unknown";

    @NotNull
    public static final String DEFAULT_STARTING_STATE = "text";

    @NotNull
    public static final String FULL_SCREEN_THUMBNAIL = "full_screen_thumbnail";

    @NotNull
    public static final String LIGHTBOX_SCREEN = "lightbox_screen";

    @NotNull
    public static final String LIVE_MODE_LEARN_MORE = "live_mode_learn_more";

    @NotNull
    public static final String LIVE_MODE_STARTING_STATE = "liveMode";

    @NotNull
    public static final String MICROPHONE_PERMISSION = "microphone_permission";

    @NotNull
    public static final String OVERFLOW = "overflow";

    @NotNull
    public static final String OVERFLOW_DROPDOWN = "overflow_dropdown";

    @NotNull
    public static final String PRIVACY_WEBVIEW = "privacy_webview";

    @NotNull
    public static final String SETTINGS = "settings";

    @NotNull
    public static final String SPLASH_SCREEN = "splash_screen";

    @NotNull
    public static final String TEXT_AUTO_SEND_STARTING_STATE = "textAutoSend";

    @NotNull
    public static final String UNKNOWN_STARTING_STATE = "unknown";

    @NotNull
    public static final String VOICE_STARTING_STATE = "voice";

    @NotNull
    public static final String WEBVIEW_BOTTOM_SHEET = "webview_bottom_sheet";

    @NotNull
    private final String fullRoute;

    @NotNull
    private final Function4<String, Bundle, String, Bundle, RouteBehavior> getBehavior;

    @NotNull
    private final String route;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute$RouteBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "MAKE_AS_ROOT", "ADD_NEW", "POP_UNTIL_ROUTE", "POP_AND_ADD_ROUTE", "NO_ACTION", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RouteBehavior {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RouteBehavior[] $VALUES;
        public static final RouteBehavior MAKE_AS_ROOT = new RouteBehavior("MAKE_AS_ROOT", 0);
        public static final RouteBehavior ADD_NEW = new RouteBehavior("ADD_NEW", 1);
        public static final RouteBehavior POP_UNTIL_ROUTE = new RouteBehavior("POP_UNTIL_ROUTE", 2);
        public static final RouteBehavior POP_AND_ADD_ROUTE = new RouteBehavior("POP_AND_ADD_ROUTE", 3);
        public static final RouteBehavior NO_ACTION = new RouteBehavior("NO_ACTION", 4);

        private static final /* synthetic */ RouteBehavior[] $values() {
            return new RouteBehavior[]{MAKE_AS_ROOT, ADD_NEW, POP_UNTIL_ROUTE, POP_AND_ADD_ROUTE, NO_ACTION};
        }

        static {
            RouteBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private RouteBehavior(String str, int i) {
        }

        @NotNull
        public static EnumEntries<RouteBehavior> getEntries() {
            return $ENTRIES;
        }

        public static RouteBehavior valueOf(String str) {
            return (RouteBehavior) Enum.valueOf(RouteBehavior.class, str);
        }

        public static RouteBehavior[] values() {
            return (RouteBehavior[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RaRoute(String str, String str2, Function4 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? new RaRoute$$ExternalSyntheticLambda0(0) : function4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RouteBehavior _init_$lambda$0(String str, Bundle bundle, String str2, Bundle bundle2) {
        return RouteBehavior.ADD_NEW;
    }

    @NotNull
    public String getFullRoute() {
        return this.fullRoute;
    }

    @NotNull
    public final String getFullyQualifiedRoute() {
        return getFullRoute();
    }

    @NotNull
    public Function4<String, Bundle, String, Bundle, RouteBehavior> getGetBehavior$ui_core_release() {
        return this.getBehavior;
    }

    @NotNull
    public final String getInitialRoute() {
        return getRoute();
    }

    @NotNull
    public String getRoute() {
        return this.route;
    }

    @NotNull
    public final RouteBehavior getRouteBehavior(@Nullable String currentRoute, @Nullable Bundle currentArgs, @Nullable String existingRouteFromBackstack, @Nullable Bundle existingArgsFromBackstack) {
        return getGetBehavior$ui_core_release().invoke(currentRoute, currentArgs, existingRouteFromBackstack, existingArgsFromBackstack);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010:\u001a\u00020;JÐ\u0001\u0010<\u001a\u00020;2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010C\u001a\u00020\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\b\b\u0002\u0010I\u001a\u00020J2\b\b\u0002\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020J2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\u0006\u0010O\u001a\u00020P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010RJ\u0088\u0001\u0010S\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u0005J\u0006\u0010T\u001a\u00020;J\u0006\u0010U\u001a\u00020;J\u0006\u0010V\u001a\u00020;J\u0006\u0010W\u001a\u00020;J\u0006\u0010X\u001a\u00020;J\u0006\u0010Y\u001a\u00020;J\u0006\u0010Z\u001a\u00020;J\u0006\u0010[\u001a\u00020;J\u0006\u0010\\\u001a\u00020;J\u001a\u0010]\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u0005J\u0016\u0010^\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010_\u001a\u00020J2\u0006\u0010`\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute$Companion;", "", "<init>", "()V", "DEFAULT_REFERER", "", "DEFAULT_STARTING_STATE", "VOICE_STARTING_STATE", "LIVE_MODE_STARTING_STATE", "TEXT_AUTO_SEND_STARTING_STATE", "UNKNOWN_STARTING_STATE", "CONVERSATION_ARG_CONVERSATION_ID", "CONVERSATION_ARG_REFERER", "CONVERSATION_ARG_START_TIME_STAMP", "CONVERSATION_ARG_HINT", "CONVERSATION_ARG_STARTING_STATE", "CONVERSATION_ARG_SHARE_IN_URI", "CONVERSATION", "CONVERSATION_ARG_HINT_OPERATION", "CONVERSATION_ARG_UNIVERSAL_PRIVACY_CODE", "CONVERSATION_ARG_ENTER_ANIMATION_TYPE", "CONVERSATION_ARG_TARGET_FRAGMENT_TIMESTAMP", "CONVERSATION_ARG_SUGGESTION_THEME", "CONVERSATION_ARG_HIDE_ATTACH_BUTTON", "CONVERSATION_ARG_HIDE_OVERFLOW_MENU", "CONVERSATION_ARG_HIDE_CONTEXTUAL_MENU", "CONVERSATION_ARG_ENABLE_SPEECH_RESPONSE_ALWAYS", "CONVERSATION_ARG_ITEM_ID", "CONVERSATION_ARG_CONVERSATION_ID_DEEPLINK", "CONVERSATION_ARG_REFERER_DEEPLINK", "CONVERSATION_ARG_START_TIME_STAMP_DEEPLINK", "CONVERSATION_ARG_HINT_DEEPLINK", "CONVERSATION_ARG_HINT_OPERATION_DEEPLINK", "CONVERSATION_ARG_STARTING_STATE_DEEPLINK", "CONVERSATION_ARG_SHARE_IN_URI_DEEPLINK", "CONVERSATION_ARG_UNIVERSAL_PRIVACY_CODE_DEEPLINK", "CONVERSATION_ARG_ENTER_ANIMATION_TYPE_DEEPLINK", "CONVERSATION_ARG_TARGET_FRAGMENT_TIME_DEEPLINK", "CONVERSATION_ARG_SUGGESTION_THEME_DEEPLINK", "CONVERSATION_ARG_HIDE_ATTACH_BUTTON_DEEPLINK", "CONVERSATION_ARG_HIDE_OVERFLOW_MENU_DEEPLINK", "CONVERSATION_ARG_HIDE_CONTEXTUAL_MENU_DEEPLINK", "CONVERSATION_ARG_ENABLE_SPEECH_RESPONSE_ALWAYS_DEEPLINK", "CONVERSATION_ARG_ITEM_ID_DEEPLINK", "CONVERSATION_FULL_ROUTE", "OVERFLOW", "OVERFLOW_DROPDOWN", "LIGHTBOX_SCREEN", "CONVERSATION_HISTORY", "SETTINGS", "CONVERSATION_HISTORY_FULL_ROUTE", "MICROPHONE_PERMISSION", "CAMERA_PERMISSION", "LIVE_MODE_LEARN_MORE", "SPLASH_SCREEN", "FULL_SCREEN_THUMBNAIL", "WEBVIEW_BOTTOM_SHEET", "PRIVACY_WEBVIEW", "startDestination", "Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute;", Constants.CONVERSATION_SCREEN, "conversationId", "referer", "startTimestamp", "hint", "startingState", "uri", "hintTextOperation", "universalPrivacyCode", "enterAnimationType", "targetFragmentTimestamp", "suggestionUiTheme", "Lcom/amazon/alexa/ra/core/data/model/SuggestionUiTheme;", "hideAttachButton", "", "hideOverflowMenu", "hideContextualMenu", "enableSpeechResponseAlways", "itemId", "conversationIdStore", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdStoreApi;", "inputBarUiConfig", "Lcom/amazon/alexa/ra/core/data/model/InputBarUiConfig;", "getExpectedRoute", "microphonePermissionScreen", "cameraPermissionScreen", "liveModeLearnMoreScreen", "overFlowScreen", "overFlowDropdownScreen", "lightBoxScreen", "fullScreenThumbnailScreen", "webViewBottomSheetScreen", "privacyWebViewScreen", "conversationHistory", "getConversationHistoryExpectedRoute", "isInternal", RouteHelper.PARAMETER_PAGE, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRaRoute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaRoute.kt\ncom/amazon/alexa/ra/core/ui/navigation/RaRoute$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RaRoute conversationHistory$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "unknown";
            }
            if ((i & 2) != 0) {
                str2 = String.valueOf(SystemClock.elapsedRealtime());
            }
            return companion.conversationHistory(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RouteBehavior conversationHistory$lambda$3(String str, Bundle bundle, String str2, Bundle bundle2) {
            return Intrinsics.areEqual(str, RaRoute.CONVERSATION_HISTORY_FULL_ROUTE) ? RouteBehavior.NO_ACTION : RouteBehavior.ADD_NEW;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r8, r15) == false) goto L79;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final com.amazon.alexa.ra.core.ui.navigation.RaRoute.RouteBehavior conversationScreen$lambda$1(com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, android.os.Bundle r18, java.lang.String r19, android.os.Bundle r20) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.navigation.RaRoute.Companion.conversationScreen$lambda$1(com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.lang.String, android.os.Bundle):com.amazon.alexa.ra.core.ui.navigation.RaRoute$RouteBehavior");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RouteBehavior overFlowScreen$lambda$2(String str, Bundle bundle, String str2, Bundle bundle2) {
            return Intrinsics.areEqual(str, "overflow") ? RouteBehavior.NO_ACTION : RouteBehavior.ADD_NEW;
        }

        @NotNull
        public final RaRoute cameraPermissionScreen() {
            return new RaRouteData(RaRoute.CAMERA_PERMISSION, RaRoute.CAMERA_PERMISSION, null, 4, null);
        }

        @NotNull
        public final RaRoute conversationHistory(@NotNull String referer, @NotNull String startTimestamp) {
            referer.getClass();
            startTimestamp.getClass();
            return new RaRouteData(RaRoute.CONVERSATION_HISTORY_FULL_ROUTE, getConversationHistoryExpectedRoute(referer, startTimestamp), new RaRoute$$ExternalSyntheticLambda0(3));
        }

        @NotNull
        public final RaRoute conversationScreen(@Nullable final String conversationId, @Nullable String referer, @Nullable String startTimestamp, @Nullable String hint, @Nullable String startingState, @Nullable String uri, @NotNull String hintTextOperation, @Nullable String universalPrivacyCode, @Nullable String enterAnimationType, @Nullable final String targetFragmentTimestamp, @Nullable SuggestionUiTheme suggestionUiTheme, boolean hideAttachButton, boolean hideOverflowMenu, boolean hideContextualMenu, boolean enableSpeechResponseAlways, @Nullable final String itemId, @NotNull final ConversationIdStoreApi conversationIdStore, @Nullable InputBarUiConfig inputBarUiConfig) {
            hintTextOperation.getClass();
            conversationIdStore.getClass();
            return new RaRouteData(RaRoute.CONVERSATION_FULL_ROUTE, getExpectedRoute(conversationId == null ? "" : conversationId, referer == null ? "unknown" : referer, startTimestamp == null ? String.valueOf(SystemClock.elapsedRealtime()) : startTimestamp, hint == null ? "" : hint, startingState == null ? "text" : startingState, uri == null ? "" : uri, hintTextOperation, universalPrivacyCode == null ? "" : universalPrivacyCode, enterAnimationType == null ? "" : enterAnimationType, targetFragmentTimestamp == null ? "" : targetFragmentTimestamp, String.valueOf(suggestionUiTheme), String.valueOf(inputBarUiConfig != null ? !inputBarUiConfig.getArtifact().getEnableFileUpload() : hideAttachButton), String.valueOf(hideOverflowMenu), String.valueOf(hideContextualMenu), String.valueOf(enableSpeechResponseAlways), itemId == null ? "" : itemId), new Function4() { // from class: com.amazon.alexa.ra.core.ui.navigation.RaRoute$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    RaRoute.RouteBehavior conversationScreen$lambda$1;
                    conversationScreen$lambda$1 = RaRoute.Companion.conversationScreen$lambda$1(ConversationIdStoreApi.this, conversationId, itemId, targetFragmentTimestamp, (String) obj, (Bundle) obj2, (String) obj3, (Bundle) obj4);
                    return conversationScreen$lambda$1;
                }
            });
        }

        @NotNull
        public final RaRoute fullScreenThumbnailScreen() {
            return new RaRouteData(RaRoute.FULL_SCREEN_THUMBNAIL, RaRoute.FULL_SCREEN_THUMBNAIL, null, 4, null);
        }

        @NotNull
        public final String getConversationHistoryExpectedRoute(@NotNull String referer, @NotNull String startTimestamp) {
            String replace$default;
            String replace$default2;
            referer.getClass();
            startTimestamp.getClass();
            replace$default = StringsKt__StringsJVMKt.replace$default(RaRoute.CONVERSATION_HISTORY_FULL_ROUTE, RaRoute.CONVERSATION_ARG_REFERER_DEEPLINK, referer, false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, RaRoute.CONVERSATION_ARG_START_TIME_STAMP_DEEPLINK, startTimestamp, false, 4, (Object) null);
            return replace$default2;
        }

        @NotNull
        public final String getExpectedRoute(@NotNull String conversationId, @NotNull String referer, @NotNull String startTimestamp, @NotNull String hint, @NotNull String startingState, @NotNull String uri, @NotNull String hintTextOperation, @NotNull String universalPrivacyCode, @NotNull String enterAnimationType, @NotNull String targetFragmentTimestamp, @NotNull String suggestionUiTheme, @NotNull String hideAttachButton, @NotNull String hideOverflowMenu, @NotNull String hideContextualMenu, @NotNull String enableSpeechResponseAlways, @NotNull String itemId) {
            String replace$default;
            String replace$default2;
            String replace$default3;
            String replace$default4;
            String replace$default5;
            String replace$default6;
            String replace$default7;
            String replace$default8;
            String replace$default9;
            String replace$default10;
            String replace$default11;
            String replace$default12;
            String replace$default13;
            String replace$default14;
            String replace$default15;
            String replace$default16;
            Automotive$$ExternalSyntheticOutline0.m(conversationId, referer, startTimestamp, hint, startingState);
            Automotive$$ExternalSyntheticOutline0.m(uri, hintTextOperation, universalPrivacyCode, enterAnimationType, targetFragmentTimestamp);
            Automotive$$ExternalSyntheticOutline0.m(suggestionUiTheme, hideAttachButton, hideOverflowMenu, hideContextualMenu, enableSpeechResponseAlways);
            itemId.getClass();
            replace$default = StringsKt__StringsJVMKt.replace$default(RaRoute.CONVERSATION_FULL_ROUTE, RaRoute.CONVERSATION_ARG_CONVERSATION_ID_DEEPLINK, conversationId, false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, RaRoute.CONVERSATION_ARG_REFERER_DEEPLINK, referer, false, 4, (Object) null);
            replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, RaRoute.CONVERSATION_ARG_START_TIME_STAMP_DEEPLINK, startTimestamp, false, 4, (Object) null);
            String encode = Uri.encode(hint);
            encode.getClass();
            replace$default4 = StringsKt__StringsJVMKt.replace$default(replace$default3, RaRoute.CONVERSATION_ARG_HINT_DEEPLINK, encode, false, 4, (Object) null);
            replace$default5 = StringsKt__StringsJVMKt.replace$default(replace$default4, RaRoute.CONVERSATION_ARG_STARTING_STATE_DEEPLINK, startingState, false, 4, (Object) null);
            replace$default6 = StringsKt__StringsJVMKt.replace$default(replace$default5, RaRoute.CONVERSATION_ARG_SHARE_IN_URI_DEEPLINK, uri, false, 4, (Object) null);
            replace$default7 = StringsKt__StringsJVMKt.replace$default(replace$default6, RaRoute.CONVERSATION_ARG_HINT_OPERATION_DEEPLINK, hintTextOperation, false, 4, (Object) null);
            replace$default8 = StringsKt__StringsJVMKt.replace$default(replace$default7, RaRoute.CONVERSATION_ARG_UNIVERSAL_PRIVACY_CODE_DEEPLINK, universalPrivacyCode, false, 4, (Object) null);
            replace$default9 = StringsKt__StringsJVMKt.replace$default(replace$default8, RaRoute.CONVERSATION_ARG_ENTER_ANIMATION_TYPE_DEEPLINK, enterAnimationType, false, 4, (Object) null);
            replace$default10 = StringsKt__StringsJVMKt.replace$default(replace$default9, RaRoute.CONVERSATION_ARG_TARGET_FRAGMENT_TIME_DEEPLINK, targetFragmentTimestamp, false, 4, (Object) null);
            replace$default11 = StringsKt__StringsJVMKt.replace$default(replace$default10, RaRoute.CONVERSATION_ARG_SUGGESTION_THEME_DEEPLINK, suggestionUiTheme, false, 4, (Object) null);
            replace$default12 = StringsKt__StringsJVMKt.replace$default(replace$default11, RaRoute.CONVERSATION_ARG_HIDE_ATTACH_BUTTON_DEEPLINK, hideAttachButton, false, 4, (Object) null);
            replace$default13 = StringsKt__StringsJVMKt.replace$default(replace$default12, RaRoute.CONVERSATION_ARG_HIDE_OVERFLOW_MENU_DEEPLINK, hideOverflowMenu, false, 4, (Object) null);
            replace$default14 = StringsKt__StringsJVMKt.replace$default(replace$default13, RaRoute.CONVERSATION_ARG_HIDE_CONTEXTUAL_MENU_DEEPLINK, hideContextualMenu, false, 4, (Object) null);
            replace$default15 = StringsKt__StringsJVMKt.replace$default(replace$default14, RaRoute.CONVERSATION_ARG_ENABLE_SPEECH_RESPONSE_ALWAYS_DEEPLINK, enableSpeechResponseAlways, false, 4, (Object) null);
            String encode2 = Uri.encode(itemId);
            encode2.getClass();
            replace$default16 = StringsKt__StringsJVMKt.replace$default(replace$default15, RaRoute.CONVERSATION_ARG_ITEM_ID_DEEPLINK, encode2, false, 4, (Object) null);
            return replace$default16;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        public final boolean isInternal(@NotNull String page) {
            page.getClass();
            switch (page.hashCode()) {
                case 95979254:
                    if (!page.equals(RaRoute.LIGHTBOX_SCREEN)) {
                    }
                    break;
                case 529642498:
                    if (!page.equals("overflow")) {
                    }
                    break;
                case 740154499:
                    if (!page.equals("conversation")) {
                    }
                    break;
                case 831063044:
                    if (!page.equals(RaRoute.MICROPHONE_PERMISSION)) {
                    }
                    break;
                case 926934164:
                    if (!page.equals("history")) {
                    }
                    break;
                case 1263543214:
                    if (!page.equals(RaRoute.OVERFLOW_DROPDOWN)) {
                    }
                    break;
            }
            return true;
        }

        @NotNull
        public final RaRoute lightBoxScreen() {
            return new RaRouteData(RaRoute.LIGHTBOX_SCREEN, RaRoute.LIGHTBOX_SCREEN, null, 4, null);
        }

        @NotNull
        public final RaRoute liveModeLearnMoreScreen() {
            return new RaRouteData(RaRoute.LIVE_MODE_LEARN_MORE, RaRoute.LIVE_MODE_LEARN_MORE, null, 4, null);
        }

        @NotNull
        public final RaRoute microphonePermissionScreen() {
            return new RaRouteData(RaRoute.MICROPHONE_PERMISSION, RaRoute.MICROPHONE_PERMISSION, null, 4, null);
        }

        @NotNull
        public final RaRoute overFlowDropdownScreen() {
            return new RaRouteData(RaRoute.OVERFLOW_DROPDOWN, RaRoute.OVERFLOW_DROPDOWN, null, 4, null);
        }

        @NotNull
        public final RaRoute overFlowScreen() {
            return new RaRouteData("overflow", "overflow", new RaRoute$$ExternalSyntheticLambda0(4));
        }

        @NotNull
        public final RaRoute privacyWebViewScreen() {
            return new RaRouteData(RaRoute.PRIVACY_WEBVIEW, RaRoute.PRIVACY_WEBVIEW, null, 4, null);
        }

        @NotNull
        public final RaRoute startDestination() {
            return new RaRouteData(RaRoute.SPLASH_SCREEN, RaRoute.SPLASH_SCREEN, null, 4, null);
        }

        @NotNull
        public final RaRoute webViewBottomSheetScreen() {
            return new RaRouteData(RaRoute.WEBVIEW_BOTTOM_SHEET, RaRoute.WEBVIEW_BOTTOM_SHEET, null, 4, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RaRoute(String str, String str2, Function4<? super String, ? super Bundle, ? super String, ? super Bundle, ? extends RouteBehavior> function4) {
        this.route = str;
        this.fullRoute = str2;
        this.getBehavior = function4;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012j\b\u0002\u0010\u0005\u001ad\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003Jp\u0010\u0018\u001ad\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006HÀ\u0003¢\u0006\u0002\b\u0019J\u0089\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032j\b\u0002\u0010\u0005\u001ad\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012Rv\u0010\u0005\u001ad\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute$RaRouteData;", "Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute;", "route", "", "fullRoute", "getBehavior", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", RouteDataHandler.CURRENT_ROUTE_KEY, "Landroid/os/Bundle;", "currentArgs", "existingRouteFromBackstack", "existingArgsFromBackstack", "Lcom/amazon/alexa/ra/core/ui/navigation/RaRoute$RouteBehavior;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "getRoute", "()Ljava/lang/String;", "getFullRoute", "getGetBehavior$ui_core_release", "()Lkotlin/jvm/functions/Function4;", "component1", "component2", "component3", "component3$ui_core_release", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RaRouteData extends RaRoute {
        public static final int $stable = 0;

        @NotNull
        private final String fullRoute;

        @NotNull
        private final Function4<String, Bundle, String, Bundle, RouteBehavior> getBehavior;

        @NotNull
        private final String route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RaRouteData(@NotNull String str, @NotNull String str2, @NotNull Function4<? super String, ? super Bundle, ? super String, ? super Bundle, ? extends RouteBehavior> function4) {
            super(str, str2, function4, null);
            str.getClass();
            str2.getClass();
            function4.getClass();
            this.route = str;
            this.fullRoute = str2;
            this.getBehavior = function4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RouteBehavior _init_$lambda$0(String str, Bundle bundle, String str2, Bundle bundle2) {
            return RouteBehavior.ADD_NEW;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RaRouteData copy$default(RaRouteData raRouteData, String str, String str2, Function4 function4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = raRouteData.route;
            }
            if ((i & 2) != 0) {
                str2 = raRouteData.fullRoute;
            }
            if ((i & 4) != 0) {
                function4 = raRouteData.getBehavior;
            }
            return raRouteData.copy(str, str2, function4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getFullRoute() {
            return this.fullRoute;
        }

        @NotNull
        public final Function4<String, Bundle, String, Bundle, RouteBehavior> component3$ui_core_release() {
            return this.getBehavior;
        }

        @NotNull
        public final RaRouteData copy(@NotNull String route, @NotNull String fullRoute, @NotNull Function4<? super String, ? super Bundle, ? super String, ? super Bundle, ? extends RouteBehavior> getBehavior) {
            route.getClass();
            fullRoute.getClass();
            getBehavior.getClass();
            return new RaRouteData(route, fullRoute, getBehavior);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RaRouteData)) {
                return false;
            }
            RaRouteData raRouteData = (RaRouteData) other;
            return Intrinsics.areEqual(this.route, raRouteData.route) && Intrinsics.areEqual(this.fullRoute, raRouteData.fullRoute) && Intrinsics.areEqual(this.getBehavior, raRouteData.getBehavior);
        }

        @Override // com.amazon.alexa.ra.core.ui.navigation.RaRoute
        @NotNull
        public String getFullRoute() {
            return this.fullRoute;
        }

        @Override // com.amazon.alexa.ra.core.ui.navigation.RaRoute
        @NotNull
        public Function4<String, Bundle, String, Bundle, RouteBehavior> getGetBehavior$ui_core_release() {
            return this.getBehavior;
        }

        @Override // com.amazon.alexa.ra.core.ui.navigation.RaRoute
        @NotNull
        public String getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.getBehavior.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.route.hashCode() * 31, 31, this.fullRoute);
        }

        @NotNull
        public String toString() {
            String str = this.route;
            String str2 = this.fullRoute;
            Function4<String, Bundle, String, Bundle, RouteBehavior> function4 = this.getBehavior;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("RaRouteData(route=", str, ", fullRoute=", str2, ", getBehavior=");
            m.append(function4);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }

        public /* synthetic */ RaRouteData(String str, String str2, Function4 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? new RaRoute$$ExternalSyntheticLambda0(5) : function4);
        }
    }

    public /* synthetic */ RaRoute(String str, String str2, Function4 function4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, function4);
    }
}
