package com.amazon.ion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UnknownSymbolException extends IonException {
    private static final long serialVersionUID = 1;
    private final int mySid;
    private final String myText;

    public UnknownSymbolException(int i) {
        this.mySid = i;
        this.myText = null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str = this.myText;
        if (str != null) {
            return str;
        }
        return "Unknown symbol text for $" + this.mySid;
    }

    public int getSid() {
        return this.mySid;
    }

    public UnknownSymbolException(String str) {
        this.myText = str;
        this.mySid = 0;
    }
}
