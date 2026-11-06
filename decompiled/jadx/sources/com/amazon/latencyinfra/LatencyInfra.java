package com.amazon.latencyinfra;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface LatencyInfra {
    void abandon(String str, String str2, Integer num);

    void blockNamespace(String str);

    void blockNamespaceEvent(String str, String str2);

    void disable();

    Long getAppStartTime();

    boolean isBlocked(String str, String str2);

    boolean isDisabled();

    boolean isNamespaceBlocked(String str);

    void mark(@NonNull LatencyMarker latencyMarker, @NonNull String str);

    void record(SingleLatencyAction singleLatencyAction, SingleEventInputArgument singleEventInputArgument);

    void recordTimeline(TimelineLatencyAction timelineLatencyAction, TimelineInputArgument timelineInputArgument);

    void setDefaultReporter(DefaultLatencyReporter defaultLatencyReporter);

    void setDomainReporter(DomainLatencyReporter domainLatencyReporter);

    void setIsInternalBuild(Boolean bool);

    void setTestID(String str);

    void start(String str);

    void stop(String str);

    void time(String str, Runnable runnable);

    void unblockNamespace(String str);
}
