package org.jetbrains.kotlin.library;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lorg/jetbrains/kotlin/library/SerializedMetadata;", "", "module", "", "fragments", "", "fragmentNames", "", "([BLjava/util/List;Ljava/util/List;)V", "getFragmentNames", "()Ljava/util/List;", "getFragments", "getModule", "()[B", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class SerializedMetadata {

    @NotNull
    private final List<String> fragmentNames;

    @NotNull
    private final List<List<byte[]>> fragments;

    @NotNull
    private final byte[] module;

    /* JADX WARN: Multi-variable type inference failed */
    public SerializedMetadata(@NotNull byte[] bArr, @NotNull List<? extends List<byte[]>> list, @NotNull List<String> list2) {
        bArr.getClass();
        list.getClass();
        list2.getClass();
        this.module = bArr;
        this.fragments = list;
        this.fragmentNames = list2;
    }

    @NotNull
    public final List<String> getFragmentNames() {
        return this.fragmentNames;
    }

    @NotNull
    public final List<List<byte[]>> getFragments() {
        return this.fragments;
    }

    @NotNull
    public final byte[] getModule() {
        return this.module;
    }
}
