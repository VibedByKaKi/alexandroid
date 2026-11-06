package org.openjdk.tools.javac.api;

import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Formattable {
    String getKind();

    String toString(Locale locale, Messages messages);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LocalizedString implements Formattable {
        String key;

        public LocalizedString(String str) {
            this.key = str;
        }

        @Override // org.openjdk.tools.javac.api.Formattable
        public String getKind() {
            return "LocalizedString";
        }

        @Override // org.openjdk.tools.javac.api.Formattable
        public String toString(Locale locale, Messages messages) {
            return messages.getLocalizedString(locale, this.key, new Object[0]);
        }

        public String toString() {
            return this.key;
        }
    }
}
