package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.GetMemberPreferencesResponse;
import com.amazon.clouddrive.extended.model.MemberPreferencesResponse;
import com.amazon.clouddrive.extended.model.deserializer.MemberPreferencesResponseDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetMemberPreferencesResponseDeserializer extends AbstractDeserializer<MemberPreferencesResponse, GetMemberPreferencesResponse> {
    public static GetMemberPreferencesResponseDeserializer INSTANCE = new GetMemberPreferencesResponseDeserializer();

    private GetMemberPreferencesResponseDeserializer() {
        super(new MemberPreferencesResponseDeserializer.MemberPreferencesResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public GetMemberPreferencesResponse createValue() {
        return new GetMemberPreferencesResponse();
    }
}
