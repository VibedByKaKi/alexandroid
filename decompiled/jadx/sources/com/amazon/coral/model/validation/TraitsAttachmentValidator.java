package com.amazon.coral.model.validation;

import com.amazon.coral.model.Model;
import com.amazon.coral.model.Traits;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class TraitsAttachmentValidator {
    private final TraitsValidAttachmentResolver validAttachmentResolver;

    public TraitsAttachmentValidator(TraitsValidAttachmentResolver traitsValidAttachmentResolver) {
        if (traitsValidAttachmentResolver != null) {
            this.validAttachmentResolver = traitsValidAttachmentResolver;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("validAttachmentResolver cannot be null");
            throw null;
        }
    }

    public void validateTraitAttachments(Model model, Class<? extends Traits> cls) {
        Collection<Class<? extends Model>> resolveValidModelAttachments = this.validAttachmentResolver.resolveValidModelAttachments(cls);
        Iterator<Class<? extends Model>> it2 = resolveValidModelAttachments.iterator();
        while (it2.hasNext()) {
            if (it2.next().isAssignableFrom(model.getClass())) {
                return;
            }
        }
        IdxTraitsValidator$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m$1(cls.toString(), " can only be applied to models of type ", resolveValidModelAttachments.toString()));
    }

    public TraitsAttachmentValidator() {
        this(new AnnotationBasedTraitsValidAttachmentResolver());
    }
}
