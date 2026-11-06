package com.amazon.alexa.system;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.base.system.payload.UserInactivityReportEventPayload;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import com.amazon.alexa.client.core.messages.Header;
import com.amazon.alexa.client.core.messages.Message;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class UserInactivityAuthority {
    private static final long INACTIVITY_REPORT_INTERVAL_MILLISECONDS = 3600000;

    @VisibleForTesting
    static final int INACTIVITY_REPORT_JOB_ID = 234613;
    private static final String TAG = "UserInactivityAuthority";
    private final AlexaClientEventBus eventBus;
    private int hourCount = 0;
    private ScheduledFuture scheduleUserInactivityReportFuture;
    private final ScheduledExecutorService sharedExecutorService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class ReportUserInactivityTask implements Runnable {
        public ReportUserInactivityTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UserInactivityAuthority.this.sendUserInactivityReport();
        }
    }

    @Inject
    public UserInactivityAuthority(AlexaClientEventBus alexaClientEventBus, @Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService) {
        this.eventBus = alexaClientEventBus;
        this.sharedExecutorService = scheduledExecutorService;
        scheduleUserInactivityReport();
    }

    private synchronized long getUserInactivityInSeconds() {
        return TimeUnit.SECONDS.convert(this.hourCount, TimeUnit.HOURS);
    }

    private void scheduleUserInactivityReport() {
        Log.i(TAG, "scheduleUserInactivityReport");
        ScheduledExecutorService scheduledExecutorService = this.sharedExecutorService;
        ReportUserInactivityTask reportUserInactivityTask = new ReportUserInactivityTask();
        long j = INACTIVITY_REPORT_INTERVAL_MILLISECONDS;
        this.scheduleUserInactivityReportFuture = scheduledExecutorService.scheduleAtFixedRate(reportUserInactivityTask, j, j, TimeUnit.MILLISECONDS);
    }

    public Message getUserInactivityReportMessage() {
        return Message.create(Header.builder().setNamespace(AvsApiConstants.System.NAMESPACE).setName(AvsApiConstants.System.Events.UserInactivityReport.NAME).build(), UserInactivityReportEventPayload.create(getUserInactivityInSeconds()));
    }

    public synchronized void resetUserInactivity() {
        try {
            ScheduledFuture scheduledFuture = this.scheduleUserInactivityReportFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.hourCount = 0;
            scheduleUserInactivityReport();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void sendUserInactivityReport() {
        Log.i(TAG, "Sending User Inactivity Report");
        this.hourCount++;
        this.eventBus.post(SendMessageEvent.builder().setMessage(getUserInactivityReportMessage()).build());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UserInactivityReportingJob extends JobService {
        private static final String TAG = "UserInactivityReportingJob";
        private JobScheduler jobScheduler;

        @VisibleForTesting
        public UserInactivityReportingJob(JobScheduler jobScheduler) {
            this.jobScheduler = jobScheduler;
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            if (jobParameters.getJobId() != UserInactivityAuthority.INACTIVITY_REPORT_JOB_ID) {
                return false;
            }
            jobParameters.getJobId();
            if (this.jobScheduler == null) {
                this.jobScheduler = (JobScheduler) getSystemService("jobscheduler");
            }
            this.jobScheduler.cancel(jobParameters.getJobId());
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        public UserInactivityReportingJob() {
        }
    }
}
