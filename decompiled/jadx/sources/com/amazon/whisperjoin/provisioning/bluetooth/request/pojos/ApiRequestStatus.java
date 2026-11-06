package com.amazon.whisperjoin.provisioning.bluetooth.request.pojos;

import com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ApiRequestStatus implements Validatable {
    public final String msg;
    public final int status;

    public ApiRequestStatus(int i, String str) {
        this.status = i;
        this.msg = str;
    }

    @Override // com.amazon.whisperjoin.provisioning.bluetooth.request.serializers.Validatable
    public void validate() {
    }
}
