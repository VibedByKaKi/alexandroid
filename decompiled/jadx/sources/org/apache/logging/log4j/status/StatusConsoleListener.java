package org.apache.logging.log4j.status;

import com.amazon.alexa.accessorykit.ModelTransformer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.Level;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StatusConsoleListener implements StatusListener {
    private final Level initialLevel;
    private final PrintStream initialStream;
    private volatile Level level;
    private final Lock lock;
    private volatile PrintStream stream;

    public StatusConsoleListener(Level level, PrintStream printStream) {
        this.lock = new ReentrantLock();
        Objects.requireNonNull(level, ModelTransformer.KEY_BATTERY_LEVEL);
        this.level = level;
        this.initialLevel = level;
        Objects.requireNonNull(printStream, "stream");
        this.stream = printStream;
        this.initialStream = printStream;
    }

    private static void closeNonSystemStream(OutputStream outputStream) {
        if (outputStream == System.out || outputStream == System.err) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.lock.lock();
        try {
            PrintStream printStream = this.stream;
            this.stream = this.initialStream;
            this.level = this.initialLevel;
            this.lock.unlock();
            closeNonSystemStream(printStream);
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // org.apache.logging.log4j.status.StatusListener
    public Level getStatusLevel() {
        return this.level;
    }

    @Override // org.apache.logging.log4j.status.StatusListener
    public void log(StatusData statusData) {
        Objects.requireNonNull(statusData, "data");
        this.stream.println(statusData.getFormattedStatus());
    }

    public void setLevel(Level level) {
        Objects.requireNonNull(level, ModelTransformer.KEY_BATTERY_LEVEL);
        if (this.level.equals(level)) {
            return;
        }
        this.lock.lock();
        try {
            this.level = level;
        } finally {
            this.lock.unlock();
        }
    }

    public void setStream(PrintStream printStream) {
        PrintStream printStream2;
        Objects.requireNonNull(printStream, "stream");
        if (this.stream != printStream) {
            this.lock.lock();
            try {
                if (this.stream != printStream) {
                    printStream2 = this.stream;
                    this.stream = printStream;
                } else {
                    printStream2 = null;
                }
                if (printStream2 != null) {
                    closeNonSystemStream(printStream2);
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    @Deprecated
    public void setFilters(String... strArr) {
    }

    public StatusConsoleListener(Level level) {
        this(level, System.out);
    }
}
