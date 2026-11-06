package expo.modules.interfaces.taskManager;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface TaskManagerInterface {
    public static final String ERR_TASK_SERVICE_NOT_FOUND = "ERR_TASK_SERVICE_NOT_FOUND";
    public static final String EVENT_NAME = "TaskManager.executeTask";

    void executeTaskWithBody(Bundle bundle);

    void flushQueuedEvents();

    String getAppScopeKey();

    void registerTask(String str, Class cls, Map<String, Object> map) throws Exception;

    boolean taskHasConsumerOfClass(String str, Class cls);

    void unregisterTask(String str, Class cls) throws Exception;
}
