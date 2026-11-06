package com.amazon.alexa.voiceui.accessibility;

import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.ui.speech.AttentionSystemContract;
import com.amazon.alexa.voice.ui.util.AlexaState;
import com.amazon.alexa.voice.ui.util.BaseProperty;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class AccessibilityHandler {
    private static final String VOICE_INTERACTION_FINISH_INTENT = "amazon.speech.VOICE_INTERACTION_COMPLETE";
    private static final String VOICE_INTERACTION_START_INTENT = "amazon.speech.VOICE_INTERACTION";
    private final AccessibilityDelegate accessibilityDelegate;
    private final AttentionSystemContract attentionSystemContract;
    private final Context context;
    private final BaseProperty.OnChangedListener onChangedListener = new PropertyChangedListener(this, 0);

    @Inject
    public AccessibilityHandler(AttentionSystemContract attentionSystemContract, AccessibilityDelegate accessibilityDelegate, Context context) {
        this.attentionSystemContract = attentionSystemContract;
        this.accessibilityDelegate = accessibilityDelegate;
        this.context = context;
    }

    private boolean isAlexaActive() {
        AlexaState alexaState = this.attentionSystemContract.alexaState().get();
        return alexaState == AlexaState.LISTENING || alexaState == AlexaState.SPEAKING || alexaState == AlexaState.THINKING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAccessibility() {
        boolean canEnableAccessibility = canEnableAccessibility();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (canEnableAccessibility) {
            accessibilityDelegate.enableAccessibility();
        } else {
            accessibilityDelegate.disableAccessibility();
        }
    }

    public boolean canEnableAccessibility() {
        return !isAlexaActive();
    }

    public void setCurrentAccessibilityForFireTablets() {
        boolean isAlexaActive = isAlexaActive();
        Context context = this.context;
        if (isAlexaActive) {
            context.sendBroadcast(new Intent("amazon.speech.VOICE_INTERACTION"));
        } else {
            context.sendBroadcast(new Intent("amazon.speech.VOICE_INTERACTION_COMPLETE"));
        }
    }

    public void startControllingAccessibility() {
        stopControllingAccessibility();
        this.attentionSystemContract.alexaState().addOnChangedListener(this.onChangedListener);
    }

    public void stopControllingAccessibility() {
        this.attentionSystemContract.alexaState().removeOnChangedListener(this.onChangedListener);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PropertyChangedListener implements BaseProperty.OnChangedListener {
        private PropertyChangedListener() {
        }

        @Override // com.amazon.alexa.voice.ui.util.BaseProperty.OnChangedListener
        public void onPropertyChanged() {
            if (FireTabletUtils.isFireOS()) {
                AccessibilityHandler.this.setCurrentAccessibilityForFireTablets();
            }
            AccessibilityHandler.this.setCurrentAccessibility();
        }

        public /* synthetic */ PropertyChangedListener(AccessibilityHandler accessibilityHandler, int i) {
            this();
        }
    }
}
