package com.amazon.alexa.mobile.assistant.client;

import com.amazon.alexa.mobile.assistant.client.utils.FireTabletUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public /* synthetic */ class DefaultAlexaAssistantClient$assistant$2$assistantBuilder$1$2 extends FunctionReferenceImpl implements Function0<Boolean> {
    public DefaultAlexaAssistantClient$assistant$2$assistantBuilder$1$2(Object obj) {
        super(0, obj, FireTabletUtils.class, "isKHTablet", "isKHTablet()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(FireTabletUtils.isKHTablet());
    }
}
