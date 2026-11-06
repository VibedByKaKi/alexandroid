package com.amazon.coral.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AbstractTraitsVisitor implements TraitsVisitor {
    private Method getOnTraitMethod(Traits traits) {
        for (Class<?> cls = traits.getClass(); !cls.equals(Object.class); cls = cls.getSuperclass()) {
            try {
                return this.getClass().getDeclaredMethod("on" + cls.getSimpleName(), cls);
            } catch (NoSuchMethodException unused) {
            }
        }
        for (Class<?> cls2 : traits.getClass().getInterfaces()) {
            try {
                return this.getClass().getDeclaredMethod("on" + cls2.getSimpleName(), cls2);
            } catch (NoSuchMethodException unused2) {
            }
        }
        return null;
    }

    @Override // com.amazon.coral.model.TraitsVisitor
    public <T extends Traits> void visit(T t) {
        Method onTraitMethod = getOnTraitMethod(t);
        if (onTraitMethod == null) {
            defaultOnTrait(t);
            return;
        }
        try {
            onTraitMethod.setAccessible(true);
            onTraitMethod.invoke(this, t);
        } catch (IllegalAccessException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        } catch (InvocationTargetException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
        }
    }

    public void defaultOnTrait(Traits traits) {
    }
}
