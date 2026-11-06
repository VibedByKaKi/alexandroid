package com.amazon.alexa.accessory.repositories.wificonfig;

import com.amazon.alexa.accessory.internal.repositories.ResultCallable;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemoryWifiConfigRepository$$ExternalSyntheticLambda1 implements ResultCallable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemoryWifiConfigRepository f$0;

    public /* synthetic */ MemoryWifiConfigRepository$$ExternalSyntheticLambda1(MemoryWifiConfigRepository memoryWifiConfigRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = memoryWifiConfigRepository;
    }

    @Override // com.amazon.alexa.accessory.internal.repositories.ResultCallable
    public final void call(Producer.Result result) {
        int i = this.$r8$classId;
        MemoryWifiConfigRepository memoryWifiConfigRepository = this.f$0;
        switch (i) {
            case 0:
                memoryWifiConfigRepository.lambda$getWiFiConfigApDetails$2(result);
                break;
            case 1:
                memoryWifiConfigRepository.lambda$getSavedWiFiNetworks$5(result);
                break;
            default:
                memoryWifiConfigRepository.lambda$stopWiFiConfigAp$1(result);
                break;
        }
    }
}
