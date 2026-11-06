package com.amazon.alexa.accessorykit;

import com.facebook.react.bridge.Promise;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda4 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda4(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i) {
            case 0:
                AccessoryModule.lambda$deregisterDevice$4(promise);
                break;
            case 1:
                AbaSettingsBridgeDelegate.lambda$setAccessoryStateInteger$42(promise);
                break;
            case 2:
                AbaSettingsBridgeDelegate.lambda$doAssistantOverride$20(promise);
                break;
            case 3:
                AbaSettingsBridgeDelegate.lambda$removeDevice$2(promise);
                break;
            case 4:
                AbaSettingsBridgeDelegate.lambda$releaseSession$37(promise);
                break;
            case 5:
                AbaSettingsBridgeDelegate.lambda$deregisterDevice$5(promise);
                break;
            case 6:
                AbaSettingsBridgeDelegate.lambda$setAccessoryStateBoolean$41(promise);
                break;
            case 7:
                AbaSettingsBridgeDelegate.lambda$requestTransportUpgrade$19(promise);
                break;
            case 8:
                promise.resolve(null);
                break;
            case 9:
                AbaSettingsBridgeDelegate.lambda$sendLogs$16(promise);
                break;
            case 10:
                AbaSettingsBridgeDelegate.lambda$requestUpdateDeviceInformation$18(promise);
                break;
            case 11:
                AbaSettingsBridgeDelegate.lambda$startSetup$24(promise);
                break;
            case 12:
                AbaSettingsBridgeDelegate.lambda$createSession$32(promise);
                break;
            case 13:
                AccessoryModule.lambda$startSetup$24(promise);
                break;
            case 14:
                AccessoryModule.lambda$doAssistantOverride$20(promise);
                break;
            case 15:
                AccessoryModule.lambda$requestTransportUpgrade$19(promise);
                break;
            case 16:
                AccessoryModule.lambda$removeDevice$1(promise);
                break;
            case 17:
                AccessoryModule.lambda$requestUpdateDeviceInformation$18(promise);
                break;
            case 18:
                AccessoryModule.lambda$setAccessoryStateBoolean$41(promise);
                break;
            case 19:
                AccessoryModule.lambda$sendLogs$16(promise);
                break;
            case 20:
                promise.resolve(null);
                break;
            case 21:
                AccessoryModule.lambda$createSession$32(promise);
                break;
            case 22:
                AccessoryModule.lambda$releaseSession$37(promise);
                break;
            default:
                AccessoryModule.lambda$setAccessoryStateInteger$42(promise);
                break;
        }
    }
}
