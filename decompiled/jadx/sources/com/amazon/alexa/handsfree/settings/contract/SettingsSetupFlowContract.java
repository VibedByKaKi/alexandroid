package com.amazon.alexa.handsfree.settings.contract;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SettingsSetupFlowContract {
    public static final String AIS_FLOW_ONGOING = "AIS_FLOW_ONGOING";
    public static final String PREFERENCE_FILE_NAME = "FalcoSetupPrefs";

    boolean canEnableWakeWord(Context context);

    Intent getPendingSetupIntent(Context context, SetupFlow setupFlow);

    boolean hasPendingSetup(Context context, SetupFlow setupFlow);
}
