package com.amazon.deecomms.calling.ui;

import java.util.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class EnhancedProcessingStateObservable extends Observable {
    @Inject
    public EnhancedProcessingStateObservable() {
    }

    public void onEnhancedProcessingStateChange(boolean z) {
        setChanged();
        notifyObservers(Boolean.valueOf(z));
    }
}
