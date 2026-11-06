package com.amazon.comms.util.modeswitch;

import android.content.Context;
import com.amazon.comms.log.CommsLogger;
import com.google.common.annotations.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ModeSwitchHelper {

    @VisibleForTesting
    public static final String MODE_SWITCH_PACKAGE = "amazon.alexa.modeswitch";
    private static ModeSwitchHelper instance;
    private static final CommsLogger sLog = CommsLogger.getLogger(ModeSwitchHelper.class);

    @VisibleForTesting
    Boolean supportsModeSwitch;

    private ModeSwitchHelper() {
    }

    public static synchronized ModeSwitchHelper getInstance() {
        ModeSwitchHelper modeSwitchHelper;
        synchronized (ModeSwitchHelper.class) {
            try {
                if (instance == null) {
                    instance = new ModeSwitchHelper();
                }
                modeSwitchHelper = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return modeSwitchHelper;
    }

    public boolean deviceSupportsModeSwitch(Context context) {
        if (this.supportsModeSwitch == null) {
            if (context.getPackageManager().hasSystemFeature(MODE_SWITCH_PACKAGE)) {
                sLog.i("ModeSwitch supported. Setting supportsModeSwitch to true.");
                this.supportsModeSwitch = Boolean.TRUE;
            } else {
                sLog.i("ModeSwitch not supported. Setting supportsModeSwitch to false.");
                this.supportsModeSwitch = Boolean.FALSE;
            }
        }
        return this.supportsModeSwitch.booleanValue();
    }
}
