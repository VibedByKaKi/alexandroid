package com.amazon.ion.impl;

import com.amazon.ion.util._Private_FastAppendable;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class _Private_FastAppendableTrampoline {
    public static _Private_FastAppendable forAppendable(Appendable appendable) {
        return new AppendableFastAppendable(appendable);
    }

    public static _Private_FastAppendable forOutputStream(OutputStream outputStream) {
        return new OutputStreamFastAppendable(outputStream);
    }
}
