package com.amazon.whisperjoin.provisionerSDK.devices.handlers;

import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.events.DeviceEvent;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.events.EventHandler;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.events.ProvisioningEvent;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.events.data.ExceptionData;
import com.amazon.whisperjoin.provisionerSDK.utility.Observers;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ProvisionableDeviceEventDispatcher implements EventHandler<DeviceEvent> {
    private static final String TAG = "com.amazon.whisperjoin.provisionerSDK.devices.handlers.ProvisionableDeviceEventDispatcher";
    private final WhisperJoinPeripheralDeviceDetails mDeviceDetails;
    private final Observers<ProvisioningEvent<DeviceEvent>> mDeviceObservers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.provisionerSDK.devices.handlers.ProvisionableDeviceEventDispatcher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent;

        static {
            int[] iArr = new int[DeviceEvent.values().length];
            $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent = iArr;
            try {
                iArr[DeviceEvent.NETWORK_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent[DeviceEvent.NETWORK_SCAN_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent[DeviceEvent.REGISTRATION_STATE_UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent[DeviceEvent.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent[DeviceEvent.PROVISIONING_DONE_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent[DeviceEvent.PROVISIONING_DONE_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ProvisionableDeviceEventDispatcher(Observers<ProvisioningEvent<DeviceEvent>> observers, WhisperJoinPeripheralDeviceDetails whisperJoinPeripheralDeviceDetails) {
        if (observers == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceObservers must not be null");
            throw null;
        }
        if (whisperJoinPeripheralDeviceDetails == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceDetails must not be null");
            throw null;
        }
        this.mDeviceObservers = observers;
        this.mDeviceDetails = whisperJoinPeripheralDeviceDetails;
    }

    private void handleMessageProcessingException(Exception exc) {
        invokeEvent(new ProvisioningEvent<>(DeviceEvent.MESSAGE_PROCESSING_EXCEPTION, new ExceptionData(null, exc)));
    }

    private void invokeEvent(ProvisioningEvent<DeviceEvent> provisioningEvent) {
        this.mDeviceObservers.invoke(this.mDeviceDetails, provisioningEvent);
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.provisioning.events.EventHandler
    public boolean handleEvent(ProvisioningEvent<DeviceEvent> provisioningEvent) {
        if (provisioningEvent == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Event can't be null");
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$events$DeviceEvent[provisioningEvent.getEvent().ordinal()]) {
            case 1:
                if (provisioningEvent.getEventObject() == null) {
                    handleMessageProcessingException(new NullPointerException("Wifi Connection Details can not be null"));
                    return true;
                }
                invokeEvent(provisioningEvent);
                return true;
            case 2:
                if (provisioningEvent.getEventObject() != null) {
                    handleMessageProcessingException(new NullPointerException("Wifi Scan Result can not be null"));
                    return true;
                }
                invokeEvent(provisioningEvent);
                return true;
            case 3:
                if (provisioningEvent.getEventObject() == null) {
                    handleMessageProcessingException(new NullPointerException("Registration Details can not be null"));
                    return true;
                }
                invokeEvent(provisioningEvent);
                return true;
            case 4:
                if (provisioningEvent.getEventObject() == null) {
                    handleMessageProcessingException(new IllegalArgumentException("Unexpected data with disconnection event"));
                    return true;
                }
                invokeEvent(provisioningEvent);
                return true;
            case 5:
                invokeEvent(provisioningEvent);
                return true;
            case 6:
                invokeEvent(provisioningEvent);
                return true;
            default:
                Single$$ExternalSyntheticBUOutline0.m(provisioningEvent.getEvent(), "Unexpected Device Event ");
                return false;
        }
    }
}
