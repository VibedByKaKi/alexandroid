package com.amazon.alexa.voice.handsfree.settings.providers;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract;
import com.amazon.alexa.handsfree.settings.contract.SetupFlow;
import com.amazon.alexa.voice.handsfree.decider.HandsFreeSetupDeciderProvider;
import com.amazon.alexa.voice.handsfree.decider.SetupFlowExecutionService;
import com.amazon.alexa.voice.handsfree.decider.StepsProvider;
import com.amazon.alexa.voice.handsfree.decider.stepcommand.StepCommand;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SettingsSetupFlowProvider implements SettingsSetupFlowContract {
    private final HandsFreeSetupDeciderProvider mHandsFreeSetupDeciderProvider;
    private final SetupFlowExecutionService.ServiceHelper mServiceHelper;

    public SettingsSetupFlowProvider() {
        this(HandsFreeSetupDeciderProvider.getInstance(), SetupFlowExecutionService.ServiceHelper.getInstance());
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract
    public boolean canEnableWakeWord(@NonNull Context context) {
        return this.mHandsFreeSetupDeciderProvider.getHandsFreeSetupDecider(context).canEnableWakeWord();
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract
    @Nullable
    public Intent getPendingSetupIntent(@NonNull Context context, @NonNull SetupFlow setupFlow) {
        StepCommand nextSetupStepCommand = this.mHandsFreeSetupDeciderProvider.getHandsFreeSetupDecider(context, setupFlow).getNextSetupStepCommand();
        if (nextSetupStepCommand == null || nextSetupStepCommand.getStepIntent() == null) {
            return null;
        }
        return this.mServiceHelper.decorateStepIntent(context, nextSetupStepCommand.getStepType(), nextSetupStepCommand.getStepIntent(), StepsProvider.getInstance().getSetupFlow());
    }

    @Override // com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract
    public boolean hasPendingSetup(@NonNull Context context, @NonNull SetupFlow setupFlow) {
        return this.mHandsFreeSetupDeciderProvider.getHandsFreeSetupDecider(context, setupFlow).isTherePendingStepCommand();
    }

    @VisibleForTesting
    public SettingsSetupFlowProvider(@NonNull HandsFreeSetupDeciderProvider handsFreeSetupDeciderProvider, @NonNull SetupFlowExecutionService.ServiceHelper serviceHelper) {
        this.mHandsFreeSetupDeciderProvider = handsFreeSetupDeciderProvider;
        this.mServiceHelper = serviceHelper;
    }
}
