package org.jetbrains.kotlin.library.impl;

import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\n¢\u0006\u0002\u0010\u000b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"buffer", "Ljava/nio/ByteBuffer;", "", "getBuffer", "([B)Ljava/nio/ByteBuffer;", "javaFile", "Ljava/io/File;", "Lorg/jetbrains/kotlin/konan/file/File;", "toArray", "", "Lorg/jetbrains/kotlin/library/impl/IrArrayReader;", "(Lorg/jetbrains/kotlin/library/impl/IrArrayReader;)[[B", "kotlin-util-klib"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IrFileReadersKt {
    @NotNull
    public static final ByteBuffer getBuffer(@NotNull byte[] bArr) {
        bArr.getClass();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.getClass();
        return wrap;
    }

    @NotNull
    public static final File javaFile(@NotNull org.jetbrains.kotlin.konan.file.File file) {
        file.getClass();
        return new File(file.getPath());
    }

    @NotNull
    public static final byte[][] toArray(@NotNull IrArrayReader irArrayReader) {
        irArrayReader.getClass();
        int entryCount = irArrayReader.entryCount();
        byte[][] bArr = new byte[entryCount][];
        for (int i = 0; i < entryCount; i++) {
            bArr[i] = irArrayReader.tableItemBytes(i);
        }
        return bArr;
    }
}
