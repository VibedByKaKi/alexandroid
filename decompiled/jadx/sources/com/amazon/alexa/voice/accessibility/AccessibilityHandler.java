package com.amazon.alexa.voice.accessibility;

import com.amazon.alexa.voice.ui.speech.SpeechController;
import com.amazon.alexa.voice.ui.util.BaseProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AccessibilityHandler {
    private final AccessibilityDelegate accessibilityDelegate;
    private BaseProperty.OnChangedListener onChangedListener = new AccessibilityHandler$$ExternalSyntheticLambda0(this, 0);
    private final SpeechController speechController;

    public AccessibilityHandler(SpeechController speechController, AccessibilityDelegate accessibilityDelegate) {
        this.speechController = speechController;
        this.accessibilityDelegate = accessibilityDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAccessibility() {
        if (this.speechController.isListening().get() || this.speechController.isSpeaking().get() || this.speechController.isProcessing().get()) {
            this.accessibilityDelegate.disableAccessibility();
        } else {
            this.accessibilityDelegate.enableAccessibility();
        }
    }

    public boolean canEnableAccessibility() {
        return (this.speechController.isListening().get() || this.speechController.isProcessing().get() || this.speechController.isSpeaking().get()) ? false : true;
    }

    public void startControllingAccessibility() {
        stopControllingAccessibility();
        this.speechController.isListening().addOnChangedListener(this.onChangedListener);
        this.speechController.isProcessing().addOnChangedListener(this.onChangedListener);
        this.speechController.isSpeaking().addOnChangedListener(this.onChangedListener);
    }

    public void stopControllingAccessibility() {
        this.speechController.isSpeaking().removeOnChangedListener(this.onChangedListener);
        this.speechController.isProcessing().removeOnChangedListener(this.onChangedListener);
        this.speechController.isListening().removeOnChangedListener(this.onChangedListener);
    }
}
