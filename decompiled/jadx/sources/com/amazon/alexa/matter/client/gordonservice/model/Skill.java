package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Skill {
    private final String skillAsin;
    private final String skillID;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SkillBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String skillAsin;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String skillID;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SkillBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Skill build() {
            return new Skill(this.skillID, this.skillAsin);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SkillBuilder skillAsin(String str) {
            this.skillAsin = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SkillBuilder skillID(String str) {
            this.skillID = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("Skill.SkillBuilder(skillID=");
            sb.append(this.skillID);
            sb.append(", skillAsin=");
            return a$$ExternalSyntheticOutline0.m(sb, this.skillAsin, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private Skill() {
        this.skillID = null;
        this.skillAsin = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SkillBuilder builder() {
        return new SkillBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Skill)) {
            return false;
        }
        Skill skill = (Skill) obj;
        String skillID = getSkillID();
        String skillID2 = skill.getSkillID();
        if (skillID != null ? !skillID.equals(skillID2) : skillID2 != null) {
            return false;
        }
        String skillAsin = getSkillAsin();
        String skillAsin2 = skill.getSkillAsin();
        return skillAsin != null ? skillAsin.equals(skillAsin2) : skillAsin2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSkillAsin() {
        return this.skillAsin;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSkillID() {
        return this.skillID;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String skillID = getSkillID();
        int hashCode = skillID == null ? 43 : skillID.hashCode();
        String skillAsin = getSkillAsin();
        return ((hashCode + 59) * 59) + (skillAsin != null ? skillAsin.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Skill(skillID=" + getSkillID() + ", skillAsin=" + getSkillAsin() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Skill withSkillAsin(String str) {
        return this.skillAsin == str ? this : new Skill(this.skillID, str);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Skill withSkillID(String str) {
        return this.skillID == str ? this : new Skill(str, this.skillAsin);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Skill(String str, String str2) {
        this.skillID = str;
        this.skillAsin = str2;
    }
}
