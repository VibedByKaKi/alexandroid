package com.amazon.alexa.accessoryclient.client.accessories;

import com.amazon.alexa.accessoryclient.client.accessories.ClientVoiceStreamingRepository;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ClientVoiceStreamingRepository$IpcVoiceStreamLease$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClientVoiceStreamingRepository.IpcVoiceStreamLease f$0;

    public /* synthetic */ ClientVoiceStreamingRepository$IpcVoiceStreamLease$$ExternalSyntheticLambda0(ClientVoiceStreamingRepository.IpcVoiceStreamLease ipcVoiceStreamLease, int i) {
        this.$r8$classId = i;
        this.f$0 = ipcVoiceStreamLease;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        ClientVoiceStreamingRepository.IpcVoiceStreamLease ipcVoiceStreamLease = this.f$0;
        switch (i) {
            case 0:
                ClientVoiceStreamingRepository.IpcVoiceStreamLease.releaseLease$lambda$2(ipcVoiceStreamLease);
                break;
            default:
                ClientVoiceStreamingRepository.VoiceStreamLeaseAcquisition.subscribeActual$lambda$0(ipcVoiceStreamLease);
                break;
        }
    }
}
