package com.amazon.ion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UnsupportedIonVersionException extends IonException {
    private static final long serialVersionUID = -1166749371823975664L;
    private final String _unsupportedIonVersionId;

    public UnsupportedIonVersionException(String str) {
        this._unsupportedIonVersionId = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Unsupported Ion version " + this._unsupportedIonVersionId;
    }

    public String getUnsuportedIonVersionId() {
        return this._unsupportedIonVersionId;
    }
}
