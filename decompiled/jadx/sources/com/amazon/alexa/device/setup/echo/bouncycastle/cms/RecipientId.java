package com.amazon.alexa.device.setup.echo.bouncycastle.cms;

import com.amazon.alexa.device.setup.echo.bouncycastle.util.Selector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class RecipientId implements Selector {
    public static final int kek = 1;
    public static final int keyAgree = 2;
    public static final int keyTrans = 0;
    public static final int password = 3;
    private final int type;

    public RecipientId(int i) {
        this.type = i;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.util.Selector
    public abstract Object clone();

    public int getType() {
        return this.type;
    }
}
