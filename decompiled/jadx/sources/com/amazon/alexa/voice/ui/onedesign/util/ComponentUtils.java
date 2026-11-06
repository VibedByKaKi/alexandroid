package com.amazon.alexa.voice.ui.onedesign.util;

import com.amazon.alexa.voice.ui.locale.AlexaLocaleAuthority;
import com.amazon.alexa.voice.ui.locale.GetLocaleAuthority;
import com.amazon.regulator.Component;
import com.amazon.regulator.internal.Preconditions;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ComponentUtils {
    private ComponentUtils() {
    }

    public static Locale getLocale(Component component) {
        return component.isRegistered(AlexaLocaleAuthority.class) ? ((AlexaLocaleAuthority) component.get(AlexaLocaleAuthority.class)).getLocale() : ((GetLocaleAuthority) component.get(GetLocaleAuthority.class)).getLocale();
    }

    public static void removeDependency(Component component, Class cls, Object obj) {
        Preconditions.nonNull(component, "Component cannot be null");
        Preconditions.nonNull(cls, "Class cannot be null");
        Preconditions.nonNull(obj, "Dependency object cannot be null");
        try {
            if (obj == component.get(cls)) {
                component.remove(cls);
            }
        } catch (IllegalStateException unused) {
        }
    }
}
