package com.amazon.alexa.mobile.assistant.client;

import com.amazon.alexa.mobile.assistant.client.metrics.MetricsSubComponentNameProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public /* synthetic */ class DefaultAlexaAssistantClient$createMetricsDelegate$1 extends FunctionReferenceImpl implements Function0<String> {
    public DefaultAlexaAssistantClient$createMetricsDelegate$1(Object obj) {
        super(0, obj, MetricsSubComponentNameProvider.class, "getSubComponentName", "getSubComponentName()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((MetricsSubComponentNameProvider) this.receiver).getSubComponentName();
    }
}
