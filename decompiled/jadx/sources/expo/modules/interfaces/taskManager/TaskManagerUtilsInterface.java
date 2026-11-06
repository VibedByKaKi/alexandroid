package expo.modules.interfaces.taskManager;

import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface TaskManagerUtilsInterface {
    void cancelScheduledJob(Context context, int i);

    void cancelTaskIntent(Context context, String str, String str2);

    PendingIntent createTaskIntent(Context context, TaskInterface taskInterface);

    void executeTask(TaskInterface taskInterface, Bundle bundle, @Nullable TaskExecutionCallback taskExecutionCallback);

    List<PersistableBundle> extractDataFromJobParams(JobParameters jobParameters);

    void scheduleJob(Context context, TaskInterface taskInterface, List<PersistableBundle> list);
}
