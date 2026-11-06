package com.amazon.alexa.accessory.frames.media.autoimport;

import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.protocol.Device;
import com.amazon.alexa.accessoryclient.client.accessories.AccessorySession;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.location.phase3.DwellTracker$$ExternalSyntheticLambda0;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.dee.app.contacts.common.constants.Constants;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\nJ\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/BatteryMonitor;", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/accessoryclient/client/accessories/AccessorySession;", "onChargingDetected", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "batteryLevel", "", "<init>", "(Lcom/amazon/alexa/accessoryclient/client/accessories/AccessorySession;Lkotlin/jvm/functions/Function1;)V", "lastBatteryStatus", "Lcom/amazon/alexa/accessory/protocol/Device$DeviceBattery$Status;", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "value", "lastKnownLevel", "getLastKnownLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isMonitoring", "", "start", "handleBatteryStatusChange", ModelTransformer.KEY_BATTERY, "Lcom/amazon/alexa/accessory/protocol/Device$DeviceBattery;", "stop", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BatteryMonitor {
    private static final long CHARGING_DETECTION_DEBOUNCE_MS = 2000;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BatteryMonitor";

    @Nullable
    private Disposable disposable;

    @Nullable
    private Device.DeviceBattery.Status lastBatteryStatus;

    @Nullable
    private volatile Integer lastKnownLevel;

    @NotNull
    private final Function1<Integer, Unit> onChargingDetected;

    @NotNull
    private final AccessorySession session;

    /* JADX WARN: Multi-variable type inference failed */
    public BatteryMonitor(@NotNull AccessorySession accessorySession, @NotNull Function1<? super Integer, Unit> function1) {
        accessorySession.getClass();
        function1.getClass();
        this.session = accessorySession;
        this.onChargingDetected = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBatteryStatusChange(Device.DeviceBattery battery) {
        Device.DeviceBattery.Status status = battery.getStatus();
        Device.DeviceBattery.Status status2 = this.lastBatteryStatus;
        int level = battery.getLevel();
        this.lastKnownLevel = Integer.valueOf(level);
        boolean z = status == Device.DeviceBattery.Status.CHARGING;
        Log.i(TAG, "Battery status update: level=" + level + "%, status=" + status + ", isCharging=" + z + ", previous=" + status2);
        Companion companion = INSTANCE;
        status.getClass();
        boolean isChargingTransition$AlexaAccessoryEchoFramesAndroid_release = companion.isChargingTransition$AlexaAccessoryEchoFramesAndroid_release(status2, status);
        this.lastBatteryStatus = status;
        if (isChargingTransition$AlexaAccessoryEchoFramesAndroid_release) {
            Log.i(TAG, "CHARGING DETECTED! Device placed in charging case. Battery level: " + level + "%");
            this.onChargingDetected.invoke(Integer.valueOf(level));
            return;
        }
        if (z) {
            Log.d(TAG, "Device is charging (no transition, already charging)");
            return;
        }
        Log.d(TAG, "Device is not charging (status: " + status + MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Nullable
    public final Integer getLastKnownLevel() {
        return this.lastKnownLevel;
    }

    public final boolean isMonitoring() {
        Disposable disposable = this.disposable;
        return (disposable == null || disposable.isDisposed()) ? false : true;
    }

    public final void start() {
        if (isMonitoring()) {
            Log.d(TAG, "Battery monitoring already active, skipping start");
        } else {
            Log.d(TAG, "Starting battery monitoring...");
            this.disposable = this.session.getDeviceRepository().queryDeviceInformationSet().doOnNext(new Consumer() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$1
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Set<Device.DeviceInformation> set) {
                    set.getClass();
                    Log.d("BatteryMonitor", "Received device info update, set size: " + set.size());
                }
            }).flatMap(new Function() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$2
                @Override // io.reactivex.rxjava3.functions.Function
                public final ObservableSource<? extends Device.DeviceInformation> apply(Set<Device.DeviceInformation> set) {
                    set.getClass();
                    return Observable.fromIterable(set);
                }
            }).filter(new Predicate() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$3
                @Override // io.reactivex.rxjava3.functions.Predicate
                public final boolean test(Device.DeviceInformation deviceInformation) {
                    String deviceType = deviceInformation.getDeviceType();
                    if (deviceType == null) {
                        deviceType = "";
                    }
                    boolean z = Intrinsics.areEqual(deviceType, "A3JKY41C0S05FZ") || Intrinsics.areEqual(deviceType, "A2OUFCM11BT9RB") || Intrinsics.areEqual(deviceType, "A3IYPH06PH1HRA");
                    Log.d("BatteryMonitor", "Device type: " + deviceType + ", isTarget: " + z);
                    return z;
                }
            }).map(new Function() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$4
                @Override // io.reactivex.rxjava3.functions.Function
                public final Device.DeviceBattery apply(Device.DeviceInformation deviceInformation) {
                    Log.d("BatteryMonitor", "Device info: type=" + deviceInformation.getDeviceType() + ", battery=" + deviceInformation.getBattery());
                    return deviceInformation.getBattery();
                }
            }).filter(new Predicate() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$5
                @Override // io.reactivex.rxjava3.functions.Predicate
                public final boolean test(Device.DeviceBattery deviceBattery) {
                    boolean z = deviceBattery != null;
                    if (!z) {
                        Log.w("BatteryMonitor", "Battery data is null");
                        return z;
                    }
                    Log.d("BatteryMonitor", "Battery data: level=" + deviceBattery.getLevel() + ", status=" + deviceBattery.getStatus());
                    return z;
                }
            }).distinctUntilChanged(new Function() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$6
                @Override // io.reactivex.rxjava3.functions.Function
                public final Device.DeviceBattery.Status apply(Device.DeviceBattery deviceBattery) {
                    return deviceBattery.getStatus();
                }
            }).debounce(2000L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$7
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Disposable disposable) {
                    disposable.getClass();
                    Log.i("BatteryMonitor", "Battery status subscription STARTED.");
                }
            }).doOnDispose(new DwellTracker$$ExternalSyntheticLambda0(9)).subscribe(new Consumer() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$9
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Device.DeviceBattery deviceBattery) {
                    BatteryMonitor batteryMonitor = BatteryMonitor.this;
                    deviceBattery.getClass();
                    batteryMonitor.handleBatteryStatusChange(deviceBattery);
                }
            }, new Consumer() { // from class: com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor$start$10
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Throwable th) {
                    th.getClass();
                    Log.e("BatteryMonitor", "Error in battery status subscription", th);
                }
            });
        }
    }

    public final void stop() {
        Log.d(TAG, "Stopping battery monitoring");
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/autoimport/BatteryMonitor$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "CHARGING_DETECTION_DEBOUNCE_MS", "", "isChargingTransition", "", "previousStatus", "Lcom/amazon/alexa/accessory/protocol/Device$DeviceBattery$Status;", "currentStatus", "isChargingTransition$AlexaAccessoryEchoFramesAndroid_release", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isChargingTransition$AlexaAccessoryEchoFramesAndroid_release(@Nullable Device.DeviceBattery.Status previousStatus, @NotNull Device.DeviceBattery.Status currentStatus) {
            currentStatus.getClass();
            if (currentStatus == Device.DeviceBattery.Status.CHARGING) {
                return previousStatus == null || previousStatus == Device.DeviceBattery.Status.DISCHARGING || previousStatus == Device.DeviceBattery.Status.UNKNOWN;
            }
            return false;
        }

        private Companion() {
        }
    }
}
