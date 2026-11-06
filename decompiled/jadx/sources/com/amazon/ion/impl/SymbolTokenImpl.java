package com.amazon.ion.impl;

import com.amazon.ion.SymbolToken;
import com.amazon.ion.UnknownSymbolException;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class SymbolTokenImpl implements _Private_SymbolToken {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int mySid;
    private final String myText;

    public SymbolTokenImpl(int i) {
        this.myText = null;
        this.mySid = i;
    }

    @Override // com.amazon.ion.SymbolToken
    public String assumeText() {
        String str = this.myText;
        if (str != null) {
            return str;
        }
        throw new UnknownSymbolException(this.mySid);
    }

    @Override // com.amazon.ion.impl._Private_SymbolToken
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof SymbolToken)) {
            SymbolToken symbolToken = (SymbolToken) obj;
            if (getText() != null && symbolToken.getText() != null) {
                return getText().equals(symbolToken.getText());
            }
            if (getText() == symbolToken.getText()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.ion.SymbolToken
    public int getSid() {
        return this.mySid;
    }

    @Override // com.amazon.ion.SymbolToken
    public String getText() {
        return this.myText;
    }

    @Override // com.amazon.ion.impl._Private_SymbolToken
    public int hashCode() {
        if (getText() != null) {
            return getText().hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SymbolToken::{text:");
        sb.append(this.myText);
        sb.append(",id:");
        return a$$ExternalSyntheticOutline0.m(sb, this.mySid, StringSubstitutor.DEFAULT_VAR_END);
    }

    public SymbolTokenImpl(String str, int i) {
        this.myText = str;
        this.mySid = i;
    }
}
