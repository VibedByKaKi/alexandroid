package com.amazon.coral.util.reflection;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.coral.org.json.XML$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class MetaInfAnnotatedClassLocator {
    private static final Logger LOG = LogManager.getLogger((Class<?>) MetaInfClassLocator.class);
    private static final String RESOURCE_PREFIX = "META-INF/annotated/";

    private MetaInfAnnotatedClassLocator() {
    }

    public static <T> Iterable<Class<? extends T>> get(Class<T> cls, Class<? extends Annotation> cls2, ClassLoader classLoader) {
        return ManifestReader.readClassesFromResource(RESOURCE_PREFIX.concat(cls2.getName()), cls, classLoader, new XML$$ExternalSyntheticBUOutline0(5));
    }

    private static void handleTypeMismatch(String str, String str2, String str3) {
        LOG.debug(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Class '", str, "' found in '", str3, "' is not an instance of '"), str2, "'"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$get$0(String str, String str2, String str3) {
        Logger logger = LOG;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Class '", str, "' found in '", str3, "' is not an instance of '");
        m.append(str2);
        m.append("'");
        logger.debug(m.toString());
    }

    public static <T> Iterable<Class<? extends T>> get(Class<T> cls, Class<? extends Annotation> cls2) {
        return get(cls, cls2, MetaInfAnnotatedClassLocator.class.getClassLoader());
    }
}
