package com.amazon.deecomms.calling.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.comms.calling.data.repo.accessory.AccessoriesRepositoryImpl;
import com.amazon.comms.calling.service.Call;
import com.amazon.comms.calling.sipclient.SipStatusCode;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.metrics.CommsMetric;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.calling.enums.AssistCspId;
import com.amazon.deecomms.calling.enums.CallType;
import com.amazon.deecomms.calling.model.response.CallInitResponse;
import com.amazon.deecomms.calling.phonecallcontroller.PCCContextProvider;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class SetupCallHelper {
    public static final int CONDITIONAL_REQUEST_FAILED = 412;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, SetupCallHelper.class);
    private static final String FILE_NAME = "SetupCallHelper.java";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.calling.util.SetupCallHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily;

        static {
            int[] iArr = new int[HttpStatusCodeFamily.values().length];
            $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily = iArr;
            try {
                iArr[HttpStatusCodeFamily.INFORMATIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily[HttpStatusCodeFamily.REDIRECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily[HttpStatusCodeFamily.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily[HttpStatusCodeFamily.CLIENT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily[HttpStatusCodeFamily.SERVER_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily[HttpStatusCodeFamily.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DeviceType {
        EchoAuto(AccessoriesRepositoryImpl.ECHO_AUTO),
        Vox("Vox"),
        GUI(AccessoriesRepositoryImpl.GUI);

        private final String name;

        DeviceType(@NonNull String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MetadataBuilder {
        private Call.Side callOrigin;
        private CallType callType;
        private DeviceType deviceType;
        private final Map<String, Object> metadata = Maps.newHashMap();
        private String reason;
        private String requestId;
        private Source source;
        private Transport transport;

        private static StackTraceElement findCallingMethod() {
            Iterator it2 = Arrays.asList(Thread.currentThread().getStackTrace()).iterator();
            while (it2.hasNext()) {
                if (SetupCallHelper.FILE_NAME.equals(((StackTraceElement) it2.next()).getFileName())) {
                    break;
                }
            }
            while (it2.hasNext()) {
                StackTraceElement stackTraceElement = (StackTraceElement) it2.next();
                if (!SetupCallHelper.FILE_NAME.equals(stackTraceElement.getFileName())) {
                    return stackTraceElement;
                }
            }
            return null;
        }

        public static MetadataBuilder newBuilder() {
            return new MetadataBuilder();
        }

        public Map<String, Object> build() {
            HashMap newHashMap = Maps.newHashMap();
            newHashMap.putAll(this.metadata);
            Source source = this.source;
            if (source != null) {
                newHashMap.put("source", source);
            }
            CallType callType = this.callType;
            if (callType != null) {
                newHashMap.put("callType", callType.getMetricValue());
            }
            Call.Side side = this.callOrigin;
            if (side != null) {
                newHashMap.put("direction", CallUtils.getCallSideMetricValue(side));
            }
            String str = this.requestId;
            if (str != null) {
                newHashMap.put("requestId", str);
            }
            DeviceType deviceType = this.deviceType;
            if (deviceType != null) {
                newHashMap.put("DeviceType", deviceType);
            }
            Transport transport = this.transport;
            if (transport != null) {
                newHashMap.put("transport", transport);
            }
            if (this.reason != null) {
                StackTraceElement findCallingMethod = findCallingMethod();
                if (findCallingMethod != null) {
                    newHashMap.put("errorSource", ParcelCompat$$ExternalSyntheticOutline0.m(findCallingMethod.getClassName(), "-", findCallingMethod.getMethodName(), ": ", this.reason));
                    return newHashMap;
                }
                newHashMap.put("errorSource", this.reason);
            }
            return newHashMap;
        }

        public MetadataBuilder withCallOrigin(@NonNull Call.Side side) {
            this.callOrigin = side;
            return this;
        }

        public MetadataBuilder withCallType(@NonNull CallType callType) {
            this.callType = callType;
            return this;
        }

        public MetadataBuilder withDeviceType(@NonNull DeviceType deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public MetadataBuilder withReason(@NonNull String str) {
            this.reason = str;
            return this;
        }

        public MetadataBuilder withRequestId(@NonNull String str) {
            this.requestId = str;
            return this;
        }

        public MetadataBuilder withSource(@NonNull Source source) {
            this.source = source;
            return this;
        }

        public MetadataBuilder withTransport(@NonNull Transport transport) {
            this.transport = transport;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ResultType {
        SUCCESS,
        EXPECTED,
        UNEXPECTED,
        UNKNOWN,
        CANCELLED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Source {
        SipCallPreparation("SipCallPreparation"),
        FetchAor("fetchAOR"),
        FetchStunTurnIce("fetchSTUNTURNICE"),
        Connected("connectedState"),
        Disconnected("disconnectedState"),
        ActivePstnCall("activePSTNCall"),
        ActiveCommsCall("activeCommsCall");

        private final String name;

        Source(@NonNull String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Transport {
        EchoAutoTopologyA(AccessoriesRepositoryImpl.ECHO_AUTO_TOPOLOG_A),
        EchoAutoTopologyB(AccessoriesRepositoryImpl.ECHO_AUTO_TOPOLOG_B),
        EchoAutoTopologyC(AccessoriesRepositoryImpl.ECHO_AUTO_TOPOLOG_C);

        private final String name;

        Transport(@NonNull String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    private SetupCallHelper() {
    }

    public static void addPCCInformationForCalling(@NonNull MetadataBuilder metadataBuilder, boolean z) {
        PCCContextProvider pCCContextProvider = CommsDaggerWrapper.getComponent().getPCCContextProvider();
        if (!z) {
            metadataBuilder.withDeviceType(DeviceType.GUI);
            return;
        }
        if (!Utils.areAccessoriesConnected()) {
            metadataBuilder.withDeviceType(DeviceType.Vox);
            return;
        }
        metadataBuilder.withDeviceType(DeviceType.EchoAuto);
        if (pCCContextProvider.isHFPPCCCompliantAccessorySessionAvailable()) {
            metadataBuilder.withTransport(Transport.EchoAutoTopologyA);
        } else if (pCCContextProvider.isA2DPPCCCompliantAccessorySessionAvailable()) {
            metadataBuilder.withTransport(Transport.EchoAutoTopologyC);
        } else {
            metadataBuilder.withTransport(Transport.EchoAutoTopologyB);
        }
    }

    public static void recordInitiationMetrics(@Nullable String str, @Nullable String str2, @NonNull ResultType resultType, @Nullable Integer num, @NonNull MetadataBuilder metadataBuilder) {
        if (str != null && CallUtils.isCallIdValid(str)) {
            CallHistoryHelper callHistoryHelper = CommsDaggerWrapper.getComponent().getCallHistoryHelper();
            if (callHistoryHelper.wereCallInitMetricsRecorded(str)) {
                LOG.d("Call initiation metrics already recorded for ".concat(str));
                return;
            }
            callHistoryHelper.setCallInitMetricsWereRecorded(str, true);
        }
        Map<String, Object> build = metadataBuilder.build();
        CallType callType = metadataBuilder.callType;
        addPCCInformationForCalling(metadataBuilder, callType != null && callType.isFromVox());
        if (resultType == ResultType.CANCELLED) {
            recordMetrics("comms.call.initiate.cancel", 1.0d, str, num, build);
            return;
        }
        if (num != null) {
            if (num.intValue() == SipStatusCode.TEMPORARILY_UNAVAILABLE.getCode() || num.intValue() == SipStatusCode.BUSY_HERE.getCode() || num.intValue() == SipStatusCode.BUSY_EVERYWHERE.getCode() || num.intValue() == SipStatusCode.DECLINE.getCode() || num.intValue() == SipStatusCode.REQUEST_TERMINATED.getCode()) {
                resultType = ResultType.SUCCESS;
            } else if (num.intValue() == SipStatusCode.SERVICE_UNAVAILABLE.getCode()) {
                resultType = ResultType.EXPECTED;
            } else if (num.intValue() >= 900 && num.intValue() <= 999) {
                int intValue = num.intValue();
                resultType = intValue != 902 ? intValue != 904 ? ResultType.UNEXPECTED : ResultType.EXPECTED : ResultType.EXPECTED;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            build.put("commsItemId", str);
            MetricsHelper.addConnectionType(build, str);
        }
        CallInitResponse callInitResponse = new CallInitResponse(num, resultType);
        CommsMetric.MetricType metricType = CommsMetric.MetricType.ClickStream;
        MetricsHelper.recordApiCallCompleted(metricType, MetricKeys.CALL_INITIATE, callInitResponse, build);
        if (str2 == null || !AssistCspId.isValidCsp(str2)) {
            return;
        }
        MetricsHelper.recordApiCallCompleted(metricType, MetricKeys.ASSIST_CALL, callInitResponse, build);
    }

    private static void recordMetrics(@NonNull String str, double d, @Nullable String str2, @Nullable Integer num, @NonNull Map<String, Object> map) {
        CounterMetric generateClickstream = CounterMetric.generateClickstream(str);
        Map<String, Object> metadata = generateClickstream.getMetadata();
        if (!TextUtils.isEmpty(str2)) {
            metadata.put("commsItemId", str2);
            MetricsHelper.addConnectionType(generateClickstream, str2);
        }
        if (num != null) {
            metadata.put("statusCode", num);
        }
        metadata.putAll(map);
        MetricsHelper.recordCounterMetric(generateClickstream, Double.valueOf(d));
    }

    public static void recordInitiationMetrics(@Nullable String str, @Nullable String str2, @NonNull ResultType resultType, @NonNull MetadataBuilder metadataBuilder) {
        recordInitiationMetrics(str, str2, resultType, null, metadataBuilder);
    }

    public static void recordInitiationMetrics(@Nullable String str, @Nullable String str2, int i, @NonNull MetadataBuilder metadataBuilder) {
        ResultType resultType;
        int i2 = AnonymousClass1.$SwitchMap$com$amazon$deecomms$calling$util$HttpStatusCodeFamily[HttpStatusCodeFamily.familyFromStatusCode(Integer.valueOf(i)).ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            resultType = ResultType.SUCCESS;
        } else if (i2 == 4) {
            resultType = ResultType.EXPECTED;
        } else if (i2 != 5) {
            resultType = ResultType.UNKNOWN;
        } else {
            resultType = ResultType.UNEXPECTED;
        }
        recordInitiationMetrics(str, str2, resultType, Integer.valueOf(i), metadataBuilder);
    }

    public static void recordInitiationMetrics(@Nullable String str, @Nullable String str2, SipStatusCode sipStatusCode, @NonNull MetadataBuilder metadataBuilder) {
        recordInitiationMetrics(str, str2, sipStatusCode.getCode(), metadataBuilder);
    }
}
