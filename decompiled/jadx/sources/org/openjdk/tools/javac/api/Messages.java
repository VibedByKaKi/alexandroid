package org.openjdk.tools.javac.api;

import java.util.Locale;
import java.util.MissingResourceException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Messages {
    void add(String str) throws MissingResourceException;

    String getLocalizedString(Locale locale, String str, Object... objArr);
}
