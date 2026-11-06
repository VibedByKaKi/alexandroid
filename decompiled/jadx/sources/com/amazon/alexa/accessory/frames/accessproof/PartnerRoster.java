package com.amazon.alexa.accessory.frames.accessproof;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import org.apache.commons.io.file.PathUtils$$ExternalSyntheticLambda3;
import org.apache.commons.lang3.time.TimeZones$$ExternalSyntheticLambda1;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PartnerRoster {
    private final BooleanSupplier enabled;
    private final List<Entry> entries;
    private final Predicate<String> rosterWeblabEnabled;

    public PartnerRoster(List<Entry> list, BooleanSupplier booleanSupplier, Predicate<String> predicate) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("a roster needs a list; pass an empty one to authorize nobody");
            throw null;
        }
        if (booleanSupplier == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("a roster needs an enable gate; pass () -> true for none");
            throw null;
        }
        if (predicate == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("a roster needs a roster-weblab reader; pass name -> false for none");
            throw null;
        }
        this.entries = ErrorUtils$$ExternalSyntheticOutline0.m(list);
        this.enabled = booleanSupplier;
        this.rosterWeblabEnabled = predicate;
    }

    public static PartnerRoster empty() {
        return new PartnerRoster(Collections.EMPTY_LIST, new TimeZones$$ExternalSyntheticLambda1(1), new PathUtils$$ExternalSyntheticLambda3(1));
    }

    private boolean isEnabled() {
        try {
            return this.enabled.getAsBoolean();
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private boolean isRosterWeblabEnabled(String str) {
        try {
            return this.rosterWeblabEnabled.test(str);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$empty$3() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$empty$4(String str) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$1(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$2(String str) {
        return false;
    }

    public List<Entry> entries() {
        if (!isEnabled()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (Entry entry : this.entries) {
            if (entry.rosterWeblab == null || isRosterWeblabEnabled(entry.rosterWeblab)) {
                arrayList.add(entry);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<Entry> findEntries(AttestationApplicationId attestationApplicationId) {
        ArrayList arrayList = new ArrayList();
        if (attestationApplicationId != null) {
            for (Entry entry : entries()) {
                if (attestationApplicationId.matches(entry.packageName, entry.signingCertificateDigest)) {
                    arrayList.add(entry);
                }
            }
        }
        return arrayList;
    }

    public Entry findEntry(AttestationApplicationId attestationApplicationId) {
        if (attestationApplicationId == null) {
            return null;
        }
        for (Entry entry : entries()) {
            if (attestationApplicationId.matches(entry.packageName, entry.signingCertificateDigest)) {
                return entry;
            }
        }
        return null;
    }

    public boolean isAuthorized(AttestationApplicationId attestationApplicationId, String str) {
        if (attestationApplicationId == null || str == null || str.trim().isEmpty()) {
            return false;
        }
        for (Entry entry : entries()) {
            if (entry.scopes.contains(str) && attestationApplicationId.matches(entry.packageName, entry.signingCertificateDigest)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "PartnerRoster" + entries();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Entry {
        private final String clientId;
        private final String packageName;

        @Nullable
        private final String rosterWeblab;
        private final Set<String> scopes;
        private final byte[] signingCertificateDigest;

        public Entry(String str, String str2, byte[] bArr, Set<String> set, @Nullable String str3) {
            if (str == null || str.trim().isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("a roster entry needs a client id");
                throw null;
            }
            if (str2 == null || str2.trim().isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("a roster entry needs a package name");
                throw null;
            }
            if (bArr == null || bArr.length != 32) {
                Single$$ExternalSyntheticBUOutline0.m$3("a roster entry needs a 32-byte SHA-256 signing certificate digest");
                throw null;
            }
            if (set == null || set.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("a roster entry needs at least one scope; an entry with none authorizes nothing");
                throw null;
            }
            for (String str4 : set) {
                if (str4 == null || str4.trim().isEmpty()) {
                    Single$$ExternalSyntheticBUOutline0.m$3("a roster entry must not hold a blank scope");
                    throw null;
                }
            }
            if (str3 != null && str3.trim().isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("a roster weblab must be a weblab name; pass null for a production build");
                throw null;
            }
            this.clientId = str;
            this.packageName = str2;
            this.signingCertificateDigest = (byte[]) bArr.clone();
            this.scopes = Collections.unmodifiableSet(new LinkedHashSet(set));
            this.rosterWeblab = str3;
        }

        public static Builder builder() {
            return new Builder(0);
        }

        public String clientId() {
            return this.clientId;
        }

        public String packageName() {
            return this.packageName;
        }

        @Nullable
        public String rosterWeblab() {
            return this.rosterWeblab;
        }

        public Set<String> scopes() {
            return this.scopes;
        }

        public byte[] signingCertificateDigest() {
            return (byte[]) this.signingCertificateDigest.clone();
        }

        public String toString() {
            return "Entry{" + this.packageName + ", scopes=" + this.scopes.size() + StringSubstitutor.DEFAULT_VAR_END;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            private String clientId;
            private String packageName;
            private String rosterWeblab;
            private Set<String> scopes;
            private byte[] signingCertificateDigest;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public Entry build() {
                return new Entry(this.clientId, this.packageName, this.signingCertificateDigest, this.scopes, this.rosterWeblab);
            }

            public Builder clientId(String str) {
                this.clientId = str;
                return this;
            }

            public Builder packageName(String str) {
                this.packageName = str;
                return this;
            }

            public Builder rosterWeblab(String str) {
                this.rosterWeblab = str;
                return this;
            }

            public Builder scopes(Set<String> set) {
                this.scopes = set;
                return this;
            }

            public Builder signingCertDigest(String str) {
                if (str == null || str.isEmpty() || (str.length() & 1) != 0) {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("digest must be even-length hex: ", str));
                    return null;
                }
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    int digit = Character.digit(str.charAt(i2), 16);
                    int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                    if (digit < 0 || digit2 < 0) {
                        Single$$ExternalSyntheticBUOutline0.m$3("digest is not hex: ".concat(str));
                        return null;
                    }
                    bArr[i] = (byte) (digit2 | (digit << 4));
                }
                this.signingCertificateDigest = bArr;
                return this;
            }

            private Builder() {
            }
        }

        public Entry(String str, String str2, byte[] bArr, Set<String> set) {
            this(str, str2, bArr, set, null);
        }
    }

    public PartnerRoster(List<Entry> list, BooleanSupplier booleanSupplier) {
        this(list, booleanSupplier, new PathUtils$$ExternalSyntheticLambda3(3));
    }

    @VisibleForTesting
    public PartnerRoster(List<Entry> list) {
        this(list, new TimeZones$$ExternalSyntheticLambda1(2), new PathUtils$$ExternalSyntheticLambda3(2));
    }
}
