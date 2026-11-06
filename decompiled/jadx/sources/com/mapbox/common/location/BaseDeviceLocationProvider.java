package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.presence.service.PresenceBleService;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.location.DeviceLocationProvider;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u0000 62\u00020\u00012\u00020\u0002:\u00046789B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\"H$J\b\u0010(\u001a\u00020\"H$J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H&J\u0016\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0011H&J\u0010\u00103\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0011H&J\b\u00104\u001a\u00020\"H\u0007J\b\u00105\u001a\u00020\"H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u0019¨\u0006:"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseLocationProvider;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "context", "Landroid/content/Context;", MissingTokenPull.TRIGGER_REQUEST, "Lcom/mapbox/common/location/LocationProviderRequest;", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V", "getContext", "()Landroid/content/Context;", "currentMode", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "getCurrentMode", "()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "setCurrentMode", "(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V", "locationUpdatePendingIntent", "Landroid/app/PendingIntent;", "getLocationUpdatePendingIntent", "()Landroid/app/PendingIntent;", "locationUpdatePendingIntent$delegate", "Lkotlin/Lazy;", "persistentId", "", "getPersistentId$annotations", "()V", "getPersistentId", "()I", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "state", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", "getState$annotations", "addLocationObserver", "", "observer", "Lcom/mapbox/common/location/LocationObserver;", "looper", "Landroid/os/Looper;", "doStart", "doStop", "extractResult", "", "Lcom/mapbox/common/location/Location;", "intent", "Landroid/content/Intent;", "notifyLocationUpdate", "locations", "removeLocationObserver", "removeLocationUpdates", BaseGmsClient.KEY_PENDING_INTENT, "requestLocationUpdates", "start", "stop", "Companion", "DeviceLocationProviderMode", "DeviceLocationProviderState", "LocationCancelable", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseDeviceLocationProvider extends BaseLocationProvider implements DeviceLocationProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final String TAG = "DeviceLocationProvider";

    @NotNull
    private final Context context;

    @NotNull
    private DeviceLocationProviderMode currentMode;

    /* renamed from: locationUpdatePendingIntent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationUpdatePendingIntent;

    @Nullable
    private final LocationProviderRequest request;

    @JvmField
    @NotNull
    public DeviceLocationProviderState state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "", "(Ljava/lang/String;I)V", "NONE", "CALLBACK", "PENDING_INTENT", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceLocationProviderMode {
        NONE,
        CALLBACK,
        PENDING_INTENT
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", "", "(Ljava/lang/String;I)V", PresenceBleService.ServiceState.STOPPED, PresenceBleService.ServiceState.STOPPING, SimbaEventProcessor.SOURCE_STARTED, PresenceBleService.ServiceState.STARTING, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @VisibleForTesting(otherwise = 4)
    public enum DeviceLocationProviderState {
        STOPPED,
        STOPPING,
        STARTED,
        STARTING
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;", "Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V", "isCanceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancel", "", "invokeIfNotCanceled", "cb", "Lkotlin/Function0;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class LocationCancelable implements Cancelable {

        @NotNull
        private final AtomicBoolean isCanceled = new AtomicBoolean(false);

        public LocationCancelable() {
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.isCanceled.set(true);
        }

        public final void invokeIfNotCanceled(@NotNull Function0<Unit> cb) {
            cb.getClass();
            if (this.isCanceled.get()) {
                MapboxCommonLogger.INSTANCE.logW$common_release("LocationService", "Operation to get last location was canceled");
            } else {
                cb.invoke();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceLocationProviderState.values().length];
            try {
                iArr[DeviceLocationProviderState.STARTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceLocationProviderState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseDeviceLocationProvider(@NotNull Context context, @Nullable LocationProviderRequest locationProviderRequest) {
        context.getClass();
        this.context = context;
        this.request = locationProviderRequest;
        this.state = DeviceLocationProviderState.STOPPED;
        this.locationUpdatePendingIntent = LazyKt.lazy(new Function0<PendingIntent>() { // from class: com.mapbox.common.location.BaseDeviceLocationProvider$locationUpdatePendingIntent$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PendingIntent invoke() {
                Intent intent = new Intent(BaseDeviceLocationProvider.this.getContext(), (Class<?>) LocationUpdatesReceiver.class);
                intent.setAction(LocationUpdatesReceiver.ACTION_PROCESS_LOCATION_UPDATES);
                int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                intent.putExtra(LocationUpdatesReceiver.LOCATION_PROVIDER_ID_KEY, BaseDeviceLocationProvider.this.getPersistentId());
                return PendingIntent.getBroadcast(BaseDeviceLocationProvider.this.getContext(), BaseDeviceLocationProvider.this.getPersistentId(), intent, i);
            }
        });
        this.currentMode = DeviceLocationProviderMode.NONE;
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void addLocationObserver(@NotNull LocationObserver observer, @NotNull Looper looper) {
        observer.getClass();
        looper.getClass();
        super.addLocationObserver(observer, looper);
        start();
    }

    public abstract void doStart();

    public abstract void doStop();

    @NotNull
    public abstract List<Location> extractResult(@NotNull Intent intent);

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final DeviceLocationProviderMode getCurrentMode() {
        return this.currentMode;
    }

    @NotNull
    public final PendingIntent getLocationUpdatePendingIntent() {
        Object value = this.locationUpdatePendingIntent.getValue();
        value.getClass();
        return (PendingIntent) value;
    }

    @Nullable
    public String getName() {
        return DeviceLocationProvider.DefaultImpls.getName(this);
    }

    public abstract int getPersistentId();

    @Nullable
    public final LocationProviderRequest getRequest() {
        return this.request;
    }

    @Override // com.mapbox.common.location.BaseLocationProvider
    public synchronized void notifyLocationUpdate(@NotNull List<? extends Location> locations) {
        locations.getClass();
        if (this.state == DeviceLocationProviderState.STARTED) {
            super.notifyLocationUpdate(locations);
        }
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void removeLocationObserver(@NotNull LocationObserver observer) {
        observer.getClass();
        super.removeLocationObserver(observer);
        if (getObservers().isEmpty()) {
            stop();
        }
    }

    public abstract void removeLocationUpdates(@NotNull PendingIntent pendingIntent);

    public abstract void requestLocationUpdates(@NotNull PendingIntent pendingIntent);

    public final void setCurrentMode(@NotNull DeviceLocationProviderMode deviceLocationProviderMode) {
        deviceLocationProviderMode.getClass();
        this.currentMode = deviceLocationProviderMode;
    }

    @CallSuper
    @VisibleForTesting(otherwise = 2)
    public final void start() {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger.logD$common_release(TAG, "Start called for " + this + ", state=" + this.state);
            int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i == 1 || i == 2) {
                mapboxCommonLogger.logW$common_release(TAG, "Skipping request to start: state == " + this.state);
            } else if (i == 3 || i == 4) {
                this.state = DeviceLocationProviderState.STARTING;
                doStart();
            }
            m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to start: state=" + this.state + ' ' + m25297exceptionOrNullimpl);
            this.state = DeviceLocationProviderState.STOPPED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x006b, B:16:0x0071, B:26:0x0061, B:4:0x0007, B:13:0x005a, B:22:0x003d, B:23:0x0053), top: B:3:0x0007, inners: #0 }] */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void stop() {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to stop: state="
            java.lang.String r1 = "Skipping request to stop: state == "
            java.lang.String r2 = "Stop called for "
            monitor-enter(r6)
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L51
            com.mapbox.common.MapboxCommonLogger r3 = com.mapbox.common.MapboxCommonLogger.INSTANCE     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "DeviceLocationProvider"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L51
            r5.append(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = " state="
            r5.append(r2)     // Catch: java.lang.Throwable -> L51
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r2 = r6.state     // Catch: java.lang.Throwable -> L51
            r5.append(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L51
            r3.logD$common_release(r4, r2)     // Catch: java.lang.Throwable -> L51
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r2 = r6.state     // Catch: java.lang.Throwable -> L51
            int[] r4 = com.mapbox.common.location.BaseDeviceLocationProvider.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L51
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L51
            r2 = r4[r2]     // Catch: java.lang.Throwable -> L51
            r4 = 1
            if (r2 == r4) goto L53
            r4 = 2
            if (r2 == r4) goto L53
            r4 = 3
            if (r2 == r4) goto L3d
            r4 = 4
            if (r2 == r4) goto L3d
            goto L5a
        L3d:
            java.lang.String r2 = "DeviceLocationProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L51
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r1 = r6.state     // Catch: java.lang.Throwable -> L51
            r4.append(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L51
            r3.logW$common_release(r2, r1)     // Catch: java.lang.Throwable -> L51
            goto L5a
        L51:
            r1 = move-exception
            goto L61
        L53:
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r1 = com.mapbox.common.location.BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPING     // Catch: java.lang.Throwable -> L51
            r6.state = r1     // Catch: java.lang.Throwable -> L51
            r6.doStop()     // Catch: java.lang.Throwable -> L51
        L5a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = kotlin.Result.m25294constructorimpl(r1)     // Catch: java.lang.Throwable -> L51
            goto L6b
        L61:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = kotlin.Result.m25294constructorimpl(r1)     // Catch: java.lang.Throwable -> L8f
        L6b:
            java.lang.Throwable r1 = kotlin.Result.m25297exceptionOrNullimpl(r1)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L91
            com.mapbox.common.MapboxCommonLogger r2 = com.mapbox.common.MapboxCommonLogger.INSTANCE     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "DeviceLocationProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L8f
            com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderState r0 = r6.state     // Catch: java.lang.Throwable -> L8f
            r4.append(r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 32
            r4.append(r0)     // Catch: java.lang.Throwable -> L8f
            r4.append(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L8f
            r2.logE$common_release(r3, r0)     // Catch: java.lang.Throwable -> L8f
            goto L91
        L8f:
            r0 = move-exception
            goto L93
        L91:
            monitor-exit(r6)
            return
        L93:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.location.BaseDeviceLocationProvider.stop():void");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;", "", "()V", Constants.LOG_TAG, "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @VisibleForTesting(otherwise = 4)
    public static /* synthetic */ void getPersistentId$annotations() {
    }

    @VisibleForTesting(otherwise = 4)
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void addLocationObserver(@NotNull LocationObserver observer) {
        observer.getClass();
        super.addLocationObserver(observer);
        start();
    }
}
