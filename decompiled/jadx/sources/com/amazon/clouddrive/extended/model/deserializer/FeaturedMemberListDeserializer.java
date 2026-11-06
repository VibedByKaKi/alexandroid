package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.FeaturedMember;
import com.amazon.clouddrive.model.deserializer.ListDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FeaturedMemberListDeserializer extends ListDeserializer<FeaturedMember> {
    public static final ListDeserializer<FeaturedMember> INSTANCE = new FeaturedMemberListDeserializer();

    private FeaturedMemberListDeserializer() {
        super(FeaturedMemberDeserializer.INSTANCE);
    }
}
