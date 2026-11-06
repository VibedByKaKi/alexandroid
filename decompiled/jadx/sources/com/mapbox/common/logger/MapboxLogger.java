package com.mapbox.common.logger;

import android.util.Log;
import androidx.annotation.Keep;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u000f\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u0017\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J:\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u001f\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010 \u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/mapbox/common/logger/MapboxLogger;", "Lcom/mapbox/base/common/logger/Logger;", "()V", "DEFAULT_TAG", "", "logLevel", "", "getLogLevel$annotations", "getLogLevel", "()I", "setLogLevel", "(I)V", "observer", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/mapbox/common/logger/LoggerObserver;", "d", "", "msg", "Lcom/mapbox/base/common/logger/model/Message;", "tr", "", "tag", "Lcom/mapbox/base/common/logger/model/Tag;", "e", "i", "log", "requiredLogLevel", "logBlock", "Lkotlin/Function0;", "removeObserver", "setObserver", "v", "w", "liblogger_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MapboxLogger implements Logger {

    @NotNull
    private static final String DEFAULT_TAG = "MapboxLogger";

    @NotNull
    public static final MapboxLogger INSTANCE = new MapboxLogger();
    private static volatile int logLevel = 2;

    @NotNull
    private static final AtomicReference<LoggerObserver> observer = new AtomicReference<>();

    private MapboxLogger() {
    }

    private final void log(int requiredLogLevel, String tag, String msg, Throwable tr, Function0<Unit> logBlock) {
        if (logLevel <= requiredLogLevel) {
            logBlock.invoke();
            LoggerObserver loggerObserver = observer.get();
            if (loggerObserver != null) {
                loggerObserver.log(requiredLogLevel, new LogEntry(tag, msg, tr));
            }
        }
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void d(@Nullable final Tag tag, @NotNull final Message msg, @Nullable final Throwable tr) {
        msg.getClass();
        log(3, tag != null ? tag.getTag() : null, msg.getMessage(), tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$d$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Tag tag2 = Tag.this;
                if (tag2 != null) {
                    tag2.getTag();
                }
                msg.getMessage();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void e(@Nullable final Tag tag, @NotNull final Message msg, @Nullable final Throwable tr) {
        msg.getClass();
        log(6, tag != null ? tag.getTag() : null, msg.getMessage(), tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$e$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                Tag tag2 = Tag.this;
                if (tag2 == null || (str = tag2.getTag()) == null) {
                    str = "MapboxLogger";
                }
                Log.e(str, msg.getMessage(), tr);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    public final int getLogLevel() {
        return logLevel;
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void i(@Nullable final Tag tag, @NotNull final Message msg, @Nullable final Throwable tr) {
        msg.getClass();
        log(4, tag != null ? tag.getTag() : null, msg.getMessage(), tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$i$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                Tag tag2 = Tag.this;
                if (tag2 == null || (str = tag2.getTag()) == null) {
                    str = "MapboxLogger";
                }
                Log.i(str, msg.getMessage(), tr);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    public final void removeObserver() {
        observer.set(null);
    }

    public final void setLogLevel(int i) {
        logLevel = i;
    }

    public final void setObserver(@NotNull LoggerObserver observer2) {
        observer2.getClass();
        observer.set(observer2);
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void v(@Nullable final Tag tag, @NotNull final Message msg, @Nullable final Throwable tr) {
        msg.getClass();
        log(2, tag != null ? tag.getTag() : null, msg.getMessage(), tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$v$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Tag tag2 = Tag.this;
                if (tag2 != null) {
                    tag2.getTag();
                }
                msg.getMessage();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void w(@Nullable final Tag tag, @NotNull final Message msg, @Nullable final Throwable tr) {
        msg.getClass();
        log(5, tag != null ? tag.getTag() : null, msg.getMessage(), tr, new Function0<Unit>() { // from class: com.mapbox.common.logger.MapboxLogger$w$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                Tag tag2 = Tag.this;
                if (tag2 == null || (str = tag2.getTag()) == null) {
                    str = "MapboxLogger";
                }
                Log.w(str, msg.getMessage(), tr);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public final void d(@NotNull Message msg, @NotNull Throwable tr) {
        msg.getClass();
        tr.getClass();
        d(null, msg, tr);
    }

    public final void e(@NotNull Message msg, @NotNull Throwable tr) {
        msg.getClass();
        tr.getClass();
        e(null, msg, tr);
    }

    public final void i(@NotNull Message msg, @NotNull Throwable tr) {
        msg.getClass();
        tr.getClass();
        i(null, msg, tr);
    }

    public final void v(@NotNull Message msg, @NotNull Throwable tr) {
        msg.getClass();
        tr.getClass();
        v(null, msg, tr);
    }

    public final void w(@NotNull Message msg, @NotNull Throwable tr) {
        msg.getClass();
        tr.getClass();
        w(null, msg, tr);
    }

    public final void d(@NotNull Tag tag, @NotNull Message msg) {
        tag.getClass();
        msg.getClass();
        d(tag, msg, null);
    }

    public final void e(@NotNull Tag tag, @NotNull Message msg) {
        tag.getClass();
        msg.getClass();
        e(tag, msg, null);
    }

    public final void i(@NotNull Tag tag, @NotNull Message msg) {
        tag.getClass();
        msg.getClass();
        i(tag, msg, null);
    }

    public final void v(@NotNull Tag tag, @NotNull Message msg) {
        tag.getClass();
        msg.getClass();
        v(tag, msg, null);
    }

    public final void w(@NotNull Tag tag, @NotNull Message msg) {
        tag.getClass();
        msg.getClass();
        w(tag, msg, null);
    }

    public final void d(@NotNull Message msg) {
        msg.getClass();
        d(null, msg, null);
    }

    public final void e(@NotNull Message msg) {
        msg.getClass();
        e(null, msg, null);
    }

    public final void i(@NotNull Message msg) {
        msg.getClass();
        i(null, msg, null);
    }

    public final void v(@NotNull Message msg) {
        msg.getClass();
        v(null, msg, null);
    }

    public final void w(@NotNull Message msg) {
        msg.getClass();
        w(null, msg, null);
    }
}
