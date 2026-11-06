package org.junit.runner.notification;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.junit.runner.Description;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Failure implements Serializable {
    private static final long serialVersionUID = 1;
    private final Description fDescription;
    private final Throwable fThrownException;

    public Failure(Description description, Throwable th) {
        this.fThrownException = th;
        this.fDescription = description;
    }

    public Description getDescription() {
        return this.fDescription;
    }

    public Throwable getException() {
        return this.fThrownException;
    }

    public String getMessage() {
        return getException().getMessage();
    }

    public String getTestHeader() {
        return this.fDescription.getDisplayName();
    }

    public String getTrace() {
        StringWriter stringWriter = new StringWriter();
        getException().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTestHeader());
        sb.append(": ");
        return ParcelCompat$$ExternalSyntheticOutline0.m(this.fThrownException, sb);
    }
}
