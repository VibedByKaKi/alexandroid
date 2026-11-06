package com.amazon.comms.calling.foundation.metrics;

import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiResult;", "", "<init>", "()V", "SUCCESS", "Lcom/amazon/comms/calling/foundation/metrics/Counters;", "getSUCCESS", "()Lcom/amazon/comms/calling/foundation/metrics/Counters;", "FAIL", "getFAIL", "FAULT", "getFAULT", "UNKNOWN", "getUNKNOWN", VisualShareErrorType.NETWORK, "getNETWORK", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ApiResult {

    @NotNull
    public static final ApiResult INSTANCE = new ApiResult();

    @NotNull
    private static final Counters SUCCESS = new Counters(1, 0, 0, 0, 0);

    @NotNull
    private static final Counters FAIL = new Counters(0, 0, 0, 1, 0);

    @NotNull
    private static final Counters FAULT = new Counters(0, 1, 0, 0, 0);

    @NotNull
    private static final Counters UNKNOWN = new Counters(0, 0, 1, 0, 0);

    @NotNull
    private static final Counters NETWORK = new Counters(0, 0, 0, 0, 1);

    private ApiResult() {
    }

    @NotNull
    public final Counters getFAIL() {
        return FAIL;
    }

    @NotNull
    public final Counters getFAULT() {
        return FAULT;
    }

    @NotNull
    public final Counters getNETWORK() {
        return NETWORK;
    }

    @NotNull
    public final Counters getSUCCESS() {
        return SUCCESS;
    }

    @NotNull
    public final Counters getUNKNOWN() {
        return UNKNOWN;
    }
}
