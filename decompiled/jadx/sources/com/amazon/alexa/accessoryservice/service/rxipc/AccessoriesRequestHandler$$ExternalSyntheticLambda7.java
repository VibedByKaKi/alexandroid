package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.TranslationSessionRequest;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda7 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ TranslationSessionRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda7(AccessoriesRequestHandler accessoriesRequestHandler, TranslationSessionRequest translationSessionRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = translationSessionRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource resumeTranslation$lambda$136;
        SingleSource startTranslation$lambda$133;
        SingleSource pauseTranslation$lambda$135;
        switch (this.$r8$classId) {
            case 0:
                resumeTranslation$lambda$136 = AccessoriesRequestHandler.resumeTranslation$lambda$136(this.f$0, this.f$1);
                return resumeTranslation$lambda$136;
            case 1:
                startTranslation$lambda$133 = AccessoriesRequestHandler.startTranslation$lambda$133(this.f$0, this.f$1);
                return startTranslation$lambda$133;
            default:
                pauseTranslation$lambda$135 = AccessoriesRequestHandler.pauseTranslation$lambda$135(this.f$0, this.f$1);
                return pauseTranslation$lambda$135;
        }
    }
}
