package org.jetbrains.kotlin.library.impl;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/IrFileWriter;", "", "()V", "writeData", "", "dataOutput", "Ljava/io/DataOutput;", "writeIntoFile", "path", "", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IrFileWriter {
    public abstract void writeData(@NotNull DataOutput dataOutput);

    public final void writeIntoFile(@NotNull String path) {
        path.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        writeData(dataOutputStream);
        dataOutputStream.close();
        fileOutputStream.close();
    }
}
