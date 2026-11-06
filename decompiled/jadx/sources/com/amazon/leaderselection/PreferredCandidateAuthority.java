package com.amazon.leaderselection;

import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class PreferredCandidateAuthority {
    private final Set<PreferredCandidateInformation> preferredCandidateInformations;

    private PreferredCandidateAuthority(Set<PreferredCandidateInformation> set) {
        this.preferredCandidateInformations = set;
    }

    public static PreferredCandidateAuthority create(Context context) {
        String[] stringArray = context.getResources().getStringArray(R.array.preferred_candidate_information_package_names);
        String[] stringArray2 = context.getResources().getStringArray(R.array.preferred_candidate_information_versions);
        if (stringArray.length != stringArray2.length) {
            Single$$ExternalSyntheticBUOutline0.m$2("Mismatched number of preferred package names and versions");
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < stringArray.length; i++) {
            linkedHashSet.add(PreferredCandidateInformation.create(stringArray[i], LeaderSelectionServiceVersion.create(stringArray2[i])));
        }
        return create(linkedHashSet);
    }

    public boolean isPreferable(Candidate candidate, Candidate candidate2) {
        if (candidate == null || !CandidateRole.canLead(candidate.getCandidateRole())) {
            return false;
        }
        if (candidate2 == null || !CandidateRole.canLead(candidate2.getCandidateRole())) {
            return true;
        }
        Iterator<PreferredCandidateInformation> it2 = this.preferredCandidateInformations.iterator();
        if (!it2.hasNext()) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        do {
            PreferredCandidateInformation next = it2.next();
            if (next.describes(candidate)) {
                i = i2;
            }
            if (next.describes(candidate2)) {
                i3 = i2;
            }
            i2++;
        } while (it2.hasNext());
        return i < i3;
    }

    public boolean isPreferred(ComponentName componentName, CandidateRegistration candidateRegistration) {
        Iterator<PreferredCandidateInformation> it2 = this.preferredCandidateInformations.iterator();
        while (it2.hasNext()) {
            if (it2.next().describes(componentName.getPackageName(), candidateRegistration.getVersion())) {
                return true;
            }
        }
        return false;
    }

    public boolean isPreferred(Candidate candidate) {
        Iterator<PreferredCandidateInformation> it2 = this.preferredCandidateInformations.iterator();
        while (it2.hasNext()) {
            if (it2.next().describes(candidate)) {
                return true;
            }
        }
        return false;
    }

    public static PreferredCandidateAuthority create(Set<PreferredCandidateInformation> set) {
        return new PreferredCandidateAuthority(set);
    }
}
