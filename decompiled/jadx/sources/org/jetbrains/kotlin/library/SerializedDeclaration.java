package org.jetbrains.kotlin.library;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlin/library/SerializedDeclaration;", "", "id", "", "declarationName", "", "bytes", "", "(ILjava/lang/String;[B)V", "getBytes", "()[B", "getDeclarationName", "()Ljava/lang/String;", "getId", "()I", "size", "getSize", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class SerializedDeclaration {

    @NotNull
    private final byte[] bytes;

    @NotNull
    private final String declarationName;
    private final int id;
    private final int size;

    public SerializedDeclaration(int i, @NotNull String str, @NotNull byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.id = i;
        this.declarationName = str;
        this.bytes = bArr;
        this.size = bArr.length;
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final String getDeclarationName() {
        return this.declarationName;
    }

    public final int getId() {
        return this.id;
    }

    public final int getSize() {
        return this.size;
    }
}
