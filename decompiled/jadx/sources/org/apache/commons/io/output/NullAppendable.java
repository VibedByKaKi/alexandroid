package org.apache.commons.io.output;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class NullAppendable implements Appendable {
    public static final NullAppendable INSTANCE = new NullAppendable();

    private NullAppendable() {
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) throws IOException {
        return this;
    }
}
