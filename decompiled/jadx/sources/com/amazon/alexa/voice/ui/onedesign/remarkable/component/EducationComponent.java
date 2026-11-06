package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.amazon.alexa.voice.ui.onedesign.remarkable.OnSwipeTouchListener;
import com.amazon.alexa.vox.ui.onedesign.R;
import com.mapbox.maps.MapController$$ExternalSyntheticLambda4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EducationComponent {
    private ScrollView educationView;
    private int educationViewDismissalDuration;
    private OnSwipeTouchListener educationViewSwipeTouchListener;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$1() {
        this.educationView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideWithAnimation$2(final Runnable runnable) {
        this.educationView.animate().alpha(0.0f).setDuration(this.educationViewDismissalDuration).setListener(new AnimatorListenerAdapter() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.EducationComponent.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                EducationComponent.this.educationView.setVisibility(8);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scroll$3(int i, int i2) {
        this.educationView.scrollBy(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.educationView.setVisibility(0);
    }

    private void updateCapabilityItem(View view, String str, String str2, Drawable drawable) {
        ((TextView) view.findViewById(R.id.remarkable_alexa_education_capability_title)).setText(str);
        ((TextView) view.findViewById(R.id.remarkable_alexa_education_capability_description)).setText(str2);
        ((ImageView) view.findViewById(R.id.remarkable_alexa_education_capability_image)).setImageDrawable(drawable);
    }

    public void hide() {
        if (this.educationView.getVisibility() != 8) {
            this.educationView.post(new EducationComponent$$ExternalSyntheticLambda1(this, 0));
        }
    }

    public void hideWithAnimation(Runnable runnable) {
        if (this.educationView.getVisibility() != 8) {
            this.educationView.post(new EducationComponent$$ExternalSyntheticLambda2(this, 0, runnable));
        } else if (runnable != null) {
            this.educationView.post(runnable);
        }
    }

    public void initialize(ScrollView scrollView, OnSwipeTouchListener.GestureActionListener gestureActionListener) {
        this.educationView = scrollView;
        OnSwipeTouchListener onSwipeTouchListener = new OnSwipeTouchListener(scrollView.getContext(), gestureActionListener);
        this.educationViewSwipeTouchListener = onSwipeTouchListener;
        this.educationView.setOnTouchListener(onSwipeTouchListener);
        Resources resources = this.educationView.getResources();
        updateCapabilityItem(this.educationView.findViewById(R.id.remarkable_alexa_education_chat), resources.getString(R.string.remarkable_alexa_education_capability_chat_title), resources.getString(R.string.remarkable_alexa_education_capability_chat_description), resources.getDrawable(R.drawable.bottomsheet_ui_remarkable_alexa_sms));
        updateCapabilityItem(this.educationView.findViewById(R.id.remarkable_alexa_education_find), resources.getString(R.string.remarkable_alexa_education_capability_find_title), resources.getString(R.string.remarkable_alexa_education_capability_find_description), resources.getDrawable(R.drawable.ic_magic_sparkle));
        updateCapabilityItem(this.educationView.findViewById(R.id.remarkable_alexa_education_action), resources.getString(R.string.remarkable_alexa_education_capability_action_title), resources.getString(R.string.remarkable_alexa_education_capability_action_description), resources.getDrawable(R.drawable.ic_tap_to_alexa));
        this.educationViewDismissalDuration = resources.getInteger(R.integer.ra_ingress_education_dismissal_duration);
    }

    public void scroll(int i, int i2) {
        this.educationView.post(new MapController$$ExternalSyntheticLambda4(this, i, i2, 6));
    }

    public void show() {
        if (this.educationView.getVisibility() != 0) {
            this.educationView.post(new EducationComponent$$ExternalSyntheticLambda1(this, 1));
        }
    }
}
