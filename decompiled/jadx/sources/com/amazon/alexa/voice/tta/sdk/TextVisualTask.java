package com.amazon.alexa.voice.tta.sdk;

import com.amazon.alexa.api.AlexaVisualTask;
import com.amazon.alexa.voice.tta.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TextVisualTask implements AlexaVisualTask {
    private static final String TAG = "TextVisualTask";

    @Override // com.amazon.alexa.api.AlexaVisualTask
    public String getTaskComponentName() {
        return Constants.Namespaces.TEXT;
    }

    @Override // com.amazon.alexa.api.AlexaVisualTask
    public void onStop() {
    }
}
