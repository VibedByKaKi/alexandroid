package org.jetbrains.kotlin.library.impl;

import java.io.DataOutput;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrTableWriter;", "Lorg/jetbrains/kotlin/library/impl/IrFileWriter;", "data", "", "Lkotlin/Pair;", "", "", "(Ljava/util/List;)V", "writeData", "", "dataOutput", "Ljava/io/DataOutput;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nIrFileWriters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IrFileWriters.kt\norg/jetbrains/kotlin/library/impl/IrTableWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n1855#2,2:168\n*S KotlinDebug\n*F\n+ 1 IrFileWriters.kt\norg/jetbrains/kotlin/library/impl/IrTableWriter\n*L\n108#1:166,2\n115#1:168,2\n*E\n"})
/* loaded from: classes11.dex */
public final class IrTableWriter extends IrFileWriter {

    @NotNull
    private final List<Pair<Long, byte[]>> data;

    public IrTableWriter(@NotNull List<Pair<Long, byte[]>> list) {
        list.getClass();
        this.data = list;
    }

    @Override // org.jetbrains.kotlin.library.impl.IrFileWriter
    public void writeData(@NotNull DataOutput dataOutput) {
        dataOutput.getClass();
        dataOutput.writeInt(this.data.size());
        int size = (this.data.size() * 16) + 4;
        Iterator<T> it2 = this.data.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            dataOutput.writeLong(((Number) pair.getFirst()).longValue());
            dataOutput.writeInt(size);
            dataOutput.writeInt(((byte[]) pair.getSecond()).length);
            size += ((byte[]) pair.getSecond()).length;
        }
        Iterator<T> it3 = this.data.iterator();
        while (it3.hasNext()) {
            dataOutput.write((byte[]) ((Pair) it3.next()).getSecond());
        }
    }
}
