package com.bugsnag.android;

import android.util.JsonReader;
import androidx.exifinterface.media.ExifInterface;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.JsonStream.Streamable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\t\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/SynchronizedStreamableStore;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bugsnag/android/JsonStream$Streamable;", "", "file", "Ljava/io/File;", "(Ljava/io/File;)V", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "load", "loadCallback", "Lkotlin/Function1;", "Landroid/util/JsonReader;", "(Lkotlin/jvm/functions/Function1;)Lcom/bugsnag/android/JsonStream$Streamable;", "persist", "", "streamable", "(Lcom/bugsnag/android/JsonStream$Streamable;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class SynchronizedStreamableStore<T extends JsonStream.Streamable> {
    private final File file;
    private final ReentrantReadWriteLock lock;

    public SynchronizedStreamableStore(@NotNull File file) {
        file.getClass();
        this.file = file;
        this.lock = new ReentrantReadWriteLock();
    }

    @NotNull
    public final T load(@NotNull Function1<? super JsonReader, ? extends T> loadCallback) throws IOException {
        loadCallback.getClass();
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.getClass();
        readLock.lock();
        try {
            File file = this.file;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                T invoke = loadCallback.invoke(new JsonReader(bufferedReader));
                CloseableKt.closeFinally(bufferedReader, null);
                return invoke;
            } finally {
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void persist(@NotNull T streamable) throws IOException {
        streamable.getClass();
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        writeLock.getClass();
        writeLock.lock();
        try {
            File file = this.file;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192);
            try {
                streamable.toStream(new JsonStream(bufferedWriter));
                CloseableKt.closeFinally(bufferedWriter, null);
            } finally {
            }
        } finally {
            writeLock.unlock();
        }
    }
}
