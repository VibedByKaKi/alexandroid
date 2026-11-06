package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.registration.DeviceRegistration;
import com.amazon.alexa.accessoryclient.common.api.ConnectionStatus;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda0(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i) {
            case 0:
                AccessoryModule.lambda$getRegisteredName$5(promise, (DeviceRegistration) obj);
                break;
            case 1:
                promise.resolve((WritableArray) obj);
                break;
            case 2:
                promise.reject((Throwable) obj);
                break;
            case 3:
                AbaSettingsBridgeDelegate.lambda$releaseSession$38(promise, (Throwable) obj);
                break;
            case 4:
                promise.resolve((WritableMap) obj);
                break;
            case 5:
                AbaSettingsBridgeDelegate.lambda$getSession$30(promise, (ConnectionStatus) obj);
                break;
            case 6:
                AbaSettingsBridgeDelegate.lambda$getSession$31(promise, (Throwable) obj);
                break;
            case 7:
                promise.resolve((Integer) obj);
                break;
            case 8:
                AbaSettingsBridgeDelegate.lambda$getRegisteredClusterDeviceSerialNumber$6(promise, (DeviceRegistration) obj);
                break;
            case 9:
                promise.resolve((String) obj);
                break;
            case 10:
                AbaSettingsBridgeDelegate.lambda$isConnected$39(promise, (ConnectionStatus) obj);
                break;
            case 11:
                AbaSettingsBridgeDelegate.lambda$isConnected$40(promise, (Throwable) obj);
                break;
            case 12:
                promise.resolve((ReadableMap) obj);
                break;
            case 13:
                AbaSettingsBridgeDelegate.lambda$sendLogs$17(promise, (Throwable) obj);
                break;
            case 14:
                AbaSettingsBridgeDelegate.lambda$getAccountIdForIdentifier$12(promise, (String) obj);
                break;
            case 15:
                AbaSettingsBridgeDelegate.lambda$getAccountIdForIdentifier$13(promise, (Throwable) obj);
                break;
            case 16:
                promise.resolve((Boolean) obj);
                break;
            case 17:
                AbaSettingsBridgeDelegate.lambda$getUserDeviceName$7(promise, (DeviceRegistration) obj);
                break;
            case 18:
                AccessoryModule.lambda$isConnected$39(promise, (ConnectionStatus) obj);
                break;
            case 19:
                AccessoryModule.lambda$isConnected$40(promise, (Throwable) obj);
                break;
            case 20:
                AccessoryModule.lambda$getUserDeviceName$7(promise, (DeviceRegistration) obj);
                break;
            case 21:
                AccessoryModule.lambda$getAccountIdForIdentifier$12(promise, (String) obj);
                break;
            case 22:
                AccessoryModule.lambda$getAccountIdForIdentifier$13(promise, (Throwable) obj);
                break;
            case 23:
                AccessoryModule.lambda$getRegisteredClusterDeviceSerialNumber$6(promise, (DeviceRegistration) obj);
                break;
            case 24:
                AccessoryModule.lambda$getSession$30(promise, (ConnectionStatus) obj);
                break;
            case 25:
                AccessoryModule.lambda$getSession$31(promise, (Throwable) obj);
                break;
            case 26:
                AccessoryModule.lambda$sendLogs$17(promise, (Throwable) obj);
                break;
            default:
                AccessoryModule.lambda$releaseSession$38(promise, (Throwable) obj);
                break;
        }
    }
}
