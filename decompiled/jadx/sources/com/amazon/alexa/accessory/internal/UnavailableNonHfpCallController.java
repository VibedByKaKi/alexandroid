package com.amazon.alexa.accessory.internal;

import com.amazon.alexa.accessory.repositories.nonhfpcalling.NonHfpCallController;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class UnavailableNonHfpCallController implements NonHfpCallController {
    @Override // com.amazon.alexa.accessory.repositories.nonhfpcalling.NonHfpCallController
    public NonHfpCallController.OperationStatus handleAcceptCall(UUID uuid) {
        return NonHfpCallController.OperationStatus.UNSUPPORTED;
    }

    @Override // com.amazon.alexa.accessory.repositories.nonhfpcalling.NonHfpCallController
    public NonHfpCallController.OperationStatus handleEndCall(UUID uuid) {
        return NonHfpCallController.OperationStatus.UNSUPPORTED;
    }

    @Override // com.amazon.alexa.accessory.repositories.nonhfpcalling.NonHfpCallController
    public NonHfpCallController.OperationStatus handleRejectCall(UUID uuid) {
        return NonHfpCallController.OperationStatus.UNSUPPORTED;
    }
}
