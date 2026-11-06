package com.amazon.alexa.mobile.assistant.client.delegates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.ui.conversation.model.ConversationBroadcastDelegate;
import com.amazon.alexa.assistant.ui.conversation.model.ConversationBroadcastEvent;
import com.dee.app.contacts.common.constants.Constants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/delegates/SdkConversationBroadcastDelegate;", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastDelegate;", "<init>", "()V", "onBroadcastEvent", "", "event", "Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationBroadcastEvent;", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SdkConversationBroadcastDelegate implements ConversationBroadcastDelegate {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "SdkConversationBroadcast";

    @Override // com.amazon.alexa.assistant.ui.conversation.model.ConversationBroadcastDelegate
    public void onBroadcastEvent(@NotNull ConversationBroadcastEvent event) {
        event.getClass();
        Objects.toString(event);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/delegates/SdkConversationBroadcastDelegate$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
