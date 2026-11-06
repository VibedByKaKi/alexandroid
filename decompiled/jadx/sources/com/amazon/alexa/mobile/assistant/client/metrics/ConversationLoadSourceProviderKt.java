package com.amazon.alexa.mobile.assistant.client.metrics;

import com.amazon.alexa.api.compat.model.conversation.ConversationLoadSource;
import com.amazon.alexa.api.compat.model.conversation.ConversationLoadSourceTracker;
import com.amazon.alexa.ra.core.data.repo.NetworkManager$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"conversationLoadSourceProvider", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "epochMs", "", "tracker", "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker;", "client_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ConversationLoadSourceProviderKt {
    @NotNull
    public static final Function1<Long, String> conversationLoadSourceProvider(@NotNull ConversationLoadSourceTracker conversationLoadSourceTracker) {
        conversationLoadSourceTracker.getClass();
        return new NetworkManager$$ExternalSyntheticLambda0(conversationLoadSourceTracker, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String conversationLoadSourceProvider$lambda$0(ConversationLoadSourceTracker conversationLoadSourceTracker, long j) {
        ConversationLoadSource sourceAtEpoch = conversationLoadSourceTracker.sourceAtEpoch(j);
        if (sourceAtEpoch != null) {
            return sourceAtEpoch.getWireValue();
        }
        return null;
    }
}
