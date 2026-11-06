package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.GroupShareResponse;
import com.amazon.clouddrive.extended.model.RefreshGroupShareResponse;
import com.amazon.clouddrive.extended.model.deserializer.GroupShareResponseDeserializer;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RefreshGroupShareResponseDeserializer extends AbstractDeserializer<GroupShareResponse, RefreshGroupShareResponse> {
    public static final JsonDeserializer<RefreshGroupShareResponse> INSTANCE = new RefreshGroupShareResponseDeserializer();

    private RefreshGroupShareResponseDeserializer() {
        super(new GroupShareResponseDeserializer.GroupShareResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public RefreshGroupShareResponse createValue() {
        return new RefreshGroupShareResponse();
    }
}
