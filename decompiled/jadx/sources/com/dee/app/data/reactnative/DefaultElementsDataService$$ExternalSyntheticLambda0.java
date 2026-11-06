package com.dee.app.data.reactnative;

import com.dee.app.cachemanager.HttpResponseWrapper;
import com.dee.app.data.reactnative.DefaultElementsDataService;
import com.google.common.base.Optional;
import rx.functions.Action1;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultElementsDataService$$ExternalSyntheticLambda0 implements Func1, Action1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultElementsDataService$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        Boolean lambda$requestSubscriber$0;
        ElementsDataResponse response;
        Boolean lambda$fetchFromCache$4;
        HttpResponseWrapper lambda$fetchFromCache$5;
        DefaultElementsDataService.ResponseWrapper lambda$fetchFromCache$9;
        switch (this.$r8$classId) {
            case 0:
                lambda$requestSubscriber$0 = DefaultElementsDataService.lambda$requestSubscriber$0((DefaultElementsDataService.ResponseWrapper) obj);
                return lambda$requestSubscriber$0;
            case 1:
                response = ((DefaultElementsDataService.ResponseWrapper) obj).getResponse();
                return response;
            case 2:
                lambda$fetchFromCache$4 = DefaultElementsDataService.lambda$fetchFromCache$4((Optional) obj);
                return lambda$fetchFromCache$4;
            case 3:
                lambda$fetchFromCache$5 = DefaultElementsDataService.lambda$fetchFromCache$5((Optional) obj);
                return lambda$fetchFromCache$5;
            default:
                lambda$fetchFromCache$9 = DefaultElementsDataService.lambda$fetchFromCache$9((Throwable) obj);
                return lambda$fetchFromCache$9;
        }
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        DefaultElementsDataService.lambda$fetchFromCache$8((Throwable) obj);
    }
}
