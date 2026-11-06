package com.amazon.dee.app.elements.bridges;

import com.amazon.deecomms.nativemodules.CommsContactsManagerDelegate;
import com.amazon.deecomms.nativemodules.ContactsManagerBridge;
import com.amazon.deecomms.util.Consumer;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class IdentityModule$$ExternalSyntheticLambda1 implements Action1, Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ IdentityModule$$ExternalSyntheticLambda1(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // com.amazon.deecomms.util.Consumer
    public void accept(Object obj) {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        ReadableMap readableMap = (ReadableMap) obj;
        switch (i) {
            case 14:
                promise.resolve(readableMap);
                break;
            default:
                promise.resolve(readableMap);
                break;
        }
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i) {
            case 0:
                promise.reject((Throwable) obj);
                break;
            case 1:
                promise.reject("Failed to get the session id", (Throwable) obj);
                break;
            case 2:
                promise.reject((Throwable) obj);
                break;
            case 3:
                promise.resolve(null);
                break;
            case 4:
                promise.reject("Failed to reAuthenticate user", (Throwable) obj);
                break;
            case 5:
                promise.resolve((String) obj);
                break;
            case 6:
                promise.reject("Failed to reAuthenticate user", (Throwable) obj);
                break;
            case 7:
                promise.resolve((String) obj);
                break;
            case 8:
                promise.reject("Failed to get the session id", (Throwable) obj);
                break;
            case 9:
                promise.resolve(null);
                break;
            case 10:
                promise.resolve((Boolean) obj);
                break;
            case 11:
                CommsContactsManagerDelegate.lambda$getShowCallerIdPreference$1(promise, (Throwable) obj);
                break;
            case 12:
                promise.resolve(null);
                break;
            case 13:
                CommsContactsManagerDelegate.lambda$setShowCallerIdPreference$3(promise, (Throwable) obj);
                break;
            case 14:
            case 15:
            default:
                promise.reject((Throwable) obj);
                break;
            case 16:
                promise.resolve(null);
                break;
            case 17:
                ContactsManagerBridge.lambda$setShowCallerIdPreference$3(promise, (Throwable) obj);
                break;
            case 18:
                promise.resolve((Boolean) obj);
                break;
            case 19:
                ContactsManagerBridge.lambda$getShowCallerIdPreference$1(promise, (Throwable) obj);
                break;
        }
    }
}
