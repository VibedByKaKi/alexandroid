package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/FileReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "file", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFile", "()Ljava/io/File;", "getSerializer", "()Landroidx/datastore/core/Serializer;", "checkNotClosed", "", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileReadScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
/* loaded from: classes13.dex */
public class FileReadScope<T> implements ReadScope<T> {

    @NotNull
    private final java.util.concurrent.atomic.AtomicBoolean closed;

    @NotNull
    private final File file;

    @NotNull
    private final Serializer<T> serializer;

    public FileReadScope(@NotNull File file, @NotNull Serializer<T> serializer) {
        file.getClass();
        serializer.getClass();
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(7:40|41|42|43|44|(1:46)|47)|30|31))|66|6|7|(0)(0)|30|31|(3:(1:36)|(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006e, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.FileReadScope<T> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof androidx.datastore.core.FileReadScope$readData$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.FileReadScope$readData$1 r0 = (androidx.datastore.core.FileReadScope$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileReadScope$readData$1 r0 = new androidx.datastore.core.FileReadScope$readData$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$0
            java.io.Closeable r7 = (java.io.Closeable) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L32
            goto L9c
        L32:
            r8 = move-exception
            goto La4
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r7)
            r7 = 0
            return r7
        L3c:
            java.lang.Object r7 = r0.L$1
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.FileReadScope r2 = (androidx.datastore.core.FileReadScope) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L48
            goto L6a
        L48:
            r8 = move-exception
            goto L75
        L4a:
            kotlin.ResultKt.throwOnFailure(r8)
            r7.checkNotClosed()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7b
            java.io.File r2 = r7.file     // Catch: java.io.FileNotFoundException -> L7b
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7b
            androidx.datastore.core.Serializer<T> r2 = r7.serializer     // Catch: java.lang.Throwable -> L70
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L70
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L70
            r0.label = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r2.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L70
            if (r2 != r1) goto L66
            goto L98
        L66:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6a:
            kotlin.io.CloseableKt.closeFinally(r7, r5)     // Catch: java.io.FileNotFoundException -> L6e
            return r8
        L6e:
            r7 = r2
            goto L7b
        L70:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L75:
            throw r8     // Catch: java.lang.Throwable -> L76
        L76:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r7, r8)     // Catch: java.io.FileNotFoundException -> L6e
            throw r4     // Catch: java.io.FileNotFoundException -> L6e
        L7b:
            java.io.File r8 = r7.file
            boolean r8 = r8.exists()
            if (r8 == 0) goto Laa
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.file
            r8.<init>(r2)
            androidx.datastore.core.Serializer<T> r7 = r7.serializer     // Catch: java.lang.Throwable -> La0
            r0.L$0 = r8     // Catch: java.lang.Throwable -> La0
            r0.L$1 = r5     // Catch: java.lang.Throwable -> La0
            r0.label = r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r7 = r7.readFrom(r8, r0)     // Catch: java.lang.Throwable -> La0
            if (r7 != r1) goto L99
        L98:
            return r1
        L99:
            r6 = r8
            r8 = r7
            r7 = r6
        L9c:
            kotlin.io.CloseableKt.closeFinally(r7, r5)
            return r8
        La0:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La4:
            throw r8     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r7, r8)
            throw r0
        Laa:
            androidx.datastore.core.Serializer<T> r7 = r7.serializer
            java.lang.Object r7 = r7.getDefaultValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope.readData$suspendImpl(androidx.datastore.core.FileReadScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void checkNotClosed() {
        if (this.closed.get()) {
            Single$$ExternalSyntheticBUOutline0.m$2("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    @Nullable
    public Object readData(@NotNull Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
