package com.amazon.alexa.voice.tta.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.api.AlexaState;
import com.amazon.alexa.api.AlexaStateListener;
import com.amazon.alexa.location.LocationManager$$ExternalSyntheticLambda1;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaStateTracker implements AlexaStateListener {
    private static final String TAG = "AlexaStateTracker";
    private final BehaviorSubject<AlexaState> alexaState = BehaviorSubject.createDefault(AlexaState.UNKNOWN);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onIdle$2(AlexaState alexaState) throws Throwable {
        return Boolean.valueOf(AlexaState.IDLE == alexaState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onListening$1(AlexaState alexaState) throws Throwable {
        return Boolean.valueOf(AlexaState.LISTENING == alexaState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onThinking$0(AlexaState alexaState) throws Throwable {
        return Boolean.valueOf(AlexaState.THINKING == alexaState);
    }

    @Override // com.amazon.alexa.api.AlexaStateListener
    public void onAlexaStateChanged(@NonNull AlexaState alexaState) {
        if (this.alexaState.getValue() == alexaState) {
            return;
        }
        Log.i(TAG, "Alexa state changed: " + this.alexaState.getValue() + " -> " + alexaState);
        this.alexaState.onNext(alexaState);
    }

    public Observable<Boolean> onIdle() {
        return this.alexaState.map(new LocationManager$$ExternalSyntheticLambda1(16)).distinctUntilChanged();
    }

    public Observable<Boolean> onListening() {
        return this.alexaState.map(new LocationManager$$ExternalSyntheticLambda1(14)).distinctUntilChanged();
    }

    public Observable<Boolean> onThinking() {
        return this.alexaState.map(new LocationManager$$ExternalSyntheticLambda1(15)).distinctUntilChanged();
    }
}
