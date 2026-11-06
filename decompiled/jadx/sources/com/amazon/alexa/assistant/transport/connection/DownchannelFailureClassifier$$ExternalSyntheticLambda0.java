package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.foundation.model.ContextProperty;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class DownchannelFailureClassifier$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DownchannelFailureClassifier$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable closedByPeer$lambda$0;
        CharSequence namespace;
        switch (this.$r8$classId) {
            case 0:
                closedByPeer$lambda$0 = DownchannelFailureClassifier.closedByPeer$lambda$0((Throwable) obj);
                return closedByPeer$lambda$0;
            default:
                namespace = ((ContextProperty) obj).getNamespace();
                return namespace;
        }
    }
}
