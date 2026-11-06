package com.amazon.alexa.accessory.internal.session;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryInquiryRecord;
import io.reactivex.rxjava3.core.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryInquirySession {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        AccessoryInquirySession create(Accessory accessory);
    }

    void connect();

    Single<AccessoryInquiryRecord> queryInquiryRecord();

    void release();
}
