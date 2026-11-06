package com.amazon.comms.ringservice.webrtc.utils;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.biloba.utils.TimeDateUtils;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.comms.calling.service.MediaStats;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.ringservice.webrtc.StatsReportParser;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WebRTCMediaStatsUtils {
    protected static final String EMPTY_STRING = "Empty";
    private static final Pattern IP4;
    private static final Pattern IP6;
    private static final int IPV6_ADDRESS_SEGMENT_SIZE = 8;
    private static final String LABEL_LOCAL_CANDIDATE_REGION = "googLocalAddress";
    private static final String LABEL_LOCAL_CANDIDATE_TYPE = "googLocalCandidateType";
    private static final String LABEL_REMOTE_CANDIDATE_REGION = "googRemoteAddress";
    private static final String LABEL_REMOTE_CANDIDATE_TYPE = "googRemoteCandidateType";
    private static final String SENSITIVE_MESSAGE_REPLACEMENT = "*****";
    private static final Pattern[] SENSITIVE_PATTERNS;
    private static final CommsLogger log = CommsLogger.getLogger(WebRTCMediaStatsUtils.class);

    static {
        Pattern compile = Pattern.compile("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+");
        IP4 = compile;
        Pattern compile2 = Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))");
        IP6 = compile2;
        SENSITIVE_PATTERNS = new Pattern[]{compile, compile2};
    }

    private static List<String> expandIpv6Address(String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(":")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(new String[8]));
        for (int i = 0; i < arrayList2.size(); i++) {
            arrayList2.set(i, TimeDateUtils.DAY_START);
        }
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((String) arrayList.get(i3)).isEmpty() && !z) {
                i2 = 8 - ((arrayList.size() - i3) - 1);
                z = true;
            } else if (!((String) arrayList.get(i3)).isEmpty()) {
                arrayList2.set(i2, String.format("%4s", arrayList.get(i3)).replace(' ', '0'));
                i2++;
            }
        }
        return arrayList2;
    }

    public static String filterSensitiveMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        for (Pattern pattern : SENSITIVE_PATTERNS) {
            str = pattern.matcher(str).replaceAll(SENSITIVE_MESSAGE_REPLACEMENT);
        }
        return str;
    }

    @Nullable
    public static String getLocalConnectionRegion(@NonNull Map<String, String> map) {
        return maskAndEncodeIpAddressWithBase64(map.get(LABEL_LOCAL_CANDIDATE_REGION));
    }

    @Nullable
    public static String getLocalConnectionType(@NonNull MediaStats mediaStats) {
        List<Map<String, String>> findActiveCandidatePairs = StatsReportParser.findActiveCandidatePairs(mediaStats.getMediaStats());
        if (!findActiveCandidatePairs.isEmpty()) {
            return getLocalConnectionType(findActiveCandidatePairs.get(0));
        }
        log.w("Not active candidate found. Return empty string.");
        return EMPTY_STRING;
    }

    @Nullable
    public static String getRemoteConnectionRegion(@NonNull Map<String, String> map) {
        return maskAndEncodeIpAddressWithBase64(map.get(LABEL_REMOTE_CANDIDATE_REGION));
    }

    @Nullable
    public static String getRemoteConnectionType(@NonNull MediaStats mediaStats) {
        List<Map<String, String>> findActiveCandidatePairs = StatsReportParser.findActiveCandidatePairs(mediaStats.getMediaStats());
        if (!findActiveCandidatePairs.isEmpty()) {
            return getRemoteConnectionType(findActiveCandidatePairs.get(0));
        }
        log.w("Not active candidate found. Return empty string.");
        return EMPTY_STRING;
    }

    private static String maskAndEncodeIPv4(String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(ArcusConfig.PATH_SEPARATOR)));
        if (arrayList.size() != 4) {
            log.w("Invalid format: IPv4 address received does not contain correct segments size. Return empty string as result.");
            return EMPTY_STRING;
        }
        arrayList.set(3, Constants.FEEDBACK_TYPE_DISLIKE);
        return Base64.encodeToString(TextUtils.join(".", arrayList).getBytes(StandardCharsets.UTF_8), 2);
    }

    private static String maskAndEncodeIPv6(String str) {
        int indexOf = str.indexOf(91);
        int indexOf2 = str.indexOf(93);
        if (indexOf == -1 || indexOf2 == -1) {
            log.w("Invalid format: IPv6 address reported by WebRTC must be enclosed in square brackets. Return empty string as result.");
            return EMPTY_STRING;
        }
        List<String> expandIpv6Address = expandIpv6Address(str.substring(indexOf + 1, indexOf2));
        expandIpv6Address.set(7, TimeDateUtils.DAY_START);
        return Base64.encodeToString(TextUtils.join(":", expandIpv6Address).getBytes(StandardCharsets.UTF_8), 2);
    }

    private static String maskAndEncodeIpAddressWithBase64(String str) {
        if (str == null || str.isEmpty()) {
            log.w("IpAddress string is empty when masking and encoding. Return empty string as result.");
            return EMPTY_STRING;
        }
        if (str.contains(".")) {
            return maskAndEncodeIPv4(str);
        }
        if (str.contains(":")) {
            return maskAndEncodeIPv6(str);
        }
        log.w("IpAddress string format is not recoginzed. Return empty string as result.");
        return EMPTY_STRING;
    }

    @Nullable
    public static String getLocalConnectionType(@NonNull Map<String, String> map) {
        return map.get(LABEL_LOCAL_CANDIDATE_TYPE);
    }

    @Nullable
    public static String getRemoteConnectionType(@NonNull Map<String, String> map) {
        return map.get(LABEL_REMOTE_CANDIDATE_TYPE);
    }
}
