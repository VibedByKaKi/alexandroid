package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.xml.DocumentationTraitsBuilder;
import com.amazon.coral.util.CharSequenceComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "documentation", targets = {Model.class})
@UseTraitsBuilder(DocumentationTraitsBuilder.class)
/* loaded from: classes19.dex */
public class DocumentationTraits extends AbstractTraits {
    private final String documentation;

    public DocumentationTraits(String str) {
        this(DocumentationTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof DocumentationTraits) && CharSequenceComparator.CASE_SENSITIVE_ORDER.compare(getDocumentation(), ((DocumentationTraits) obj).getDocumentation()) == 0) {
            return super.equals(obj);
        }
        return false;
    }

    public CharSequence getDocumentation() {
        return this.documentation;
    }

    public DocumentationTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, String str3) {
        super(cls, id, str, str2);
        this.documentation = nullToEmpty(str3);
    }
}
