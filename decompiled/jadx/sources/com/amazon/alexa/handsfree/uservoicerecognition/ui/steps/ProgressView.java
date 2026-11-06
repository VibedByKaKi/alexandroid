package com.amazon.alexa.handsfree.uservoicerecognition.ui.steps;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.uservoicerecognition.R;
import com.amazon.alexa.handsfree.uservoicerecognition.model.EnrollmentStep;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ProgressView extends LinearLayout {

    @Dimension
    private int mStepSeparation;

    public ProgressView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ProgressView, 0, 0);
        this.mStepSeparation = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ProgressView_stepSeparation, 0);
        setOrientation(0);
        obtainStyledAttributes.recycle();
    }

    @VisibleForTesting
    public StepView getNewStepView(int i, int i2, @NonNull EnrollmentStep.TrainingState trainingState) {
        return new StepView(getContext(), i, i2, trainingState);
    }

    public void initialize(int i, @NonNull EnrollmentStep.TrainingState trainingState) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            StepView newStepView = getNewStepView(i2, i, trainingState);
            initializeStepViewLayout(i2, newStepView);
            addView(newStepView);
        }
    }

    @VisibleForTesting
    public void initializeStepViewLayout(int i, @NonNull View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (i > 0) {
            layoutParams.setMarginStart(this.mStepSeparation);
        }
        view.setLayoutParams(layoutParams);
    }

    public void setStepState(int i, @NonNull EnrollmentStep.TrainingState trainingState, boolean z) {
        ((StepView) getChildAt(i)).setStepState(trainingState, z);
    }

    @VisibleForTesting
    public ProgressView(@NonNull Context context, int i) {
        super(context);
        this.mStepSeparation = i;
        setOrientation(0);
    }
}
