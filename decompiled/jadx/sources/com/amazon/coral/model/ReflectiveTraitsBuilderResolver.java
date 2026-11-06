package com.amazon.coral.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.coral.model.xml.DefaultTraitsBuilder;
import com.amazon.coral.model.xml.TraitsBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReflectiveTraitsBuilderResolver implements TraitsBuilderResolver {
    @Override // com.amazon.coral.model.TraitsBuilderResolver
    public TraitsBuilder getBuilderFor(Class<? extends Traits> cls) {
        UseTraitsBuilder useTraitsBuilder = (UseTraitsBuilder) cls.getAnnotation(UseTraitsBuilder.class);
        if (useTraitsBuilder == null) {
            return new DefaultTraitsBuilder().withClass(cls);
        }
        Class<? extends TraitsBuilder> value = useTraitsBuilder.value();
        try {
            return value.newInstance();
        } catch (Exception e) {
            String canonicalName = value.getCanonicalName();
            String canonicalName2 = cls.getCanonicalName();
            String message = e.getMessage();
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Could not instantiate builder '", canonicalName, "' for trait class '", canonicalName2, "': ");
            m.append(message);
            throw new ModelIndexFactoryException(m.toString());
        }
    }
}
