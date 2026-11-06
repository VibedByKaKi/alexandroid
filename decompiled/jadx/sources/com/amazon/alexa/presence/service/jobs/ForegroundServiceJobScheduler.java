package com.amazon.alexa.presence.service.jobs;

import androidx.compose.ui.Actual_androidKt$$ExternalSyntheticLambda0;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.amazon.alexa.presence.service.jobs.ForegroundServiceJobScheduler;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.ttcf.TTCFService$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rJ\u001c\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0018J4\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler;", "", "()V", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "adhocJobs", "", "Ljava/util/concurrent/Future;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "uniqueScheduledJobs", "", "", "Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobInfo;", "awaitAllJobs", "", "cancelRecurring", "checkBackJobName", "scheduleOnce", "jobName", "job", "Ljava/lang/Runnable;", "scheduleRecurring", "Lcom/amazon/alexa/presence/service/jobs/PeriodicJob;", "repeatInterval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "initialDelay", "Companion", "JobInfo", "JobStatus", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroundServiceJobScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceJobScheduler.kt\ncom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n515#2:143\n500#2,6:144\n135#3,9:150\n215#3:159\n216#3:161\n144#3:162\n1#4:160\n1855#5,2:163\n*S KotlinDebug\n*F\n+ 1 ForegroundServiceJobScheduler.kt\ncom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler\n*L\n107#1:143\n107#1:144,6\n107#1:150,9\n107#1:159\n107#1:161\n107#1:162\n107#1:160\n108#1:163,2\n*E\n"})
/* loaded from: classes18.dex */
public final class ForegroundServiceJobScheduler {
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;
    private static final Logger log;

    @NotNull
    private final List<Future<?>> adhocJobs;

    @NotNull
    private final ScheduledExecutorService executor;

    @NotNull
    private final Map<String, JobInfo> uniqueScheduledJobs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobStatus;", "", "(Ljava/lang/String;I)V", "CREATING", "ENQUEUED", "RUNNING", "REMOVED", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JobStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JobStatus[] $VALUES;
        public static final JobStatus CREATING = new JobStatus("CREATING", 0);
        public static final JobStatus ENQUEUED = new JobStatus("ENQUEUED", 1);
        public static final JobStatus RUNNING = new JobStatus("RUNNING", 2);
        public static final JobStatus REMOVED = new JobStatus("REMOVED", 3);

        private static final /* synthetic */ JobStatus[] $values() {
            return new JobStatus[]{CREATING, ENQUEUED, RUNNING, REMOVED};
        }

        static {
            JobStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private JobStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries<JobStatus> getEntries() {
            return $ENTRIES;
        }

        public static JobStatus valueOf(String str) {
            return (JobStatus) Enum.valueOf(JobStatus.class, str);
        }

        public static JobStatus[] values() {
            return (JobStatus[]) $VALUES.clone();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        log = LoggerFactory.getLogger(companion.getClass().getEnclosingClass());
    }

    @Inject
    public ForegroundServiceJobScheduler(@NotNull ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.executor = scheduledExecutorService;
        this.uniqueScheduledJobs = new LinkedHashMap();
        this.adhocJobs = new ArrayList();
    }

    public static /* synthetic */ void scheduleOnce$default(ForegroundServiceJobScheduler foregroundServiceJobScheduler, String str, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        foregroundServiceJobScheduler.scheduleOnce(str, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleOnce$lambda$2(Runnable runnable, String str, Ref.ObjectRef objectRef, ForegroundServiceJobScheduler foregroundServiceJobScheduler) {
        runnable.getClass();
        objectRef.getClass();
        foregroundServiceJobScheduler.getClass();
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                log.error("Error executing adhoc job " + str, th);
                if (objectRef.element != 0) {
                    TypeIntrinsics.asMutableCollection(foregroundServiceJobScheduler.adhocJobs).remove(objectRef.element);
                }
            } finally {
                Object obj = objectRef.element;
                if (obj != null) {
                    TypeIntrinsics.asMutableCollection(foregroundServiceJobScheduler.adhocJobs).remove(obj);
                }
            }
        }
    }

    public static /* synthetic */ void scheduleRecurring$default(ForegroundServiceJobScheduler foregroundServiceJobScheduler, String str, long j, TimeUnit timeUnit, long j2, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 900000;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        foregroundServiceJobScheduler.scheduleRecurring(str, j3, timeUnit, (i & 8) != 0 ? j3 : j2, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRecurring$lambda$0(PeriodicJob periodicJob) {
        periodicJob.getClass();
        periodicJob.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRecurring$lambda$1(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    public final synchronized void awaitAllJobs() {
        try {
            Map<String, JobInfo> map = this.uniqueScheduledJobs;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JobInfo> entry : map.entrySet()) {
                if (entry.getValue().getCurrentStatus() == JobStatus.RUNNING) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                ScheduledFuture<?> future = ((JobInfo) ((Map.Entry) it2.next()).getValue()).getFuture();
                if (future != null) {
                    arrayList.add(future);
                }
            }
            Iterator it3 = CollectionsKt.plus((Collection) arrayList, (Iterable) this.adhocJobs).iterator();
            while (it3.hasNext()) {
                ((Future) it3.next()).get();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void cancelRecurring(@NotNull String checkBackJobName) {
        try {
            checkBackJobName.getClass();
            JobInfo jobInfo = this.uniqueScheduledJobs.get(checkBackJobName);
            if (jobInfo != null) {
                ScheduledFuture<?> future = jobInfo.getFuture();
                if (future != null) {
                    future.cancel(false);
                }
                this.uniqueScheduledJobs.remove(checkBackJobName);
                jobInfo.setCurrentStatus(JobStatus.REMOVED);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final ScheduledExecutorService getExecutor() {
        return this.executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Object, java.util.concurrent.Future] */
    @JvmOverloads
    public final synchronized void scheduleOnce(@Nullable String jobName, @NotNull Runnable job) {
        ForegroundServiceJobScheduler foregroundServiceJobScheduler;
        String str;
        try {
            try {
                job.getClass();
                try {
                    log.debug("Scheduling job " + jobName);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    foregroundServiceJobScheduler = this;
                    str = jobName;
                    try {
                        ?? submit = this.executor.submit(new Schedulers$$ExternalSyntheticLambda1(9, job, str, objectRef, foregroundServiceJobScheduler));
                        objectRef.element = submit;
                        foregroundServiceJobScheduler.adhocJobs.add(submit);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        log.error("Error scheduling job " + str, th2);
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    foregroundServiceJobScheduler = this;
                    str = jobName;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
        throw th;
    }

    public final synchronized void scheduleRecurring(@NotNull final String jobName, long repeatInterval, @NotNull TimeUnit timeUnit, long initialDelay, @NotNull final Runnable job) {
        jobName.getClass();
        timeUnit.getClass();
        job.getClass();
        JobInfo jobInfo = this.uniqueScheduledJobs.get(jobName);
        if (jobInfo == null || jobInfo.getCurrentStatus() == JobStatus.REMOVED) {
            final JobInfo jobInfo2 = new JobInfo(null, null, null, null, 15, null);
            try {
                jobInfo2.setFuture(this.executor.scheduleAtFixedRate(new Actual_androidKt$$ExternalSyntheticLambda0(new Function0<Unit>() { // from class: com.amazon.alexa.presence.service.jobs.ForegroundServiceJobScheduler$scheduleRecurring$jobWrapper$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Logger logger;
                        Logger logger2;
                        Logger logger3;
                        try {
                            ForegroundServiceJobScheduler.JobStatus currentStatus = ForegroundServiceJobScheduler.JobInfo.this.getCurrentStatus();
                            ForegroundServiceJobScheduler.JobStatus jobStatus = ForegroundServiceJobScheduler.JobStatus.ENQUEUED;
                            if (currentStatus == jobStatus) {
                                logger3 = ForegroundServiceJobScheduler.log;
                                logger3.debug("Running job " + jobName);
                                ForegroundServiceJobScheduler.JobInfo.this.setLastRunDate(Long.valueOf(System.currentTimeMillis()));
                                ForegroundServiceJobScheduler.JobInfo.this.setCurrentStatus(ForegroundServiceJobScheduler.JobStatus.RUNNING);
                                job.run();
                            } else {
                                logger2 = ForegroundServiceJobScheduler.log;
                                logger2.debug("Scheduled job " + jobName + " attempted to run in non-runnable state " + ForegroundServiceJobScheduler.JobInfo.this.getCurrentStatus());
                            }
                            ForegroundServiceJobScheduler.JobInfo.this.setLastCompletionDate(Long.valueOf(System.currentTimeMillis()));
                            ForegroundServiceJobScheduler.JobInfo.this.setCurrentStatus(jobStatus);
                        } catch (Throwable th) {
                            try {
                                logger = ForegroundServiceJobScheduler.log;
                                logger.warn("Error running job " + jobName, th);
                            } finally {
                                ForegroundServiceJobScheduler.JobInfo.this.setLastCompletionDate(Long.valueOf(System.currentTimeMillis()));
                                ForegroundServiceJobScheduler.JobInfo.this.setCurrentStatus(ForegroundServiceJobScheduler.JobStatus.ENQUEUED);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, 4), initialDelay, repeatInterval, timeUnit));
                jobInfo2.setCurrentStatus(JobStatus.ENQUEUED);
                this.uniqueScheduledJobs.put(jobName, jobInfo2);
            } catch (Throwable th) {
                log.error("Error scheduling job", th);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ForegroundServiceJobScheduler() {
        /*
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r0.getClass()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.presence.service.jobs.ForegroundServiceJobScheduler.<init>():void");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bHÆ\u0003J@\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006&"}, d2 = {"Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobInfo;", "", "lastRunDate", "", "lastCompletionDate", "currentStatus", "Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobStatus;", "future", "Ljava/util/concurrent/ScheduledFuture;", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobStatus;Ljava/util/concurrent/ScheduledFuture;)V", "getCurrentStatus", "()Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobStatus;", "setCurrentStatus", "(Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobStatus;)V", "getFuture", "()Ljava/util/concurrent/ScheduledFuture;", "setFuture", "(Ljava/util/concurrent/ScheduledFuture;)V", "getLastCompletionDate", "()Ljava/lang/Long;", "setLastCompletionDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLastRunDate", "setLastRunDate", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobStatus;Ljava/util/concurrent/ScheduledFuture;)Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler$JobInfo;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JobInfo {

        @NotNull
        private JobStatus currentStatus;

        @Nullable
        private ScheduledFuture<?> future;

        @Nullable
        private Long lastCompletionDate;

        @Nullable
        private Long lastRunDate;

        public /* synthetic */ JobInfo(Long l, Long l2, JobStatus jobStatus, ScheduledFuture scheduledFuture, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? JobStatus.CREATING : jobStatus, (i & 8) != 0 ? null : scheduledFuture);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JobInfo copy$default(JobInfo jobInfo, Long l, Long l2, JobStatus jobStatus, ScheduledFuture scheduledFuture, int i, Object obj) {
            if ((i & 1) != 0) {
                l = jobInfo.lastRunDate;
            }
            if ((i & 2) != 0) {
                l2 = jobInfo.lastCompletionDate;
            }
            if ((i & 4) != 0) {
                jobStatus = jobInfo.currentStatus;
            }
            if ((i & 8) != 0) {
                scheduledFuture = jobInfo.future;
            }
            return jobInfo.copy(l, l2, jobStatus, scheduledFuture);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Long getLastRunDate() {
            return this.lastRunDate;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Long getLastCompletionDate() {
            return this.lastCompletionDate;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final JobStatus getCurrentStatus() {
            return this.currentStatus;
        }

        @Nullable
        public final ScheduledFuture<?> component4() {
            return this.future;
        }

        @NotNull
        public final JobInfo copy(@Nullable Long lastRunDate, @Nullable Long lastCompletionDate, @NotNull JobStatus currentStatus, @Nullable ScheduledFuture<?> future) {
            currentStatus.getClass();
            return new JobInfo(lastRunDate, lastCompletionDate, currentStatus, future);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JobInfo)) {
                return false;
            }
            JobInfo jobInfo = (JobInfo) other;
            return Intrinsics.areEqual(this.lastRunDate, jobInfo.lastRunDate) && Intrinsics.areEqual(this.lastCompletionDate, jobInfo.lastCompletionDate) && this.currentStatus == jobInfo.currentStatus && Intrinsics.areEqual(this.future, jobInfo.future);
        }

        @NotNull
        public final JobStatus getCurrentStatus() {
            return this.currentStatus;
        }

        @Nullable
        public final ScheduledFuture<?> getFuture() {
            return this.future;
        }

        @Nullable
        public final Long getLastCompletionDate() {
            return this.lastCompletionDate;
        }

        @Nullable
        public final Long getLastRunDate() {
            return this.lastRunDate;
        }

        public int hashCode() {
            Long l = this.lastRunDate;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.lastCompletionDate;
            int hashCode2 = (this.currentStatus.hashCode() + ((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
            ScheduledFuture<?> scheduledFuture = this.future;
            return hashCode2 + (scheduledFuture != null ? scheduledFuture.hashCode() : 0);
        }

        public final void setCurrentStatus(@NotNull JobStatus jobStatus) {
            jobStatus.getClass();
            this.currentStatus = jobStatus;
        }

        public final void setFuture(@Nullable ScheduledFuture<?> scheduledFuture) {
            this.future = scheduledFuture;
        }

        public final void setLastCompletionDate(@Nullable Long l) {
            this.lastCompletionDate = l;
        }

        public final void setLastRunDate(@Nullable Long l) {
            this.lastRunDate = l;
        }

        @NotNull
        public String toString() {
            return "JobInfo(lastRunDate=" + this.lastRunDate + ", lastCompletionDate=" + this.lastCompletionDate + ", currentStatus=" + this.currentStatus + ", future=" + this.future + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public JobInfo(@Nullable Long l, @Nullable Long l2, @NotNull JobStatus jobStatus, @Nullable ScheduledFuture<?> scheduledFuture) {
            jobStatus.getClass();
            this.lastRunDate = l;
            this.lastCompletionDate = l2;
            this.currentStatus = jobStatus;
            this.future = scheduledFuture;
        }

        public JobInfo() {
            this(null, null, null, null, 15, null);
        }
    }

    @JvmOverloads
    public final void scheduleOnce(@NotNull Runnable runnable) {
        runnable.getClass();
        scheduleOnce$default(this, null, runnable, 1, null);
    }

    public final synchronized void scheduleRecurring(@NotNull PeriodicJob job) {
        try {
            try {
                job.getClass();
                scheduleRecurring(job.getJobName(), job.getRepeatInterval(), job.getTimeUnit(), job.getInitialDelay(), new TTCFService$$ExternalSyntheticLambda0(job, 13));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
