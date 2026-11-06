package com.amazon.alexa.client.crashreporting.bugsnag;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.crashreporting.BreadcrumbType;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import com.bugsnag.android.Bugsnag;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0012¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J,\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/client/crashreporting/bugsnag/BugsnagCrashReporter;", "Lcom/amazon/alexa/client/crashreporting/CrashReporter;", "()V", "random", "Ljava/util/Random;", "(Ljava/util/Random;)V", "clearBreadcrumbs", "", "leaveBreadcrumb", "name", "", "breadcrumbType", "Lcom/amazon/alexa/client/crashreporting/BreadcrumbType;", "metadata", "", "notifyHandledException", "throwable", "", "probability", "", "putMetadata", "key", "value", "", "Companion", "AVSAndroidClient-crashreporting_bugsnagRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes17.dex */
public class BugsnagCrashReporter implements CrashReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAB_NAME = "Alexa";

    @NotNull
    private final Random random;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BreadcrumbType.values().length];
            try {
                iArr[BreadcrumbType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BreadcrumbType.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BreadcrumbType.MANUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BreadcrumbType.NAVIGATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BreadcrumbType.PROCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BreadcrumbType.REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BreadcrumbType.STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BreadcrumbType.USER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BugsnagCrashReporter(@NotNull Random random) {
        random.getClass();
        this.random = random;
    }

    @JvmStatic
    @NotNull
    public static final BugsnagCrashReporter create() {
        return INSTANCE.create();
    }

    @Override // com.amazon.alexa.client.crashreporting.CrashReporter
    public void leaveBreadcrumb(@NotNull String name, @NotNull BreadcrumbType breadcrumbType, @NotNull Map<String, String> metadata) {
        com.bugsnag.android.BreadcrumbType breadcrumbType2;
        name.getClass();
        breadcrumbType.getClass();
        metadata.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[breadcrumbType.ordinal()]) {
            case 1:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.ERROR;
                break;
            case 2:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.LOG;
                break;
            case 3:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.MANUAL;
                break;
            case 4:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.NAVIGATION;
                break;
            case 5:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.PROCESS;
                break;
            case 6:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.REQUEST;
                break;
            case 7:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.STATE;
                break;
            case 8:
                breadcrumbType2 = com.bugsnag.android.BreadcrumbType.USER;
                break;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
        }
        Bugsnag.leaveBreadcrumb(name, metadata, breadcrumbType2);
    }

    @Override // com.amazon.alexa.client.crashreporting.CrashReporter
    public void notifyHandledException(@NotNull Throwable throwable, double probability) {
        throwable.getClass();
        if (this.random.nextDouble() <= probability) {
            notifyHandledException(throwable);
        }
    }

    @Override // com.amazon.alexa.client.crashreporting.CrashReporter
    public void putMetadata(@NotNull String key, @Nullable Object value) {
        key.getClass();
        Bugsnag.addMetadata("Alexa", key, value);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/client/crashreporting/bugsnag/BugsnagCrashReporter$Companion;", "", "()V", "TAB_NAME", "", "create", "Lcom/amazon/alexa/client/crashreporting/bugsnag/BugsnagCrashReporter;", "AVSAndroidClient-crashreporting_bugsnagRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BugsnagCrashReporter create() {
            return new BugsnagCrashReporter((DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BugsnagCrashReporter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BugsnagCrashReporter() {
        this(new Random());
    }

    @Override // com.amazon.alexa.client.crashreporting.CrashReporter
    public void clearBreadcrumbs() {
    }

    @Override // com.amazon.alexa.client.crashreporting.CrashReporter
    public void notifyHandledException(@NotNull Throwable throwable) {
        throwable.getClass();
        Bugsnag.notify(throwable);
    }

    @Override // com.amazon.alexa.client.crashreporting.CrashReporter
    public void leaveBreadcrumb(@NotNull String name) {
        name.getClass();
        Bugsnag.leaveBreadcrumb(name);
    }
}
