package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(@NotNull File file, @NotNull Serializer<T> serializer) {
        super(file, serializer);
        file.getClass();
        serializer.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.datastore.core.WriteScope
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.FileWriteScope$writeData$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = (androidx.datastore.core.FileWriteScope$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = new androidx.datastore.core.FileWriteScope$writeData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            java.io.FileOutputStream r5 = (java.io.FileOutputStream) r5
            java.lang.Object r6 = r0.L$0
            java.io.Closeable r6 = (java.io.Closeable) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L32
            goto L61
        L32:
            r5 = move-exception
            goto L72
        L34:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            return r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            r5.checkNotClosed()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.getFile()
            r7.<init>(r2)
            androidx.datastore.core.Serializer r5 = r5.getSerializer()     // Catch: java.lang.Throwable -> L70
            androidx.datastore.core.UncloseableOutputStream r2 = new androidx.datastore.core.UncloseableOutputStream     // Catch: java.lang.Throwable -> L70
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L70
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L70
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L70
            r0.label = r3     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r5.writeTo(r6, r2, r0)     // Catch: java.lang.Throwable -> L70
            if (r5 != r1) goto L5f
            return r1
        L5f:
            r5 = r7
            r6 = r5
        L61:
            java.io.FileDescriptor r5 = r5.getFD()     // Catch: java.lang.Throwable -> L32
            r5.sync()     // Catch: java.lang.Throwable -> L32
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L32
            kotlin.io.CloseableKt.closeFinally(r6, r4)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L70:
            r5 = move-exception
            r6 = r7
        L72:
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileWriteScope.writeData(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
