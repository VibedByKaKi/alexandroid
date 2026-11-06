package com.amazon.alexa.client.alexaservice.base.metrics;

import android.app.ActivityManager;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.device.PersistentStorage;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ConversationLoadSourceStore {

    @VisibleForTesting
    static final String KEY_BOOT_COUNT = "bootCount";

    @VisibleForTesting
    static final String KEY_ELAPSED_REALTIME_MS = "elapsedRealtimeMs";

    @VisibleForTesting
    static final String KEY_REVISION = "revision";

    @VisibleForTesting
    static final String KEY_SENDER_PID = "senderPid";

    @VisibleForTesting
    static final String KEY_SENDER_PROCESS_NAME = "senderProcessName";

    @VisibleForTesting
    static final String KEY_SENDER_START_ELAPSED_REALTIME_MS = "senderStartElapsedRealtimeMs";

    @VisibleForTesting
    static final String KEY_SIGN_OUTS_ELAPSED_REALTIME_MS = "signOutsElapsedRealtimeMs";

    @VisibleForTesting
    static final String KEY_SOURCES = "sources";
    private static final int MAX_SIGN_OUTS = 16;
    private static final int MAX_TRANSITIONS = 16;
    private static final long NO_SIGN_OUT = Long.MIN_VALUE;
    private static final String SEPARATOR = ",";
    private static final Pattern SOURCE_PATTERN = Pattern.compile("[A-Za-z.]{0,64}");
    private static final String TAG = "ConversationLoadSourceStore";
    private static final long UNAVAILABLE_BOOT_COUNT = -1;

    @Nullable
    private static ConversationLoadSourceStore instance;
    private final long bootCount;
    private final Context context;
    private volatile State state = load();
    private final PersistentStorage storage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class History {
        private final long[] elapsedRealtimeMs;
        private final long revision;
        private final int senderPid;
        private final String senderProcessName;
        private final long senderStartElapsedRealtimeMs;
        private final String[] sources;

        public History(String[] strArr, long[] jArr, long j, int i, String str, long j2) {
            this.sources = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.elapsedRealtimeMs = Arrays.copyOf(jArr, jArr.length);
            this.revision = j;
            this.senderPid = i;
            this.senderProcessName = str;
            this.senderStartElapsedRealtimeMs = j2;
        }

        private boolean hasValidTransitions() {
            String[] strArr = this.sources;
            if (strArr.length != this.elapsedRealtimeMs.length || strArr.length < 1 || strArr.length > 16) {
                return false;
            }
            long j = 0;
            int i = 0;
            while (true) {
                String[] strArr2 = this.sources;
                if (i >= strArr2.length) {
                    return true;
                }
                if (!isValidTransition(strArr2[i], this.elapsedRealtimeMs[i], j)) {
                    return false;
                }
                j = this.elapsedRealtimeMs[i];
                i++;
            }
        }

        private boolean isSameSender(History history) {
            return this.senderPid == history.senderPid && this.senderProcessName.equals(history.senderProcessName) && this.senderStartElapsedRealtimeMs == history.senderStartElapsedRealtimeMs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isSentBy(int i, @Nullable String str) {
            return this.senderPid == i && this.senderProcessName.equals(str);
        }

        private static boolean isValidTransition(@Nullable String str, long j, long j2) {
            return str != null && ConversationLoadSourceStore.SOURCE_PATTERN.matcher(str).matches() && j >= j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isWellFormed(String str) {
            return hasValidTransitions() && this.revision >= 0 && this.senderPid > 0 && this.senderStartElapsedRealtimeMs >= 0 && str.equals(this.senderProcessName);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int lastTransitionAtOrBefore(long j) {
            for (int length = this.sources.length - 1; length >= 0; length--) {
                if (this.elapsedRealtimeMs[length] <= j) {
                    return length;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static History readFrom(PersistentStorage persistentStorage) {
            return new History(persistentStorage.getString("sources", "").split(",", -1), ConversationLoadSourceStore.parseTimes(persistentStorage.getString(ConversationLoadSourceStore.KEY_ELAPSED_REALTIME_MS, "")), persistentStorage.getLong("revision", -1L), (int) persistentStorage.getLong(ConversationLoadSourceStore.KEY_SENDER_PID, 0L), persistentStorage.getString(ConversationLoadSourceStore.KEY_SENDER_PROCESS_NAME, ""), persistentStorage.getLong(ConversationLoadSourceStore.KEY_SENDER_START_ELAPSED_REALTIME_MS, -1L));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String sourceAt(int i) {
            return this.sources[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean supersedes(@Nullable History history) {
            if (history == null) {
                return true;
            }
            if (this.senderStartElapsedRealtimeMs < history.senderStartElapsedRealtimeMs) {
                return false;
            }
            return !isSameSender(history) || this.revision > history.revision;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long timeAt(int i) {
            return this.elapsedRealtimeMs[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PersistentStorage.Transaction writeTo(PersistentStorage.Transaction transaction) {
            return transaction.set("sources", TextUtils.join(",", this.sources)).set(ConversationLoadSourceStore.KEY_ELAPSED_REALTIME_MS, ConversationLoadSourceStore.joinTimes(this.elapsedRealtimeMs)).set("revision", this.revision).set(ConversationLoadSourceStore.KEY_SENDER_PID, this.senderPid).set(ConversationLoadSourceStore.KEY_SENDER_PROCESS_NAME, this.senderProcessName).set(ConversationLoadSourceStore.KEY_SENDER_START_ELAPSED_REALTIME_MS, this.senderStartElapsedRealtimeMs);
        }

        public long getRevision() {
            return this.revision;
        }

        public int size() {
            return this.sources.length;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class State {
        static final State EMPTY = new State(null, new long[0]);

        @Nullable
        private final History history;
        private final long[] signOutsElapsedRealtimeMs;

        public State(@Nullable History history, long[] jArr) {
            this.history = history;
            this.signOutsElapsedRealtimeMs = jArr;
        }

        private boolean isMaskedBySignOut(long j, long j2) {
            return latestSignOutAtOrBefore(j2) >= j;
        }

        private long latestSignOutAtOrBefore(long j) {
            for (int length = this.signOutsElapsedRealtimeMs.length - 1; length >= 0; length--) {
                long j2 = this.signOutsElapsedRealtimeMs[length];
                if (j2 <= j) {
                    return j2;
                }
            }
            return Long.MIN_VALUE;
        }

        @Nullable
        public String sourceAt(long j) {
            int lastTransitionAtOrBefore;
            History history = this.history;
            if (history == null || (lastTransitionAtOrBefore = history.lastTransitionAtOrBefore(j)) < 0 || isMaskedBySignOut(this.history.timeAt(lastTransitionAtOrBefore), j)) {
                return null;
            }
            return this.history.sourceAt(lastTransitionAtOrBefore);
        }

        public State withHistory(History history) {
            return new State(history, this.signOutsElapsedRealtimeMs);
        }

        public State withSignOutAt(long j) {
            long[] jArr = this.signOutsElapsedRealtimeMs;
            long[] copyOf = Arrays.copyOf(jArr, jArr.length + 1);
            copyOf[this.signOutsElapsedRealtimeMs.length] = j;
            return new State(this.history, ConversationLoadSourceStore.latestDistinct(copyOf));
        }
    }

    @VisibleForTesting
    public ConversationLoadSourceStore(Context context, PersistentStorage persistentStorage) {
        this.context = context;
        this.storage = persistentStorage;
        this.bootCount = readBootCount(context);
    }

    @VisibleForTesting
    public static synchronized void clearInstance() {
        synchronized (ConversationLoadSourceStore.class) {
            instance = null;
        }
    }

    public static synchronized ConversationLoadSourceStore getInstance(Context context, PersistentStorage persistentStorage) {
        synchronized (ConversationLoadSourceStore.class) {
            ConversationLoadSourceStore conversationLoadSourceStore = instance;
            if (conversationLoadSourceStore != null) {
                return conversationLoadSourceStore;
            }
            ConversationLoadSourceStore conversationLoadSourceStore2 = new ConversationLoadSourceStore(context.getApplicationContext(), persistentStorage);
            instance = conversationLoadSourceStore2;
            return conversationLoadSourceStore2;
        }
    }

    private boolean isSenderAlive(History history) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (history.isSentBy(runningAppProcessInfo.pid, runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWrittenInThisBoot() {
        return this.bootCount != -1 && this.storage.getLong(KEY_BOOT_COUNT, -1L) == this.bootCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String joinTimes(long[] jArr) {
        String[] strArr = new String[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            strArr[i] = Long.toString(jArr[i]);
        }
        return TextUtils.join(",", strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long[] latestDistinct(long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(copyOf);
        long[] jArr2 = new long[copyOf.length];
        int i = 0;
        for (long j : copyOf) {
            if (i <= 0 || jArr2[i - 1] != j) {
                jArr2[i] = j;
                i++;
            }
        }
        return Arrays.copyOfRange(jArr2, Math.max(0, i - 16), i);
    }

    private State load() {
        try {
            return readState();
        } catch (RuntimeException e) {
            Log.w(TAG, "Discarded an unreadable conversation load source file: ".concat(e.getClass().getSimpleName()));
            return State.EMPTY;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long[] parseTimes(String str) {
        String[] split = str.split(",", -1);
        long[] jArr = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            jArr[i] = Long.parseLong(split[i]);
        }
        return jArr;
    }

    private static long readBootCount(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "boot_count", -1);
    }

    private long[] readSignOuts() {
        return !this.storage.contains(KEY_SIGN_OUTS_ELAPSED_REALTIME_MS) ? new long[0] : latestDistinct(parseTimes(this.storage.getString(KEY_SIGN_OUTS_ELAPSED_REALTIME_MS, "")));
    }

    private State readState() {
        if (!isWrittenInThisBoot()) {
            return State.EMPTY;
        }
        return new State(readWellFormedHistory(), readSignOuts());
    }

    @Nullable
    private History readWellFormedHistory() {
        if (!this.storage.contains("sources")) {
            return null;
        }
        History readFrom = History.readFrom(this.storage);
        if (readFrom.isWellFormed(this.context.getPackageName())) {
            return readFrom;
        }
        Log.w(TAG, "Discarded a stored conversation load source history");
        return null;
    }

    private PersistentStorage.Transaction write(State state) {
        PersistentStorage.Transaction writeSignOuts = writeSignOuts(this.storage.edit().clear().set(KEY_BOOT_COUNT, this.bootCount), state.signOutsElapsedRealtimeMs);
        return state.history == null ? writeSignOuts : state.history.writeTo(writeSignOuts);
    }

    private static PersistentStorage.Transaction writeSignOuts(PersistentStorage.Transaction transaction, long[] jArr) {
        return jArr.length == 0 ? transaction : transaction.set(KEY_SIGN_OUTS_ELAPSED_REALTIME_MS, joinTimes(jArr));
    }

    public synchronized void accept(History history) {
        if (!history.isWellFormed(this.context.getPackageName())) {
            Log.w(TAG, "Rejected a conversation load source history");
        } else if (!history.supersedes(this.state.history)) {
            history.getRevision();
        } else {
            this.state = this.state.withHistory(history);
            write(this.state).commitAsynchronously();
        }
    }

    public synchronized void clear(long j) {
        this.state = this.state.withSignOutAt(j);
        write(this.state).commitSynchronously();
    }

    @Nullable
    public String sourceAt(long j) {
        State state = this.state;
        String sourceAt = state.sourceAt(j);
        if (!TextUtils.isEmpty(sourceAt) && isSenderAlive(state.history)) {
            return sourceAt;
        }
        return null;
    }
}
