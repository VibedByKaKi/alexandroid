package org.openjdk.javax.annotation.processing;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openjdk.javax.lang.model.element.Element;
import org.openjdk.javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface RoundEnvironment {
    boolean errorRaised();

    Set<? extends Element> getElementsAnnotatedWith(Class<? extends Annotation> cls);

    Set<? extends Element> getElementsAnnotatedWith(TypeElement typeElement);

    default Set<? extends Element> getElementsAnnotatedWithAny(Set<Class<? extends Annotation>> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Class<? extends Annotation>> it2 = set.iterator();
        while (it2.hasNext()) {
            linkedHashSet.addAll(getElementsAnnotatedWith(it2.next()));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    Set<? extends Element> getRootElements();

    boolean processingOver();

    default Set<? extends Element> getElementsAnnotatedWithAny(TypeElement... typeElementArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (TypeElement typeElement : typeElementArr) {
            linkedHashSet.addAll(getElementsAnnotatedWith(typeElement));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
