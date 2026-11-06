package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u0003567B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u00020\u001f8G¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010 R\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0013\u0010#\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\fR\u0013\u0010'\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0019R\u0011\u0010/\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0014R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Landroidx/work/Configuration;", "", "builder", "Landroidx/work/Configuration$Builder;", "(Landroidx/work/Configuration$Builder;)V", "clock", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "contentUriTriggerWorkersLimit", "", "getContentUriTriggerWorkersLimit", "()I", "defaultProcessName", "", "getDefaultProcessName", "()Ljava/lang/String;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "isUsingDefaultTaskExecutor", "", "()Z", "maxJobSchedulerId", "getMaxJobSchedulerId", "maxSchedulerLimit", "getMaxSchedulerLimit", "minJobSchedulerId", "getMinJobSchedulerId", "minimumLoggingLevel", "getMinimumLoggingLevel", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler", "()Landroidx/work/RunnableScheduler;", "schedulingExceptionHandler", "getSchedulingExceptionHandler", "taskExecutor", "getTaskExecutor", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "Builder", "Companion", "Provider", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;

    @NotNull
    private final Clock clock;
    private final int contentUriTriggerWorkersLimit;

    @Nullable
    private final String defaultProcessName;

    @NotNull
    private final Executor executor;

    @Nullable
    private final Consumer<Throwable> initializationExceptionHandler;

    @NotNull
    private final InputMergerFactory inputMergerFactory;
    private final boolean isUsingDefaultTaskExecutor;
    private final int maxJobSchedulerId;
    private final int maxSchedulerLimit;
    private final int minJobSchedulerId;
    private final int minimumLoggingLevel;

    @NotNull
    private final RunnableScheduler runnableScheduler;

    @Nullable
    private final Consumer<Throwable> schedulingExceptionHandler;

    @NotNull
    private final Executor taskExecutor;

    @NotNull
    private final WorkerFactory workerFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Provider {
        @NotNull
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(@NotNull Builder builder) {
        builder.getClass();
        Executor executor = builder.getExecutor();
        this.executor = executor == null ? ConfigurationKt.createDefaultExecutor(false) : executor;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? ConfigurationKt.createDefaultExecutor(true) : taskExecutor;
        Clock clock = builder.getClock();
        this.clock = clock == null ? new SystemClock() : clock;
        WorkerFactory workerFactory = builder.getWorkerFactory();
        if (workerFactory == null) {
            workerFactory = WorkerFactory.getDefaultWorkerFactory();
            workerFactory.getClass();
        }
        this.workerFactory = workerFactory;
        InputMergerFactory inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory;
        RunnableScheduler runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new DefaultRunnableScheduler() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.getInitializationExceptionHandler$work_runtime_release();
        this.schedulingExceptionHandler = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
    }

    @NotNull
    public final Clock getClock() {
        return this.clock;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    @Nullable
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.initializationExceptionHandler;
    }

    @NotNull
    public final InputMergerFactory getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    @IntRange(from = 20, to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    @NotNull
    public final RunnableScheduler getRunnableScheduler() {
        return this.runnableScheduler;
    }

    @Nullable
    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.schedulingExceptionHandler;
    }

    @NotNull
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    @NotNull
    public final WorkerFactory getWorkerFactory() {
        return this.workerFactory;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: isUsingDefaultTaskExecutor, reason: from getter */
    public final boolean getIsUsingDefaultTaskExecutor() {
        return this.isUsingDefaultTaskExecutor;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010I\u001a\u00020\u0004J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0013J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010O\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0016\u0010R\u001a\u00020\u00002\u0006\u00104\u001a\u00020\r2\u0006\u0010.\u001a\u00020\rJ\u000e\u0010S\u001a\u00020\u00002\u0006\u00101\u001a\u00020\rJ\u000e\u0010T\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\rJ\u000e\u0010U\u001a\u00020\u00002\u0006\u00107\u001a\u000208J\u0014\u0010V\u001a\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u000e\u0010W\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0019J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010C\u001a\u00020DR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u001a\u0010.\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R\u001a\u00101\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R\u001a\u00104\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R\u001c\u00107\u001a\u0004\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\u001c\u0010@\u001a\u0004\u0018\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001dR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006Y"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "()V", "configuration", "Landroidx/work/Configuration;", "(Landroidx/work/Configuration;)V", "clock", "Landroidx/work/Clock;", "getClock$work_runtime_release", "()Landroidx/work/Clock;", "setClock$work_runtime_release", "(Landroidx/work/Clock;)V", "contentUriTriggerWorkersLimit", "", "getContentUriTriggerWorkersLimit$work_runtime_release", "()I", "setContentUriTriggerWorkersLimit$work_runtime_release", "(I)V", "defaultProcessName", "", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "initializationExceptionHandler", "Landroidx/core/util/Consumer;", "", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "inputMergerFactory", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "loggingLevel", "getLoggingLevel$work_runtime_release", "setLoggingLevel$work_runtime_release", "maxJobSchedulerId", "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", "maxSchedulerLimit", "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", "minJobSchedulerId", "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", "runnableScheduler", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler$work_runtime_release", "()Landroidx/work/RunnableScheduler;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/RunnableScheduler;)V", "schedulingExceptionHandler", "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "taskExecutor", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "workerFactory", "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setClock", "setContentUriTriggerWorkersLimit", "setDefaultProcessName", "processName", "setExecutor", "setInitializationExceptionHandler", "exceptionHandler", "setInputMergerFactory", "setJobSchedulerJobIdRange", "setMaxSchedulerLimit", "setMinimumLoggingLevel", "setRunnableScheduler", "setSchedulingExceptionHandler", "setTaskExecutor", "setWorkerFactory", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private Clock clock;
        private int contentUriTriggerWorkersLimit;

        @Nullable
        private String defaultProcessName;

        @Nullable
        private Executor executor;

        @Nullable
        private Consumer<Throwable> initializationExceptionHandler;

        @Nullable
        private InputMergerFactory inputMergerFactory;
        private int loggingLevel;
        private int maxJobSchedulerId;
        private int maxSchedulerLimit;
        private int minJobSchedulerId;

        @Nullable
        private RunnableScheduler runnableScheduler;

        @Nullable
        private Consumer<Throwable> schedulingExceptionHandler;

        @Nullable
        private Executor taskExecutor;

        @Nullable
        private WorkerFactory workerFactory;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NotNull Configuration configuration) {
            configuration.getClass();
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = ConfigurationKt.getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT();
            this.executor = configuration.getExecutor();
            this.workerFactory = configuration.getWorkerFactory();
            this.inputMergerFactory = configuration.getInputMergerFactory();
            this.taskExecutor = configuration.getTaskExecutor();
            this.clock = configuration.getClock();
            this.loggingLevel = configuration.getMinimumLoggingLevel();
            this.minJobSchedulerId = configuration.getMinJobSchedulerId();
            this.maxJobSchedulerId = configuration.getMaxJobSchedulerId();
            this.maxSchedulerLimit = configuration.getMaxSchedulerLimit();
            this.runnableScheduler = configuration.getRunnableScheduler();
            this.initializationExceptionHandler = configuration.getInitializationExceptionHandler();
            this.schedulingExceptionHandler = configuration.getSchedulingExceptionHandler();
            this.defaultProcessName = configuration.getDefaultProcessName();
        }

        @NotNull
        public final Configuration build() {
            return new Configuration(this);
        }

        @Nullable
        /* renamed from: getClock$work_runtime_release, reason: from getter */
        public final Clock getClock() {
            return this.clock;
        }

        /* renamed from: getContentUriTriggerWorkersLimit$work_runtime_release, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        @Nullable
        /* renamed from: getDefaultProcessName$work_runtime_release, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        @Nullable
        /* renamed from: getExecutor$work_runtime_release, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @Nullable
        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.initializationExceptionHandler;
        }

        @Nullable
        /* renamed from: getInputMergerFactory$work_runtime_release, reason: from getter */
        public final InputMergerFactory getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* renamed from: getLoggingLevel$work_runtime_release, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* renamed from: getMaxJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* renamed from: getMaxSchedulerLimit$work_runtime_release, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* renamed from: getMinJobSchedulerId$work_runtime_release, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        @Nullable
        /* renamed from: getRunnableScheduler$work_runtime_release, reason: from getter */
        public final RunnableScheduler getRunnableScheduler() {
            return this.runnableScheduler;
        }

        @Nullable
        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.schedulingExceptionHandler;
        }

        @Nullable
        /* renamed from: getTaskExecutor$work_runtime_release, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        @Nullable
        /* renamed from: getWorkerFactory$work_runtime_release, reason: from getter */
        public final WorkerFactory getWorkerFactory() {
            return this.workerFactory;
        }

        @NotNull
        public final Builder setClock(@NotNull Clock clock) {
            clock.getClass();
            this.clock = clock;
            return this;
        }

        public final void setClock$work_runtime_release(@Nullable Clock clock) {
            this.clock = clock;
        }

        @NotNull
        public final Builder setContentUriTriggerWorkersLimit(int contentUriTriggerWorkersLimit) {
            this.contentUriTriggerWorkersLimit = Math.max(contentUriTriggerWorkersLimit, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i) {
            this.contentUriTriggerWorkersLimit = i;
        }

        @NotNull
        public final Builder setDefaultProcessName(@NotNull String processName) {
            processName.getClass();
            this.defaultProcessName = processName;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(@Nullable String str) {
            this.defaultProcessName = str;
        }

        @NotNull
        public final Builder setExecutor(@NotNull Executor executor) {
            executor.getClass();
            this.executor = executor;
            return this;
        }

        public final void setExecutor$work_runtime_release(@Nullable Executor executor) {
            this.executor = executor;
        }

        @NotNull
        public final Builder setInitializationExceptionHandler(@NotNull Consumer<Throwable> exceptionHandler) {
            exceptionHandler.getClass();
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(@Nullable Consumer<Throwable> consumer) {
            this.initializationExceptionHandler = consumer;
        }

        @NotNull
        public final Builder setInputMergerFactory(@NotNull InputMergerFactory inputMergerFactory) {
            inputMergerFactory.getClass();
            this.inputMergerFactory = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(@Nullable InputMergerFactory inputMergerFactory) {
            this.inputMergerFactory = inputMergerFactory;
        }

        @NotNull
        public final Builder setJobSchedulerJobIdRange(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                Single$$ExternalSyntheticBUOutline0.m$3("WorkManager needs a range of at least 1000 job ids.");
                return null;
            }
            this.minJobSchedulerId = minJobSchedulerId;
            this.maxJobSchedulerId = maxJobSchedulerId;
            return this;
        }

        public final void setLoggingLevel$work_runtime_release(int i) {
            this.loggingLevel = i;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i) {
            this.maxJobSchedulerId = i;
        }

        @NotNull
        public final Builder setMaxSchedulerLimit(int maxSchedulerLimit) {
            if (maxSchedulerLimit >= 20) {
                this.maxSchedulerLimit = Math.min(maxSchedulerLimit, 50);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            return null;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i) {
            this.maxSchedulerLimit = i;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i) {
            this.minJobSchedulerId = i;
        }

        @NotNull
        public final Builder setMinimumLoggingLevel(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        @NotNull
        public final Builder setRunnableScheduler(@NotNull RunnableScheduler runnableScheduler) {
            runnableScheduler.getClass();
            this.runnableScheduler = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(@Nullable RunnableScheduler runnableScheduler) {
            this.runnableScheduler = runnableScheduler;
        }

        @NotNull
        public final Builder setSchedulingExceptionHandler(@NotNull Consumer<Throwable> schedulingExceptionHandler) {
            schedulingExceptionHandler.getClass();
            this.schedulingExceptionHandler = schedulingExceptionHandler;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(@Nullable Consumer<Throwable> consumer) {
            this.schedulingExceptionHandler = consumer;
        }

        @NotNull
        public final Builder setTaskExecutor(@NotNull Executor taskExecutor) {
            taskExecutor.getClass();
            this.taskExecutor = taskExecutor;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(@Nullable Executor executor) {
            this.taskExecutor = executor;
        }

        @NotNull
        public final Builder setWorkerFactory(@NotNull WorkerFactory workerFactory) {
            workerFactory.getClass();
            this.workerFactory = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(@Nullable WorkerFactory workerFactory) {
            this.workerFactory = workerFactory;
        }

        public Builder() {
            this.loggingLevel = 4;
            this.maxJobSchedulerId = Integer.MAX_VALUE;
            this.maxSchedulerLimit = 20;
            this.contentUriTriggerWorkersLimit = ConfigurationKt.getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT();
        }
    }
}
