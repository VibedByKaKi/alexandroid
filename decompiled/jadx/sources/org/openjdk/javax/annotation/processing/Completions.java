package org.openjdk.javax.annotation.processing;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Completions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleCompletion implements Completion {
        private String message;
        private String value;

        public SimpleCompletion(String str, String str2) {
            if (str == null || str2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("Null completion strings not accepted.");
                throw null;
            }
            this.value = str;
            this.message = str2;
        }

        @Override // org.openjdk.javax.annotation.processing.Completion
        public String getMessage() {
            return this.message;
        }

        @Override // org.openjdk.javax.annotation.processing.Completion
        public String getValue() {
            return this.value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[\"");
            sb.append(this.value);
            sb.append("\", \"");
            return a$$ExternalSyntheticOutline0.m(sb, this.message, "\"]");
        }
    }

    private Completions() {
    }

    public static Completion of(String str) {
        return new SimpleCompletion(str, "");
    }

    public static Completion of(String str, String str2) {
        return new SimpleCompletion(str, str2);
    }
}
