package org.openjdk.tools.sjavac.comp;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.openjdk.tools.javac.main.Main;
import org.openjdk.tools.sjavac.Log;
import org.openjdk.tools.sjavac.server.Sjavac;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class PooledSjavac implements Sjavac {
    final Sjavac delegate;
    final ExecutorService pool;

    public PooledSjavac(Sjavac sjavac, int i) {
        Objects.requireNonNull(sjavac);
        this.delegate = sjavac;
        this.pool = Executors.newFixedThreadPool(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Main.Result lambda$compile$0(Log log, String[] strArr) throws Exception {
        Log.setLogForCurrentThread(log);
        return this.delegate.compile(strArr);
    }

    @Override // org.openjdk.tools.sjavac.server.Sjavac
    public Main.Result compile(String[] strArr) {
        try {
            return (Main.Result) this.pool.submit(new Processor$$ExternalSyntheticLambda1(this, 10, Log.get(), strArr)).get();
        } catch (Exception e) {
            e.printStackTrace();
            OnnxMap$$ExternalSyntheticBUOutline0.m("Error during compile", e);
            return null;
        }
    }

    @Override // org.openjdk.tools.sjavac.server.Sjavac
    public void shutdown() {
        Log.debug("Shutting down PooledSjavac");
        this.pool.shutdown();
        try {
            ExecutorService executorService = this.pool;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(60L, timeUnit)) {
                this.pool.shutdownNow();
                if (!this.pool.awaitTermination(60L, timeUnit)) {
                    Log.error("ThreadPool did not terminate");
                }
            }
        } catch (InterruptedException unused) {
            this.pool.shutdownNow();
            Thread.currentThread().interrupt();
        }
        this.delegate.shutdown();
    }
}
