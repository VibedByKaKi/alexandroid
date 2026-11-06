package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionIntRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda9 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionIntRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda9(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionIntRequest querySessionIntRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionIntRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource audiogram$lambda$102;
        SingleSource stopVoiceStreamLease$lambda$173;
        SingleSource mediaEnhancementCorrectionAmount$lambda$104;
        SingleSource startVoiceStreamLease$lambda$172;
        ObservableSource requestVoiceStreamLease$lambda$171;
        ObservableSource queryInputConfiguration$lambda$63;
        CompletableSource resetInputConfiguration$lambda$65;
        SingleSource removeOutgoingNotification$lambda$113;
        switch (this.$r8$classId) {
            case 0:
                audiogram$lambda$102 = AccessoriesRequestHandler.getAudiogram$lambda$102(this.f$0, this.f$1);
                return audiogram$lambda$102;
            case 1:
                stopVoiceStreamLease$lambda$173 = AccessoriesRequestHandler.stopVoiceStreamLease$lambda$173(this.f$0, this.f$1);
                return stopVoiceStreamLease$lambda$173;
            case 2:
                mediaEnhancementCorrectionAmount$lambda$104 = AccessoriesRequestHandler.getMediaEnhancementCorrectionAmount$lambda$104(this.f$0, this.f$1);
                return mediaEnhancementCorrectionAmount$lambda$104;
            case 3:
                startVoiceStreamLease$lambda$172 = AccessoriesRequestHandler.startVoiceStreamLease$lambda$172(this.f$0, this.f$1);
                return startVoiceStreamLease$lambda$172;
            case 4:
                requestVoiceStreamLease$lambda$171 = AccessoriesRequestHandler.requestVoiceStreamLease$lambda$171(this.f$0, this.f$1);
                return requestVoiceStreamLease$lambda$171;
            case 5:
                queryInputConfiguration$lambda$63 = AccessoriesRequestHandler.queryInputConfiguration$lambda$63(this.f$0, this.f$1);
                return queryInputConfiguration$lambda$63;
            case 6:
                resetInputConfiguration$lambda$65 = AccessoriesRequestHandler.resetInputConfiguration$lambda$65(this.f$0, this.f$1);
                return resetInputConfiguration$lambda$65;
            default:
                removeOutgoingNotification$lambda$113 = AccessoriesRequestHandler.removeOutgoingNotification$lambda$113(this.f$0, this.f$1);
                return removeOutgoingNotification$lambda$113;
        }
    }
}
