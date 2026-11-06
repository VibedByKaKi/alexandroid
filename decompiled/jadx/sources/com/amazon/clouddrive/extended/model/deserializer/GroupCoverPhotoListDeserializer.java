package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.GroupCoverPhoto;
import com.amazon.clouddrive.model.deserializer.ListDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupCoverPhotoListDeserializer extends ListDeserializer<GroupCoverPhoto> {
    public static final ListDeserializer<GroupCoverPhoto> INSTANCE = new GroupCoverPhotoListDeserializer();

    private GroupCoverPhotoListDeserializer() {
        super(GroupCoverPhotoDeserializer.INSTANCE);
    }
}
