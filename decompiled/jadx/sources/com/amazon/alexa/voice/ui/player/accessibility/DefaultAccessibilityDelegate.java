package com.amazon.alexa.voice.ui.player.accessibility;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DefaultAccessibilityDelegate implements AccessibilityDelegate {
    private final View view;

    public DefaultAccessibilityDelegate(View view) {
        this.view = view;
    }

    @Override // com.amazon.alexa.voice.ui.player.accessibility.AccessibilityDelegate
    public void disableAccessibility() {
        this.view.setImportantForAccessibility(4);
    }

    @Override // com.amazon.alexa.voice.ui.player.accessibility.AccessibilityDelegate
    public void enableAccessibility() {
        this.view.setImportantForAccessibility(2);
    }
}
