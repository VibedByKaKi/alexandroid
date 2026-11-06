package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public class SystemForegroundDispatcher implements OnConstraintsStateChangedListener, ExecutionListener {
    private static final String ACTION_CANCEL_WORK = "ACTION_CANCEL_WORK";
    private static final String ACTION_NOTIFY = "ACTION_NOTIFY";
    private static final String ACTION_START_FOREGROUND = "ACTION_START_FOREGROUND";
    private static final String ACTION_STOP_FOREGROUND = "ACTION_STOP_FOREGROUND";
    private static final String KEY_FOREGROUND_SERVICE_TYPE = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String KEY_GENERATION = "KEY_GENERATION";
    private static final String KEY_NOTIFICATION = "KEY_NOTIFICATION";
    private static final String KEY_NOTIFICATION_ID = "KEY_NOTIFICATION_ID";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    static final String TAG = Logger.tagWithPrefix("SystemFgDispatcher");

    @Nullable
    private Callback mCallback;
    final WorkConstraintsTracker mConstraintsTracker;
    private Context mContext;
    WorkGenerationalId mCurrentForegroundId;
    final Map<WorkGenerationalId, ForegroundInfo> mForegroundInfoById;
    final Object mLock;
    private final TaskExecutor mTaskExecutor;
    final Map<WorkGenerationalId, Job> mTrackedWorkSpecs;
    private WorkManagerImpl mWorkManagerImpl;
    final Map<WorkGenerationalId, WorkSpec> mWorkSpecById;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void cancelNotification(int i);

        void notify(int i, @NonNull Notification notification);

        void startForeground(int i, int i2, @NonNull Notification notification);

        void stop();
    }

    public SystemForegroundDispatcher(@NonNull Context context) {
        this.mContext = context;
        this.mLock = new Object();
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = new WorkConstraintsTracker(this.mWorkManagerImpl.getTrackers());
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }

    @NonNull
    public static Intent createCancelWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, SystemForegroundService.class, ACTION_CANCEL_WORK);
        m.setData(Uri.parse("workspec://" + str));
        m.putExtra(KEY_WORKSPEC_ID, str);
        return m;
    }

    @NonNull
    public static Intent createNotifyIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, SystemForegroundService.class, ACTION_NOTIFY);
        m.putExtra(KEY_NOTIFICATION_ID, foregroundInfo.getNotificationId());
        m.putExtra(KEY_FOREGROUND_SERVICE_TYPE, foregroundInfo.getForegroundServiceType());
        m.putExtra(KEY_NOTIFICATION, foregroundInfo.getNotification());
        m.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        m.putExtra(KEY_GENERATION, workGenerationalId.getGeneration());
        return m;
    }

    @NonNull
    public static Intent createStartForegroundIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, SystemForegroundService.class, ACTION_START_FOREGROUND);
        m.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        m.putExtra(KEY_GENERATION, workGenerationalId.getGeneration());
        m.putExtra(KEY_NOTIFICATION_ID, foregroundInfo.getNotificationId());
        m.putExtra(KEY_FOREGROUND_SERVICE_TYPE, foregroundInfo.getForegroundServiceType());
        m.putExtra(KEY_NOTIFICATION, foregroundInfo.getNotification());
        return m;
    }

    @NonNull
    public static Intent createStopForegroundIntent(@NonNull Context context) {
        return TableInfo$$ExternalSyntheticOutline0.m(context, SystemForegroundService.class, ACTION_STOP_FOREGROUND);
    }

    @MainThread
    private void handleCancelWork(@NonNull Intent intent) {
        Logger.get().info(TAG, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.mWorkManagerImpl.cancelWorkById(UUID.fromString(stringExtra));
    }

    @MainThread
    private void handleNotify(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, 0);
        int intExtra2 = intent.getIntExtra(KEY_FOREGROUND_SERVICE_TYPE, 0);
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra(KEY_GENERATION, 0));
        Notification notification = (Notification) intent.getParcelableExtra(KEY_NOTIFICATION);
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        m.append(intExtra2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        logger.debug(str, m.toString());
        if (notification == null || this.mCallback == null) {
            return;
        }
        this.mForegroundInfoById.put(workGenerationalId, new ForegroundInfo(intExtra, notification, intExtra2));
        if (this.mCurrentForegroundId == null) {
            this.mCurrentForegroundId = workGenerationalId;
            this.mCallback.startForeground(intExtra, intExtra2, notification);
            return;
        }
        this.mCallback.notify(intExtra, notification);
        if (intExtra2 != 0) {
            Iterator<Map.Entry<WorkGenerationalId, ForegroundInfo>> it2 = this.mForegroundInfoById.entrySet().iterator();
            while (it2.hasNext()) {
                i |= it2.next().getValue().getForegroundServiceType();
            }
            ForegroundInfo foregroundInfo = this.mForegroundInfoById.get(this.mCurrentForegroundId);
            if (foregroundInfo != null) {
                this.mCallback.startForeground(foregroundInfo.getNotificationId(), i, foregroundInfo.getNotification());
            }
        }
    }

    @MainThread
    private void handleStartForeground(@NonNull Intent intent) {
        Logger.get().info(TAG, "Started foreground service " + intent);
        final String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        this.mTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                WorkSpec runningWorkSpec = SystemForegroundDispatcher.this.mWorkManagerImpl.getProcessor().getRunningWorkSpec(stringExtra);
                if (runningWorkSpec == null || !runningWorkSpec.hasConstraints()) {
                    return;
                }
                synchronized (SystemForegroundDispatcher.this.mLock) {
                    SystemForegroundDispatcher.this.mWorkSpecById.put(WorkSpecKt.generationalId(runningWorkSpec), runningWorkSpec);
                    SystemForegroundDispatcher systemForegroundDispatcher = SystemForegroundDispatcher.this;
                    SystemForegroundDispatcher.this.mTrackedWorkSpecs.put(WorkSpecKt.generationalId(runningWorkSpec), WorkConstraintsTrackerKt.listen(systemForegroundDispatcher.mConstraintsTracker, runningWorkSpec, systemForegroundDispatcher.mTaskExecutor.getTaskCoroutineDispatcher(), SystemForegroundDispatcher.this));
                }
            }
        });
    }

    @MainThread
    public void handleStop(@NonNull Intent intent) {
        Logger.get().info(TAG, "Stopping foreground service");
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.stop();
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsNotMet) {
            String str = workSpec.id;
            Logger.get().debug(TAG, "Constraints unmet for WorkSpec " + str);
            this.mWorkManagerImpl.stopForegroundWork(WorkSpecKt.generationalId(workSpec));
        }
    }

    @MainThread
    public void onDestroy() {
        this.mCallback = null;
        synchronized (this.mLock) {
            try {
                Iterator<Job> it2 = this.mTrackedWorkSpecs.values().iterator();
                while (it2.hasNext()) {
                    it2.next().cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mWorkManagerImpl.getProcessor().removeExecutionListener(this);
    }

    @Override // androidx.work.impl.ExecutionListener
    @MainThread
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        Map.Entry<WorkGenerationalId, ForegroundInfo> entry;
        synchronized (this.mLock) {
            try {
                Job remove = this.mWorkSpecById.remove(workGenerationalId) != null ? this.mTrackedWorkSpecs.remove(workGenerationalId) : null;
                if (remove != null) {
                    remove.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo remove2 = this.mForegroundInfoById.remove(workGenerationalId);
        if (workGenerationalId.equals(this.mCurrentForegroundId)) {
            if (this.mForegroundInfoById.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, ForegroundInfo>> it2 = this.mForegroundInfoById.entrySet().iterator();
                Map.Entry<WorkGenerationalId, ForegroundInfo> next = it2.next();
                while (true) {
                    entry = next;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                }
                this.mCurrentForegroundId = entry.getKey();
                if (this.mCallback != null) {
                    ForegroundInfo value = entry.getValue();
                    this.mCallback.startForeground(value.getNotificationId(), value.getForegroundServiceType(), value.getNotification());
                    this.mCallback.cancelNotification(value.getNotificationId());
                }
            } else {
                this.mCurrentForegroundId = null;
            }
        }
        Callback callback = this.mCallback;
        if (remove2 == null || callback == null) {
            return;
        }
        Logger.get().debug(TAG, "Removing Notification (id: " + remove2.getNotificationId() + ", workSpecId: " + workGenerationalId + ", notificationType: " + remove2.getForegroundServiceType());
        callback.cancelNotification(remove2.getNotificationId());
    }

    public void onStartCommand(@NonNull Intent intent) {
        String action = intent.getAction();
        if (ACTION_START_FOREGROUND.equals(action)) {
            handleStartForeground(intent);
            handleNotify(intent);
        } else if (ACTION_NOTIFY.equals(action)) {
            handleNotify(intent);
        } else if (ACTION_CANCEL_WORK.equals(action)) {
            handleCancelWork(intent);
        } else if (ACTION_STOP_FOREGROUND.equals(action)) {
            handleStop(intent);
        }
    }

    @MainThread
    public void setCallback(@NonNull Callback callback) {
        if (this.mCallback != null) {
            Logger.get().error(TAG, "A callback already exists.");
        } else {
            this.mCallback = callback;
        }
    }

    @VisibleForTesting
    public SystemForegroundDispatcher(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl, @NonNull WorkConstraintsTracker workConstraintsTracker) {
        this.mContext = context;
        this.mLock = new Object();
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = workConstraintsTracker;
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }
}
