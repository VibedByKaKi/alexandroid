package com.amazon.alexa.assistant.ui.conversation;

import android.net.Uri;
import androidx.compose.runtime.State;
import com.amazon.alexa.assistant.foundation.model.PrivateContainerInteraction;
import com.amazon.alexa.assistant.ui.conversation.ConversationViewModelFactory;
import com.amazon.alexa.ra.core.ui.events.IngressRenderEvent;
import com.amazon.alexa.ra.core.ui.events.IngressUserInitiatedActionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConversationViewModelFactory$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ConversationViewModelFactory$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit initialConversationContext$lambda$40;
        State invoke$lambda$32$lambda$31$lambda$22$lambda$21;
        Unit invoke$lambda$32$lambda$31$lambda$26$lambda$25;
        Unit invoke$lambda$32$lambda$31$lambda$28$lambda$27;
        Unit buildPrivateContainerInteractionRecorder$lambda$2;
        switch (this.$r8$classId) {
            case 0:
                initialConversationContext$lambda$40 = ConversationViewModelFactory.getInitialConversationContext$lambda$40((JsonBuilder) obj);
                return initialConversationContext$lambda$40;
            case 1:
                invoke$lambda$32$lambda$31$lambda$22$lambda$21 = FloatingInputBarViewKt$FloatingInputBarView$1.invoke$lambda$32$lambda$31$lambda$22$lambda$21((Uri) obj);
                return invoke$lambda$32$lambda$31$lambda$22$lambda$21;
            case 2:
                invoke$lambda$32$lambda$31$lambda$26$lambda$25 = FloatingInputBarViewKt$FloatingInputBarView$1.invoke$lambda$32$lambda$31$lambda$26$lambda$25((IngressRenderEvent) obj);
                return invoke$lambda$32$lambda$31$lambda$26$lambda$25;
            case 3:
                invoke$lambda$32$lambda$31$lambda$28$lambda$27 = FloatingInputBarViewKt$FloatingInputBarView$1.invoke$lambda$32$lambda$31$lambda$28$lambda$27((IngressUserInitiatedActionEvent) obj);
                return invoke$lambda$32$lambda$31$lambda$28$lambda$27;
            default:
                buildPrivateContainerInteractionRecorder$lambda$2 = ConversationViewModelFactory.Companion.buildPrivateContainerInteractionRecorder$lambda$2((PrivateContainerInteraction) obj);
                return buildPrivateContainerInteractionRecorder$lambda$2;
        }
    }
}
