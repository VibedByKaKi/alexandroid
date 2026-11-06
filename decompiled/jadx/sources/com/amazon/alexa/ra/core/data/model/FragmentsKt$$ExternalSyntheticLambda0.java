package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.assistant.foundation.textstate.model.TextRequestError;
import com.amazon.alexa.assistant.ui.conversation.ConversationViewModelFactory;
import com.amazon.alexa.assistant.ui.conversation.metrics.TouchInteractionMetricProcessor;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class FragmentsKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ FragmentsKt$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int orderedChildren$lambda$1;
        Unit create$lambda$21;
        switch (this.$r8$classId) {
            case 0:
                orderedChildren$lambda$1 = FragmentsKt.orderedChildren$lambda$1((FragmentData) this.f$0, (Function0) this.f$1, (HashMap) this.f$2, (FragmentData) obj, (FragmentData) obj2);
                return Integer.valueOf(orderedChildren$lambda$1);
            default:
                create$lambda$21 = ConversationViewModelFactory.create$lambda$21((Ref.ObjectRef) this.f$0, (ConversationViewModelFactory) this.f$1, (TouchInteractionMetricProcessor) this.f$2, (TextRequestError) obj, (String) obj2);
                return create$lambda$21;
        }
    }
}
