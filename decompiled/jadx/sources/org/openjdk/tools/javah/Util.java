package org.openjdk.tools.javah;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.openjdk.javax.tools.Diagnostic;
import org.openjdk.javax.tools.DiagnosticListener;
import org.openjdk.javax.tools.JavaFileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Util {
    public DiagnosticListener<? super JavaFileObject> dl;
    public PrintWriter log;
    private ResourceBundle m;
    public boolean verbose = false;

    public Util(PrintWriter printWriter, DiagnosticListener<? super JavaFileObject> diagnosticListener) {
        this.log = printWriter;
        this.dl = diagnosticListener;
    }

    private Diagnostic<JavaFileObject> createDiagnostic(final Diagnostic.Kind kind, final String str, final Object... objArr) {
        return new Diagnostic<JavaFileObject>() { // from class: org.openjdk.tools.javah.Util.1
            @Override // org.openjdk.javax.tools.Diagnostic
            public String getCode() {
                return str;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public long getColumnNumber() {
                return -1L;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public long getEndPosition() {
                return -1L;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public Diagnostic.Kind getKind() {
                return kind;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public long getLineNumber() {
                return -1L;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public String getMessage(Locale locale) {
                return str.length() == 0 ? (String) objArr[0] : Util.this.getText(str, objArr);
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public long getPosition() {
                return -1L;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public long getStartPosition() {
                return -1L;
            }

            @Override // org.openjdk.javax.tools.Diagnostic
            public JavaFileObject getSource() {
                return null;
            }
        };
    }

    private void fatal(String str, Exception exc) throws Exit {
        this.dl.report(createDiagnostic(Diagnostic.Kind.ERROR, "", str));
        throw new Exit(10, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getText(String str, Object... objArr) throws Exit {
        if (this.m == null) {
            initMessages();
        }
        try {
            return MessageFormat.format(this.m.getString(str), objArr);
        } catch (MissingResourceException e) {
            this.fatal(a$$ExternalSyntheticOutline0.m("Key ", str, " not found in resources."), e);
            return null;
        }
    }

    private void initMessages() throws Exit {
        try {
            this.m = ResourceBundle.getBundle("org.openjdk.tools.javah.resources.l10n");
        } catch (MissingResourceException e) {
            fatal("Error loading resources.  Please file a bug report.", e);
        }
    }

    public void bug(String str, Exception exc) throws Exit {
        this.dl.report(createDiagnostic(Diagnostic.Kind.ERROR, str, new Object[0]));
        this.dl.report(createDiagnostic(Diagnostic.Kind.NOTE, "bug.report", new Object[0]));
        throw new Exit(11, exc);
    }

    public void error(String str, Object... objArr) throws Exit {
        this.dl.report(createDiagnostic(Diagnostic.Kind.ERROR, str, objArr));
        throw new Exit(15);
    }

    public void log(String str) {
        this.log.println(str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Exit extends Error {
        private static final long serialVersionUID = 430820978114067221L;
        public final Throwable cause;
        public final int exitValue;

        public Exit(int i, Throwable th) {
            super(th);
            this.exitValue = i;
            this.cause = th;
        }

        public Exit(int i) {
            this(i, null);
        }

        public Exit(Exit exit) {
            this(exit.exitValue, exit.cause);
        }
    }

    public void bug(String str) throws Exit {
        bug(str, null);
    }
}
