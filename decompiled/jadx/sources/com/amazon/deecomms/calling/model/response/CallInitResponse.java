package com.amazon.deecomms.calling.model.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.calling.util.HttpStatusCodeFamily;
import com.amazon.deecomms.calling.util.SetupCallHelper;
import com.amazon.deecomms.common.metrics.MetricsStatsProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallInitResponse implements MetricsStatsProvider {
    private final Long callDuration;
    private final HttpStatusCodeFamily family;
    private final Integer httpStatusCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.calling.model.response.CallInitResponse$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$calling$util$SetupCallHelper$ResultType;

        static {
            int[] iArr = new int[SetupCallHelper.ResultType.values().length];
            $SwitchMap$com$amazon$deecomms$calling$util$SetupCallHelper$ResultType = iArr;
            try {
                iArr[SetupCallHelper.ResultType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$SetupCallHelper$ResultType[SetupCallHelper.ResultType.EXPECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$SetupCallHelper$ResultType[SetupCallHelper.ResultType.UNEXPECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$util$SetupCallHelper$ResultType[SetupCallHelper.ResultType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CallInitResponse(@Nullable Integer num, @Nullable Long l, @NonNull SetupCallHelper.ResultType resultType) {
        this.httpStatusCode = num;
        this.callDuration = l;
        this.family = getResponseFamily(resultType);
    }

    private HttpStatusCodeFamily getResponseFamily(SetupCallHelper.ResultType resultType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$deecomms$calling$util$SetupCallHelper$ResultType[resultType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? HttpStatusCodeFamily.UNKNOWN : HttpStatusCodeFamily.SERVER_ERROR : HttpStatusCodeFamily.CLIENT_ERROR : HttpStatusCodeFamily.SUCCESS;
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public Long getCallDuration() {
        return this.callDuration;
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public int getFailureCount() {
        return this.family.getFailureCount();
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public int getFaultCount() {
        return this.family.getFaultCount();
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public Integer getHttpResponseCode() {
        return this.httpStatusCode;
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public String getRequestId() {
        return null;
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public int getSuccessCount() {
        return this.family.getSuccessCount();
    }

    @Override // com.amazon.deecomms.common.metrics.MetricsStatsProvider
    public int getUnknownCount() {
        return this.family.getUnknownCount();
    }

    public CallInitResponse(@Nullable Integer num, @NonNull SetupCallHelper.ResultType resultType) {
        this(num, null, resultType);
    }
}
