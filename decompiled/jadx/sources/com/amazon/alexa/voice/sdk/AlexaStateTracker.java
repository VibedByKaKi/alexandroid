package com.amazon.alexa.voice.sdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener;
import com.amazon.alexa.api.compat.model.AlexaStateExtras;
import com.amazon.alexa.api.compat.model.AlexaStateV2;
import com.amazon.apl.android.APLLayout$$ExternalSyntheticLambda0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaStateTracker implements AlexaAttentionSystemListener {
    private static final String TAG = "AlexaStateTracker";
    private final BehaviorSubject<AlexaStateV2> alexaState;
    private volatile AlexaStateV2 lastRequestedState;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public AlexaStateTracker() {
        AlexaStateV2 alexaStateV2 = AlexaStateV2.UNKNOWN;
        this.lastRequestedState = alexaStateV2;
        this.alexaState = BehaviorSubject.createDefault(alexaStateV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isListening(AlexaStateV2 alexaStateV2) {
        return AlexaStateV2.LISTENING == alexaStateV2 || AlexaStateV2.PREPARING_TO_LISTEN == alexaStateV2 || AlexaStateV2.FINISHING_LISTENING == alexaStateV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isListeningOrProcessing(AlexaStateV2 alexaStateV2) {
        return isProcessing(alexaStateV2) || isListening(alexaStateV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNotRunning(AlexaStateV2 alexaStateV2) {
        return AlexaStateV2.IDLE == alexaStateV2 || AlexaStateV2.UNKNOWN == alexaStateV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isProcessing(AlexaStateV2 alexaStateV2) {
        return AlexaStateV2.THINKING == alexaStateV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAlexaStateChanged$0(AlexaStateV2 alexaStateV2) {
        this.alexaState.onNext(alexaStateV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$onSpeaking$1(AlexaStateV2 alexaStateV2) throws Throwable {
        return Boolean.valueOf(AlexaStateV2.SPEAKING == alexaStateV2);
    }

    public boolean isSpeaking() {
        return isSpeaking(this.alexaState.getValue());
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener
    public void onAlexaStateChanged(@NonNull AlexaStateV2 alexaStateV2, @NonNull AlexaStateExtras alexaStateExtras) {
        if (alexaStateV2 == this.lastRequestedState) {
            return;
        }
        this.lastRequestedState = alexaStateV2;
        Log.i(TAG, "Alexa state changed: " + this.alexaState.getValue() + " -> " + alexaStateV2);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.alexaState.onNext(alexaStateV2);
        } else {
            this.mainHandler.post(new APLLayout$$ExternalSyntheticLambda0(this, alexaStateV2, 19));
        }
    }

    public Observable<Boolean> onIdle() {
        return this.alexaState.map(new AlexaStateTracker$$ExternalSyntheticLambda0(2)).distinctUntilChanged();
    }

    public Observable<Boolean> onListening() {
        return this.alexaState.map(new AlexaStateTracker$$ExternalSyntheticLambda0(4)).distinctUntilChanged();
    }

    public Observable<Boolean> onListeningOrProcessing() {
        return this.alexaState.map(new AlexaStateTracker$$ExternalSyntheticLambda0(1)).distinctUntilChanged();
    }

    public Observable<Boolean> onProcessing() {
        return this.alexaState.map(new AlexaStateTracker$$ExternalSyntheticLambda0(0)).distinctUntilChanged();
    }

    public Observable<Boolean> onSpeaking() {
        return this.alexaState.map(new AlexaStateTracker$$ExternalSyntheticLambda0(3)).distinctUntilChanged();
    }

    private static boolean isSpeaking(AlexaStateV2 alexaStateV2) {
        return AlexaStateV2.SPEAKING == alexaStateV2;
    }

    public boolean isListeningOrProcessing() {
        return isListeningOrProcessing(this.alexaState.getValue());
    }
}
