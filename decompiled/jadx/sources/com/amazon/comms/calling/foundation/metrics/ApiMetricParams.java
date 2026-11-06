package com.amazon.comms.calling.foundation.metrics;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "", "<init>", "()V", "Success", "Fault", "Unknown", "Fail", AlexaMetricsConstants.EventConstants.NETWORK, "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Fail;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Fault;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Network;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Success;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Unknown;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class ApiMetricParams {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Success;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "counter", "", "<init>", "(I)V", "getCounter", "()I", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Success extends ApiMetricParams {
        private final int counter;

        public Success(int i) {
            super(null);
            this.counter = i;
        }

        public final int getCounter() {
            return this.counter;
        }
    }

    public /* synthetic */ ApiMetricParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiMetricParams() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Fail;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "counter", "", "errorInfo", "Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "<init>", "(ILcom/amazon/comms/calling/foundation/metrics/ErrorInfo;)V", "getCounter", "()I", "getErrorInfo", "()Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fail extends ApiMetricParams {
        private final int counter;

        @Nullable
        private final ErrorInfo errorInfo;

        public /* synthetic */ Fail(int i, ErrorInfo errorInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : errorInfo);
        }

        public final int getCounter() {
            return this.counter;
        }

        @Nullable
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public Fail(int i, @Nullable ErrorInfo errorInfo) {
            super(null);
            this.counter = i;
            this.errorInfo = errorInfo;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Fault;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "counter", "", "errorInfo", "Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "<init>", "(ILcom/amazon/comms/calling/foundation/metrics/ErrorInfo;)V", "getCounter", "()I", "getErrorInfo", "()Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fault extends ApiMetricParams {
        private final int counter;

        @Nullable
        private final ErrorInfo errorInfo;

        public /* synthetic */ Fault(int i, ErrorInfo errorInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : errorInfo);
        }

        public final int getCounter() {
            return this.counter;
        }

        @Nullable
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public Fault(int i, @Nullable ErrorInfo errorInfo) {
            super(null);
            this.counter = i;
            this.errorInfo = errorInfo;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Network;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "counter", "", "errorInfo", "Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "<init>", "(ILcom/amazon/comms/calling/foundation/metrics/ErrorInfo;)V", "getCounter", "()I", "getErrorInfo", "()Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Network extends ApiMetricParams {
        private final int counter;

        @Nullable
        private final ErrorInfo errorInfo;

        public /* synthetic */ Network(int i, ErrorInfo errorInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : errorInfo);
        }

        public final int getCounter() {
            return this.counter;
        }

        @Nullable
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public Network(int i, @Nullable ErrorInfo errorInfo) {
            super(null);
            this.counter = i;
            this.errorInfo = errorInfo;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams$Unknown;", "Lcom/amazon/comms/calling/foundation/metrics/ApiMetricParams;", "counter", "", "errorInfo", "Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "<init>", "(ILcom/amazon/comms/calling/foundation/metrics/ErrorInfo;)V", "getCounter", "()I", "getErrorInfo", "()Lcom/amazon/comms/calling/foundation/metrics/ErrorInfo;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unknown extends ApiMetricParams {
        private final int counter;

        @Nullable
        private final ErrorInfo errorInfo;

        public /* synthetic */ Unknown(int i, ErrorInfo errorInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : errorInfo);
        }

        public final int getCounter() {
            return this.counter;
        }

        @Nullable
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public Unknown(int i, @Nullable ErrorInfo errorInfo) {
            super(null);
            this.counter = i;
            this.errorInfo = errorInfo;
        }
    }
}
