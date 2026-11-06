package com.google.auto.value.extension.toprettystring.processor;

import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreStreams;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableSet;
import autovalue.shaded.com.google.common.collect.MoreCollectors;
import com.google.auto.value.extension.AutoValueExtension;
import java.util.Optional;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class ToPrettyStringMethods {
    private ToPrettyStringMethods() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$toPrettyStringMethods$0(ExecutableElement executableElement) {
        return Annotations.toPrettyStringAnnotation(executableElement).isPresent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$toPrettyStringMethods$1(ExecutableElement executableElement) {
        return Annotations.toPrettyStringAnnotation(executableElement).isPresent();
    }

    public static Optional<ExecutableElement> toPrettyStringMethod(TypeElement typeElement, Types types, Elements elements) {
        return (Optional) toPrettyStringMethods(typeElement, types, elements).stream().collect(MoreCollectors.toOptional());
    }

    public static ImmutableSet<ExecutableElement> toPrettyStringMethods(AutoValueExtension.Context context) {
        return (ImmutableSet) context.abstractMethods().stream().filter(new ToPrettyStringMethods$$ExternalSyntheticLambda0()).collect(MoreStreams.toImmutableSet());
    }

    public static ImmutableList<ExecutableElement> toPrettyStringMethods(TypeElement typeElement, Types types, Elements elements) {
        return (ImmutableList) MoreElements.getLocalAndInheritedMethods(typeElement, types, elements).stream().filter(new ToPrettyStringMethods$$ExternalSyntheticLambda1()).collect(MoreStreams.toImmutableList());
    }
}
