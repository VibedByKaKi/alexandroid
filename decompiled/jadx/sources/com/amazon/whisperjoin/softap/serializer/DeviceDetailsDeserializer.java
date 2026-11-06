package com.amazon.whisperjoin.softap.serializer;

import com.amazon.whisperjoin.softap.exceptions.SoftAPDeserializerException;
import com.amazon.whisperjoin.softap.pojos.DeviceDetails;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface DeviceDetailsDeserializer extends StringDeserializer<DeviceDetails> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.whisperjoin.softap.serializer.StringDeserializer
    DeviceDetails deserialize(String str) throws SoftAPDeserializerException;
}
