package com.amazon.alexa.voice.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.alexa.ra.core.metrics.InvocationType;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.voice.ui.internal.Logger;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RouteHelper {
    public static final Set<String> ALLOWLISTED_REFERERS_FOR_AUTOSEND = ImmutableSet.of("mobile-for-you", InvocationType.HFS_FOR_YOU, InvocationType.FIRST_TIME_USER_EXPERIENCE, "mobile-you-might-like", "notificationcard", "kitchen-personal-recipe", "kitchen-meal-plans", InvocationType.AGENT_FORWARD_BOTTOM_SHEET_SUGGESTION, "kids-blocked-suggestion", "tablet-home", "new-route", "tasks-smart-actions", "redesign-alexa-plus-feedback", "pulse-suggestions", "daily-digest");
    public static final String CONVERSATION_HISTORY_PAGE = "history";
    public static final String CONVERSATION_PAGE = "conversation";
    public static final String LIVE_MODE_STARTING_STATE = "liveMode";
    private static final String NAME_VALUE_SEPARATOR = "=";
    public static final String PARAMETER_CONVERSATION_ID = "conversationId";
    public static final String PARAMETER_CONV_ID = "conversationID";
    public static final String PARAMETER_ENTER_ANIMATION_TYPE = "enterAnimationType";
    public static final String PARAMETER_EVENT_START_TIME = "eventStartTime";
    public static final String PARAMETER_HINT = "hint";
    public static final String PARAMETER_INVOKING_COMPONENT = "invokingComponent";
    public static final String PARAMETER_ITEM_ID = "itemId";
    public static final String PARAMETER_OPEN_SHARE_SHEET_ON_LAUNCH = "openShareSheetOnLaunch";
    public static final String PARAMETER_PAGE = "page";
    public static final String PARAMETER_REFERER = "referer";
    public static final String PARAMETER_ROUTE_ORIGIN = "routeOrigin";
    private static final String PARAMETER_SEPARATOR = "&";
    public static final String PARAMETER_STARTING_STATE = "startingState";
    public static final String PARAMETER_START_TIMESTAMP = "startTimestamp";
    public static final String PARAMETER_TARGET_FRAGMENT_TIMESTAMP = "targetFragmentTimestamp";
    public static final String PARAMETER_UNIVERSAL_PRIVACY_CODE = "universalPrivacyCode";
    public static final String PARAMETER_URI = "uri";
    public static final String REFERER_LIVE_MODE = "LiveMode";
    public static final String ROUTE_ORIGIN_EXTERNAL = "external";
    public static final String SKIP_FTUE = "skipFtue";
    private static final String TAG = "RouteHelper";
    public static final String TEXT_STARTING_STATE = "text";
    public static final String TEXT_STARTING_STATE_AUTO_SEND = "textAutoSend";
    public static final String VOICE_STARTING_STATE = "voice";

    private RouteHelper() {
    }

    public static long convertCurrentMillisToElapseTimeStamp(TimeProvider timeProvider, String str) {
        long elapsedRealTime = timeProvider.elapsedRealTime();
        if (!isNumeric(str)) {
            return elapsedRealTime;
        }
        try {
            return timeProvider.elapsedRealTime() - (timeProvider.currentTimeMillis() - Long.parseLong(str));
        } catch (Exception e) {
            Logger.error("convertCurrentMillisToElapseTimeStamp: Error parsing startTimestamp using current elapsed time stamp as default!", e);
            return elapsedRealTime;
        }
    }

    public static String getReferer(Map<String, String> map) {
        String str = map.get("referer");
        if (str != null) {
            return str;
        }
        map.put("referer", "UNKNOWN");
        return "UNKNOWN";
    }

    public static TimeProvider getTimeProvider() {
        return new TimeProvider();
    }

    public static boolean isNumeric(String str) {
        return StringUtils.isNumeric(str);
    }

    public static boolean isRaRoute(Route route) {
        if (route != null) {
            return route.is("alexa-conversations") || route.is("alexa-conversations/view") || route.is("alexa-conversations/new") || route.is("conversation/{conversationId}");
        }
        return false;
    }

    public static Map<String, String> parseQueryParameters(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : Uri.decode(str).split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }
}
