package org.jetbrains.kotlin.library.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.library.IrKotlinLibraryLayout;
import org.jetbrains.kotlin.library.IrWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrWriterImpl;", "Lorg/jetbrains/kotlin/library/IrWriter;", "irLayout", "Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;", "(Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;)V", "getIrLayout", "()Lorg/jetbrains/kotlin/library/IrKotlinLibraryLayout;", "addDataFlowGraph", "", "dataFlowGraph", "", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IrWriterImpl implements IrWriter {

    @NotNull
    private final IrKotlinLibraryLayout irLayout;

    public IrWriterImpl(@NotNull IrKotlinLibraryLayout irKotlinLibraryLayout) {
        irKotlinLibraryLayout.getClass();
        this.irLayout = irKotlinLibraryLayout;
    }

    @Override // org.jetbrains.kotlin.library.IrWriter
    public void addDataFlowGraph(@NotNull byte[] dataFlowGraph) {
        dataFlowGraph.getClass();
        this.irLayout.getDataFlowGraphFile().writeBytes(dataFlowGraph);
    }

    @NotNull
    public final IrKotlinLibraryLayout getIrLayout() {
        return this.irLayout;
    }
}
