package org.apache.commons.net.ftp.parser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ParserInitializationException extends RuntimeException {
    private static final long serialVersionUID = 5563335279583210658L;

    public ParserInitializationException(String str) {
        super(str);
    }

    @Deprecated
    public Throwable getRootCause() {
        return super.getCause();
    }

    public ParserInitializationException(String str, Throwable th) {
        super(str, th);
    }
}
