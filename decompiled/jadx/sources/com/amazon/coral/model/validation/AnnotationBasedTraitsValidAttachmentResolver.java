package com.amazon.coral.model.validation;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.Traits;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AnnotationBasedTraitsValidAttachmentResolver implements TraitsValidAttachmentResolver {
    private static final Logger LOG = LogManager.getLogger((Class<?>) AnnotationBasedTraitsValidAttachmentResolver.class);

    @Override // com.amazon.coral.model.validation.TraitsValidAttachmentResolver
    public Collection<Class<? extends Model>> resolveValidModelAttachments(Class<? extends Traits> cls) {
        Trait trait = (Trait) cls.getAnnotation(Trait.class);
        ArrayList arrayList = new ArrayList();
        if (trait == null) {
            LOG.warn("No @Trait annotation present on class " + cls.getCanonicalName() + " - no way to verify that this trait has been attached to the correct shape");
            arrayList.add(Model.class);
            return arrayList;
        }
        for (Class<?> cls2 : trait.targets()) {
            if (Model.class.isAssignableFrom(cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
