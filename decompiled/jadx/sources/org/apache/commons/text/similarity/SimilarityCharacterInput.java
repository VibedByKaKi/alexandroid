package org.apache.commons.text.similarity;

import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class SimilarityCharacterInput implements SimilarityInput<Character> {
    private final CharSequence cs;

    public SimilarityCharacterInput(CharSequence charSequence) {
        if (charSequence != null) {
            this.cs = charSequence;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("CharSequence");
            throw null;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.text.similarity.SimilarityInput
    public Character at(int i) {
        return Character.valueOf(this.cs.charAt(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SimilarityCharacterInput.class == obj.getClass()) {
            return Objects.equals(this.cs, ((SimilarityCharacterInput) obj).cs);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.cs);
    }

    @Override // org.apache.commons.text.similarity.SimilarityInput
    public int length() {
        return this.cs.length();
    }

    public String toString() {
        return this.cs.toString();
    }
}
