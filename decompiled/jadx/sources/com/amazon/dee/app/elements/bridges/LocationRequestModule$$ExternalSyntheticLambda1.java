package com.amazon.dee.app.elements.bridges;

import com.amazon.alexa.accessory.protocol.Cloudpairing;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessorykit.accessories.session.device.DeviceRepositoryModule;
import com.amazon.alexa.accessorykit.accessories.session.supplier.SessionSupplierModule;
import com.amazon.alexa.accessorykit.accessories.session.system.SystemRepositoryModule;
import com.amazon.alexa.accessorykit.cloudpairing.CloudPairingRepositoryModule;
import com.amazon.alexa.accessorykit.factoryreset.FactoryResetModule;
import com.amazon.alexa.accessorykit.instrumentation.InstrumentationRepositoryModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class LocationRequestModule$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ LocationRequestModule$$ExternalSyntheticLambda1(int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Promise promise = this.f$0;
        switch (i) {
            case 0:
                promise.reject("Failed to get the most recent location", (Throwable) obj);
                break;
            case 1:
                DeviceRepositoryModule.lambda$requestCompleteSetup$7(promise, (Common.ErrorCode) obj);
                break;
            case 2:
                DeviceRepositoryModule.lambda$requestStartSetup$3(promise, (Common.ErrorCode) obj);
                break;
            case 3:
                DeviceRepositoryModule.lambda$requestOverrideAssistant$8(promise, (Common.ErrorCode) obj);
                break;
            case 4:
                promise.resolve((Boolean) obj);
                break;
            case 5:
                SessionSupplierModule.lambda$hasSessions$5(promise, (Throwable) obj);
                break;
            case 6:
                promise.resolve((Boolean) obj);
                break;
            case 7:
                SessionSupplierModule.lambda$hasSession$3(promise, (Throwable) obj);
                break;
            case 8:
                SessionSupplierModule.lambda$releaseSession$10(promise, (Throwable) obj);
                break;
            case 9:
                promise.resolve((WritableArray) obj);
                break;
            case 10:
                SystemRepositoryModule.lambda$connectUser$3(promise, (Common.ErrorCode) obj);
                break;
            case 11:
                SystemRepositoryModule.lambda$unpairUser$5(promise, (Common.ErrorCode) obj);
                break;
            case 12:
                SystemRepositoryModule.lambda$setLocale$0(promise, (Common.ErrorCode) obj);
                break;
            case 13:
                SystemRepositoryModule.lambda$setLocaleAsync$1(promise, (Common.ErrorCode) obj);
                break;
            case 14:
                SystemRepositoryModule.lambda$disconnectUser$4(promise, (Common.ErrorCode) obj);
                break;
            case 15:
                SystemRepositoryModule.lambda$setWakewords$2(promise, (Common.ErrorCode) obj);
                break;
            case 16:
                CloudPairingRepositoryModule.lambda$getCloudPairingStatus$0(promise, (Cloudpairing.CloudPairingStatus) obj);
                break;
            case 17:
                FactoryResetModule.lambda$factoryResetDevice$0(promise, (Boolean) obj);
                break;
            case 18:
                FactoryResetModule.lambda$factoryResetDevice$1(promise, (Throwable) obj);
                break;
            case 19:
                InstrumentationRepositoryModule.lambda$issueRemoteReset$0(promise, (Common.ErrorCode) obj);
                break;
            default:
                promise.reject("Failed to get the most recent location", (Throwable) obj);
                break;
        }
    }
}
