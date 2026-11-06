package dagger.internal.codegen.base;

import dagger.internal.codegen.javapoet.TypeNames;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum ContributionType {
    MAP,
    SET,
    SET_VALUES,
    UNIQUE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface HasContributionType {
        ContributionType contributionType();
    }

    public static ContributionType fromBindingElement(XElement xElement) {
        return xElement.hasAnnotation(TypeNames.INTO_MAP) ? MAP : xElement.hasAnnotation(TypeNames.INTO_SET) ? SET : xElement.hasAnnotation(TypeNames.ELEMENTS_INTO_SET) ? SET_VALUES : UNIQUE;
    }

    public boolean isMultibinding() {
        return !equals(UNIQUE);
    }
}
