package com.amazon.clouddrive.extended.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PatchGroupPrivacyPreferencesResponse extends MemberPreferencesResponse {
    @Override // com.amazon.clouddrive.extended.model.MemberPreferencesResponse
    public String toString() {
        return "PatchGroupPrivacyPreferencesResponse{} " + super.toString();
    }

    public PatchGroupPrivacyPreferencesResponse withPreferenceSets(List<GroupPreferenceSet> list) {
        setPreferenceSets(list);
        return this;
    }
}
