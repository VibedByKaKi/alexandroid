package com.amazon.alexa.smarthomecameras.ptz.directives;

import com.amazon.alexa.smarthomecameras.directives.AlexaDirective;
import com.amazon.alexa.smarthomecameras.directives.AlexaHeader;
import com.amazon.alexa.smarthomecameras.util.CamerasLogger;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PhysicalPtzDirectiveFactory {
    public AlexaDirective createPhysicalPanDirective(int i) {
        CamerasLogger.logInfo(CamerasLogger.LVC_TAG, "Creating Pan Directive With Magnitude: " + i);
        return new AlexaDirective(AlexaHeader.builder().setNamespace("Alexa.RangeController").setName("AdjustRangeValue").setPayloadVersion("3").setInstance(PhysicalPtzDirectiveConstants.CAMERA_PAN_INSTANCE_NAME).setCorrelationToken(UUID.randomUUID().toString()).build(), AdjustRangePayload.create(i));
    }

    public AlexaDirective createPhysicalTiltDirective(int i) {
        CamerasLogger.logInfo(CamerasLogger.LVC_TAG, "Creating Tilt Directive With Magnitude: " + i);
        return new AlexaDirective(AlexaHeader.builder().setNamespace("Alexa.RangeController").setName("AdjustRangeValue").setPayloadVersion("3").setInstance(PhysicalPtzDirectiveConstants.CAMERA_TILT_INSTANCE_NAME).setCorrelationToken(UUID.randomUUID().toString()).build(), AdjustRangePayload.create(i));
    }
}
