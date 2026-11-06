package com.amazon.alexa.alertsca;

import androidx.annotation.RawRes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
enum AlertSoundName {
    ALARM_FOREGROUND_SOUND(R.raw.avs_med_system_alerts_melodic_01),
    ALARM_BACKGROUND_SOUND(R.raw.avs_med_system_alerts_melodic_01_short),
    TIMER_FOREGROUND_SOUND(R.raw.avs_med_system_alerts_melodic_02),
    TIMER_BACKGROUND_SOUND(R.raw.avs_med_system_alerts_melodic_02_short),
    REMINDER_FOREGROUND_SOUND(R.raw.avs_default_reminder),
    REMINDER_BACKGROUND_SOUND(R.raw.avs_default_reminder);

    private int resId;

    AlertSoundName(@RawRes int i) {
        this.resId = i;
    }

    @RawRes
    public int getResourceId() {
        return this.resId;
    }
}
