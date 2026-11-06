package com.amazon.alexa.matter.utils;

import com.amazon.commsnetworking.api.INetworkRequest;
import com.amazon.dee.app.services.network.interceptor.CookieRefreshInterceptor;
import com.amazon.dee.app.ui.clouddrive.AlexaDeviceBackgroundImageViewModel;
import com.amazon.deecomms.common.network.okhttp.OkHttpCall;
import com.dee.app.data.reactnative.bridges.ElementLocalStorageDelegate;
import com.dee.app.http.HttpCoralService;
import com.facebook.react.bridge.Promise;
import io.reactivex.rxjava3.core.ObservableEmitter;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class RxJava1To3$$ExternalSyntheticLambda2 implements Action0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RxJava1To3$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // rx.functions.Action0
    public final void call() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ObservableEmitter) obj).onComplete();
                break;
            case 1:
                ((INetworkRequest) obj).cancel();
                break;
            case 2:
                CookieRefreshInterceptor.handleRefreshError$lambda$3((CookieRefreshInterceptor) obj);
                break;
            case 3:
                ((AlexaDeviceBackgroundImageViewModel) obj).lambda$initializePhotoService$0();
                break;
            case 4:
                ((OkHttpCall) obj).cancel();
                break;
            case 5:
                ElementLocalStorageDelegate.lambda$clear$2((Promise) obj);
                break;
            default:
                ((HttpCoralService.HttpCall) obj).cancel();
                break;
        }
    }
}
