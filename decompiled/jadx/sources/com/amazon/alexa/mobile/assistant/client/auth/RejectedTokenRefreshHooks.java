package com.amazon.alexa.mobile.assistant.client.auth;

import android.os.Process;
import android.os.SystemClock;
import com.amazon.alexa.assistant.foundation.metric.model.Metric;
import com.amazon.alexa.assistant.toolkit.networkConnectivityMonitor.NetworkState;
import com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/RejectedTokenRefreshHooks;", "", "isForcedRefreshDisabled", "", "recordMetric", "", "metric", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "elapsedRealtime", "", "processStartElapsedRealtime", "networkState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/toolkit/networkConnectivityMonitor/NetworkState;", "getNetworkState", "()Lkotlinx/coroutines/flow/StateFlow;", "networkBlocked", "getNetworkBlocked", "requestStarts", "Lkotlinx/coroutines/flow/Flow;", "getRequestStarts", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface RejectedTokenRefreshHooks {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/RejectedTokenRefreshHooks$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/amazon/alexa/mobile/assistant/client/auth/RejectedTokenRefreshHooks;", "getDEFAULT", "()Lcom/amazon/alexa/mobile/assistant/client/auth/RejectedTokenRefreshHooks;", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final RejectedTokenRefreshHooks DEFAULT = new RejectedTokenRefreshHooks() { // from class: com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks$Companion$DEFAULT$1
            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public long elapsedRealtime() {
                return RejectedTokenRefreshHooks.DefaultImpls.elapsedRealtime(this);
            }

            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public StateFlow<Boolean> getNetworkBlocked() {
                return RejectedTokenRefreshHooks.DefaultImpls.getNetworkBlocked(this);
            }

            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public StateFlow<NetworkState> getNetworkState() {
                return RejectedTokenRefreshHooks.DefaultImpls.getNetworkState(this);
            }

            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public Flow<Unit> getRequestStarts() {
                return RejectedTokenRefreshHooks.DefaultImpls.getRequestStarts(this);
            }

            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public boolean isForcedRefreshDisabled() {
                return RejectedTokenRefreshHooks.DefaultImpls.isForcedRefreshDisabled(this);
            }

            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public long processStartElapsedRealtime() {
                return RejectedTokenRefreshHooks.DefaultImpls.processStartElapsedRealtime(this);
            }

            @Override // com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshHooks
            public void recordMetric(Metric metric) {
                RejectedTokenRefreshHooks.DefaultImpls.recordMetric(this, metric);
            }
        };

        private Companion() {
        }

        @NotNull
        public final RejectedTokenRefreshHooks getDEFAULT() {
            return DEFAULT;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static long elapsedRealtime(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks) {
            return SystemClock.elapsedRealtime();
        }

        @Nullable
        public static StateFlow<Boolean> getNetworkBlocked(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks) {
            return null;
        }

        @Nullable
        public static StateFlow<NetworkState> getNetworkState(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks) {
            return null;
        }

        @Nullable
        public static Flow<Unit> getRequestStarts(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks) {
            return null;
        }

        public static boolean isForcedRefreshDisabled(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks) {
            return false;
        }

        public static long processStartElapsedRealtime(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks) {
            return Process.getStartElapsedRealtime();
        }

        public static void recordMetric(@NotNull RejectedTokenRefreshHooks rejectedTokenRefreshHooks, @NotNull Metric metric) {
            metric.getClass();
        }
    }

    long elapsedRealtime();

    @Nullable
    StateFlow<Boolean> getNetworkBlocked();

    @Nullable
    StateFlow<NetworkState> getNetworkState();

    @Nullable
    Flow<Unit> getRequestStarts();

    boolean isForcedRefreshDisabled();

    long processStartElapsedRealtime();

    void recordMetric(@NotNull Metric metric);
}
