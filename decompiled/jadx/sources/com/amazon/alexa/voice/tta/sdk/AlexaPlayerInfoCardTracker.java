package com.amazon.alexa.voice.tta.sdk;

import com.amazon.alexa.api.AlexaPlayerInfoCardListener;
import com.amazon.alexa.api.AlexaPlayerInfoState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaPlayerInfoCardTracker implements AlexaPlayerInfoCardListener {
    private static String prevAudioItemId = "";
    private final PublishSubject<AlexaPlayerInfoState> alexaPlayerInfo = PublishSubject.create();

    public Observable<AlexaPlayerInfoState> onAlexaPlayerInfoState() {
        return this.alexaPlayerInfo;
    }

    @Override // com.amazon.alexa.api.AlexaPlayerInfoCardListener
    public void onAudioItemStateChanged(AlexaPlayerInfoState alexaPlayerInfoState, String str, long j) {
        if (prevAudioItemId.contentEquals(str) || alexaPlayerInfoState != AlexaPlayerInfoState.PLAYING) {
            return;
        }
        prevAudioItemId = str;
        this.alexaPlayerInfo.onNext(alexaPlayerInfoState);
    }

    @Override // com.amazon.alexa.api.AlexaPlayerInfoCardListener
    public void onReceivedPlayerInfoCard(String str, boolean z) {
    }
}
