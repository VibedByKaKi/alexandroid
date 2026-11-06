package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InvalidTelnetOptionException extends Exception {
    private static final long serialVersionUID = -2516777155928793597L;
    private final String msg;
    private final int optionCode;

    public InvalidTelnetOptionException(String str, int i) {
        this.optionCode = i;
        this.msg = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.msg + ": " + this.optionCode;
    }
}
