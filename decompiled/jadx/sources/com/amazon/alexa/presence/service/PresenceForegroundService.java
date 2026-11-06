package com.amazon.alexa.presence.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.presence.Presence;
import com.amazon.alexa.presence.R;
import com.amazon.alexa.presence.library.Compatibility;
import com.amazon.alexa.presence.library.MetricsRecorder;
import com.amazon.alexa.presence.logging.PresenceSlf4jAndroidLoggerFactory;
import com.amazon.alexa.presence.metrics.MetricsId;
import com.amazon.alexa.presence.metrics.MetricsMethod;
import com.amazon.alexa.presence.service.PhoneIdService;
import com.amazon.alexa.presence.service.dagger.DaggerComponentFactory;
import com.amazon.alexa.presence.service.dagger.ForegroundServiceComponent;
import com.amazon.alexa.presence.service.dagger.ForegroundServiceContextModule;
import com.amazon.alexa.presence.service.dagger.ForegroundServiceModule;
import com.amazon.alexa.presence.service.jobs.ForegroundServiceJobScheduler;
import com.amazon.alexa.presence.service.receivers.PresenceForegroundServiceReceiver;
import com.amazon.alexa.presence.utils.Timed;
import com.amazon.deecomms.common.network.AppUrl;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda19;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.impl.AlexaSlf4jAndroidLoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020!H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020!H\u0016J\"\u0010)\u001a\u00020*2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lcom/amazon/alexa/presence/service/PresenceForegroundService;", "Landroid/app/Service;", "applicationModule", "Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceModule;", "(Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceModule;)V", "alexaGeneralNotificationChannel", "Landroid/app/NotificationChannel;", "getAlexaGeneralNotificationChannel", "()Landroid/app/NotificationChannel;", JsonFields.COMPONENT, "Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceComponent;", "getComponent", "()Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceComponent;", "component$delegate", "Lkotlin/Lazy;", "jobScheduler", "Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler;", "getJobScheduler", "()Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler;", "setJobScheduler", "(Lcom/amazon/alexa/presence/service/jobs/ForegroundServiceJobScheduler;)V", "metrics", "Lcom/amazon/alexa/presence/library/MetricsRecorder;", "getMetrics", "()Lcom/amazon/alexa/presence/library/MetricsRecorder;", "metrics$delegate", "phoneIdService", "Lcom/amazon/alexa/presence/service/PhoneIdService;", "getPhoneIdService", "()Lcom/amazon/alexa/presence/service/PhoneIdService;", "setPhoneIdService", "(Lcom/amazon/alexa/presence/service/PhoneIdService;)V", "handleIntent", "", "intent", "Landroid/content/Intent;", "init", "onBind", "Landroid/os/IBinder;", "onCreate", "onDestroy", "onStartCommand", "", "flags", AppUrl.ACMS.QueryParam.Keys.MESSAGE_START_ID, "setupForegroundServiceNotification", "setupNotificationChannel", "Companion", "Controls", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPresenceForegroundService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresenceForegroundService.kt\ncom/amazon/alexa/presence/service/PresenceForegroundService\n+ 2 Timed.kt\ncom/amazon/alexa/presence/utils/Timed$Companion\n*L\n1#1,257:1\n25#2:258\n*S KotlinDebug\n*F\n+ 1 PresenceForegroundService.kt\ncom/amazon/alexa/presence/service/PresenceForegroundService\n*L\n105#1:258\n*E\n"})
/* loaded from: classes18.dex */
public final class PresenceForegroundService extends Service {

    @NotNull
    public static final String ACTION_ROTATE_DATA = "com.amazon.alexa.intent.action.PRESENCE_ROTATE_DATA_ID";

    @NotNull
    public static final String ACTION_START_SERVICE = "com.amazon.alexa.intent.action.PRESENCE_START";

    @NotNull
    public static final String ACTION_STOP_SERVICE = "com.amazon.alexa.intent.action.PRESENCE_STOP";

    @NotNull
    private static final String ALEXA_GENERAL_NOTIFICATION_CHANNEL = "alexa_notification_channel";
    private static final int SERVICE_ID = 24856;

    @NotNull
    private final ForegroundServiceModule applicationModule;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy component;

    @Inject
    public ForegroundServiceJobScheduler jobScheduler;

    /* renamed from: metrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metrics;

    @Inject
    public PhoneIdService phoneIdService;
    private static final String TAG = Presence.tag();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/presence/service/PresenceForegroundService$Controls;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "serviceHelper", "Lcom/amazon/alexa/presence/service/PresenceForegroundServiceStateAdviser;", "notifyPresenceServiceToRotateServiceData", "", "notifyPresenceServiceToRun", "notifyPresenceServiceToStop", "rotateServiceDataIdIntent", "Landroid/content/Intent;", "startServiceIntent", "stopServiceIntent", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Controls {

        @NotNull
        private final Context ctx;

        @NotNull
        private final PresenceForegroundServiceStateAdviser serviceHelper;

        public Controls(@NotNull Context context) {
            context.getClass();
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.ctx = applicationContext;
            this.serviceHelper = new PresenceForegroundServiceStateAdviser(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ComponentName notifyPresenceServiceToRotateServiceData$lambda$2(Controls controls) {
            controls.getClass();
            return controls.ctx.startForegroundService(controls.rotateServiceDataIdIntent());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ComponentName notifyPresenceServiceToRotateServiceData$lambda$3(Controls controls) {
            controls.getClass();
            return controls.ctx.startService(controls.rotateServiceDataIdIntent());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ComponentName notifyPresenceServiceToRun$lambda$0(Controls controls) {
            controls.getClass();
            return controls.ctx.startForegroundService(controls.startServiceIntent());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ComponentName notifyPresenceServiceToRun$lambda$1(Controls controls) {
            controls.getClass();
            return controls.ctx.startService(controls.startServiceIntent());
        }

        private final Intent startServiceIntent() {
            Intent intent = new Intent(this.ctx, (Class<?>) PresenceForegroundService.class);
            intent.setAction(PresenceForegroundService.ACTION_START_SERVICE);
            return intent;
        }

        private final Intent stopServiceIntent() {
            Intent intent = new Intent(this.ctx, (Class<?>) PresenceForegroundService.class);
            intent.setAction(PresenceForegroundService.ACTION_STOP_SERVICE);
            return intent;
        }

        public final void notifyPresenceServiceToRotateServiceData() {
            if (this.serviceHelper.serviceShouldBeRunning()) {
                Compatibility.ifAndroidOOrLater(new PresenceForegroundService$Controls$$ExternalSyntheticLambda0(this, 0), new PresenceForegroundService$Controls$$ExternalSyntheticLambda0(this, 1));
            } else {
                Log.w(PresenceForegroundService.TAG, "Presence service requested to rotate data, but it should not be running right now.");
            }
        }

        public final void notifyPresenceServiceToRun() {
            if (this.serviceHelper.serviceShouldBeRunning()) {
                Compatibility.ifAndroidOOrLater(new PresenceForegroundService$Controls$$ExternalSyntheticLambda0(this, 2), new PresenceForegroundService$Controls$$ExternalSyntheticLambda0(this, 3));
            } else {
                Log.w(PresenceForegroundService.TAG, "Presence service requested to start, but not in a state where it can run.");
            }
        }

        public final void notifyPresenceServiceToStop() {
            this.ctx.stopService(stopServiceIntent());
        }

        @NotNull
        public final Intent rotateServiceDataIdIntent() {
            Intent intent = new Intent(this.ctx, (Class<?>) PresenceForegroundService.class);
            intent.setAction(PresenceForegroundService.ACTION_ROTATE_DATA);
            return intent;
        }
    }

    static {
        AlexaSlf4jAndroidLoggerFactory.subscribe(PresenceSlf4jAndroidLoggerFactory.DEFAULT);
    }

    @JvmOverloads
    public PresenceForegroundService(@NotNull ForegroundServiceModule foregroundServiceModule) {
        foregroundServiceModule.getClass();
        this.applicationModule = foregroundServiceModule;
        this.component = LazyKt.lazy(new Function0<ForegroundServiceComponent>() { // from class: com.amazon.alexa.presence.service.PresenceForegroundService$component$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ForegroundServiceComponent invoke() {
                ForegroundServiceModule foregroundServiceModule2;
                foregroundServiceModule2 = PresenceForegroundService.this.applicationModule;
                Context applicationContext = PresenceForegroundService.this.getApplicationContext();
                applicationContext.getClass();
                return DaggerComponentFactory.create(foregroundServiceModule2, new ForegroundServiceContextModule(applicationContext));
            }
        });
        this.metrics = LazyKt.lazy(new Function0<MetricsRecorder>() { // from class: com.amazon.alexa.presence.service.PresenceForegroundService$metrics$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final MetricsRecorder invoke() {
                try {
                    return MetricsRecorder.getMetricsUtil();
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    @RequiresApi(api = 26)
    private final NotificationChannel getAlexaGeneralNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel("alexa_notification_channel", getResources().getString(R.string.presence_service_notification_general_channel_title), 2);
        notificationChannel.setShowBadge(false);
        return notificationChannel;
    }

    private final ForegroundServiceComponent getComponent() {
        Object value = this.component.getValue();
        value.getClass();
        return (ForegroundServiceComponent) value;
    }

    private final MetricsRecorder getMetrics() {
        return (MetricsRecorder) this.metrics.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleIntent(Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            Class cls = null;
            Object[] objArr = 0;
            if (hashCode != -1286898152) {
                if (hashCode != -1239150356) {
                    if (hashCode == -444091006 && action.equals(ACTION_ROTATE_DATA)) {
                        Timed timed = new Timed("handleIntent/Rotate Data", cls, 2, objArr == true ? 1 : 0);
                        try {
                            String str = TAG;
                            Log.i(str, "Requested to rotate service data.");
                            MetricsRecorder metrics = getMetrics();
                            metrics.getClass();
                            metrics.recordCount(MetricsId.PHONE_ID_ROTATED, MetricsMethod.PHONE_ID);
                            getPhoneIdService().receiveInstruction(PhoneIdService.Instruction.ROTATE_DATA);
                            Log.i(str, "Service data rotated.");
                            CloseableKt.closeFinally(timed, null);
                            return;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(timed, th);
                                throw th2;
                            }
                        }
                    }
                } else if (action.equals(ACTION_START_SERVICE)) {
                    Timed timed2 = new Timed("handleIntent/Start BLE Service", PresenceForegroundService.class);
                    try {
                        getPhoneIdService().receiveInstruction(PhoneIdService.Instruction.START_SERVICE);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(timed2, null);
                        return;
                    } finally {
                    }
                }
            } else if (action.equals(ACTION_STOP_SERVICE)) {
                Timed timed3 = new Timed("handleIntent/Stop BLE Service", Timed.INSTANCE.getClass());
                try {
                    getPhoneIdService().receiveInstruction(PhoneIdService.Instruction.STOP_SERVICE);
                    stopForeground(true);
                    stopSelf();
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(timed3, null);
                    return;
                } finally {
                }
            }
        }
        intent.getAction();
    }

    private final void init() {
        getComponent().inject(this);
    }

    private final void setupForegroundServiceNotification() {
        setupNotificationChannel();
        String string = getResources().getString(R.string.presence_service_notification_title);
        string.getClass();
        String string2 = getResources().getString(R.string.presence_service_notification_text);
        string2.getClass();
        Notification build = new NotificationCompat.Builder(this, "alexa_notification_channel").setContentTitle(string).setContentText(string2).setSmallIcon(R.drawable.ic_alexaicon).setColor(getResources().getColor(R.color.notification_color)).setPriority(-1).setVisibility(-1).setShowWhen(false).build();
        build.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            startForeground(SERVICE_ID, build, 16);
        } else {
            startForeground(SERVICE_ID, build);
        }
    }

    private final void setupNotificationChannel() {
        Compatibility.ifAndroidOOrLater(new Functions$$ExternalSyntheticLambda19(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object setupNotificationChannel$lambda$4(PresenceForegroundService presenceForegroundService) {
        presenceForegroundService.getClass();
        ((NotificationManager) presenceForegroundService.getSystemService(NotificationManager.class)).createNotificationChannel(presenceForegroundService.getAlexaGeneralNotificationChannel());
        return null;
    }

    @NotNull
    public final ForegroundServiceJobScheduler getJobScheduler() {
        ForegroundServiceJobScheduler foregroundServiceJobScheduler = this.jobScheduler;
        if (foregroundServiceJobScheduler != null) {
            return foregroundServiceJobScheduler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("jobScheduler");
        return null;
    }

    @NotNull
    public final PhoneIdService getPhoneIdService() {
        PhoneIdService phoneIdService = this.phoneIdService;
        if (phoneIdService != null) {
            return phoneIdService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("phoneIdService");
        return null;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        intent.getClass();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            init();
        } catch (Throwable unused) {
            Log.w(TAG, "Unable to setup metrics service.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            getPhoneIdService().receiveInstruction(PhoneIdService.Instruction.STOP_SERVICE);
        } catch (Throwable th) {
            Log.w(TAG, "Error encountered while trying to stop GATT service", th);
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Timed timed = new Timed("onStartCommand", null, 2, 0 == true ? 1 : 0);
        if (intent != null) {
            try {
                intent.getAction();
            } finally {
            }
        }
        setupForegroundServiceNotification();
        PresenceForegroundServiceReceiver.registerReceivers(this);
        handleIntent(intent);
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(timed, null);
        return 0;
    }

    public final void setJobScheduler(@NotNull ForegroundServiceJobScheduler foregroundServiceJobScheduler) {
        foregroundServiceJobScheduler.getClass();
        this.jobScheduler = foregroundServiceJobScheduler;
    }

    public final void setPhoneIdService(@NotNull PhoneIdService phoneIdService) {
        phoneIdService.getClass();
        this.phoneIdService = phoneIdService;
    }

    public /* synthetic */ PresenceForegroundService(ForegroundServiceModule foregroundServiceModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ForegroundServiceModule() : foregroundServiceModule);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PresenceForegroundService() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
