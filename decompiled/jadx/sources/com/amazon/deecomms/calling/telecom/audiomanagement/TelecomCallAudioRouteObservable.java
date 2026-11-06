package com.amazon.deecomms.calling.telecom.audiomanagement;

import android.telecom.CallAudioState;
import androidx.annotation.NonNull;
import java.util.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TelecomCallAudioRouteObservable extends Observable {
    public void onCallAudioStateUpdated(@NonNull CallAudioState callAudioState) {
        setChanged();
        notifyObservers(callAudioState);
    }
}
