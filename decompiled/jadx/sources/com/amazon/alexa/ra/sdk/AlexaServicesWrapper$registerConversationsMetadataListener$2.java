package com.amazon.alexa.ra.sdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public /* synthetic */ class AlexaServicesWrapper$registerConversationsMetadataListener$2 extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
    public AlexaServicesWrapper$registerConversationsMetadataListener$2(Object obj) {
        super(1, obj, ConversationsListener.class, "onDeleted", "onDeleted(Ljava/util/List;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<String> list) {
        list.getClass();
        ((ConversationsListener) this.receiver).onDeleted(list);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
        invoke2((List<String>) list);
        return Unit.INSTANCE;
    }
}
