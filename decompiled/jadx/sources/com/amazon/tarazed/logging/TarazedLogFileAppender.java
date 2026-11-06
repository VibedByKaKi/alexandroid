package com.amazon.tarazed.logging;

import android.content.Context;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0013H\u0002J\u001a\u0010!\u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0#J\u0006\u0010$\u001a\u00020\u001fJ\b\u0010%\u001a\u00020\u001fH\u0002J\u0006\u0010&\u001a\u00020\u001fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/amazon/tarazed/logging/TarazedLogFileAppender;", "", "context", "Landroid/content/Context;", "logFileName", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "(Landroid/content/Context;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;)V", "appenderChannel", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/logging/LogRecord;", "appenderJob", "Lkotlinx/coroutines/Job;", "logFile", "Ljava/io/File;", "logHandler", "Ljava/util/logging/Handler;", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "appendLog", ModelTransformer.KEY_BATTERY_LEVEL, "Ljava/util/logging/Level;", "tag", "msg", "thrown", "", "clearLogs", "", "createHandler", "forEachLine", "action", "Lkotlin/Function1;", "start", "startAppenderJob", "stop", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedLogFileAppender {
    private static final int LOG_FILE_COUNT = 1;
    private static final int LOG_FILE_LIMIT_BYTES = 786432;

    @NotNull
    private final Channel<LogRecord> appenderChannel;
    private Job appenderJob;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final DispatcherProvider dispatchers;

    @NotNull
    private final File logFile;
    private Handler logHandler;
    private final Logger logger;

    public TarazedLogFileAppender(@NotNull Context context, @NotNull String str, @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider) {
        context.getClass();
        str.getClass();
        coroutineScope.getClass();
        dispatcherProvider.getClass();
        this.coroutineScope = coroutineScope;
        this.dispatchers = dispatcherProvider;
        Logger anonymousLogger = Logger.getAnonymousLogger();
        this.logger = anonymousLogger;
        this.logFile = new File(context.getCacheDir(), str);
        this.appenderChannel = ChannelKt.Channel$default(0, null, null, 7, null);
        anonymousLogger.setUseParentHandlers(false);
        anonymousLogger.setLevel(Level.ALL);
        start();
    }

    public static /* synthetic */ Job appendLog$default(TarazedLogFileAppender tarazedLogFileAppender, Level level, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 8) != 0) {
            th = null;
        }
        return tarazedLogFileAppender.appendLog(level, str, str2, th);
    }

    private final Handler createHandler() {
        FileHandler fileHandler = new FileHandler(this.logFile.getAbsolutePath(), LOG_FILE_LIMIT_BYTES, 1, true);
        fileHandler.setFormatter(TarazedLogFormatter.INSTANCE);
        return fileHandler;
    }

    private final void startAppenderJob() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.io(), null, new TarazedLogFileAppender$startAppenderJob$1(this, null), 2, null);
        this.appenderJob = launch$default;
    }

    @NotNull
    public final Job appendLog(@NotNull Level level, @NotNull String tag, @NotNull String msg, @Nullable Throwable thrown) {
        Job launch$default;
        level.getClass();
        tag.getClass();
        msg.getClass();
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.dispatchers.io(), null, new TarazedLogFileAppender$appendLog$1(level, msg, tag, thrown, this, null), 2, null);
        return launch$default;
    }

    public final void clearLogs() {
        this.logFile.delete();
    }

    public final void forEachLine(@NotNull Function1<? super String, Unit> action) {
        action.getClass();
        File file = this.logFile;
        Charset defaultCharset = Charset.defaultCharset();
        defaultCharset.getClass();
        FilesKt.forEachLine(file, defaultCharset, action);
    }

    public final void start() {
        startAppenderJob();
        Handler createHandler = createHandler();
        this.logHandler = createHandler;
        Logger logger = this.logger;
        if (createHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logHandler");
            createHandler = null;
        }
        logger.addHandler(createHandler);
    }

    public final void stop() {
        Logger logger = this.logger;
        Handler handler = this.logHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logHandler");
            handler = null;
        }
        logger.removeHandler(handler);
        Handler handler2 = this.logHandler;
        if (handler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logHandler");
            handler2 = null;
        }
        handler2.close();
        Job job = this.appenderJob;
        if (job == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appenderJob");
            job = null;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
