package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {
    private final Clock clock;
    private final Map<Priority, SchedulerConfig.ConfigValue> values;

    public AutoValue_SchedulerConfig(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        if (clock == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null clock");
            throw null;
        }
        this.clock = clock;
        if (map != null) {
            this.values = map;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null values");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            if (this.clock.equals(schedulerConfig.getClock()) && this.values.equals(schedulerConfig.getValues())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.ConfigValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() ^ ((this.clock.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.clock);
        sb.append(", values=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.values, StringSubstitutor.DEFAULT_VAR_END);
    }
}
