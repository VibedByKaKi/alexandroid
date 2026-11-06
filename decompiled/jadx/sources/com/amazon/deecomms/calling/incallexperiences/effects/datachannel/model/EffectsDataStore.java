package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EffectsDataStore {
    private static EffectsDataStore callCaptioningDataStoreInstance;
    private static EffectsDataStore effectDataStoreInstance;
    private static EffectsDataStore reactionsDataStoreInstance;
    private EffectData effectData;

    public static EffectsDataStore getCallCaptioningInstance() {
        if (callCaptioningDataStoreInstance == null) {
            callCaptioningDataStoreInstance = new EffectsDataStore();
        }
        return callCaptioningDataStoreInstance;
    }

    public static EffectsDataStore getEffectsInstance() {
        if (effectDataStoreInstance == null) {
            effectDataStoreInstance = new EffectsDataStore();
        }
        return effectDataStoreInstance;
    }

    public static EffectsDataStore getReactionsInstance() {
        if (reactionsDataStoreInstance == null) {
            reactionsDataStoreInstance = new EffectsDataStore();
        }
        return reactionsDataStoreInstance;
    }

    public void deleteEffectData() {
        this.effectData = null;
    }

    public EffectData getEffectData() {
        return this.effectData;
    }

    public boolean isEffectActive() {
        EffectData effectData = this.effectData;
        if (effectData == null || effectData.getEffectIcons() == null || this.effectData.getEffectIcons().isEmpty()) {
            return false;
        }
        Iterator<EffectIcon> it2 = this.effectData.getEffectIcons().iterator();
        while (it2.hasNext()) {
            if (it2.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    public void saveEffectData(EffectData effectData) {
        this.effectData = effectData;
    }
}
