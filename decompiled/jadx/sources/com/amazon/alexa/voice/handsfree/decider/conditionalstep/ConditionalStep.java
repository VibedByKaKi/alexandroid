package com.amazon.alexa.voice.handsfree.decider.conditionalstep;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.handsfree.decider.StepType;
import com.amazon.alexa.voice.handsfree.decider.stepcommand.StepCommand;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class ConditionalStep {
    private ExecutionState mExecutionState;

    public ConditionalStep(@NonNull ExecutionState executionState) {
        this.mExecutionState = executionState;
    }

    public ExecutionState getExecutionState() {
        return this.mExecutionState;
    }

    @NonNull
    public abstract StepCommand getStepCommand();

    @NonNull
    public abstract StepType getStepType();

    public abstract boolean isLaunchedInFtue();

    public abstract boolean isRequiredForWakeWord();

    public void mediateExecution() {
        if (isRequiredForWakeWord() && isLaunchedInFtue() && needsExecution()) {
            this.mExecutionState.reportFtueMandatoryExecution(this);
        }
    }

    public abstract boolean needsExecution();
}
