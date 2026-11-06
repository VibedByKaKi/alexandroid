package com.amazon.alexa.presence.service;

import android.content.ComponentName;
import com.amazon.alexa.presence.service.PresenceForegroundService;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class PresenceForegroundService$Controls$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PresenceForegroundService.Controls f$0;

    public /* synthetic */ PresenceForegroundService$Controls$$ExternalSyntheticLambda0(PresenceForegroundService.Controls controls, int i) {
        this.$r8$classId = i;
        this.f$0 = controls;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ComponentName notifyPresenceServiceToRotateServiceData$lambda$2;
        ComponentName notifyPresenceServiceToRotateServiceData$lambda$3;
        ComponentName notifyPresenceServiceToRun$lambda$0;
        ComponentName notifyPresenceServiceToRun$lambda$1;
        int i = this.$r8$classId;
        PresenceForegroundService.Controls controls = this.f$0;
        switch (i) {
            case 0:
                notifyPresenceServiceToRotateServiceData$lambda$2 = PresenceForegroundService.Controls.notifyPresenceServiceToRotateServiceData$lambda$2(controls);
                return notifyPresenceServiceToRotateServiceData$lambda$2;
            case 1:
                notifyPresenceServiceToRotateServiceData$lambda$3 = PresenceForegroundService.Controls.notifyPresenceServiceToRotateServiceData$lambda$3(controls);
                return notifyPresenceServiceToRotateServiceData$lambda$3;
            case 2:
                notifyPresenceServiceToRun$lambda$0 = PresenceForegroundService.Controls.notifyPresenceServiceToRun$lambda$0(controls);
                return notifyPresenceServiceToRun$lambda$0;
            default:
                notifyPresenceServiceToRun$lambda$1 = PresenceForegroundService.Controls.notifyPresenceServiceToRun$lambda$1(controls);
                return notifyPresenceServiceToRun$lambda$1;
        }
    }
}
