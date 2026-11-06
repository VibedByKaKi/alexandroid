package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.accessorykit.ModelTransformer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0086\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"DEBUG", "", "LOGGER", "Landroidx/paging/Logger;", "getLOGGER", "()Landroidx/paging/Logger;", "setLOGGER", "(Landroidx/paging/Logger;)V", "LOG_TAG", "", "VERBOSE", "log", "", ModelTransformer.KEY_BATTERY_LEVEL, "tr", "", "block", "Lkotlin/Function0;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public final class LoggerKt {
    public static final int DEBUG = 3;

    @Nullable
    private static Logger LOGGER = null;

    @NotNull
    public static final String LOG_TAG = "Paging";
    public static final int VERBOSE = 2;

    @Nullable
    public static final Logger getLOGGER() {
        return LOGGER;
    }

    public static final void log(@IntRange(from = 2, to = 3) int i, @Nullable Throwable th, @NotNull Function0<String> function0) {
        function0.getClass();
        Logger logger = getLOGGER();
        if (logger == null || !logger.isLoggable(i)) {
            return;
        }
        logger.log(i, function0.invoke(), th);
    }

    public static /* synthetic */ void log$default(int i, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        function0.getClass();
        Logger logger = getLOGGER();
        if (logger == null || !logger.isLoggable(i)) {
            return;
        }
        logger.log(i, (String) function0.invoke(), th);
    }

    public static final void setLOGGER(@Nullable Logger logger) {
        LOGGER = logger;
    }
}
