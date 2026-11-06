package com.amazon.coral.util.reflection;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.voiceui.ra.RaInteractor$$ExternalSyntheticLambda2;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum MetaInfClassLocator {
    SERVICES("services"),
    CLASSES("classes");

    private static final Logger LOG = LogManager.getLogger((Class<?>) MetaInfClassLocator.class);
    private final String resourcePrefix;

    MetaInfClassLocator(String str) {
        this.resourcePrefix = a$$ExternalSyntheticOutline0.m("META-INF/", str, "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleTypeMismatch(String str, String str2, String str3) {
        throw new ClassCastException(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Class '", str, "' found in '", str3, "' is not an instance of '"), str2, "'"));
    }

    public <T> Iterable<Class<? extends T>> get(Class<T> cls, ClassLoader classLoader) {
        return ManifestReader.readClassesFromResource(this.resourcePrefix + cls.getName(), cls, classLoader, new RaInteractor$$ExternalSyntheticLambda2(this, 10));
    }

    public <T> Iterable<Class<? extends T>> get(Class<T> cls) {
        return get(cls, MetaInfClassLocator.class.getClassLoader());
    }
}
