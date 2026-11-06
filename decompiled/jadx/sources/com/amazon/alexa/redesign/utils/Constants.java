package com.amazon.alexa.redesign.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.metrics.InteractionLabel;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\\\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020iX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R!\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0084\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0088\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u000f\u0010\u008b\u0001\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0088\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0095\u0001"}, d2 = {"Lcom/amazon/alexa/redesign/utils/Constants;", "", "<init>", "()V", "HOME_CHANNEL_NATIVE", "", "IMAGE_TYPE_ICON", "MIN_DURATION_FOR_VIEW", "", "MIN_PERC_MINI_TEMPLATE", "", "TWA_MAX_REQUEST_COUNT", "", "SKELETON", "SERVICES_CAN_START_TIMEOUT", "VIEW_UPDATE_TYPE_SKELETON", "VIEW_UPDATE_TYPE_MOTION_ANIMATION", "VIEW_UPDATE_TYPE_CACHE", "VIEW_UPDATE_TYPE_SERVER", "VIEW_UPDATE_TYPE_PULLREFRESH", "VIEW_UPDATE_TYPE_ERROR_PAGE_RETRY", "VIEW_UPDATE_TYPE_REFRESH_BUTTON", "VIEW_UPDATE_TYPE_EVENT_BUS", "VIEW_UPDATE_TYPE_QUICK_ACTIONS_DISMISS", "VIEW_UPDATE_TYPE_NEXT_PAGE", "VIEW_CONTROLLER_TAG", "OPEN_HOME_BOTTOM_SHEET_EVENT_BUS", "HOME_REFRESH_EVENT_BUS", "SERVICES_CAN_START", "HOME_TTC_COMPLETE", "NOTICE_BANNER_UPDATE", "FTUX_NOT_ELIGIBLE", "FTUX_FORWARD_STARTED", "AGENT_NOT_ELIGIBLE", "AGENT_FORWARD_STARTED", "AGENT_FORWARD_DISMISSED", "HOME_REDESIGN_TOUR_SKIP", "HOME_REDESIGN_TOUR_START", "WBS_DISPLAYED_EVENT", "TOUR_PERSISTENCE_QUERY_EVENT", "TOUR_PERSISTENCE_RESPONSE_EVENT", "FTUX_STATE_QUERY_EVENT", "FTUX_STATE_RESPONSE_EVENT", "FTUX_STATE_WRITE_EVENT", "FTUX_STATE_WRITTEN_EVENT", "UNIVERSAL_DEVICE_PICKER_ROUTE", "CONVERSATION_VIEW_STATE_CLOSE", "BOTTOM_NAV_BAR_REDESIGN_LAUNCH", "BOTTOM_NAV_BAR_REDESIGN_EXP", "FOUNDATION_NAMESPACE", "HOME_NAMESPACE", "HOME_SERVICE_NAMESPACE", "EMIT_NETWORK_METRICS", Constants.ALEXA_CH_HOME_DEPRECATE_P13_EXPERIMENT, "ALEXA_IDENTITY_NAMESPACE", "YOUR_PROFILE_INGRESS", "PROFILE_CHANGE_LISTENER", "PARTIAL_REFRESH", "LSO", "SHAKE_TO_FEEDBACK", Constants.AGENT_FORWARD_DRAWER_ANDROID, "CACHE_FIRST", "CARD_STUDIO_NATIVE_DATA", "CARD_STUDIO_NATIVE_FIRST_PAGE", "CARD_STUDIO_CONTROL_NATIVE_CACHE_HEAD", "ALEXA_SUBSCRIPTIONS_GROWTH_MOBILE_NAMESPACE", "B_TOUR_COACHMARK_ANDROID", Constants.HOME_HNB_DEFERRED_ANDROID, "HNB_CONDITIONAL_RENDERING", "AGENT_FORWARD_HOME", "AGENT_FORWARD_HOME_CLASSIC", "CARD_STUDIO_KH", "CARD_STUDIO_HOME", "CARD_STUDIO_AGENT_SPACE", "LEO_SERVICE_ACTOR_ACCESS_TOKEN_ANDROID", "APP_REDESIGN_LEO_SERVICE_ACTOR_ACCESS_TOKEN_ANDROID", "AGENT_FORWARD_FAVORITES_DEFAULT", "ALEXA_CH_HOME_AGENT_FORWARD_DYNAMIC_CARDS_ANDROID", Constants.APP_REDESIGN_COACHMARK_TOUR_ANDROID, "APP_REDESIGN_AGENTSPACE_PHASE_ONE_ANDROID", "RA_CONVERSATION_NAMESPACE", "RA_CONVERSATION_CX_PLUGGABLE_FEATURE", "MOSAIC_NAMESPACE", "ASSISTANT_BOTTOM_SHEET_REDESIGN", "EVENT_BUS_ROUTE_REQUEST_FAILED", "NC_DB_ON_REQUEST", "NC_DB_ON_RECEIVE", "HOME_MODES_ANDROID_WEBLAB", "ORBIT_HOME_MODE_IC_ANDROID_WEBLAB", "HOME_MODES_MODE_PROPAGATION_START", "HOME_MODES_MODE_PROPAGATION_STOP", "HOME_MODE_CHANGE_EVENT", "HOME_MODE_TOAST_EVENT", "HOME_MODE_LOCAL_STORAGE_KEY", "MULTI_PREM_NAMESPACE", "MULTI_PREM_USER_INTERFACE", Constants.MULTI_PREM_SUPPORTED_MARKETPLACE, "LFS_NAMESPACE", "LFS_MAPVIEW_3D", "HOME_NAME_CHANGE_EVENT", "HOME_NAME_LOCAL_STORAGE_KEY", "HOME_MODES_ICON_TTS", "HOME_MODES_ICON_TTA", "HOME_MODES_ICON_TTC", "HOME_MODES_ICON_INACTIVE_OPACITY", "", "HOME_MODES_ICON_ACTIVE_OPACITY", "NOTICE_BANNER_WEBLAB", "KEY_DISMISS_CARDS", "KEY_CLICK_TO_DISMISS_CARDS", "HOME_FEED_API", "REQUEST_METHOD_GET", "REQUEST_METHOD_DELETE", "REQUEST_METHOD_POST", "METADATA", "APP_ONLY_STATUS_NAMESPACE", "IS_APP_ONLY", "IS_APP_ONLY_RESPONSE_FIELD", Constants.HOME_SHARED_PREFERENCES, "RETURN_POSITION", "RETURN_OFFSET", Constants.HOME_COACH_MARK_SHARED_PREFERENCES, Constants.HOME_COACH_MARK_TOUR_SEEN_KEY, "COACH_MARK_SDK_TOUR_SEEN_SHARED_PREFERENCES", "QUICK_ADD_ACTION_TYPE", "QUICK_ADD_CONTENT_TYPE", "QUICK_ADD_CONTENT_PROVIDER", "CONTENT_TYPE_FAVORITES", "CONTENT_TYPE_NOTIFICATION_BANNER", "CONTENT_TYPE_AGENT_FORWARD_HOME", "COLLAPSED_ACTIVITY_ITEM_COUNT", "RN_SECTION_TO_CUSTOM_TEMPLATE_ROUTES", "", "getRN_SECTION_TO_CUSTOM_TEMPLATE_ROUTES", "()Ljava/util/Map;", "KH_DEVICE_TYPES", "", "getKH_DEVICE_TYPES", "()Ljava/util/Set;", "BACKGROUND_LOAD_DELAY", "SELF_UPDATING_CONTENT_TYPES", "getSELF_UPDATING_CONTENT_TYPES", "DEFAULT_BENEFIT_NAME", "OVERRIDE", "SPECIAL", "AutomationConstants", "LocationUploadConstants", "CardIds", "AgentForwardHomeConstants", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class Constants {

    @NotNull
    public static final String AGENT_FORWARD_DISMISSED = "agent-forward-bottomsheet::dismissed";

    @NotNull
    public static final String AGENT_FORWARD_DRAWER_ANDROID = "AGENT_FORWARD_DRAWER_ANDROID";

    @NotNull
    public static final String AGENT_FORWARD_FAVORITES_DEFAULT = "ALEXA_CH_HOME_AGENT_FORWARD_FAVORITES_DEFAULT_ANDROID";

    @NotNull
    public static final String AGENT_FORWARD_HOME = "ALEXA_CH_HOME_AGENT_FORWARD_PROTOTYPE_ANDROID";

    @NotNull
    public static final String AGENT_FORWARD_HOME_CLASSIC = "ALEXA_CH_HOME_AGENT_FORWARD_ON_CLASSIC_ANDROID_EXPERIMENT";

    @NotNull
    public static final String AGENT_FORWARD_STARTED = "agent-forward-bottomsheet::opening";

    @NotNull
    public static final String AGENT_NOT_ELIGIBLE = "agent-forward-bottomsheet::not::eligible";

    @NotNull
    public static final String ALEXA_CH_HOME_AGENT_FORWARD_DYNAMIC_CARDS_ANDROID = "ALEXA_CH_HOME_AGENT_FORWARD_DYNAMIC_CARDS_ANDROID";

    @NotNull
    public static final String ALEXA_CH_HOME_DEPRECATE_P13_EXPERIMENT = "ALEXA_CH_HOME_DEPRECATE_P13_EXPERIMENT";

    @NotNull
    public static final String ALEXA_IDENTITY_NAMESPACE = "ALEXA_IDENTITY_EXPERIENCE_FRONTEND";

    @NotNull
    public static final String ALEXA_SUBSCRIPTIONS_GROWTH_MOBILE_NAMESPACE = "ALEXA_SUBSCRIPTIONS_GROWTH_MOBILE";

    @NotNull
    public static final String APP_ONLY_STATUS_NAMESPACE = "AppOnlyStatus";

    @NotNull
    public static final String APP_REDESIGN_AGENTSPACE_PHASE_ONE_ANDROID = "APP_REDESIGN_AGENTSPACE_PHASE_ONE_ANDROID";

    @NotNull
    public static final String APP_REDESIGN_COACHMARK_TOUR_ANDROID = "APP_REDESIGN_COACHMARK_TOUR_ANDROID";

    @NotNull
    public static final String APP_REDESIGN_LEO_SERVICE_ACTOR_ACCESS_TOKEN_ANDROID = "ALEXA_MOBILE_APP_REDESIGN_LEO_SERVICE_ACTOR_ACCESS_TOKEN_ANDROID";

    @NotNull
    public static final String ASSISTANT_BOTTOM_SHEET_REDESIGN = "ALEXA_A4A_ANDROID_BOTTOMSHEET";
    public static final long BACKGROUND_LOAD_DELAY = 2000;

    @NotNull
    public static final String BOTTOM_NAV_BAR_REDESIGN_EXP = "FOUNDATION_ANDROID_BOTTOM_TABBAR_REDESIGN_2";

    @NotNull
    public static final String BOTTOM_NAV_BAR_REDESIGN_LAUNCH = "BOTTOM_NAV_BAR_REDESIGN_LAUNCH";

    @NotNull
    public static final String B_TOUR_COACHMARK_ANDROID = "B_TOUR_COACHMARK_ANDROID";

    @NotNull
    public static final String CACHE_FIRST = "ALEXA_CH_HOME_CACHE_FIRST_ANDROID";

    @NotNull
    public static final String CARD_STUDIO_AGENT_SPACE = "ALEXA_MOBILE_CARD_STUDIO_AGENT_SPACE_ANDROID";

    @NotNull
    public static final String CARD_STUDIO_CONTROL_NATIVE_CACHE_HEAD = "ALEXA_MOBILE_CARD_STUDIO_CONTROL_NATIVE_CACHE_HEAD_ANDROID";

    @NotNull
    public static final String CARD_STUDIO_HOME = "ALEXA_MOBILE_CARD_STUDIO_ANDROID";

    @NotNull
    public static final String CARD_STUDIO_KH = "ALEXA_MOBILE_CARD_STUDIO_KH";

    @NotNull
    public static final String CARD_STUDIO_NATIVE_DATA = "ALEXA_MOBILE_CARD_STUDIO_NATIVE_COSMO_ANDROID";

    @NotNull
    public static final String CARD_STUDIO_NATIVE_FIRST_PAGE = "ALEXA_MOBILE_CARD_STUDIO_NATIVE_FIRST_PAGE_ANDROID";

    @NotNull
    public static final String COACH_MARK_SDK_TOUR_SEEN_SHARED_PREFERENCES = "CoachMarkViewStatus";
    public static final int COLLAPSED_ACTIVITY_ITEM_COUNT = 3;

    @NotNull
    public static final String CONTENT_TYPE_AGENT_FORWARD_HOME = "AgentForwardHome";

    @NotNull
    public static final String CONTENT_TYPE_NOTIFICATION_BANNER = "HomeNotificationBanner";

    @NotNull
    public static final String CONVERSATION_VIEW_STATE_CLOSE = "conversation::view::close";

    @NotNull
    public static final String DEFAULT_BENEFIT_NAME = "alexa_premium_default";

    @NotNull
    public static final String EMIT_NETWORK_METRICS = "ALEXA_CH_HOME_EMIT_NETWORK_METRICS_ANDROID";

    @NotNull
    public static final String EVENT_BUS_ROUTE_REQUEST_FAILED = "request:home:native-route:failed";

    @NotNull
    public static final String FOUNDATION_NAMESPACE = "AlexaMobileFoundationAndroid";

    @NotNull
    public static final String FTUX_FORWARD_STARTED = "preview::ftux::setup::starting";

    @NotNull
    public static final String FTUX_NOT_ELIGIBLE = "preview::ftux::setup::not::eligible";

    @NotNull
    public static final String FTUX_STATE_QUERY_EVENT = "home:ftux:state:query";

    @NotNull
    public static final String FTUX_STATE_RESPONSE_EVENT = "home:ftux:state:response";

    @NotNull
    public static final String FTUX_STATE_WRITE_EVENT = "home:ftux:state:write";

    @NotNull
    public static final String FTUX_STATE_WRITTEN_EVENT = "home:ftux:state:written";

    @NotNull
    public static final String HNB_CONDITIONAL_RENDERING = "ALEXA_CH_HOME_OMIT_HNB_IF_NO_UNREAD_NOTIFICATIONS_ANDROID";

    @NotNull
    public static final String HOME_CHANNEL_NATIVE = "HomeChannelNative: ";

    @NotNull
    public static final String HOME_COACH_MARK_SHARED_PREFERENCES = "HOME_COACH_MARK_SHARED_PREFERENCES";

    @NotNull
    public static final String HOME_COACH_MARK_TOUR_SEEN_KEY = "HOME_COACH_MARK_TOUR_SEEN_KEY";

    @NotNull
    public static final String HOME_FEED_API = "/api/content";

    @NotNull
    public static final String HOME_HNB_DEFERRED_ANDROID = "HOME_HNB_DEFERRED_ANDROID";

    @NotNull
    public static final String HOME_MODES_ANDROID_WEBLAB = "ALEXA_HOME_MODES_V2_ANDROID";
    public static final float HOME_MODES_ICON_ACTIVE_OPACITY = 1.0f;
    public static final float HOME_MODES_ICON_INACTIVE_OPACITY = 0.3f;

    @NotNull
    public static final String HOME_MODES_ICON_TTA = "HomeModesIcon_TimeToAction";

    @NotNull
    public static final String HOME_MODES_ICON_TTC = "HomeModesIcon_TimeToComplete";

    @NotNull
    public static final String HOME_MODES_ICON_TTS = "HomeModesIcon_TimeToStub";

    @NotNull
    public static final String HOME_MODES_MODE_PROPAGATION_START = "homemodes:modePropagation:start";

    @NotNull
    public static final String HOME_MODES_MODE_PROPAGATION_STOP = "homemodes:modePropagation:stop";

    @NotNull
    public static final String HOME_MODE_CHANGE_EVENT = "homemodes:notifyIconChanged";

    @NotNull
    public static final String HOME_MODE_LOCAL_STORAGE_KEY = "HOME_MODES_STATE";

    @NotNull
    public static final String HOME_MODE_TOAST_EVENT = "homemodes:showToast";

    @NotNull
    public static final String HOME_NAMESPACE = "ALEXA_MOBILE_HOME_FRONTEND";

    @NotNull
    public static final String HOME_NAME_CHANGE_EVENT = "spaces:premisesChanged";

    @NotNull
    public static final String HOME_NAME_LOCAL_STORAGE_KEY = "SELECTED_PREMISES_KEY";

    @NotNull
    public static final String HOME_REDESIGN_TOUR_SKIP = "home:redesign:tour:skip";

    @NotNull
    public static final String HOME_REDESIGN_TOUR_START = "home:redesign:tour:start";

    @NotNull
    public static final String HOME_REFRESH_EVENT_BUS = "home::refresh";

    @NotNull
    public static final String HOME_SERVICE_NAMESPACE = "ALEXA_MOBILE_HOME_SERVICE";

    @NotNull
    public static final String HOME_SHARED_PREFERENCES = "HOME_SHARED_PREFERENCES";

    @NotNull
    public static final String HOME_TTC_COMPLETE = "home:ttc:complete";

    @NotNull
    public static final String IMAGE_TYPE_ICON = "Icon";

    @NotNull
    public static final String IS_APP_ONLY = "isAppOnly";

    @NotNull
    public static final String IS_APP_ONLY_RESPONSE_FIELD = "appOnly";

    @NotNull
    public static final String KEY_CLICK_TO_DISMISS_CARDS = "clickToDismissCardId";

    @NotNull
    public static final String KEY_DISMISS_CARDS = "dismissCardId";

    @NotNull
    public static final String LEO_SERVICE_ACTOR_ACCESS_TOKEN_ANDROID = "ALEXA_MOBILE_LEO_SERVICE_ACTOR_ACCESS_TOKEN_ANDROID";

    @NotNull
    public static final String LFS_MAPVIEW_3D = "ALEXA_MOBILE_FEATURE_LFS_MAPVIEW_3D";

    @NotNull
    public static final String LFS_NAMESPACE = "ALEXA_MOBILE_FEATURE_LFS";

    @NotNull
    public static final String LSO = "ALEXA_CH_HOME_LSO_ANDROID";

    @NotNull
    public static final String METADATA = "metadata";
    public static final double MIN_PERC_MINI_TEMPLATE = 1.0d;

    @NotNull
    public static final String MOSAIC_NAMESPACE = "AlexaMobileAssistantMosaic";

    @NotNull
    public static final String MULTI_PREM_NAMESPACE = "ALEXA_MULTI_PREMISES";

    @NotNull
    public static final String MULTI_PREM_SUPPORTED_MARKETPLACE = "MULTI_PREM_SUPPORTED_MARKETPLACE";

    @NotNull
    public static final String MULTI_PREM_USER_INTERFACE = "USER_INTERFACE";

    @NotNull
    public static final String NC_DB_ON_RECEIVE = "notificationCenter:onReceive";

    @NotNull
    public static final String NC_DB_ON_REQUEST = "notificationCenter:onRequest";

    @NotNull
    public static final String NOTICE_BANNER_UPDATE = "home:notice:banner:update";

    @NotNull
    public static final String NOTICE_BANNER_WEBLAB = "ALEXA_MOBILE_HOME_NOTICE_BANNER_ANDROID";

    @NotNull
    public static final String OPEN_HOME_BOTTOM_SHEET_EVENT_BUS = "open:home:bottom:sheet";

    @NotNull
    public static final String ORBIT_HOME_MODE_IC_ANDROID_WEBLAB = "ORBIT_HOME_MODE_IC_ANDROID";

    @NotNull
    public static final String OVERRIDE = "Override";

    @NotNull
    public static final String PARTIAL_REFRESH = "ALEXA_MOBILE_HOME_B_PARTIAL_REFRESH_ANDROID_LAUNCH";

    @NotNull
    public static final String PROFILE_CHANGE_LISTENER = "ALEXA_MOBILE_HOME_PROFILE_CHANGE_LISTENER_ANDROID";

    @NotNull
    public static final String QUICK_ADD_ACTION_TYPE = "QuickAddIngressAction";

    @NotNull
    public static final String QUICK_ADD_CONTENT_PROVIDER = "QuickAdd";

    @NotNull
    public static final String QUICK_ADD_CONTENT_TYPE = "QuickAddIngress";

    @NotNull
    public static final String RA_CONVERSATION_CX_PLUGGABLE_FEATURE = "ALEXA_ANDROID_CONVERSATION_CX_PLUGGABLE";

    @NotNull
    public static final String RA_CONVERSATION_NAMESPACE = "AlexaVoiceAndroidConversationUIMiscellaneous";

    @NotNull
    public static final String REQUEST_METHOD_DELETE = "DELETE";

    @NotNull
    public static final String REQUEST_METHOD_GET = "GET";

    @NotNull
    public static final String REQUEST_METHOD_POST = "POST";

    @NotNull
    public static final String RETURN_OFFSET = "returnOffset";

    @NotNull
    public static final String RETURN_POSITION = "returnPosition";

    @NotNull
    public static final String SERVICES_CAN_START = "servicesCanStart";
    public static final long SERVICES_CAN_START_TIMEOUT = 10000;

    @NotNull
    public static final String SHAKE_TO_FEEDBACK = "ALEXA_MOBILE_SHAKE_TO_FEEDBACK";

    @NotNull
    public static final String SKELETON = "skeleton";

    @NotNull
    public static final String SPECIAL = "Special";

    @NotNull
    public static final String TOUR_PERSISTENCE_QUERY_EVENT = "redesign:tour:persistence:query";

    @NotNull
    public static final String TOUR_PERSISTENCE_RESPONSE_EVENT = "redesign:tour:persistence:response";
    public static final int TWA_MAX_REQUEST_COUNT = 10;

    @NotNull
    public static final String UNIVERSAL_DEVICE_PICKER_ROUTE = "universal-device-picker";

    @NotNull
    public static final String VIEW_CONTROLLER_TAG = "HomeRedesignViewCtrlr";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_CACHE = "viewUpdateTypeCache";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_ERROR_PAGE_RETRY = "viewUpdateTypeErrorPageRetry";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_EVENT_BUS = "viewUpdateTypeEventBus";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_MOTION_ANIMATION = "viewUpdateTypeSkeleton";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_NEXT_PAGE = "viewUpdateTypeNextPage";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_PULLREFRESH = "viewUpdateTypePullRefresh";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_QUICK_ACTIONS_DISMISS = "viewUpdateTypeQuickActionsDismiss";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_REFRESH_BUTTON = "viewUpdateTypeRefreshButton";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_SERVER = "viewUpdateTypeServer";

    @NotNull
    public static final String VIEW_UPDATE_TYPE_SKELETON = "viewUpdateTypeSkeleton";

    @NotNull
    public static final String WBS_DISPLAYED_EVENT = "alexa:welcome:tour:BS:displayed";

    @NotNull
    public static final String YOUR_PROFILE_INGRESS = "ALEXA_PROFILE_HOME_HEADER_INGRESS_ANDROID";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @JvmField
    public static final long MIN_DURATION_FOR_VIEW = 2000;

    @NotNull
    private static final Map<String, String> RN_SECTION_TO_CUSTOM_TEMPLATE_ROUTES = MapsKt.mapOf(TuplesKt.to("Favorites", "rn/FavoritesSection"), TuplesKt.to("HomeShortcutBar", "rn/HomeStatusBar"), TuplesKt.to(InteractionLabel.FOR_YOU, "rn/HorizontalHomeSection"), TuplesKt.to("FOR_YOU_CAROUSEL", "rn/HorizontalHomeSection"), TuplesKt.to("ContinueWithAlexa", "rn/VerticalHomeSection"), TuplesKt.to("ForYouSection", "rn/HorizontalHomeSection"), TuplesKt.to("ContinueWithAlexaSection", "rn/VerticalHomeSection"), TuplesKt.to("ForYouSection", "rn/ForYouSection"), TuplesKt.to("ContinueWithAlexaSection", "rn/ContinueWithAlexaSection"));

    @NotNull
    private static final Set<String> KH_DEVICE_TYPES = SetsKt.setOf((Object[]) new String[]{"A2BHP7EZ7CDEIZ", "A1FIA5ZJNVOM6Z", "A3ORLONYQTBTOZ", "A1D9UOSBPO2IVH", "A1NPAGU1M4PA7Z", "A3M7PA8JXKE627"});

    @NotNull
    public static final String CONTENT_TYPE_FAVORITES = "HomeFavorites";

    @NotNull
    private static final Set<String> SELF_UPDATING_CONTENT_TYPES = SetsKt.setOf(CONTENT_TYPE_FAVORITES);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/utils/Constants$AgentForwardHomeConstants;", "", "<init>", "()V", "FULL_SCREEN_INDEX_NONE", "", "TYPE_TO_ALEXA_ROUTE_NO_ENTER_ANIMATION", "", "TAG_BULLSEYE_FAVORITES_DEFAULT", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AgentForwardHomeConstants {
        public static final int $stable = 0;
        public static final int FULL_SCREEN_INDEX_NONE = -1;

        @NotNull
        public static final AgentForwardHomeConstants INSTANCE = new AgentForwardHomeConstants();

        @NotNull
        public static final String TAG_BULLSEYE_FAVORITES_DEFAULT = "Bullseye:FavoritesDefault";

        @NotNull
        public static final String TYPE_TO_ALEXA_ROUTE_NO_ENTER_ANIMATION = "type-to-alexa?enterAnimationType=none";

        private AgentForwardHomeConstants() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/utils/Constants$AutomationConstants;", "", "<init>", "()V", "isQABuild", "", "()Z", "setQABuild", "(Z)V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AutomationConstants {
        private static boolean isQABuild;

        @NotNull
        public static final AutomationConstants INSTANCE = new AutomationConstants();
        public static final int $stable = 8;

        private AutomationConstants() {
        }

        public final boolean isQABuild() {
            return isQABuild;
        }

        public final void setQABuild(boolean z) {
            isQABuild = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/utils/Constants$CardIds;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "AGENT_CARD", "DEVICES_CARD", "FAVORITES_CARD", "PERSONAL_DEVICES_CARD", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CardIds {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CardIds[] $VALUES;
        public static final CardIds AGENT_CARD = new CardIds("AGENT_CARD", 0, "AgentCard");
        public static final CardIds DEVICES_CARD = new CardIds("DEVICES_CARD", 1, "DevicesCard");
        public static final CardIds FAVORITES_CARD = new CardIds("FAVORITES_CARD", 2, "FavoritesCard");
        public static final CardIds PERSONAL_DEVICES_CARD = new CardIds("PERSONAL_DEVICES_CARD", 3, "PersonalDevicesCard");

        @NotNull
        private final String id;

        private static final /* synthetic */ CardIds[] $values() {
            return new CardIds[]{AGENT_CARD, DEVICES_CARD, FAVORITES_CARD, PERSONAL_DEVICES_CARD};
        }

        static {
            CardIds[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private CardIds(String str, int i, String str2) {
            this.id = str2;
        }

        @NotNull
        public static EnumEntries<CardIds> getEntries() {
            return $ENTRIES;
        }

        public static CardIds valueOf(String str) {
            return (CardIds) Enum.valueOf(CardIds.class, str);
        }

        public static CardIds[] values() {
            return (CardIds[]) $VALUES.clone();
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/utils/Constants$LocationUploadConstants;", "", "<init>", "()V", "UPLOAD_INTERVAL", "", com.dee.app.contacts.common.constants.Constants.LOG_TAG, "", "EVENT_REQUEST_TYPE_AVS", "AVS_USAGE_METRIC", "EVENT_REQUEST_TYPE", "ERROR_EVENT_TYPE", "SUCCESS_RESPONSE_TYPE", "LOCATION_FEATURE_NAME", "LOCATION_INTERFACE_NAME", "FULL_FEATURE_ID", "FULL_ERROR_EVENT", "FULL_SUCCESS_EVENT", "HOME_FEATURES_NAMESPACE", "HOME_UPLOAD_LOCATION_FEATURE_FLAG", "METRIC", "METRIC_SUCCESS", "METRIC_FAULT", "METRIC_ERROR", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationUploadConstants {
        public static final int $stable = 0;

        @NotNull
        public static final String AVS_USAGE_METRIC = "usingAvsPath";

        @NotNull
        public static final String ERROR_EVENT_TYPE = "localLocationUpdateErrorResponse";

        @NotNull
        public static final String EVENT_REQUEST_TYPE = "localLocationUpdateRequest";

        @NotNull
        public static final String EVENT_REQUEST_TYPE_AVS = "System.SynchronizeState.Geolocation";

        @NotNull
        public static final String FULL_ERROR_EVENT = "localLocationUpdateErrorResponse::PremiumFeatures";

        @NotNull
        public static final String FULL_FEATURE_ID = "localLocationUpdateRequest::PremiumFeatures";

        @NotNull
        public static final String FULL_SUCCESS_EVENT = "localLocationUpdateResponse::PremiumFeatures";

        @NotNull
        public static final String HOME_FEATURES_NAMESPACE = "ALEXA_MOBILE_HOME_FRONTEND";

        @NotNull
        public static final String HOME_UPLOAD_LOCATION_FEATURE_FLAG = "ALEXA_CH_HOME_UPLOAD_LOCATION_ANDROID";

        @NotNull
        public static final LocationUploadConstants INSTANCE = new LocationUploadConstants();

        @NotNull
        public static final String LOCATION_FEATURE_NAME = "PremiumFeatures";

        @NotNull
        public static final String LOCATION_INTERFACE_NAME = "OneTimePreciseLocation";

        @NotNull
        public static final String METRIC = ".location";

        @NotNull
        public static final String METRIC_ERROR = ".location.error";

        @NotNull
        public static final String METRIC_FAULT = ".location.fault";

        @NotNull
        public static final String METRIC_SUCCESS = ".location.success";

        @NotNull
        public static final String SUCCESS_RESPONSE_TYPE = "localLocationUpdateResponse";

        @NotNull
        public static final String TAG = "HomeRedesignViewController";
        public static final long UPLOAD_INTERVAL = 120000;

        private LocationUploadConstants() {
        }
    }

    private Constants() {
    }

    @NotNull
    public final Set<String> getKH_DEVICE_TYPES() {
        return KH_DEVICE_TYPES;
    }

    @NotNull
    public final Map<String, String> getRN_SECTION_TO_CUSTOM_TEMPLATE_ROUTES() {
        return RN_SECTION_TO_CUSTOM_TEMPLATE_ROUTES;
    }

    @NotNull
    public final Set<String> getSELF_UPDATING_CONTENT_TYPES() {
        return SELF_UPDATING_CONTENT_TYPES;
    }
}
