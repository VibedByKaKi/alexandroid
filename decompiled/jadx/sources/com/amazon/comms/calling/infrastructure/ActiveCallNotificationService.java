package com.amazon.comms.calling.infrastructure;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.network.AppUrl;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/ActiveCallNotificationService;", "Landroid/app/Service;", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "flags", AppUrl.ACMS.QueryParam.Keys.MESSAGE_START_ID, "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public class ActiveCallNotificationService extends Service {

    @NotNull
    public static final String CALL_NOTIFICATION = "call_notification";
    public static final int MILLIS_IN_SECOND = 1000;

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(ActiveCallNotificationService.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    @Inject
    public ActiveCallNotificationService() {
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent p0) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        getLOG().i("[Comms-calling]: onCreate ActiveCallNotificationService");
    }

    @Override // android.app.Service
    public void onDestroy() {
        getLOG().i("[Comms-calling]: onDestroy ActiveCallNotificationService");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        getLOG().d("[Comms-calling]: onStartCommand ActiveCallNotificationService");
        Notification notification = intent != null ? (Notification) intent.getParcelableExtra(CALL_NOTIFICATION) : null;
        if (notification == null) {
            return 2;
        }
        startForeground(200, notification, 4);
        return 2;
    }
}
