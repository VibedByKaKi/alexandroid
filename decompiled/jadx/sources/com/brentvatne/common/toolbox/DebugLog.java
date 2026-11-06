package com.brentvatne.common.toolbox;

import android.util.Log;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0003J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0003J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\u000bH\u0007J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/brentvatne/common/toolbox/DebugLog;", "", "<init>", "()V", ModelTransformer.KEY_BATTERY_LEVEL, "", "displayThread", "", "TAG_PREFIX", "", "setConfig", "", "_level", "_displayThread", "getTag", "tag", "getMsg", "msg", "v", "d", "i", "w", "e", "wtf", "printCallStack", "checkUIThread", "checkNotUIThread", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugLog {

    @NotNull
    private static final String TAG_PREFIX = "RNV";

    @NotNull
    public static final DebugLog INSTANCE = new DebugLog();
    private static int level = 5;
    private static boolean displayThread = true;

    private DebugLog() {
    }

    @JvmStatic
    public static final void checkNotUIThread(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (Intrinsics.areEqual(Thread.currentThread().getName(), "main")) {
            wtf(tag, "------------------------>" + getMsg(msg));
        }
    }

    @JvmStatic
    public static final void checkUIThread(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (Intrinsics.areEqual(Thread.currentThread().getName(), "main")) {
            return;
        }
        wtf(tag, "------------------------>" + getMsg(msg));
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (level <= 3) {
            getTag(tag);
            getMsg(msg);
        }
    }

    @JvmStatic
    public static final void e(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (level <= 6) {
            Log.e(getTag(tag), getMsg(msg));
        }
    }

    @JvmStatic
    private static final String getMsg(String msg) {
        return displayThread ? a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, Thread.currentThread().getName(), "] ", msg) : msg;
    }

    @JvmStatic
    private static final String getTag(String tag) {
        return a$$ExternalSyntheticOutline0.m(TAG_PREFIX, tag);
    }

    @JvmStatic
    public static final void i(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (level <= 4) {
            Log.i(getTag(tag), getMsg(msg));
        }
    }

    @JvmStatic
    public static final void printCallStack() {
        if (level <= 2) {
            new Exception().printStackTrace();
        }
    }

    @JvmStatic
    public static final void setConfig(int _level, boolean _displayThread) {
        level = _level;
        displayThread = _displayThread;
    }

    @JvmStatic
    public static final void v(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (level <= 2) {
            getTag(tag);
            getMsg(msg);
        }
    }

    @JvmStatic
    public static final void w(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        if (level <= 5) {
            Log.w(getTag(tag), getMsg(msg));
        }
    }

    @JvmStatic
    public static final void wtf(@NotNull String tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        Log.wtf(getTag(tag), "--------------->" + getMsg(msg));
        printCallStack();
    }
}
