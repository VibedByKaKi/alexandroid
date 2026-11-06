package com.google.zxing.oned.rss.expanded;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class ExpandedPair {
    private final FinderPattern finderPattern;
    private final DataCharacter leftChar;
    private final DataCharacter rightChar;

    public ExpandedPair(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern) {
        this.leftChar = dataCharacter;
        this.rightChar = dataCharacter2;
        this.finderPattern = finderPattern;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedPair)) {
            return false;
        }
        ExpandedPair expandedPair = (ExpandedPair) obj;
        return Objects.equals(this.leftChar, expandedPair.leftChar) && Objects.equals(this.rightChar, expandedPair.rightChar) && Objects.equals(this.finderPattern, expandedPair.finderPattern);
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public DataCharacter getLeftChar() {
        return this.leftChar;
    }

    public DataCharacter getRightChar() {
        return this.rightChar;
    }

    public int hashCode() {
        return Objects.hashCode(this.finderPattern) ^ (Objects.hashCode(this.leftChar) ^ Objects.hashCode(this.rightChar));
    }

    public boolean mustBeLast() {
        return this.rightChar == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.leftChar);
        sb.append(" , ");
        sb.append(this.rightChar);
        sb.append(" : ");
        FinderPattern finderPattern = this.finderPattern;
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, " ]", finderPattern == null ? "null" : Integer.valueOf(finderPattern.getValue()));
    }
}
