package com.amazon.alexa.accessory.notificationpublisher.transcriber;

import android.os.Handler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
interface Transcriber {
    void cancelTranscribe();

    boolean hasRecordAudioPermission();

    void onManualSpeechEndPointing();

    boolean startTranscribe(TranscribeListener transcribeListener, Handler handler);
}
