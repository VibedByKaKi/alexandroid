package com.amazon.alexa.accessory.avsclient;

import com.amazon.alexa.accessory.avsclient.AccessoryDiagnostics;
import com.amazon.minerva.transport.direct.Batch;
import com.amazon.minerva.transport.direct.DirectTransport;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryDiagnostics$$ExternalSyntheticLambda5 implements AccessoryDiagnostics.MinervaUploader {
    public final /* synthetic */ DirectTransport f$0;

    public /* synthetic */ AccessoryDiagnostics$$ExternalSyntheticLambda5(DirectTransport directTransport) {
        this.f$0 = directTransport;
    }

    @Override // com.amazon.alexa.accessory.avsclient.AccessoryDiagnostics.MinervaUploader
    public final CompletableFuture upload(Batch batch) {
        return this.f$0.upload(batch);
    }
}
