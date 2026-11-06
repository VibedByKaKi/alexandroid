package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class ConstructorDetector implements Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _allowJDKTypeCtors;
    protected final boolean _requireCtorAnnotation;
    protected final SingleArgConstructor _singleArgMode;
    public static final ConstructorDetector DEFAULT = new ConstructorDetector(SingleArgConstructor.HEURISTIC);
    public static final ConstructorDetector USE_PROPERTIES_BASED = new ConstructorDetector(SingleArgConstructor.PROPERTIES);
    public static final ConstructorDetector USE_DELEGATING = new ConstructorDetector(SingleArgConstructor.DELEGATING);
    public static final ConstructorDetector EXPLICIT_ONLY = new ConstructorDetector(SingleArgConstructor.REQUIRE_MODE);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SingleArgConstructor {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    public ConstructorDetector(SingleArgConstructor singleArgConstructor, boolean z, boolean z2) {
        this._singleArgMode = singleArgConstructor;
        this._requireCtorAnnotation = z;
        this._allowJDKTypeCtors = z2;
    }

    public boolean allowJDKTypeConstructors() {
        return this._allowJDKTypeCtors;
    }

    public boolean requireCtorAnnotation() {
        return this._requireCtorAnnotation;
    }

    public boolean shouldIntrospectorImplicitConstructors(Class<?> cls) {
        if (this._requireCtorAnnotation) {
            return false;
        }
        return this._allowJDKTypeCtors || !ClassUtil.isJDKClass(cls) || Throwable.class.isAssignableFrom(cls);
    }

    public boolean singleArgCreatorDefaultsToDelegating() {
        return this._singleArgMode == SingleArgConstructor.DELEGATING;
    }

    public boolean singleArgCreatorDefaultsToProperties() {
        return this._singleArgMode == SingleArgConstructor.PROPERTIES;
    }

    public SingleArgConstructor singleArgMode() {
        return this._singleArgMode;
    }

    public ConstructorDetector withAllowJDKTypeConstructors(boolean z) {
        return new ConstructorDetector(this._singleArgMode, this._requireCtorAnnotation, z);
    }

    public ConstructorDetector withRequireAnnotation(boolean z) {
        return new ConstructorDetector(this._singleArgMode, z, this._allowJDKTypeCtors);
    }

    public ConstructorDetector withSingleArgMode(SingleArgConstructor singleArgConstructor) {
        return new ConstructorDetector(singleArgConstructor, this._requireCtorAnnotation, this._allowJDKTypeCtors);
    }

    public ConstructorDetector(SingleArgConstructor singleArgConstructor) {
        this(singleArgConstructor, false, false);
    }
}
