package com.amazon.alexa.mobilytics.configuration;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DCMDeprecationListConfigV2 {
    private List<String> dcmDeprecationGroupIDs = null;

    public void clearDcmDeprecationList() {
        this.dcmDeprecationGroupIDs.clear();
    }

    public List<String> dcmDeprecationItems() {
        return this.dcmDeprecationGroupIDs;
    }
}
