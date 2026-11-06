package com.amazon.alexa.presence.service.jobs;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/presence/service/jobs/PeriodicJob;", "Ljava/lang/Runnable;", "initialDelay", "", "getInitialDelay", "()J", "jobName", "", "getJobName", "()Ljava/lang/String;", "repeatInterval", "getRepeatInterval", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PeriodicJob extends Runnable {
    long getInitialDelay();

    @NotNull
    String getJobName();

    long getRepeatInterval();

    @NotNull
    TimeUnit getTimeUnit();
}
