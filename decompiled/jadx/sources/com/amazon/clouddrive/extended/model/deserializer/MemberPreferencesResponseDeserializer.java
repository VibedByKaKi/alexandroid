package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.GroupPreferenceSet;
import com.amazon.clouddrive.extended.model.MemberPreferencesResponse;
import com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer;
import com.amazon.clouddrive.model.deserializer.ListDeserializer;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MemberPreferencesResponseDeserializer extends AbstractDeserializer<MemberPreferencesResponse, MemberPreferencesResponse> {
    public static MemberPreferencesResponseDeserializer INSTANCE = new MemberPreferencesResponseDeserializer();
    private static final ListDeserializer<GroupPreferenceSet> GROUP_PREFERENCE_SET_LIST_DESERIALIZER = new ListDeserializer<>(GroupPreferenceSetDeserializer.INSTANCE);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MemberPreferencesResponseFieldDeserializer implements JsonFieldDeserializer<MemberPreferencesResponse> {
        @Override // com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends MemberPreferencesResponse> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (!"preferenceSets".equals(str)) {
                return false;
            }
            u.setPreferenceSets(MemberPreferencesResponseDeserializer.GROUP_PREFERENCE_SET_LIST_DESERIALIZER.deserialize(jsonParser));
            return true;
        }
    }

    private MemberPreferencesResponseDeserializer() {
        super(new MemberPreferencesResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public MemberPreferencesResponse createValue() {
        return new MemberPreferencesResponse();
    }
}
