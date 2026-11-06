package com.amazon.alexa.assistant.transport.multipart;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.JsonBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class EventMultipartBuilder$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EventMultipartBuilder$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit json$lambda$0;
        MutableSharedFlow invokeSuspend$lambda$0;
        Unit json$lambda$15;
        switch (this.$r8$classId) {
            case 0:
                json$lambda$0 = EventMultipartBuilder.json$lambda$0((JsonBuilder) obj);
                return json$lambda$0;
            case 1:
                invokeSuspend$lambda$0 = DefaultAttachmentProvider$attachmentChunks$1.invokeSuspend$lambda$0((String) obj);
                return invokeSuspend$lambda$0;
            default:
                json$lambda$15 = MultiPartResponseProcessor.json$lambda$15((JsonBuilder) obj);
                return json$lambda$15;
        }
    }
}
