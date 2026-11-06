package com.here.sdk.routing;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SectionNotice {

    @NonNull
    public SectionNoticeCode code;

    @NonNull
    public NoticeSeverity severity;

    @NonNull
    public List<ViolatedRestriction> violatedRestrictions = new ArrayList();

    public SectionNotice(@NonNull SectionNoticeCode sectionNoticeCode, @NonNull NoticeSeverity noticeSeverity) {
        this.code = sectionNoticeCode;
        this.severity = noticeSeverity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionNotice)) {
            return false;
        }
        SectionNotice sectionNotice = (SectionNotice) obj;
        return Objects.equals(this.code, sectionNotice.code) && Objects.equals(this.severity, sectionNotice.severity) && Objects.equals(this.violatedRestrictions, sectionNotice.violatedRestrictions);
    }

    public int hashCode() {
        SectionNoticeCode sectionNoticeCode = this.code;
        int hashCode = (JfifUtil.MARKER_EOI + (sectionNoticeCode != null ? sectionNoticeCode.hashCode() : 0)) * 31;
        NoticeSeverity noticeSeverity = this.severity;
        int hashCode2 = (hashCode + (noticeSeverity != null ? noticeSeverity.hashCode() : 0)) * 31;
        List<ViolatedRestriction> list = this.violatedRestrictions;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }
}
