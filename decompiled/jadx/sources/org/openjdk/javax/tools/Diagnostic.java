package org.openjdk.javax.tools;

import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Diagnostic<S> {
    public static final long NOPOS = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        ERROR,
        WARNING,
        MANDATORY_WARNING,
        NOTE,
        OTHER
    }

    String getCode();

    long getColumnNumber();

    long getEndPosition();

    Kind getKind();

    long getLineNumber();

    String getMessage(Locale locale);

    long getPosition();

    S getSource();

    long getStartPosition();
}
