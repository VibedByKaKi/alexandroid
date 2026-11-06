package com.swmansion.reanimated.keyboard;

import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.PixelUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = WindowInsetsCompat.Type.ime();
    private static final int SYSTEM_BAR_TYPE_MASK = WindowInsetsCompat.Type.systemBars();
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i;
        if (i == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i = this.mActiveTransitionCounter;
        if (i > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i + 1;
    }

    public void updateHeight(WindowInsetsCompat windowInsetsCompat, boolean z) {
        int dIPFromPixel = (int) PixelUtil.toDIPFromPixel(Math.max(0, windowInsetsCompat.getInsets(CONTENT_TYPE_MASK).bottom - (z ? 0 : windowInsetsCompat.getInsets(SYSTEM_BAR_TYPE_MASK).bottom)));
        if (dIPFromPixel > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = dIPFromPixel;
        }
    }
}
