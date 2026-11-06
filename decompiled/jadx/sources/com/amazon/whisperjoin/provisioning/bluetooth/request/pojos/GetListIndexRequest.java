package com.amazon.whisperjoin.provisioning.bluetooth.request.pojos;

import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class GetListIndexRequest implements Validatable {
    public final int listIndex;

    public GetListIndexRequest(int i) {
        this.listIndex = i;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
        if (this.listIndex >= 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid list-index request; index must be non-negative.");
    }
}
