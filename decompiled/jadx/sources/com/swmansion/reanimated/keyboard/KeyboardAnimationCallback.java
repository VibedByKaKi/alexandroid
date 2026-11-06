package com.swmansion.reanimated.keyboard;

import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class KeyboardAnimationCallback extends WindowInsetsAnimationCompat.Callback {
    private static final int CONTENT_TYPE_MASK = WindowInsetsCompat.Type.ime();
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        return (windowInsetsAnimationCompat.getTypeMask() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        if (isKeyboardAnimation(windowInsetsAnimationCompat)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        Iterator<WindowInsetsAnimationCompat> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (isKeyboardAnimation(it2.next())) {
                this.mKeyboard.updateHeight(windowInsetsCompat, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        if (!isKeyboardAnimation(windowInsetsAnimationCompat)) {
            return boundsCompat;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return super.onStart(windowInsetsAnimationCompat, boundsCompat);
    }
}
