package com.amazon.alexa.accessory.frames.utils.device;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/utils/device/PhoneBatteryProvider;", "", "<init>", "()V", Constants.LOG_TAG, "", "DEFAULT_BATTERY_LEVEL", "", "getBatteryStatus", "Lcom/amazon/alexa/accessory/frames/utils/device/BatteryStatus;", "context", "Landroid/content/Context;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneBatteryProvider {
    private static final int DEFAULT_BATTERY_LEVEL = 100;

    @NotNull
    public static final PhoneBatteryProvider INSTANCE = new PhoneBatteryProvider();

    @NotNull
    private static final String TAG = "PhoneBatteryProvider";

    private PhoneBatteryProvider() {
    }

    @NotNull
    public final BatteryStatus getBatteryStatus(@NotNull Context context) {
        context.getClass();
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Log.w(TAG, "Unable to retrieve battery status, using default values");
            return new BatteryStatus(100, false, false, 4, null);
        }
        int intExtra = registerReceiver.getIntExtra(ModelTransformer.KEY_BATTERY_LEVEL, -1);
        int intExtra2 = registerReceiver.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1);
        int intExtra3 = registerReceiver.getIntExtra("status", -1);
        int i = 100;
        if (intExtra >= 0 && intExtra2 > 0) {
            i = (intExtra * 100) / intExtra2;
        }
        int i2 = i;
        boolean z = intExtra3 == 2 || intExtra3 == 5;
        Log.i(TAG, "Battery status - Level: " + i2 + "%, Charging: " + z);
        return new BatteryStatus(i2, z, false, 4, null);
    }
}
