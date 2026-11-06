package com.amazon.alexa.assistant.metric;

import com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor.NetworkState;
import com.amazon.alexa.assistant.transport.model.ClientState;
import com.amazon.alexa.assistant.transport.model.ClientStateError;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.devicesetupservice.smarthome.ProtocolType;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0014\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000e\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"transportStateDimension", "", "clientState", "Lcom/amazon/alexa/assistant/transport/model/ClientState;", "boundedExceptionClassName", "error", "", "networkTransportTypeDimension", "networkState", "Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;", "networkValidatedDimension", "durationBucket", "durationMs", "", "(Ljava/lang/Long;)Ljava/lang/String;", "EXCEPTION_CLASS_ALLOWLIST", "", "UNKNOWN_EXCEPTION_OTHER_BUCKET", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MetricContextMapperKt {

    @NotNull
    private static final Set<String> EXCEPTION_CLASS_ALLOWLIST = SetsKt.setOf((Object[]) new String[]{"IOException", "SocketTimeoutException", "UnknownHostException", "SocketException", "ConnectException", "NoRouteToHostException", "SSLException", "StreamResetException", "ConnectionShutdownException", "NotConnectedException", "HttpErrorResponseException", "EventIdleTimeoutException", "InvalidEndpointException", "MalformedStreamException", "ReconnectCancelledException", "TimeoutCancellationException", MetricsConstants.Error.CANCELLATION_EXCEPTION, "IllegalStateException"});

    @NotNull
    private static final String UNKNOWN_EXCEPTION_OTHER_BUCKET = "Other";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkState.values().length];
            try {
                iArr[NetworkState.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkState.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkState.ETHERNET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkState.UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkState.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final String boundedExceptionClassName(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        for (Class<?> cls = th.getClass(); cls != null; cls = cls.getSuperclass()) {
            String simpleName = cls.getSimpleName();
            if (EXCEPTION_CLASS_ALLOWLIST.contains(simpleName)) {
                return simpleName;
            }
        }
        return "Other";
    }

    @Nullable
    public static final String durationBucket(@Nullable Long l) {
        if (l == null || l.longValue() < 0) {
            return null;
        }
        return l.longValue() < 5000 ? "0-5s" : l.longValue() < 30000 ? "5-30s" : l.longValue() < 120000 ? "30-120s" : l.longValue() < 600000 ? "120-600s" : "600s+";
    }

    @Nullable
    public static final String networkTransportTypeDimension(@Nullable NetworkState networkState) {
        int i = networkState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkState.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return ProtocolType.WIFI;
        }
        if (i == 2) {
            return "CELLULAR";
        }
        if (i == 3) {
            return "ETHERNET";
        }
        if (i == 4 || i == 5) {
            return "NONE";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Nullable
    public static final String networkValidatedDimension(@Nullable NetworkState networkState) {
        int i = networkState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkState.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1 || i == 2 || i == 3) {
            return "true";
        }
        if (i == 4) {
            return "false";
        }
        if (i == 5) {
            return null;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Nullable
    public static final String transportStateDimension(@Nullable ClientState clientState) {
        if (clientState == null) {
            return null;
        }
        if (clientState instanceof ClientState.Stopped) {
            return "Stopped";
        }
        if (clientState instanceof ClientState.Disconnected) {
            return "Disconnected";
        }
        if (clientState instanceof ClientState.Connecting) {
            return "Connecting";
        }
        if (clientState instanceof ClientState.Connected) {
            return "Connected";
        }
        if (!(clientState instanceof ClientState.Error)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        ClientStateError error = ((ClientState.Error) clientState).getError();
        if (error instanceof ClientStateError.NoInternetConnection) {
            return "Error(NoInternetConnection)";
        }
        if (error instanceof ClientStateError.InvalidToken) {
            return "Error(InvalidToken)";
        }
        if (error instanceof ClientStateError.NoAuthToken) {
            return "Error(NoAuthToken)";
        }
        if (error instanceof ClientStateError.Other) {
            return "Error(Other)";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
