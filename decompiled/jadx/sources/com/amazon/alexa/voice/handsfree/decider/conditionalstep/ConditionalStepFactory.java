package com.amazon.alexa.voice.handsfree.decider.conditionalstep;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.handsfree.decider.StepType;
import com.amazon.alexa.voice.handsfree.decider.StepsProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ConditionalStepFactory {
    public List<ConditionalStep> getAISProfileSteps(@NonNull Context context) {
        return getSteps(StepsProvider.getInstance().getAISProfileSteps(context), context);
    }

    @VisibleForTesting
    public List<ConditionalStep> getSteps(@NonNull List<StepType> list, @NonNull Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<StepType> it2 = list.iterator();
        while (it2.hasNext()) {
            ConditionalStep step = it2.next().getStep(context);
            step.mediateExecution();
            arrayList.add(step);
        }
        return arrayList;
    }

    public List<ConditionalStep> getSteps(@NonNull Context context) {
        return getSteps(StepsProvider.getInstance().getSteps(context), context);
    }
}
