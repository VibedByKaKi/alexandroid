package com.amazon.alexa.api.compat.model.assistant.subcomponent;

import com.amazon.alexa.api.compat.model.AlexaDialogExtras;
import com.amazon.alexa.api.compat.model.assistant.DialogApiSender;
import com.amazon.alexa.api.compat.model.assistant.WakeWordApiSender;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DialogAssistantSubcomponentBase$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaDialogExtras f$0;

    public /* synthetic */ DialogAssistantSubcomponentBase$$ExternalSyntheticLambda2(AlexaDialogExtras alexaDialogExtras, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaDialogExtras;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$start$0;
        Unit lambda$startListening$1;
        int i = this.$r8$classId;
        AlexaDialogExtras alexaDialogExtras = this.f$0;
        switch (i) {
            case 0:
                lambda$start$0 = DialogAssistantSubcomponentBase.lambda$start$0(alexaDialogExtras, (DialogApiSender) obj);
                return lambda$start$0;
            default:
                lambda$startListening$1 = WakeWordAssistantSubcomponentBase.lambda$startListening$1(alexaDialogExtras, (WakeWordApiSender) obj);
                return lambda$startListening$1;
        }
    }
}
