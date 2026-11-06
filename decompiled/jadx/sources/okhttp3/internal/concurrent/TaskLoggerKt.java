package okhttp3.internal.concurrent;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.tarazed.session.sessionEvents.PlaybackStates;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"formatDuration", "", "ns", "", "log", "", "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "message", "logElapsed", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "taskLog", "messageBlock", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TaskLoggerKt {
    @NotNull
    public static final String formatDuration(long j) {
        String m;
        if (j <= -999500000) {
            m = a$$ExternalSyntheticOutline0.m((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            m = a$$ExternalSyntheticOutline0.m((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            m = a$$ExternalSyntheticOutline0.m((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            m = a$$ExternalSyntheticOutline0.m((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            m = a$$ExternalSyntheticOutline0.m((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            m = a$$ExternalSyntheticOutline0.m((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%6s", Arrays.copyOf(new Object[]{m}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull Function0<? extends T> function0) {
        long j;
        task.getClass();
        taskQueue.getClass();
        function0.getClass();
        boolean isLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner().getBackend().nanoTime();
            log(task, taskQueue, PlaybackStates.STARTING);
        } else {
            j = -1;
        }
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            if (isLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - j));
            }
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (isLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - j));
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue taskQueue, @NotNull Function0<String> function0) {
        task.getClass();
        taskQueue.getClass();
        function0.getClass();
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, function0.invoke());
        }
    }
}
