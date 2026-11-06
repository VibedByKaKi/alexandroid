package com.amazon.clouddrive.model;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ContentSignature implements Comparable<ContentSignature> {
    private final String contentSignature;
    private final String contentSignatureType;

    public ContentSignature(String str, String str2) {
        this.contentSignatureType = str;
        this.contentSignature = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(ContentSignature contentSignature) {
        if (contentSignature == null) {
            return -1;
        }
        if (this == contentSignature) {
            return 0;
        }
        int compare = ObjectComparator.compare(getContentSignatureType(), contentSignature.getContentSignatureType());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getContentSignature(), contentSignature.getContentSignature());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ContentSignature) && compareTo((ContentSignature) obj) == 0;
    }

    public String getContentSignature() {
        return this.contentSignature;
    }

    public String getContentSignatureType() {
        return this.contentSignatureType;
    }

    public int hashCode() {
        return Objects.hash(this.contentSignatureType, this.contentSignature);
    }
}
