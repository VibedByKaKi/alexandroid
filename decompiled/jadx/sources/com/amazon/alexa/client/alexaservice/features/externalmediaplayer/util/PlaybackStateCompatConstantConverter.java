package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.util;

import com.amazon.devicesetupservice.reporting.NetworkState;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PlaybackStateCompatConstantConverter {
    private static final String UNKNOWN_VALUE = "UNKNOWN";
    private static final Map<Integer, String> STATE_MAP = new ImmutableMap.Builder().put(0, "STATE_NONE").put(1, "STATE_STOPPED").put(2, "STATE_PAUSED").put(3, "STATE_PLAYING").put(4, "STATE_FAST_FORWARDING").put(5, "STATE_REWINDING").put(6, "STATE_BUFFERING").put(7, "STATE_ERROR").put(8, NetworkState.STATE_CONNECTING).put(9, "STATE_SKIPPING_TO_PREVIOUS").put(10, "STATE_SKIPPING_TO_NEXT").put(11, "STATE_SKIPPING_TO_QUEUE_ITEM").build();
    private static final Map<Long, String> ACTION_MAP = new ImmutableMap.Builder().put(1L, "ACTION_STOP").put(2L, "ACTION_PAUSE").put(4L, "ACTION_PLAY").put(8L, "ACTION_REWIND").put(16L, "ACTION_SKIP_TO_PREVIOUS").put(32L, "ACTION_SKIP_TO_NEXT").put(64L, "ACTION_FAST_FORWARD").put(128L, "ACTION_SET_RATING").put(256L, "ACTION_SEEK_TO").put(512L, "ACTION_PLAY_PAUSE").put(1024L, "ACTION_PLAY_FROM_MEDIA_ID").put(2048L, "ACTION_PLAY_FROM_SEARCH").put(4096L, "ACTION_SKIP_TO_QUEUE_ITEM").put(8192L, "ACTION_PLAY_FROM_URI").put(16384L, "ACTION_PREPARE").put(32768L, "ACTION_PREPARE_FROM_MEDIA_ID").put(65536L, "ACTION_PREPARE_FROM_SEARCH").put(131072L, "ACTION_PREPARE_FROM_URI").put(262144L, "ACTION_SET_REPEAT_MODE").put(524288L, "ACTION_SET_SHUFFLE_MODE_ENABLED").put(1048576L, "ACTION_SET_CAPTIONING_ENABLED").put(2097152L, "ACTION_SET_SHUFFLE_MODE").build();
    private static final Map<Integer, String> ERROR_MAP = new ImmutableMap.Builder().put(0, "ERROR_CODE_UNKNOWN_ERROR").put(1, "ERROR_CODE_APP_ERROR").put(2, "ERROR_CODE_NOT_SUPPORTED").put(3, "ERROR_CODE_AUTHENTICATION_EXPIRED").put(4, "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED").put(5, "ERROR_CODE_CONCURRENT_STREAM_LIMIT").put(6, "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED").put(7, "ERROR_CODE_NOT_AVAILABLE_IN_REGION").put(8, "ERROR_CODE_CONTENT_ALREADY_PLAYING").put(9, "ERROR_CODE_SKIP_LIMIT_REACHED").put(10, "ERROR_CODE_ACTION_ABORTED").put(11, "ERROR_CODE_END_OF_QUEUE").build();

    public static String getAction(long j) {
        Map<Long, String> map = ACTION_MAP;
        return map.containsKey(Long.valueOf(j)) ? map.get(Long.valueOf(j)) : "UNKNOWN";
    }

    public static String getError(int i) {
        Map<Integer, String> map = ERROR_MAP;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "UNKNOWN";
    }

    public static String getState(int i) {
        Map<Integer, String> map = STATE_MAP;
        return map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "UNKNOWN";
    }
}
