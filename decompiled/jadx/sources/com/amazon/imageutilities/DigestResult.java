package com.amazon.imageutilities;

import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DigestResult {
    private final String algorithm;
    private final String fileDigest;
    private final String visualDigest;

    public DigestResult(String str, String str2, String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Algorithm cannot be null.");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("File Digest cannot be null.");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Visual Digest cannot be null.");
            throw null;
        }
        this.algorithm = str;
        this.fileDigest = str2;
        this.visualDigest = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DigestResult)) {
            return false;
        }
        DigestResult digestResult = (DigestResult) obj;
        return digestResult.algorithm.equals(this.algorithm) && digestResult.fileDigest.equals(this.fileDigest) && digestResult.visualDigest.equals(this.visualDigest);
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public String getFileDigest() {
        return this.fileDigest;
    }

    public String getVisualDigest() {
        return this.visualDigest;
    }

    public int hashCode() {
        return Objects.hash(this.algorithm, this.fileDigest, this.visualDigest);
    }
}
