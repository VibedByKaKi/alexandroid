package com.amazon.comms.calling.service;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PlatformVoIPSelection {
    private final boolean enableDolbyDap;
    private final boolean enableLibasp;

    public PlatformVoIPSelection(boolean z, boolean z2) {
        this.enableLibasp = z;
        this.enableDolbyDap = z2;
    }

    public boolean isEnableDolbyDap() {
        return this.enableDolbyDap;
    }

    public boolean isEnableLibasp() {
        return this.enableLibasp;
    }
}
