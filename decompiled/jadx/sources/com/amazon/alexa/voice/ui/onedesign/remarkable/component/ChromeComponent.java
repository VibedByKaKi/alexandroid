package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.amazon.alexa.voice.ui.util.AlexaState;
import com.amazon.alexa.voice.ui.widget.AlexaChromeView;
import com.amazon.alexa.vox.ui.onedesign.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ChromeComponent {
    private static final String TAG = "ChromeComponent";
    private AlexaChromeView alexaChromeView;
    private final Context context;
    Animation dismissChromeAnimations;
    Animation openChromeAnimations;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.onedesign.remarkable.component.ChromeComponent$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$voice$ui$util$AlexaState;

        static {
            int[] iArr = new int[AlexaState.values().length];
            $SwitchMap$com$amazon$alexa$voice$ui$util$AlexaState = iArr;
            try {
                iArr[AlexaState.THINKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$util$AlexaState[AlexaState.SPEAKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$util$AlexaState[AlexaState.LISTENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ChromeComponent(Context context) {
        this.context = context;
    }

    private void createDismissChromeInterpolator() {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(this.context, R.anim.motion_easing_accelerate);
        long integer = this.context.getResources().getInteger(R.integer.alexachrome_view_dismiss_duration);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.context.getResources().getInteger(R.integer.chrome_view_y_delta));
        this.dismissChromeAnimations = translateAnimation;
        translateAnimation.setDuration(integer);
        this.dismissChromeAnimations.setInterpolator(loadInterpolator);
    }

    private void createOpenChromeInterpolator() {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(this.context, R.anim.motion_easing_decelerate_mild);
        long integer = this.context.getResources().getInteger(R.integer.alexachrome_view_open_duration);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.context.getResources().getInteger(R.integer.chrome_view_y_delta), 0.0f);
        this.openChromeAnimations = translateAnimation;
        translateAnimation.setDuration(integer);
        this.openChromeAnimations.setInterpolator(loadInterpolator);
    }

    private void dismissChromeAnimation() {
        this.alexaChromeView.startAnimation(this.dismissChromeAnimations);
        this.alexaChromeView.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openChromeAnimation() {
        if (this.alexaChromeView.getVisibility() == 4) {
            this.alexaChromeView.startAnimation(this.openChromeAnimations);
            this.alexaChromeView.postInvalidateOnAnimation();
        }
    }

    private void setChromeViewAnimations() {
        createOpenChromeInterpolator();
        createDismissChromeInterpolator();
        this.alexaChromeView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.ChromeComponent.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ChromeComponent.this.alexaChromeView.getViewTreeObserver().removeOnPreDrawListener(this);
                ChromeComponent.this.openChromeAnimation();
                ChromeComponent.this.alexaChromeView.startOpening();
                return true;
            }
        });
    }

    public void animateSoundLevelChange(float f) {
        this.alexaChromeView.animateSoundLevelChange(f);
    }

    public void hide() {
        if (this.alexaChromeView.getVisibility() == 0) {
            this.alexaChromeView.setVisibility(4);
            dismissChromeAnimation();
        }
    }

    public void initialize(AlexaChromeView alexaChromeView) {
        this.alexaChromeView = alexaChromeView;
    }

    public void release() {
        this.alexaChromeView = null;
    }

    public void show() {
        this.alexaChromeView.setVisibility(0);
        setChromeViewAnimations();
    }

    public void startAnimation(AlexaState alexaState) {
        int i = AnonymousClass2.$SwitchMap$com$amazon$alexa$voice$ui$util$AlexaState[alexaState.ordinal()];
        if (i == 1) {
            this.alexaChromeView.startThinking();
        } else if (i == 2) {
            this.alexaChromeView.startResponding();
        } else {
            if (i != 3) {
                return;
            }
            this.alexaChromeView.startListening();
        }
    }
}
