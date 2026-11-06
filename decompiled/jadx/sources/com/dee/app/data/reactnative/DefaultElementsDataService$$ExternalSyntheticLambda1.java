package com.dee.app.data.reactnative;

import com.dee.app.cachemanager.HttpResponseWrapper;
import com.dee.app.data.reactnative.DefaultElementsDataService;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultElementsDataService$$ExternalSyntheticLambda1 implements Func1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ElementsDataRequest f$0;

    public /* synthetic */ DefaultElementsDataService$$ExternalSyntheticLambda1(ElementsDataRequest elementsDataRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = elementsDataRequest;
    }

    @Override // rx.functions.Func1
    public final Object call(Object obj) {
        Boolean lambda$requestSubscriber$1;
        Boolean lambda$fetchFromCache$6;
        DefaultElementsDataService.ResponseWrapper lambda$fetchFromCache$7;
        int i = this.$r8$classId;
        ElementsDataRequest elementsDataRequest = this.f$0;
        switch (i) {
            case 0:
                lambda$requestSubscriber$1 = DefaultElementsDataService.lambda$requestSubscriber$1(elementsDataRequest, (DefaultElementsDataService.ResponseWrapper) obj);
                return lambda$requestSubscriber$1;
            case 1:
                lambda$fetchFromCache$6 = DefaultElementsDataService.lambda$fetchFromCache$6(elementsDataRequest, (HttpResponseWrapper) obj);
                return lambda$fetchFromCache$6;
            default:
                lambda$fetchFromCache$7 = DefaultElementsDataService.lambda$fetchFromCache$7(elementsDataRequest, (HttpResponseWrapper) obj);
                return lambda$fetchFromCache$7;
        }
    }
}
