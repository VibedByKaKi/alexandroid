package com.amazon.alexa.ra.sdk;

import com.amazon.alexa.ra.core.data.model.ConversationMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public /* synthetic */ class AlexaServicesWrapper$registerConversationsMetadataListener$1 extends FunctionReferenceImpl implements Function1<ConversationMetadata, Unit> {
    public AlexaServicesWrapper$registerConversationsMetadataListener$1(Object obj) {
        super(1, obj, ConversationsListener.class, "onMetadataUpdated", "onMetadataUpdated(Lcom/amazon/alexa/ra/core/data/model/ConversationMetadata;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConversationMetadata conversationMetadata) {
        conversationMetadata.getClass();
        ((ConversationsListener) this.receiver).onMetadataUpdated(conversationMetadata);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConversationMetadata conversationMetadata) {
        invoke2(conversationMetadata);
        return Unit.INSTANCE;
    }
}
