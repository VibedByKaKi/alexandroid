package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class PairingHints {
    private final int initialSetupHint;
    private final String initialSetupInstruction;
    private final int secondarySetupHint;
    private final String secondarySetupInstruction;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class PairingHintsBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int initialSetupHint;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String initialSetupInstruction;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int secondarySetupHint;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String secondarySetupInstruction;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingHintsBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingHints build() {
            return new PairingHints(this.initialSetupHint, this.secondarySetupHint, this.initialSetupInstruction, this.secondarySetupInstruction);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingHintsBuilder initialSetupHint(int i) {
            this.initialSetupHint = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingHintsBuilder initialSetupInstruction(String str) {
            this.initialSetupInstruction = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingHintsBuilder secondarySetupHint(int i) {
            this.secondarySetupHint = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public PairingHintsBuilder secondarySetupInstruction(String str) {
            this.secondarySetupInstruction = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("PairingHints.PairingHintsBuilder(initialSetupHint=");
            sb.append(this.initialSetupHint);
            sb.append(", secondarySetupHint=");
            sb.append(this.secondarySetupHint);
            sb.append(", initialSetupInstruction=");
            sb.append(this.initialSetupInstruction);
            sb.append(", secondarySetupInstruction=");
            return a$$ExternalSyntheticOutline0.m(sb, this.secondarySetupInstruction, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private PairingHints() {
        this.initialSetupHint = 0;
        this.secondarySetupHint = 0;
        this.initialSetupInstruction = null;
        this.secondarySetupInstruction = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static PairingHintsBuilder builder() {
        return new PairingHintsBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PairingHints)) {
            return false;
        }
        PairingHints pairingHints = (PairingHints) obj;
        if (getInitialSetupHint() != pairingHints.getInitialSetupHint() || getSecondarySetupHint() != pairingHints.getSecondarySetupHint()) {
            return false;
        }
        String initialSetupInstruction = getInitialSetupInstruction();
        String initialSetupInstruction2 = pairingHints.getInitialSetupInstruction();
        if (initialSetupInstruction != null ? !initialSetupInstruction.equals(initialSetupInstruction2) : initialSetupInstruction2 != null) {
            return false;
        }
        String secondarySetupInstruction = getSecondarySetupInstruction();
        String secondarySetupInstruction2 = pairingHints.getSecondarySetupInstruction();
        return secondarySetupInstruction != null ? secondarySetupInstruction.equals(secondarySetupInstruction2) : secondarySetupInstruction2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getInitialSetupHint() {
        return this.initialSetupHint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getInitialSetupInstruction() {
        return this.initialSetupInstruction;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getSecondarySetupHint() {
        return this.secondarySetupHint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSecondarySetupInstruction() {
        return this.secondarySetupInstruction;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int secondarySetupHint = getSecondarySetupHint() + ((getInitialSetupHint() + 59) * 59);
        String initialSetupInstruction = getInitialSetupInstruction();
        int i = secondarySetupHint * 59;
        int hashCode = initialSetupInstruction == null ? 43 : initialSetupInstruction.hashCode();
        String secondarySetupInstruction = getSecondarySetupInstruction();
        return ((i + hashCode) * 59) + (secondarySetupInstruction != null ? secondarySetupInstruction.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "PairingHints(initialSetupHint=" + getInitialSetupHint() + ", secondarySetupHint=" + getSecondarySetupHint() + ", initialSetupInstruction=" + getInitialSetupInstruction() + ", secondarySetupInstruction=" + getSecondarySetupInstruction() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingHints withInitialSetupHint(int i) {
        return this.initialSetupHint == i ? this : new PairingHints(i, this.secondarySetupHint, this.initialSetupInstruction, this.secondarySetupInstruction);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingHints withInitialSetupInstruction(String str) {
        return this.initialSetupInstruction == str ? this : new PairingHints(this.initialSetupHint, this.secondarySetupHint, str, this.secondarySetupInstruction);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingHints withSecondarySetupHint(int i) {
        return this.secondarySetupHint == i ? this : new PairingHints(this.initialSetupHint, i, this.initialSetupInstruction, this.secondarySetupInstruction);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingHints withSecondarySetupInstruction(String str) {
        return this.secondarySetupInstruction == str ? this : new PairingHints(this.initialSetupHint, this.secondarySetupHint, this.initialSetupInstruction, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PairingHints(int i, int i2, String str, String str2) {
        this.initialSetupHint = i;
        this.secondarySetupHint = i2;
        this.initialSetupInstruction = str;
        this.secondarySetupInstruction = str2;
    }
}
