package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bugsnag.android.JsonStream;
import java.io.IOException;
import java.lang.Thread;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Thread implements JsonStream.Streamable {
    private final ThreadInternal impl;
    private final Logger logger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.bugsnag.android.Thread$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$lang$Thread$State;

        static {
            int[] iArr = new int[Thread.State.values().length];
            $SwitchMap$java$lang$Thread$State = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");

        private final String descriptor;

        State(String str) {
            this.descriptor = str;
        }

        @NonNull
        public static State byDescriptor(@Nullable String str) {
            if (str == null) {
                return UNKNOWN;
            }
            for (State state : values()) {
                if (state.getDescriptor().equals(str)) {
                    return state;
                }
            }
            return UNKNOWN;
        }

        @NonNull
        public static State forThread(@NonNull java.lang.Thread thread) {
            return getState(thread.getState());
        }

        @NonNull
        private static State getState(Thread.State state) {
            switch (AnonymousClass1.$SwitchMap$java$lang$Thread$State[state.ordinal()]) {
                case 1:
                    return NEW;
                case 2:
                    return BLOCKED;
                case 3:
                    return RUNNABLE;
                case 4:
                    return TERMINATED;
                case 5:
                    return TIMED_WAITING;
                case 6:
                    return WAITING;
                default:
                    return UNKNOWN;
            }
        }

        @NonNull
        public String getDescriptor() {
            return this.descriptor;
        }
    }

    public Thread(long j, @NonNull String str, @NonNull ThreadType threadType, boolean z, @NonNull State state, @NonNull Stacktrace stacktrace, @NonNull Logger logger) {
        this.impl = new ThreadInternal(j, str, threadType, z, state.getDescriptor(), stacktrace);
        this.logger = logger;
    }

    private void logNull(String str) {
        this.logger.e("Invalid null value supplied to thread." + str + ", ignoring");
    }

    public boolean getErrorReportingThread() {
        return this.impl.getIsErrorReportingThread();
    }

    public long getId() {
        return this.impl.getId();
    }

    @NonNull
    public String getName() {
        return this.impl.getName();
    }

    @NonNull
    public List<Stackframe> getStacktrace() {
        return this.impl.getStacktrace();
    }

    @NonNull
    public State getState() {
        return State.byDescriptor(this.impl.getState());
    }

    @NonNull
    public ThreadType getType() {
        return this.impl.getType();
    }

    public void setId(long j) {
        this.impl.setId(j);
    }

    public void setName(@NonNull String str) {
        if (str != null) {
            this.impl.setName(str);
        } else {
            logNull("name");
        }
    }

    public void setStacktrace(@NonNull List<Stackframe> list) {
        if (CollectionUtils.containsNullElements(list)) {
            logNull("stacktrace");
        } else {
            this.impl.setStacktrace(list);
        }
    }

    public void setState(@NonNull State state) {
        if (state != null) {
            this.impl.setState(state.getDescriptor());
        } else {
            logNull("state");
        }
    }

    public void setType(@NonNull ThreadType threadType) {
        if (threadType != null) {
            this.impl.setType(threadType);
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NonNull JsonStream jsonStream) throws IOException {
        this.impl.toStream(jsonStream);
    }

    public Thread(@NonNull ThreadInternal threadInternal, @NonNull Logger logger) {
        this.impl = threadInternal;
        this.logger = logger;
    }
}
