package org.jetbrains.kotlin.library.impl;

import java.io.DataOutput;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.library.SerializedDeclaration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrDeclarationWriter;", "Lorg/jetbrains/kotlin/library/impl/IrFileWriter;", "declarations", "", "Lorg/jetbrains/kotlin/library/SerializedDeclaration;", "(Ljava/util/List;)V", "INDEX_HEADER_SIZE", "", "SINGLE_INDEX_RECORD_SIZE", "writeData", "", "dataOutput", "Ljava/io/DataOutput;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class IrDeclarationWriter extends IrFileWriter {
    private final int INDEX_HEADER_SIZE;
    private final int SINGLE_INDEX_RECORD_SIZE;

    @NotNull
    private final List<SerializedDeclaration> declarations;

    public IrDeclarationWriter(@NotNull List<SerializedDeclaration> list) {
        list.getClass();
        this.declarations = list;
        this.SINGLE_INDEX_RECORD_SIZE = 12;
        this.INDEX_HEADER_SIZE = 4;
    }

    @Override // org.jetbrains.kotlin.library.impl.IrFileWriter
    public void writeData(@NotNull DataOutput dataOutput) {
        dataOutput.getClass();
        dataOutput.writeInt(this.declarations.size());
        int size = (this.declarations.size() * this.SINGLE_INDEX_RECORD_SIZE) + this.INDEX_HEADER_SIZE;
        for (SerializedDeclaration serializedDeclaration : this.declarations) {
            dataOutput.writeInt(serializedDeclaration.getId());
            dataOutput.writeInt(size);
            dataOutput.writeInt(serializedDeclaration.getSize());
            size += serializedDeclaration.getSize();
        }
        Iterator<SerializedDeclaration> it2 = this.declarations.iterator();
        while (it2.hasNext()) {
            dataOutput.write(it2.next().getBytes());
        }
    }
}
