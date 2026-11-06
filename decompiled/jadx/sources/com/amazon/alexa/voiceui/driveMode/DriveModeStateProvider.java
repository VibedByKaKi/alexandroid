package com.amazon.alexa.voiceui.driveMode;

import com.amazon.alexa.voice.ui.onedesign.util.Properties;
import com.amazon.alexa.voice.ui.util.BooleanProperty;
import io.reactivex.rxjava3.core.Observable;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class DriveModeStateProvider {
    private BooleanProperty driveModeEnabled;
    private final Observable<Boolean> driveModeEnabledObservable;

    public DriveModeStateProvider() {
        BooleanProperty booleanProperty = new BooleanProperty(false);
        this.driveModeEnabled = booleanProperty;
        this.driveModeEnabledObservable = Properties.toObservable(booleanProperty);
    }

    public boolean getDriveModeEnabled() {
        return this.driveModeEnabled.get();
    }

    public Observable<Boolean> onDriveModeEnabled() {
        return this.driveModeEnabledObservable;
    }

    public void setDriveModeEnabled(boolean z) {
        this.driveModeEnabled.set(z);
    }
}
