package com.amazon.alexa.accessory.frames.smartPlay.dynamicUtterance.models;

import com.amazon.alexa.accessory.frames.msp.models.SupportedMSP;
import java.time.LocalDateTime;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class UserCondition {
    private boolean checkWeblab;
    private Season currentSeason;
    private LocalDateTime currentTime;
    private SupportedMSP userCurrentMSP;

    public UserCondition(SupportedMSP supportedMSP, LocalDateTime localDateTime) {
        this.userCurrentMSP = supportedMSP;
        this.currentTime = localDateTime;
        if (localDateTime != null) {
            this.currentSeason = Season.fromLocalDateTime(localDateTime);
            this.checkWeblab = true;
        }
    }

    public Season getCurrentSeason() {
        return this.currentSeason;
    }

    public LocalDateTime getCurrentTime() {
        return this.currentTime;
    }

    public SupportedMSP getUserCurrentMSP() {
        return this.userCurrentMSP;
    }

    public boolean isCheckWeblab() {
        return this.checkWeblab;
    }
}
