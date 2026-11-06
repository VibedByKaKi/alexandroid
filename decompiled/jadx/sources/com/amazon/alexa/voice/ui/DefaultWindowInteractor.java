package com.amazon.alexa.voice.ui;

import android.view.Window;
import androidx.annotation.ColorInt;
import com.amazon.alexa.voice.ui.window.WindowInteractor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DefaultWindowInteractor implements WindowInteractor {

    @ColorInt
    private final int defaultStatusBarColor;
    private final Window window;

    public DefaultWindowInteractor(Window window) {
        this.window = window;
        this.defaultStatusBarColor = window.getStatusBarColor();
    }

    private void setStatusBarBackgroundColor(@ColorInt int i) {
        this.window.clearFlags(67108864);
        this.window.addFlags(Integer.MIN_VALUE);
        this.window.setStatusBarColor(i);
    }

    @Override // com.amazon.alexa.voice.ui.window.WindowInteractor
    public void restoreDefaultStatusBarColor() {
        setStatusBarBackgroundColor(this.defaultStatusBarColor);
    }

    @Override // com.amazon.alexa.voice.ui.window.WindowInteractor
    public void setStatusBarColor(@ColorInt int i) {
        setStatusBarBackgroundColor(i);
    }

    @Override // com.amazon.alexa.voice.ui.window.WindowInteractor
    public void setWindowBackground(int i) {
        this.window.setBackgroundDrawableResource(i);
    }
}
