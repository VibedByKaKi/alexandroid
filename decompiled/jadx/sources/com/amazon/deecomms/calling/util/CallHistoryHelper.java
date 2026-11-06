package com.amazon.deecomms.calling.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.calling.service.Call;
import com.amazon.deecomms.calling.enums.CallType;
import com.amazon.deecomms.calling.model.CallQualityMetricsModel;
import com.amazon.deecomms.calling.model.CallingMetricsModel;
import com.amazon.deecomms.contacts.model.ContactPhoneNumber;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallHistoryHelper {
    private static final int HISTORY_MAX_SIZE = 10;
    private static final int HISTORY_TTL_IN_MINS = 240;
    public static final int MISSING_CALL_STATUS_CODE = -1;
    private final Cache<String, Info> CACHE = CacheBuilder.newBuilder().maximumSize(10).expireAfterAccess(240, TimeUnit.MINUTES).build();

    @NonNull
    private Info getOrCreateCallInfo(@NonNull String str) {
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent != null) {
            return ifPresent;
        }
        Info info = new Info(0);
        this.CACHE.put(str, info);
        return info;
    }

    public void answeredCall(@NonNull String str) {
        Info.m21893$$Nest$fputansweredCall(getOrCreateCallInfo(str));
    }

    public boolean didUserAnswerCall(@NonNull String str) {
        Boolean bool;
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent == null || (bool = ifPresent.answeredCall) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean didUserEndCall(@NonNull String str) {
        Boolean bool;
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent == null || (bool = ifPresent.userEndedCall) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Nullable
    public String getCallConnectionType(@NonNull String str) {
        String str2;
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent == null || (str2 = ifPresent.connectionType) == null) {
            return null;
        }
        return str2;
    }

    @NonNull
    public String getCallProvider(@NonNull String str) {
        String str2;
        Info ifPresent = this.CACHE.getIfPresent(str);
        return (ifPresent == null || (str2 = ifPresent.callProvider) == null) ? "" : str2;
    }

    @Nullable
    public CallQualityMetricsModel getCallQualityMetrics(@NonNull String str) {
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent != null) {
            return ifPresent.callQualityMetrics;
        }
        return null;
    }

    public int getCallStatusCode(String str) {
        Integer num;
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent == null || (num = ifPresent.statusCode) == null) {
            return -1;
        }
        return num.intValue();
    }

    @NonNull
    public CallType getCallType(@NonNull String str) {
        CallType callType;
        Info ifPresent = this.CACHE.getIfPresent(str);
        return (ifPresent == null || (callType = ifPresent.callType) == null) ? CallType.NONE : callType;
    }

    @Nullable
    public ContactPhoneNumber getCalleePhoneNumber(@NonNull String str) {
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent != null) {
            return ifPresent.calleePhoneNumber;
        }
        return null;
    }

    @Nullable
    public CallingMetricsModel getCallingMetrics(@NonNull String str) {
        Info ifPresent = this.CACHE.getIfPresent(str);
        if (ifPresent != null) {
            return ifPresent.callingMetrics;
        }
        return null;
    }

    public void keepAlive(@NonNull String str) {
        this.CACHE.getIfPresent(str);
    }

    public boolean setCallConnectionType(@NonNull Call call) {
        String connectionType = CallUtils.getConnectionType(call);
        Info orCreateCallInfo = getOrCreateCallInfo(call.getCallId());
        if (TextUtils.isEmpty(connectionType) || TextUtils.equals(connectionType, orCreateCallInfo.connectionType)) {
            return false;
        }
        getOrCreateCallInfo(call.getCallId()).connectionType = connectionType;
        return true;
    }

    public void setCallInitMetricsWereRecorded(@NonNull String str, boolean z) {
        getOrCreateCallInfo(str).callInitMetricsWereRecorded = z;
    }

    public void setCallProvider(@NonNull String str, @NonNull String str2) {
        getOrCreateCallInfo(str).callProvider = str2;
    }

    public void setCallQualityMetrics(@NonNull CallQualityMetricsModel callQualityMetricsModel) {
        getOrCreateCallInfo(callQualityMetricsModel.getCallId()).callQualityMetrics = callQualityMetricsModel;
    }

    public void setCallStatusCode(@NonNull String str, int i) {
        getOrCreateCallInfo(str).statusCode = Integer.valueOf(i);
    }

    public void setCallType(@NonNull String str, @NonNull CallType callType) {
        getOrCreateCallInfo(str).callType = callType;
    }

    public void setCalleePhoneNumber(@NonNull String str, @NonNull ContactPhoneNumber contactPhoneNumber) {
        getOrCreateCallInfo(str).calleePhoneNumber = contactPhoneNumber;
    }

    public void setCallingMetrics(@NonNull CallingMetricsModel callingMetricsModel) {
        getOrCreateCallInfo(callingMetricsModel.getCallId()).callingMetrics = callingMetricsModel;
    }

    public void userEndedCall(@NonNull String str) {
        Info.m21902$$Nest$fputuserEndedCall(getOrCreateCallInfo(str));
    }

    public boolean wereCallInitMetricsRecorded(@NonNull String str) {
        Info ifPresent = this.CACHE.getIfPresent(str);
        return ifPresent != null && ifPresent.callInitMetricsWereRecorded;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Info {
        private Boolean answeredCall;
        private boolean callInitMetricsWereRecorded;
        private String callProvider;
        private CallQualityMetricsModel callQualityMetrics;
        private CallType callType;
        private ContactPhoneNumber calleePhoneNumber;
        private CallingMetricsModel callingMetrics;
        private String connectionType;
        private Integer statusCode;
        private Boolean userEndedCall;

        /* renamed from: -$$Nest$fputansweredCall, reason: not valid java name */
        public static /* bridge */ /* synthetic */ void m21893$$Nest$fputansweredCall(Info info) {
            info.answeredCall = Boolean.TRUE;
        }

        /* renamed from: -$$Nest$fputuserEndedCall, reason: not valid java name */
        public static /* bridge */ /* synthetic */ void m21902$$Nest$fputuserEndedCall(Info info) {
            info.userEndedCall = Boolean.TRUE;
        }

        public /* synthetic */ Info(int i) {
            this();
        }

        private Info() {
        }
    }

    @Nullable
    public String getCallConnectionType(@NonNull Call call) {
        return getCallConnectionType(call.getCallId());
    }
}
