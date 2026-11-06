package com.amazon.clouddrive.model.deserializer;

import com.amazon.clouddrive.model.CloudDriveBenefit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveBenefitListDeserializer extends ListDeserializer<CloudDriveBenefit> {
    public static final CloudDriveBenefitListDeserializer INSTANCE = new CloudDriveBenefitListDeserializer();

    private CloudDriveBenefitListDeserializer() {
        super(CloudDriveBenefitDeserializer.INSTANCE);
    }
}
