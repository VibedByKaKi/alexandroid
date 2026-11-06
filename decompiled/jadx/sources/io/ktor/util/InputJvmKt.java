package io.ktor.util;

import java.io.InputStream;
import kotlin.Metadata;
import kotlinx.io.core.Input;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"asStream", "Ljava/io/InputStream;", "Lkotlinx/io/core/Input;", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class InputJvmKt {
    @KtorExperimentalAPI
    @NotNull
    public static final InputStream asStream(@NotNull final Input input) {
        input.getClass();
        return new InputStream() { // from class: io.ktor.util.InputJvmKt$asStream$1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Input.this.close();
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] buffer, int offset, int length) {
                buffer.getClass();
                if (Input.this.getEndOfInput()) {
                    return -1;
                }
                return Input.this.readAvailable(buffer, offset, length);
            }

            @Override // java.io.InputStream
            public long skip(long count) {
                return Input.this.discard(count);
            }

            @Override // java.io.InputStream
            public int read() {
                return Input.this.tryPeek();
            }
        };
    }
}
