package com.amazon.alexa.accessory.frames.ota;

import com.amazon.alexa.accessory.protocol.Assettransfer;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class OTAHelper$$ExternalSyntheticLambda30 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Assettransfer.Asset) obj).getSize();
    }
}
