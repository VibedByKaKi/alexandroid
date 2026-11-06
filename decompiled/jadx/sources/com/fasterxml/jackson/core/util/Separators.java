package com.fasterxml.jackson.core.util;

import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class Separators implements Serializable {
    public static final String DEFAULT_ARRAY_EMPTY_SEPARATOR = " ";
    public static final String DEFAULT_OBJECT_EMPTY_SEPARATOR = " ";
    public static final String DEFAULT_ROOT_VALUE_SEPARATOR = " ";
    private static final long serialVersionUID = 1;
    private final String arrayEmptySeparator;
    private final char arrayValueSeparator;
    private final Spacing arrayValueSpacing;
    private final String objectEmptySeparator;
    private final char objectEntrySeparator;
    private final Spacing objectEntrySpacing;
    private final char objectFieldValueSeparator;
    private final Spacing objectFieldValueSpacing;
    private final String rootSeparator;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Spacing {
        NONE("", ""),
        BEFORE(" ", ""),
        AFTER("", " "),
        BOTH(" ", " ");

        private final String spacesAfter;
        private final String spacesBefore;

        Spacing(String str, String str2) {
            this.spacesBefore = str;
            this.spacesAfter = str2;
        }

        public String apply(char c) {
            return this.spacesBefore + c + this.spacesAfter;
        }

        public String spacesAfter() {
            return this.spacesAfter;
        }

        public String spacesBefore() {
            return this.spacesBefore;
        }
    }

    public Separators(String str, char c, Spacing spacing, char c2, Spacing spacing2, String str2, char c3, Spacing spacing3, String str3) {
        this.rootSeparator = str;
        this.objectFieldValueSeparator = c;
        this.objectFieldValueSpacing = spacing;
        this.objectEntrySeparator = c2;
        this.objectEntrySpacing = spacing2;
        this.objectEmptySeparator = str2;
        this.arrayValueSeparator = c3;
        this.arrayValueSpacing = spacing3;
        this.arrayEmptySeparator = str3;
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public String getArrayEmptySeparator() {
        return this.arrayEmptySeparator;
    }

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    public Spacing getArrayValueSpacing() {
        return this.arrayValueSpacing;
    }

    public String getObjectEmptySeparator() {
        return this.objectEmptySeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public Spacing getObjectEntrySpacing() {
        return this.objectEntrySpacing;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }

    public Spacing getObjectFieldValueSpacing() {
        return this.objectFieldValueSpacing;
    }

    public String getRootSeparator() {
        return this.rootSeparator;
    }

    public Separators withArrayEmptySeparator(String str) {
        return Objects.equals(this.arrayEmptySeparator, str) ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, this.objectFieldValueSpacing, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, str);
    }

    public Separators withArrayValueSeparator(char c) {
        return this.arrayValueSeparator == c ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, this.objectFieldValueSpacing, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, c, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public Separators withArrayValueSpacing(Spacing spacing) {
        return this.arrayValueSpacing == spacing ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, this.objectFieldValueSpacing, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, spacing, this.arrayEmptySeparator);
    }

    public Separators withObjectEmptySeparator(String str) {
        return Objects.equals(this.objectEmptySeparator, str) ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, this.objectFieldValueSpacing, this.objectEntrySeparator, this.objectEntrySpacing, str, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public Separators withObjectEntrySeparator(char c) {
        return this.objectEntrySeparator == c ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, this.objectFieldValueSpacing, c, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public Separators withObjectEntrySpacing(Spacing spacing) {
        return this.objectEntrySpacing == spacing ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, this.objectFieldValueSpacing, this.objectEntrySeparator, spacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public Separators withObjectFieldValueSeparator(char c) {
        return this.objectFieldValueSeparator == c ? this : new Separators(this.rootSeparator, c, this.objectFieldValueSpacing, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public Separators withObjectFieldValueSpacing(Spacing spacing) {
        return this.objectFieldValueSpacing == spacing ? this : new Separators(this.rootSeparator, this.objectFieldValueSeparator, spacing, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public Separators withRootSeparator(String str) {
        return Objects.equals(this.rootSeparator, str) ? this : new Separators(str, this.objectFieldValueSeparator, this.objectFieldValueSpacing, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Separators(char r11, char r12, char r13) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.util.Separators$Spacing r3 = com.fasterxml.jackson.core.util.Separators.Spacing.BOTH
            com.fasterxml.jackson.core.util.Separators$Spacing r5 = com.fasterxml.jackson.core.util.Separators.Spacing.NONE
            java.lang.String r6 = " "
            java.lang.String r9 = " "
            java.lang.String r1 = " "
            r8 = r5
            r0 = r10
            r2 = r11
            r4 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.Separators.<init>(char, char, char):void");
    }

    @Deprecated
    public Separators(String str, char c, Spacing spacing, char c2, Spacing spacing2, char c3, Spacing spacing3) {
        this(str, c, spacing, c2, spacing2, " ", c3, spacing3, " ");
    }

    public Separators() {
        this(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.COMMA);
    }
}
