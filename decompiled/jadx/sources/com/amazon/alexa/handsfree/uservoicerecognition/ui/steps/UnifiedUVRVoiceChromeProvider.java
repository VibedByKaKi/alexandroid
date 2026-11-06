package com.amazon.alexa.handsfree.uservoicerecognition.ui.steps;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UnifiedUVRVoiceChromeProvider implements StepsContract.VoiceChrome {
    private static final String TAG = "UnifiedUVRVoiceChromeProvider";

    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.VoiceChrome
    public void dismissVoiceChrome(@NonNull StepsContract.ViewListener viewListener) {
        viewListener.onVoiceChromeDismissed();
    }

    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.VoiceChrome
    public void setVoiceChromeNotRecording() {
    }

    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.VoiceChrome
    public void setVoiceChromeRecording() {
    }

    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.VoiceChrome
    public void showVoiceChrome() {
    }

    @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.steps.StepsContract.VoiceChrome
    public void setVoiceChromeLevelOnFeedback(float f) {
    }
}
