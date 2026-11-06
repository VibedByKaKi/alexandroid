package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.internal.bluetooth.SdpRepository;
import com.amazon.alexa.accessory.internal.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryExplorer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Observer {
        void onKnownAccessoryFound(Accessory accessory);

        void onKnownAccessoryLost(Accessory accessory);

        default void onUnknownAccessoryConnected(Accessory accessory, AccessoryInquiryRecord accessoryInquiryRecord) {
            Logger.d("AccessoryExplorer: Default implementation of onUnknownAccessoryConnected");
        }

        void onUnknownAccessoryFound(Accessory accessory, AccessoryInquiryRecord accessoryInquiryRecord);

        void onUnknownAccessoryLost(Accessory accessory, AccessoryInquiryRecord accessoryInquiryRecord);
    }

    void cancel(Observer observer);

    void discover(Observer observer);

    AccessoryAttributes getAccessoryAttributes();

    SdpRepository getSdpRepository();
}
