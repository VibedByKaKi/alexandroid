package com.amazon.ion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public class EmptySymbolException extends IonException {
    private static final long serialVersionUID = -7801632953459636349L;

    public EmptySymbolException() {
        super("Symbols must contain at least one character.");
    }
}
