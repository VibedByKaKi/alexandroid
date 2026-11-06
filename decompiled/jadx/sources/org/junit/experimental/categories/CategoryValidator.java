package org.junit.experimental.categories;

import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runners.model.FrameworkMethod;
import org.junit.validator.AnnotationValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class CategoryValidator extends AnnotationValidator {
    private static final Set<Class<? extends Annotation>> INCOMPATIBLE_ANNOTATIONS = Collections.unmodifiableSet(new HashSet(Arrays.asList(BeforeClass.class, AfterClass.class, Before.class, After.class)));

    private void addErrorMessage(List<Exception> list, Class<?> cls) {
        list.add(new Exception(a$$ExternalSyntheticOutline0.m("@", cls.getSimpleName(), " can not be combined with @Category")));
    }

    @Override // org.junit.validator.AnnotationValidator
    public List<Exception> validateAnnotatedMethod(FrameworkMethod frameworkMethod) {
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : frameworkMethod.getAnnotations()) {
            for (Class<? extends Annotation> cls : INCOMPATIBLE_ANNOTATIONS) {
                if (annotation.annotationType().isAssignableFrom(cls)) {
                    addErrorMessage(arrayList, cls);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
