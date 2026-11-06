package com.amazon.alexa.accessory.frames.utils.device;

import com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/utils/device/DeviceBatteryProvider;", "", "batteryMonitor", "Lcom/amazon/alexa/accessory/frames/media/autoimport/BatteryMonitor;", "<init>", "(Lcom/amazon/alexa/accessory/frames/media/autoimport/BatteryMonitor;)V", Constants.LOG_TAG, "", "getBatteryLevel", "", "()Ljava/lang/Integer;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeviceBatteryProvider {

    @NotNull
    private final String TAG;

    @NotNull
    private final BatteryMonitor batteryMonitor;

    public DeviceBatteryProvider(@NotNull BatteryMonitor batteryMonitor) {
        batteryMonitor.getClass();
        this.batteryMonitor = batteryMonitor;
        this.TAG = "DeviceBatteryProvider";
    }

    @Nullable
    public final Integer getBatteryLevel() {
        Integer lastKnownLevel = this.batteryMonitor.getLastKnownLevel();
        Log.d(this.TAG, "Battery level from cache: " + lastKnownLevel);
        return lastKnownLevel;
    }
}
