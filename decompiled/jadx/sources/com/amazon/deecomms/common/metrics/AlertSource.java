package com.amazon.deecomms.common.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.api.metrics.CommsMetric;
import com.amazon.deecomms.common.network.IHttpClient;
import com.amazon.deecomms.common.network.ServiceException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AlertSource {
    private final String operation;
    private final Integer statusCode;
    private final Type type;
    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.common.metrics.AlertSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$common$metrics$AlertSource$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$com$amazon$deecomms$common$metrics$AlertSource$Type = iArr;
            try {
                iArr[Type.RequestId.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$common$metrics$AlertSource$Type[Type.CallId.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$common$metrics$AlertSource$Type[Type.ClassName.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$common$metrics$AlertSource$Type[Type.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        RequestId,
        CallId,
        ClassName,
        Unknown
    }

    private AlertSource(@NonNull Type type, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.type = type;
        this.value = str;
        this.statusCode = num;
        this.operation = str2;
    }

    public static AlertSource newCallSource(@NonNull String str) {
        return new AlertSource(Type.CallId, str);
    }

    public static AlertSource newClassSource(@NonNull Object obj) {
        return newClassSource(obj.getClass().getName());
    }

    public static AlertSource newRequestSource(@NonNull IHttpClient.Response response) {
        IHttpClient.Call call = response.getCall();
        return new AlertSource(Type.RequestId, call.getRequestId(), Integer.valueOf(response.code()), call.getOperationMetricNameRoot());
    }

    public static AlertSource newSource(@NonNull String str) {
        return new AlertSource(Type.Unknown, str);
    }

    public String getOperation() {
        return this.operation;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Type getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setupMetric(@NonNull CommsMetric commsMetric) {
        Map<String, Object> metadata = commsMetric.getMetadata();
        int i = AnonymousClass1.$SwitchMap$com$amazon$deecomms$common$metrics$AlertSource$Type[getType().ordinal()];
        if (i == 1) {
            metadata.put("requestId", getValue());
            metadata.put("source", getOperation());
        } else if (i != 2) {
            metadata.put("source", getValue());
        } else {
            metadata.put("commsItemId", getValue());
        }
        metadata.put("statusCode", this.statusCode);
    }

    private AlertSource(@NonNull Type type, @Nullable String str, @Nullable Integer num) {
        this(type, str, num, null);
    }

    private AlertSource(@NonNull Type type, @Nullable String str, @NonNull String str2) {
        this(type, str, null, str2);
    }

    public static AlertSource newClassSource(@NonNull Class<?> cls) {
        return newClassSource(cls.getName());
    }

    private AlertSource(@NonNull Type type, @NonNull String str) {
        this(type, str, null, null);
    }

    public static AlertSource newClassSource(@NonNull String str) {
        return new AlertSource(Type.ClassName, str);
    }

    public static AlertSource newRequestSource(@NonNull IHttpClient.Call call) {
        return new AlertSource(Type.RequestId, call.getRequestId(), call.getOperationMetricNameRoot());
    }

    public static AlertSource newRequestSource(@NonNull String str) {
        return new AlertSource(Type.RequestId, str);
    }

    public static AlertSource newRequestSource(@NonNull ServiceException serviceException) {
        String requestId = serviceException.getRequestId();
        Type type = Type.RequestId;
        if (requestId == null) {
            requestId = "";
        }
        return new AlertSource(type, requestId, serviceException.getHttpResponseCode());
    }
}
