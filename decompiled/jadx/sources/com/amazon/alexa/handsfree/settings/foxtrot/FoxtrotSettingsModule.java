package com.amazon.alexa.handsfree.settings.foxtrot;

import com.amazon.alexa.handsfree.settings.contract.SettingsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum FoxtrotSettingsModule {
    INSTANCE;

    private final SettingsContract mSettingsContract = new SettingsContract(new FoxtrotPreferenceSetting());

    FoxtrotSettingsModule() {
    }

    public SettingsContract getSettingsContract() {
        return this.mSettingsContract;
    }
}
