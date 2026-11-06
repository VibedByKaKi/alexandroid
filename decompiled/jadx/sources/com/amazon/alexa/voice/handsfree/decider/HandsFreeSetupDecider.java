package com.amazon.alexa.voice.handsfree.decider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AHFSunsetWeblabStateProvider;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.decider.conditionalstep.ConditionalStep;
import com.amazon.alexa.voice.handsfree.decider.stepcommand.StepCommand;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HandsFreeSetupDecider {
    private static final String TAG = "HandsFreeSetupDecider";
    private final AHFSunsetWeblabStateProvider mAHFSunsetWeblabStateProvider;
    private final List<ConditionalStep> mConditionalSteps;

    public HandsFreeSetupDecider(@NonNull List<ConditionalStep> list, @NonNull AHFSunsetWeblabStateProvider aHFSunsetWeblabStateProvider) {
        this.mConditionalSteps = list;
        this.mAHFSunsetWeblabStateProvider = aHFSunsetWeblabStateProvider;
    }

    public boolean canEnableWakeWord() {
        for (ConditionalStep conditionalStep : this.mConditionalSteps) {
            if (conditionalStep.needsExecution() && conditionalStep.isRequiredForWakeWord()) {
                Log.d(TAG, "Step " + conditionalStep.getStepType().name() + " required for wake word!");
                return false;
            }
        }
        return true;
    }

    @NonNull
    @VisibleForTesting
    public List<ConditionalStep> getConditionalSteps() {
        return this.mConditionalSteps;
    }

    @Nullable
    public StepCommand getNextSetupStepCommand() {
        if (this.mAHFSunsetWeblabStateProvider.getAHFSunsetWeblabState(HandsFreeComponent.REMOVE_AHF_FOR_ALL_CUSTOMERS)) {
            Log.i(TAG, "Cannot provide next step to complete setup");
        }
        return null;
    }

    @Nullable
    public StepCommand getNextSetupStepCommandByStepType(@NonNull StepType stepType) {
        int intValue;
        if (this.mAHFSunsetWeblabStateProvider.getAHFSunsetWeblabState(HandsFreeComponent.REMOVE_AHF_FOR_ALL_CUSTOMERS)) {
            Log.i(TAG, "Cannot provide next step by type to complete setup");
            return null;
        }
        Integer stepIndex = getStepIndex(stepType);
        if (stepIndex == null) {
            return null;
        }
        try {
            intValue = stepIndex.intValue();
        } catch (NoSuchElementException e) {
            Log.e(TAG, e.getMessage());
        }
        do {
            intValue++;
            if (intValue >= this.mConditionalSteps.size()) {
                return null;
            }
        } while (!this.mConditionalSteps.get(intValue).needsExecution());
        return this.mConditionalSteps.get(intValue).getStepCommand();
    }

    @Nullable
    public Integer getStepIndex(@NonNull StepType stepType) {
        for (int i = 0; i < this.mConditionalSteps.size(); i++) {
            if (this.mConditionalSteps.get(i).getStepType() == stepType) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public boolean isTherePendingStepCommand() {
        return getNextSetupStepCommand() != null;
    }
}
