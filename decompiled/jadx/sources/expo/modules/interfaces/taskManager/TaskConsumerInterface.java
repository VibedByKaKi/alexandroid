package expo.modules.interfaces.taskManager;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface TaskConsumerInterface {
    boolean canReceiveCustomBroadcast(String str);

    boolean didCancelJob(JobService jobService, JobParameters jobParameters);

    boolean didExecuteJob(JobService jobService, JobParameters jobParameters);

    void didReceiveBroadcast(Intent intent);

    void didRegister(TaskInterface taskInterface);

    void didUnregister();

    void setOptions(Map<String, Object> map);

    String taskType();
}
