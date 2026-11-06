package com.swmansion.worklets;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
/* loaded from: classes9.dex */
public abstract class WorkletsMessageQueueThreadBase implements MessageQueueThread {
    protected final MessageQueueThreadImpl messageQueueThread = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new CodecsKt$$ExternalSyntheticBUOutline0(15));

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        this.messageQueueThread.assertIsOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public <T> Future<T> callOnQueue(Callable<T> callable) {
        return this.messageQueueThread.callOnQueue(callable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    /* renamed from: getPerfStats */
    public MessageQueueThreadPerfStats getStats() {
        return this.messageQueueThread.getStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.messageQueueThread.isOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        try {
            Field declaredField = this.messageQueueThread.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(this.messageQueueThread, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        this.messageQueueThread.resetPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String str) {
        this.messageQueueThread.assertIsOnThread(str);
    }
}
