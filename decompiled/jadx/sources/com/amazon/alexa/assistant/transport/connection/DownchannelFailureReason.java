package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.model.MetricName;
import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;
import com.amazon.minerva.client.thirdparty.transport.UploadResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/DownchannelFailureReason;", "", "value", "", "initFailedMetric", "Lcom/amazon/alexa/assistant/transport/model/MetricName;", "errorResponseMetric", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/amazon/alexa/assistant/transport/model/MetricName;Lcom/amazon/alexa/assistant/transport/model/MetricName;)V", "getValue", "()Ljava/lang/String;", "getInitFailedMetric", "()Lcom/amazon/alexa/assistant/transport/model/MetricName;", "getErrorResponseMetric", "CANCELLED", "NO_INTERNET_CONNECTION", UploadResult.SERVER_ERROR, ErrorConstants.UNAUTHORIZED, "CLIENT_CONNECTION_ERROR", "UNKNOWN_NETWORK_ERROR", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DownchannelFailureReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DownchannelFailureReason[] $VALUES;

    @NotNull
    private final MetricName errorResponseMetric;

    @NotNull
    private final MetricName initFailedMetric;

    @NotNull
    private final String value;
    public static final DownchannelFailureReason CANCELLED = new DownchannelFailureReason("CANCELLED", 0, "CANCELLED", MetricName.DOWNCHANNEL_FAILURE_CANCELLATION_EXCEPTION, MetricName.DOWNCHANNEL_FAILURE_REASON_ERROR_RESPONSE_CANCELLED_ERROR);
    public static final DownchannelFailureReason NO_INTERNET_CONNECTION = new DownchannelFailureReason("NO_INTERNET_CONNECTION", 1, "NO_INTERNET_CONNECTION", MetricName.DOWNCHANNEL_FAILURE_REASON_INIT_FAILED_NO_INTERNET_CONNECTION_ERROR, MetricName.DOWNCHANNEL_FAILURE_REASON_ERROR_RESPONSE_NO_INTERNET_CONNECTION_ERROR);
    public static final DownchannelFailureReason SERVER_ERROR = new DownchannelFailureReason(UploadResult.SERVER_ERROR, 2, UploadResult.SERVER_ERROR, MetricName.DOWNCHANNEL_FAILURE_REASON_INIT_FAILED_SERVER_ERROR, MetricName.DOWNCHANNEL_FAILURE_REASON_ERROR_RESPONSE_SERVER_ERROR);
    public static final DownchannelFailureReason UNAUTHORIZED = new DownchannelFailureReason(ErrorConstants.UNAUTHORIZED, 3, ErrorConstants.UNAUTHORIZED, MetricName.DOWNCHANNEL_FAILURE_REASON_INIT_FAILED_UNAUTHORIZED_ERROR, MetricName.DOWNCHANNEL_FAILURE_REASON_ERROR_RESPONSE_UNAUTHORIZED_ERROR);
    public static final DownchannelFailureReason CLIENT_CONNECTION_ERROR = new DownchannelFailureReason("CLIENT_CONNECTION_ERROR", 4, "CLIENT_CONNECTION_ERROR", MetricName.DOWNCHANNEL_FAILURE_REASON_INIT_FAILED_CLIENT_CONNECTION_ERROR, MetricName.DOWNCHANNEL_FAILURE_REASON_ERROR_RESPONSE_CLIENT_CONNECTION_ERROR);
    public static final DownchannelFailureReason UNKNOWN_NETWORK_ERROR = new DownchannelFailureReason("UNKNOWN_NETWORK_ERROR", 5, "UNKNOWN_NETWORK_ERROR", MetricName.DOWNCHANNEL_FAILURE_REASON_INIT_FAILED_UNKNOWN_NETWORK_ERROR, MetricName.DOWNCHANNEL_FAILURE_REASON_ERROR_RESPONSE_UNKNOWN_NETWORK_ERROR);

    private static final /* synthetic */ DownchannelFailureReason[] $values() {
        return new DownchannelFailureReason[]{CANCELLED, NO_INTERNET_CONNECTION, SERVER_ERROR, UNAUTHORIZED, CLIENT_CONNECTION_ERROR, UNKNOWN_NETWORK_ERROR};
    }

    static {
        DownchannelFailureReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DownchannelFailureReason(String str, int i, String str2, MetricName metricName, MetricName metricName2) {
        this.value = str2;
        this.initFailedMetric = metricName;
        this.errorResponseMetric = metricName2;
    }

    @NotNull
    public static EnumEntries<DownchannelFailureReason> getEntries() {
        return $ENTRIES;
    }

    public static DownchannelFailureReason valueOf(String str) {
        return (DownchannelFailureReason) Enum.valueOf(DownchannelFailureReason.class, str);
    }

    public static DownchannelFailureReason[] values() {
        return (DownchannelFailureReason[]) $VALUES.clone();
    }

    @NotNull
    public final MetricName getErrorResponseMetric() {
        return this.errorResponseMetric;
    }

    @NotNull
    public final MetricName getInitFailedMetric() {
        return this.initFailedMetric;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
