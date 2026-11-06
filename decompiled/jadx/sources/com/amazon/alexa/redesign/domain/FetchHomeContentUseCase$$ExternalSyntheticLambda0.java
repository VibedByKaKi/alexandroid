package com.amazon.alexa.redesign.domain;

import com.amazon.alexa.redesign.entity.ContentResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function3;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class FetchHomeContentUseCase$$ExternalSyntheticLambda0 implements BiFunction, Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FetchHomeContentUseCase f$0;

    public /* synthetic */ FetchHomeContentUseCase$$ExternalSyntheticLambda0(FetchHomeContentUseCase fetchHomeContentUseCase, int i) {
        this.$r8$classId = i;
        this.f$0 = fetchHomeContentUseCase;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        ContentResponse quickCacheContent$lambda$2;
        ContentResponse remoteContentNetworkOnly$lambda$1;
        int i = this.$r8$classId;
        ContentResponse contentResponse = (ContentResponse) obj;
        List list = (List) obj2;
        FetchHomeContentUseCase fetchHomeContentUseCase = this.f$0;
        switch (i) {
            case 0:
                quickCacheContent$lambda$2 = FetchHomeContentUseCase.getQuickCacheContent$lambda$2(fetchHomeContentUseCase, contentResponse, list);
                return quickCacheContent$lambda$2;
            default:
                remoteContentNetworkOnly$lambda$1 = FetchHomeContentUseCase.remoteContentNetworkOnly$lambda$1(fetchHomeContentUseCase, contentResponse, list);
                return remoteContentNetworkOnly$lambda$1;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    public Object apply(Object obj, Object obj2, Object obj3) {
        ContentResponse remoteContent$lambda$0;
        remoteContent$lambda$0 = FetchHomeContentUseCase.remoteContent$lambda$0(this.f$0, (ContentResponse) obj, (ContentResponse) obj2, (List) obj3);
        return remoteContent$lambda$0;
    }
}
