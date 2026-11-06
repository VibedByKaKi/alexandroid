package com.amazon.alexa.wakeword.speakerverification.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.wakeword.speakerverification.pryon.PryonOperation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface PryonMetricsListener {
    void onExampleAccepted();

    void onExampleRejected();

    void onPryonOperationFailure(@NonNull PryonOperation pryonOperation, int i);

    void onPryonOperationSuccess(@NonNull PryonOperation pryonOperation);
}
