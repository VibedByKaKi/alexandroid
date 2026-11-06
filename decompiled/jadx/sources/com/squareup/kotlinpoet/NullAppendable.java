package com.squareup.kotlinpoet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/squareup/kotlinpoet/NullAppendable;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "()V", "append", "c", "", "charSequence", "", "start", "", "end", "kotlinpoet"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NullAppendable implements Appendable {

    @NotNull
    public static final NullAppendable INSTANCE = new NullAppendable();

    private NullAppendable() {
    }

    @Override // java.lang.Appendable
    @NotNull
    public NullAppendable append(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public NullAppendable append(@NotNull CharSequence charSequence, int start, int end) {
        charSequence.getClass();
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public NullAppendable append(char c) {
        return this;
    }
}
