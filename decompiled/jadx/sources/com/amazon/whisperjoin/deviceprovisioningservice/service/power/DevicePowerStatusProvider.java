package com.amazon.whisperjoin.deviceprovisioningservice.service.power;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.alexa.accessorykit.ModelTransformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DevicePowerStatusProvider {
    private final Context mContext;

    public DevicePowerStatusProvider(Context context) {
        this.mContext = context;
    }

    public DevicePowerStatus getDevicePowerStatus() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.mContext;
        Intent registerReceiver = i >= 33 ? context.registerReceiver(null, intentFilter, 2) : context.registerReceiver(null, intentFilter);
        int intExtra = registerReceiver.getIntExtra("status", -1);
        boolean z = intExtra == 2 || intExtra == 5;
        int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
        return new DevicePowerStatus(registerReceiver.getIntExtra(ModelTransformer.KEY_BATTERY_LEVEL, -1) / registerReceiver.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1), z, intExtra2 == 2, intExtra2 == 1);
    }
}
