package org.jetbrains.kotlin.library.impl;

import java.io.DataOutput;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrMemoryArrayWriter;", "Lorg/jetbrains/kotlin/library/impl/IrMemoryWriter;", "data", "", "", "(Ljava/util/List;)V", "writeData", "", "dataOutput", "Ljava/io/DataOutput;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nIrFileWriters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IrFileWriters.kt\norg/jetbrains/kotlin/library/impl/IrMemoryArrayWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n1855#2,2:168\n*S KotlinDebug\n*F\n+ 1 IrFileWriters.kt\norg/jetbrains/kotlin/library/impl/IrMemoryArrayWriter\n*L\n61#1:166,2\n62#1:168,2\n*E\n"})
/* loaded from: classes11.dex */
public final class IrMemoryArrayWriter extends IrMemoryWriter {

    @NotNull
    private final List<byte[]> data;

    public IrMemoryArrayWriter(@NotNull List<byte[]> list) {
        list.getClass();
        this.data = list;
    }

    @Override // org.jetbrains.kotlin.library.impl.IrMemoryWriter
    public void writeData(@NotNull DataOutput dataOutput) {
        dataOutput.getClass();
        dataOutput.writeInt(this.data.size());
        Iterator<T> it2 = this.data.iterator();
        while (it2.hasNext()) {
            dataOutput.writeInt(((byte[]) it2.next()).length);
        }
        Iterator<T> it3 = this.data.iterator();
        while (it3.hasNext()) {
            dataOutput.write((byte[]) it3.next());
        }
    }
}
