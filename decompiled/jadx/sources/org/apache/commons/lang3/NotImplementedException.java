package org.apache.commons.lang3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NotImplementedException extends UnsupportedOperationException {
    private static final long serialVersionUID = 20131021;
    private final String code;

    public NotImplementedException() {
        this.code = null;
    }

    public String getCode() {
        return this.code;
    }

    public NotImplementedException(String str) {
        this(str, (String) null);
    }

    public NotImplementedException(String str, String str2) {
        super(str);
        this.code = str2;
    }

    public NotImplementedException(String str, Throwable th) {
        this(str, th, null);
    }

    public NotImplementedException(String str, Throwable th, String str2) {
        super(str, th);
        this.code = str2;
    }

    public NotImplementedException(Throwable th) {
        this(th, (String) null);
    }

    public NotImplementedException(Throwable th, String str) {
        super(th);
        this.code = str;
    }
}
