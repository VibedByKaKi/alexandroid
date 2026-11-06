package com.amazon.alexa.presence.bleconn.data;

import android.content.Context;
import com.amazon.alexa.presence.service.PersistentMap;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DeveloperSettings {
    private static final String BLE_V2_OVERRIDE_KEY = "BleV2Override";
    private PersistentMap settings;

    @Inject
    public DeveloperSettings(Context context) {
        this.settings = null;
        this.settings = loadSettings(context);
    }

    private static PersistentMap loadSettings(Context context) {
        return new PersistentMap(context);
    }

    public void clearBleV2Override() {
        this.settings.remove((Object) BLE_V2_OVERRIDE_KEY);
    }

    public Boolean getBleV2OverrideStatus() {
        String str = this.settings.get((Object) BLE_V2_OVERRIDE_KEY);
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public Boolean isBleV2OverrideOff() {
        return Boolean.valueOf((getBleV2OverrideStatus() == null || getBleV2OverrideStatus().booleanValue()) ? false : true);
    }

    public Boolean isBleV2OverrideOn() {
        return Boolean.valueOf(getBleV2OverrideStatus() != null && getBleV2OverrideStatus().booleanValue());
    }

    public void setBleV2Override(boolean z) {
        this.settings.put(BLE_V2_OVERRIDE_KEY, Boolean.toString(z));
    }
}
