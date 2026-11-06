package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.Invitee;
import com.amazon.clouddrive.model.serializer.ListSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class InviteeListSerializer extends ListSerializer<Invitee> {
    public static final ListSerializer<Invitee> INSTANCE = new InviteeListSerializer();

    private InviteeListSerializer() {
        super(InviteeSerializer.INSTANCE);
    }
}
