package com.amazon.alexa.accessoryclient.client.accessories;

import com.amazon.alexa.accessoryclient.client.accessories.ClientVoiceStreamingRepository;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ClientVoiceStreamingRepository$IpcVoiceStreamLease$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClientVoiceStreamingRepository.IpcVoiceStreamLease f$0;
    public final /* synthetic */ ClientVoiceStreamingRepository f$1;

    public /* synthetic */ ClientVoiceStreamingRepository$IpcVoiceStreamLease$$ExternalSyntheticLambda1(ClientVoiceStreamingRepository.IpcVoiceStreamLease ipcVoiceStreamLease, ClientVoiceStreamingRepository clientVoiceStreamingRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = ipcVoiceStreamLease;
        this.f$1 = clientVoiceStreamingRepository;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        CompletableSource requestStopVoiceStream$lambda$1;
        SingleSource requestStartVoiceStream$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                requestStopVoiceStream$lambda$1 = ClientVoiceStreamingRepository.IpcVoiceStreamLease.requestStopVoiceStream$lambda$1(this.f$0, this.f$1);
                return requestStopVoiceStream$lambda$1;
            default:
                requestStartVoiceStream$lambda$0 = ClientVoiceStreamingRepository.IpcVoiceStreamLease.requestStartVoiceStream$lambda$0(this.f$0, this.f$1);
                return requestStartVoiceStream$lambda$0;
        }
    }
}
