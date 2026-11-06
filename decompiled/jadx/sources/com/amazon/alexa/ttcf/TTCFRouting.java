package com.amazon.alexa.ttcf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ttcf.api.TTCFRoute;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class TTCFRouting implements TTCFTimedRoute {

    @Nullable
    private Long endTime;

    @NonNull
    private final TTCFRoute route;
    private final long startTime;
    private boolean valid = true;

    public TTCFRouting(@NonNull TTCFRoute tTCFRoute, long j) {
        this.route = tTCFRoute;
        this.startTime = j;
    }

    public void finishAtTime(long j) {
        if (this.endTime == null) {
            this.endTime = Long.valueOf(j);
        }
    }

    @Override // com.amazon.alexa.ttcf.TTCFTimedRoute
    @Nullable
    public Long getEndTime() {
        return this.endTime;
    }

    @Override // com.amazon.alexa.ttcf.TTCFTimedRoute
    @NonNull
    public TTCFRoute getRoute() {
        return this.route;
    }

    @Override // com.amazon.alexa.ttcf.TTCFTimedRoute
    public long getStartTime() {
        return this.startTime;
    }

    public void invalidate() {
        this.valid = false;
    }

    public boolean isValid() {
        return this.valid;
    }
}
