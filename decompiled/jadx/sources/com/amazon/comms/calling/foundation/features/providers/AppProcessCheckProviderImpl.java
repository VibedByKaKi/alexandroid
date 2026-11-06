package com.amazon.comms.calling.foundation.features.providers;

import android.app.ActivityManager;
import android.os.Process;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/foundation/features/providers/AppProcessCheckProviderImpl;", "Lcom/amazon/comms/calling/foundation/features/providers/AppProcessCheckProvider;", "activityManager", "Landroid/app/ActivityManager;", "<init>", "(Landroid/app/ActivityManager;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "getAppImportance", "", "hasForegroundImportance", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AppProcessCheckProviderImpl implements AppProcessCheckProvider {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(AppProcessCheckProviderImpl.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final ActivityManager activityManager;

    @Inject
    public AppProcessCheckProviderImpl(@NotNull ActivityManager activityManager) {
        activityManager.getClass();
        this.activityManager = activityManager;
        this.LOG = new CallingLogger();
    }

    private final int getAppImportance() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.activityManager.getRunningAppProcesses();
        int myPid = Process.myPid();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    getLOG().i("App is >>> fetchImportance: process index is " + runningAppProcesses.indexOf(runningAppProcessInfo) + ",importance: " + runningAppProcessInfo.importance);
                    return runningAppProcessInfo.importance;
                }
            }
        }
        getLOG().i("Could not obtain app importance");
        return 500;
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.comms.calling.foundation.features.providers.AppProcessCheckProvider
    public boolean hasForegroundImportance() {
        int appImportance = getAppImportance();
        return appImportance == 100 || appImportance == 200;
    }
}
