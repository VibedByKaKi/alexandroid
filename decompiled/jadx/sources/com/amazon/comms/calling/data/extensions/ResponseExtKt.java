package com.amazon.comms.calling.data.extensions;

import com.amazon.comms.calling.foundation.metrics.ApiMetricParams;
import kotlin.Metadata;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"metricToSend", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "Lokhttp3/Response;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ResponseExtKt {
    @NotNull
    public static final ApiMetricParams metricToSend(@NotNull Response response) {
        response.getClass();
        int code = response.code() / 100;
        return code != 1 ? code != 2 ? code != 3 ? code != 4 ? code != 5 ? new ApiMetricParams.Unknown(1, null, 2, null) : new ApiMetricParams.Fault(1, null, 2, null) : new ApiMetricParams.Fail(1, null, 2, null) : new ApiMetricParams.Unknown(1, null, 2, null) : new ApiMetricParams.Success(1) : new ApiMetricParams.Unknown(1, null, 2, null);
    }
}
