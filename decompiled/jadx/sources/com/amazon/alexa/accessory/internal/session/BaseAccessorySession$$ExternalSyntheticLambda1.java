package com.amazon.alexa.accessory.internal.session;

import com.amazon.alexa.accessory.capabilities.speech.AccessoryIdentifierProvider;
import com.amazon.alexa.accessory.internal.util.functions.Supplier;
import com.amazon.alexa.accessory.io.SizedSource;
import com.amazon.alexa.accessory.transport.TransportReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class BaseAccessorySession$$ExternalSyntheticLambda1 implements Supplier, AccessoryIdentifierProvider, TransportReceiver {
    public final /* synthetic */ BaseAccessorySession f$0;

    public /* synthetic */ BaseAccessorySession$$ExternalSyntheticLambda1(BaseAccessorySession baseAccessorySession) {
        this.f$0 = baseAccessorySession;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Supplier
    public Object get() {
        return this.f$0.getDeviceRepositoryV2();
    }

    @Override // com.amazon.alexa.accessory.capabilities.speech.AccessoryIdentifierProvider
    public String getIdentifier() {
        return this.f$0.getAddress();
    }

    @Override // com.amazon.alexa.accessory.transport.TransportReceiver
    public void onDataReceived(SizedSource sizedSource, int i) {
        this.f$0.lambda$attachCapabilities$1(sizedSource, i);
    }
}
