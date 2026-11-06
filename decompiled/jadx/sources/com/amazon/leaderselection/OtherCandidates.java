package com.amazon.leaderselection;

import com.amazon.alexa.utils.security.SignatureVerifier;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class OtherCandidates {
    private final CandidateInformationFinder candidateInformationFinder;
    private TreeSet<Candidate> candidates;
    private Candidate mostPreferredCandidate = Candidate.UNKNOWN;
    private final PreferredCandidateAuthority preferredCandidateAuthority;
    private final SignatureVerifier signatureVerifier;

    public OtherCandidates(PreferredCandidateAuthority preferredCandidateAuthority, CandidateInformationFinder candidateInformationFinder, SignatureVerifier signatureVerifier) {
        this.preferredCandidateAuthority = preferredCandidateAuthority;
        this.candidateInformationFinder = candidateInformationFinder;
        this.signatureVerifier = signatureVerifier;
    }

    private boolean isAcceptable(CandidateInformation candidateInformation) {
        return candidateInformation.getCandidateRegistration().getRole() != CandidateRole.NONE && this.signatureVerifier.verify(candidateInformation.getComponentName().getPackageName());
    }

    private void updateMostPreferredCandidate(Candidate candidate) {
        if (this.preferredCandidateAuthority.isPreferable(candidate, this.mostPreferredCandidate) || (!this.preferredCandidateAuthority.isPreferred(this.mostPreferredCandidate) && CandidateRole.canLead(candidate.getCandidateRole()) && candidate.getLeaderSelectionServiceVersion().isHigherOrEquivalent(this.mostPreferredCandidate.getLeaderSelectionServiceVersion()))) {
            this.mostPreferredCandidate = candidate;
        }
    }

    public boolean contains(Candidate candidate) {
        Iterator<Candidate> it2 = get().iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(candidate)) {
                return true;
            }
        }
        return false;
    }

    public Set<Candidate> get() {
        if (this.candidates == null) {
            this.candidates = new TreeSet<>(new HighestVersionComparator(0));
            for (CandidateInformation candidateInformation : this.candidateInformationFinder.discover()) {
                if (isAcceptable(candidateInformation)) {
                    Candidate create = Candidate.create(candidateInformation, AccountIdentifier.UNKNOWN, PreferredOpinion.UNKNOWN);
                    updateMostPreferredCandidate(create);
                    this.candidates.add(create);
                }
            }
        }
        return this.candidates;
    }

    public Candidate getMostPreferredOtherCandidate() {
        get();
        return this.mostPreferredCandidate;
    }

    public Candidate getOtherCandidateWithHighestVersion() {
        get();
        return this.candidates.isEmpty() ? Candidate.UNKNOWN : this.candidates.last();
    }

    public Candidate getOtherCandidateWithNextHighestVersion(Candidate candidate) {
        get();
        Iterator<Candidate> descendingIterator = this.candidates.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (candidate.equals(descendingIterator.next()) && descendingIterator.hasNext()) {
                return descendingIterator.next();
            }
        }
        return Candidate.UNKNOWN;
    }

    public Set<Candidate> getWithout(Candidate... candidateArr) {
        Set<Candidate> set = get();
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        for (Candidate candidate : candidateArr) {
            hashSet.remove(candidate);
        }
        return hashSet;
    }

    public boolean isCandidateHigherVersionThanOthers(Candidate candidate) {
        return candidate.getLeaderSelectionServiceVersion().isHigherOrEquivalent(getOtherCandidateWithHighestVersion().getLeaderSelectionServiceVersion());
    }

    public boolean isCandidateMorePreferredThanOthers(Candidate candidate) {
        if (candidate.getCandidateRole() != CandidateRole.CANDIDATE) {
            return false;
        }
        Candidate mostPreferredOtherCandidate = getMostPreferredOtherCandidate();
        return this.preferredCandidateAuthority.isPreferred(mostPreferredOtherCandidate) ? this.preferredCandidateAuthority.isPreferable(candidate, mostPreferredOtherCandidate) : isCandidateHigherVersionThanOthers(candidate);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HighestVersionComparator implements Comparator<Candidate> {
        public /* synthetic */ HighestVersionComparator(int i) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(Candidate candidate, Candidate candidate2) {
            LeaderSelectionServiceVersion leaderSelectionServiceVersion = candidate.getLeaderSelectionServiceVersion();
            LeaderSelectionServiceVersion leaderSelectionServiceVersion2 = candidate2.getLeaderSelectionServiceVersion();
            if (candidate.equals(candidate2)) {
                return 0;
            }
            return ((leaderSelectionServiceVersion.equals(leaderSelectionServiceVersion2) && CandidateRole.canLead(candidate.getCandidateRole())) || leaderSelectionServiceVersion.isHigherOrEquivalent(leaderSelectionServiceVersion2)) ? 1 : -1;
        }

        private HighestVersionComparator() {
        }
    }
}
