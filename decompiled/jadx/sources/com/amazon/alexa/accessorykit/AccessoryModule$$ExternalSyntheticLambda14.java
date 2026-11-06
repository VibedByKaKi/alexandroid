package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.User;
import com.amazon.alexa.accessory.internal.util.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda14 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda14(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Logger.e("queryAccessoryState failed.", (Throwable) obj);
                break;
            case 1:
                AbaSettingsBridgeDelegate.lambda$startEmittingBridgeEvents$51((Throwable) obj);
                break;
            case 2:
                AbaSettingsBridgeDelegate.lambda$startEmittingBridgeEvents$52((Throwable) obj);
                break;
            case 3:
                Logger.e("queryAccessoryState failed.", (Throwable) obj);
                break;
            case 4:
                AccessoriesFactory.lambda$initializeBugsnagNotification$6((Throwable) obj);
                break;
            case 5:
                Logger.e("Error observing users to initialize DeviceEngagementMetrics.", (Throwable) obj);
                break;
            case 6:
                AccessoriesFactory.lambda$initializeIPCFinishSetupInteractor$12((User) obj);
                break;
            case 7:
                Logger.e("Error observing users to initialize interactor.", (Throwable) obj);
                break;
            case 8:
                AccessoryModule.lambda$startEmittingBridgeEvents$47((Throwable) obj);
                break;
            case 9:
                AccessoryModule.lambda$startEmittingBridgeEvents$48((Throwable) obj);
                break;
            case 10:
                AccessoryPresenceNotifier.lambda$observerClientSessions$6((Throwable) obj);
                break;
            case 11:
                Logger.e("AccessoryPresenceNotifier:Failed to cache sessions");
                break;
            default:
                AccessoryPresenceNotifier.lambda$observerClientDevices$4((Throwable) obj);
                break;
        }
    }
}
