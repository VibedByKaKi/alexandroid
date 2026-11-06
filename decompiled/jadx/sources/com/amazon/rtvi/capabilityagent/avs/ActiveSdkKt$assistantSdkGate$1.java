package com.amazon.rtvi.capabilityagent.avs;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public /* synthetic */ class ActiveSdkKt$assistantSdkGate$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public static final ActiveSdkKt$assistantSdkGate$1 INSTANCE = new ActiveSdkKt$assistantSdkGate$1();

    public ActiveSdkKt$assistantSdkGate$1() {
        super(0, ActiveSdkKt.class, "isAssistantSdkActive", "isAssistantSdkActive()Z", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(ActiveSdkKt.isAssistantSdkActive());
    }
}
