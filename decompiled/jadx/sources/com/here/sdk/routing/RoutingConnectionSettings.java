package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RoutingConnectionSettings {

    @NonNull
    public Duration initialConnectionTimeout = Duration.ofSeconds(5);

    @NonNull
    public Duration connectionTimeoutRetryIncrease = Duration.ofSeconds(10);

    @NonNull
    public Duration initialTransferTimeout = Duration.ofSeconds(10);

    @NonNull
    public Duration transferTimeoutRetryIncrease = Duration.ofSeconds(2);
    public int maxRetryCount = 3;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoutingConnectionSettings)) {
            return false;
        }
        RoutingConnectionSettings routingConnectionSettings = (RoutingConnectionSettings) obj;
        return Objects.equals(this.initialConnectionTimeout, routingConnectionSettings.initialConnectionTimeout) && Objects.equals(this.connectionTimeoutRetryIncrease, routingConnectionSettings.connectionTimeoutRetryIncrease) && Objects.equals(this.initialTransferTimeout, routingConnectionSettings.initialTransferTimeout) && Objects.equals(this.transferTimeoutRetryIncrease, routingConnectionSettings.transferTimeoutRetryIncrease) && this.maxRetryCount == routingConnectionSettings.maxRetryCount;
    }

    public int hashCode() {
        Duration duration = this.initialConnectionTimeout;
        int hashCode = (JfifUtil.MARKER_EOI + (duration != null ? duration.hashCode() : 0)) * 31;
        Duration duration2 = this.connectionTimeoutRetryIncrease;
        int hashCode2 = (hashCode + (duration2 != null ? duration2.hashCode() : 0)) * 31;
        Duration duration3 = this.initialTransferTimeout;
        int hashCode3 = (hashCode2 + (duration3 != null ? duration3.hashCode() : 0)) * 31;
        Duration duration4 = this.transferTimeoutRetryIncrease;
        return ((hashCode3 + (duration4 != null ? duration4.hashCode() : 0)) * 31) + this.maxRetryCount;
    }
}
