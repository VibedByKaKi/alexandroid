package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Constants;", "", "<init>", "()V", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Constants {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTION_ROUTE_FROM_CHAT = "com.amazon.alexa.ra.action.linkout";

    @NotNull
    public static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";

    @NotNull
    public static final String ALEXA_PLUS_PREVIEW_TEXT_ENABLED = "alexaPlusPreviewTextEnabled";
    public static final int ALEXA_PRIVACY = 6;

    @NotNull
    public static final String ALEXA_PRIVACY_URL = "https://www.amazon.com/alexa-privacy/apd/home";

    @NotNull
    public static final String ALEXA_PRIVACY_WEBVIEW_URL = "https://www.amazon.com/alexa-privacy/apd/home?disableGlobalNav=true";
    public static final int ALEXA_SETTINGS = 5;
    public static final float ANIMATION_PROGRESS_COMPLETE = 1.0f;
    public static final float ANIMATION_PROGRESS_START = 0.0f;

    @NotNull
    public static final String APLUS_UPSELL_PREFS = "alexa_plus_upsell_prefs";
    public static final int CAMERA_PERMISSION = 1;
    public static final int CHATS = 4;

    @NotNull
    public static final String CONVERSATIONS_HISTORY_SCREEN = "conversationsHistoryScreen";
    public static final long CONVERSATION_APIS_TIMEOUT = 5000;

    @NotNull
    public static final String CONVERSATION_ID_EXTRA = "conversationId";

    @NotNull
    public static final String CONVERSATION_ID_PREFIX = "amzn1.conversation.client.";

    @NotNull
    public static final String CONVERSATION_SCREEN = "conversationScreen";

    @NotNull
    public static final String CONVERSATION_VIEW_STATE_CLOSE = "conversation::view::close";
    public static final long CUSTOM_CONTENT_API_TIMEOUT = 2000;

    @NotNull
    public static final String CUSTOM_PILL_ID = "Custom";

    @NotNull
    public static final String DEEP_LINK_URL = "https://alexa.amazon.com/?fragment=";
    public static final long DEFAULT_START_TIME = 0;

    @NotNull
    public static final String DISPLAY_HINT_PEEK = "PEEK";

    @NotNull
    public static final String DISPLAY_HINT_SHOW = "SHOW";

    @NotNull
    public static final String DOT_OPERATOR = ".";
    public static final float DRAG_THRESHOLD_FRACTION = 0.15f;

    @NotNull
    public static final String EVENT_SOURCE_INITIAL_PAYLOAD = "INITIAL_PAYLOAD";

    @NotNull
    public static final String EVENT_SOURCE_PAGINATION = "PAGINATION";

    @NotNull
    public static final String EXTRA_USE_DYNAMIC_STARTERS = "useDynamicStarters";
    public static final int FEATURE_DISABLED = 0;
    public static final int FEATURE_ENABLED = 1;

    @NotNull
    public static final String FEEDBACK_NEGATIVE_OPTION_ID = "MobileChatFeedbackCampaign_NO";

    @NotNull
    public static final String FEEDBACK_NEGATIVE_OPTION_TEXT = "ThumbsDown";

    @NotNull
    public static final String FEEDBACK_POSITIVE_OPTION_ID = "MobileChatFeedbackCampaign_YES";

    @NotNull
    public static final String FEEDBACK_POSITIVE_OPTION_TEXT = "ThumbsUp";

    @NotNull
    public static final String FEEDBACK_TYPE_DISLIKE = "0";

    @NotNull
    public static final String FEEDBACK_TYPE_EMPTY = "";

    @NotNull
    public static final String FEEDBACK_TYPE_LIKE = "1";
    public static final float FULL_OPACITY = 1.0f;
    public static final float HALF_OPACITY = 0.5f;
    public static final float HEADER_OFFSET_FADE_OUT_THRESHOLD_PX = 1.0f;

    @NotNull
    public static final String HIDE_KEYBOARD_ON_SUBMIT_ENABLED = "hideKeyboardOnSubmitEnabled";

    @NotNull
    public static final String HINT_TEXT_OPERATION_HIDE = "hide";

    @NotNull
    public static final String HINT_TEXT_OPERATION_SEND = "Send";

    @NotNull
    public static final String HINT_TEXT_OPERATION_SHOW = "Show";

    @NotNull
    public static final String IMAGE_TYPE_BACKGROUND = "BACKGROUND";

    @NotNull
    public static final String KEY_APLUS_UPSELL_ELIGIBLE = "aplus_upsell_eligible";

    @NotNull
    public static final String L1_FEEDBACK_INQUIRY_ID = "MobileChatFeedbackCampaign_L1Feedback";

    @NotNull
    public static final String L2_FEEDBACK_INQUIRY_ID = "MobileChatFeedbackCampaign_L2Feedback";

    @NotNull
    public static final String LEARN_MORE_TAG = "LEARN_MORE";
    public static final int MAX_COLD_START_PILLS = 5;
    public static final int MAX_PILLS = 3;
    public static final int MY_CHATS = 2;
    public static final long NBA_FETCH_TIMEOUT = 5000;
    public static final int NEW_CHAT = 1;
    public static final float ORIGIN_CENTER = 0.5f;
    public static final float ORIGIN_END = 1.0f;
    public static final float ORIGIN_START = 0.0f;
    public static final float PEEK_HEIGHT_DEFAULT = 0.62f;
    public static final float PEEK_HEIGHT_MAX = 0.8f;
    public static final float PEEK_HEIGHT_MIN = 0.25f;
    public static final long PERSONALIZED_CONTENT_API_TIMEOUT = 1000;

    @NotNull
    public static final String RA_ACTIVITY_CLASS = "com.amazon.alexa.ra.ui.RaActivity";

    @NotNull
    public static final String RECENT_CHATS_PILL_ID = "RecentChats";

    @NotNull
    public static final String REFERER_ADD_FRAGMENT_DISPLAY_HINT_SHOW = "AddFragmentDirectiveForShow";

    @NotNull
    public static final String REFERER_CONVERSATION_CHANGED = "conversationChanged";

    @NotNull
    public static final String REFERER_DELETION = "deletedConversation";

    @NotNull
    public static final String REFERER_HISTORY = "history";

    @NotNull
    public static final String REFERER_HOME_CARD = "home-card";

    @NotNull
    public static final String REFERER_LIVE_MODE_OPT_IN_NOTIFICATION = "liveModeOptInNotification";

    @NotNull
    public static final String REFERER_MORE_CHANNEL = "more-menu";

    @NotNull
    public static final String REFERER_NEW_CHAT = "ConversationScreenNewChat";

    @NotNull
    public static final String REFERER_OVERFLOW = "overflow";

    @NotNull
    public static final String REFERER_SEND_TO_PHONE = "sendToPhone";

    @NotNull
    public static final String REFERER_SUGGESTION_PILL = "suggestionPill";

    @NotNull
    public static final String ROUTE_TO_ALEXA_DELETE_CONVERSATION_FAQ = "https://www.amazon.com/gp/help/customer/display.html?nodeId=201602230#delete_recordings";

    @NotNull
    public static final String ROUTE_TO_ALEXA_DEVICE_SETTINGS = "v2/voice/handsfree-settings";

    @NotNull
    public static final String ROUTE_TO_ALEXA_FAQ = "https://www.amazon.com/gp/help/customer/display.html?nodeId=201602230";

    @NotNull
    public static final String ROUTE_TO_ALEXA_PRIVACY = "v2/alexa-privacy-dashboard/webview?url=https://www.amazon.com/alexa-privacy/apd/home";

    @NotNull
    public static final String ROUTE_TO_ALEXA_VOICE_RESPONSES = "v2/settings/voice-responses";
    public static final float SCALE_NORMAL = 1.0f;
    public static final float SCALE_UP_5_PERCENT = 1.05f;
    public static final long SCROLL_BUTTON_STATE_DEBOUNCE_THRESHOLD = 200;

    @NotNull
    public static final String SETTINGS_TAG = "SETTINGS";

    @NotNull
    public static final String SHARE_SCREEN_PILL_ID = "ShareScreen";
    public static final long SOFT_INPUT_MODE_LIST_ANIMATION_DELAY = 200;
    public static final int SWIPE_STATE_DOWN = 1;
    public static final int SWIPE_STATE_UP = 0;
    public static final int TEXT_ANIMATION_DISABLED = 0;
    public static final int TEXT_ANIMATION_ENABLED = 1;

    @NotNull
    public static final String TEXT_COMPONENT_SEPARATOR = "\n\n";
    public static final float TRUNCATION_SAFETY_FACTOR = 0.98f;
    public static final int VOICE_RESPONSES = 3;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Integer> hideAlexaLogoLottieResIdList = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.raw.lottie_alexa_logo_a_idle_assets), Integer.valueOf(R.raw.lottie_alexa_logo_a_outro_assets)});

    @NotNull
    private static final List<Integer> showAlexaLogoLottieResIdList = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.raw.lottie_alexa_logo_a_intro_assets), Integer.valueOf(R.raw.lottie_alexa_logo_a_idle_assets)});

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\b#\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020'0H¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020'0H¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u000201X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Constants$Companion;", "", "<init>", "()V", "DEEP_LINK_URL", "", "ROUTE_TO_ALEXA_DEVICE_SETTINGS", "ALEXA_PRIVACY_URL", "ALEXA_PRIVACY_WEBVIEW_URL", "ROUTE_TO_ALEXA_VOICE_RESPONSES", "ACTION_SHOW_RA_UI", "RA_ACTIVITY_CLASS", "CONVERSATION_ID_EXTRA", "EXTRA_USE_DYNAMIC_STARTERS", "ROUTE_TO_ALEXA_PRIVACY", "ROUTE_TO_ALEXA_FAQ", "ROUTE_TO_ALEXA_DELETE_CONVERSATION_FAQ", "REFERER_HISTORY", "REFERER_OVERFLOW", "REFERER_NEW_CHAT", "REFERER_SUGGESTION_PILL", "REFERER_ADD_FRAGMENT_DISPLAY_HINT_SHOW", "REFERER_HOME_CARD", "REFERER_MORE_CHANNEL", "REFERER_SEND_TO_PHONE", "REFERER_LIVE_MODE_OPT_IN_NOTIFICATION", "REFERER_DELETION", "REFERER_CONVERSATION_CHANGED", "CONVERSATION_VIEW_STATE_CLOSE", "CONVERSATIONS_HISTORY_SCREEN", "CONVERSATION_SCREEN", "EVENT_SOURCE_PAGINATION", "EVENT_SOURCE_INITIAL_PAYLOAD", "ACTION_ROUTE_FROM_CHAT", "HIDE_KEYBOARD_ON_SUBMIT_ENABLED", "ALEXA_PLUS_PREVIEW_TEXT_ENABLED", "APLUS_UPSELL_PREFS", "KEY_APLUS_UPSELL_ELIGIBLE", "NEW_CHAT", "", "MY_CHATS", "VOICE_RESPONSES", "CHATS", "ALEXA_SETTINGS", "ALEXA_PRIVACY", "CAMERA_PERMISSION", "TEXT_ANIMATION_DISABLED", "TEXT_ANIMATION_ENABLED", "HALF_OPACITY", "", "FULL_OPACITY", "SCALE_UP_5_PERCENT", "SCALE_NORMAL", "ANIMATION_PROGRESS_START", "ANIMATION_PROGRESS_COMPLETE", "ORIGIN_START", "ORIGIN_CENTER", "ORIGIN_END", "FEATURE_ENABLED", "FEATURE_DISABLED", "PERSONALIZED_CONTENT_API_TIMEOUT", "", "CUSTOM_CONTENT_API_TIMEOUT", "NBA_FETCH_TIMEOUT", "CONVERSATION_APIS_TIMEOUT", "CONVERSATION_ID_PREFIX", "DOT_OPERATOR", "MAX_PILLS", "MAX_COLD_START_PILLS", "SCROLL_BUTTON_STATE_DEBOUNCE_THRESHOLD", "SOFT_INPUT_MODE_LIST_ANIMATION_DELAY", "hideAlexaLogoLottieResIdList", "", "getHideAlexaLogoLottieResIdList", "()Ljava/util/List;", "showAlexaLogoLottieResIdList", "getShowAlexaLogoLottieResIdList", "L1_FEEDBACK_INQUIRY_ID", "L2_FEEDBACK_INQUIRY_ID", "FEEDBACK_POSITIVE_OPTION_ID", "FEEDBACK_NEGATIVE_OPTION_ID", "FEEDBACK_POSITIVE_OPTION_TEXT", "FEEDBACK_NEGATIVE_OPTION_TEXT", "FEEDBACK_TYPE_LIKE", "FEEDBACK_TYPE_DISLIKE", "FEEDBACK_TYPE_EMPTY", "DEFAULT_START_TIME", "SWIPE_STATE_DOWN", "SWIPE_STATE_UP", "HEADER_OFFSET_FADE_OUT_THRESHOLD_PX", "RECENT_CHATS_PILL_ID", "CUSTOM_PILL_ID", "SHARE_SCREEN_PILL_ID", "IMAGE_TYPE_BACKGROUND", "TEXT_COMPONENT_SEPARATOR", "LEARN_MORE_TAG", "SETTINGS_TAG", "TRUNCATION_SAFETY_FACTOR", "PEEK_HEIGHT_DEFAULT", "PEEK_HEIGHT_MIN", "PEEK_HEIGHT_MAX", "DRAG_THRESHOLD_FRACTION", "DISPLAY_HINT_SHOW", "DISPLAY_HINT_PEEK", "HINT_TEXT_OPERATION_SHOW", "HINT_TEXT_OPERATION_HIDE", "HINT_TEXT_OPERATION_SEND", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Integer> getHideAlexaLogoLottieResIdList() {
            return Constants.hideAlexaLogoLottieResIdList;
        }

        @NotNull
        public final List<Integer> getShowAlexaLogoLottieResIdList() {
            return Constants.showAlexaLogoLottieResIdList;
        }

        private Companion() {
        }
    }
}
