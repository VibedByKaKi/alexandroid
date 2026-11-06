package com.amazon.clouddrive.extended.model;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MemberPreferencesResponse {
    private List<GroupPreferenceSet> preferenceSets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberPreferencesResponse)) {
            return false;
        }
        MemberPreferencesResponse memberPreferencesResponse = (MemberPreferencesResponse) obj;
        return getPreferenceSets() != null ? getPreferenceSets().equals(memberPreferencesResponse.getPreferenceSets()) : memberPreferencesResponse.getPreferenceSets() == null;
    }

    public List<GroupPreferenceSet> getPreferenceSets() {
        return this.preferenceSets;
    }

    public int hashCode() {
        if (getPreferenceSets() != null) {
            return getPreferenceSets().hashCode();
        }
        return 0;
    }

    public void setPreferenceSets(List<GroupPreferenceSet> list) {
        this.preferenceSets = list;
    }

    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(new StringBuilder("MemberPreferencesResponse{preferenceSets="), this.preferenceSets, AbstractJsonLexerKt.END_OBJ);
    }
}
