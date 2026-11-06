package com.amazon.alexa.api.compat.model.conversation;

import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.deecomms.common.network.AppUrl;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0014\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker;", "", "elapsedRealtimeClock", "Lkotlin/Function0;", "", "wallClock", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", JoinPoint.SYNCHRONIZATION_LOCK, "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceListener;", AppUrl.LATEST, "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceSnapshot;", "record", "", "source", "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSource;", "snapshot", "sourceAt", "elapsedRealtimeMs", "sourceAtEpoch", "epochMs", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "appendLocked", "deliver", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationLoadSourceTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationLoadSourceTracker.kt\ncom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1#2:125\n1863#3,2:126\n*S KotlinDebug\n*F\n+ 1 ConversationLoadSourceTracker.kt\ncom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker\n*L\n42#1:126,2\n*E\n"})
/* loaded from: classes16.dex */
public final class ConversationLoadSourceTracker {

    @NotNull
    private static final String TAG = "ConversationLoadSourceTracker";

    @NotNull
    private final Function0<Long> elapsedRealtimeClock;

    @NotNull
    private volatile ConversationLoadSourceSnapshot latest;

    @NotNull
    private final CopyOnWriteArrayList<ConversationLoadSourceListener> listeners;

    @NotNull
    private final Object lock;

    @NotNull
    private final Function0<Long> wallClock;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ConversationLoadSourceTracker instance = new ConversationLoadSourceTracker(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.api.compat.model.conversation.ConversationLoadSourceTracker$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.api.compat.model.conversation.ConversationLoadSourceTracker$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Long> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public ConversationLoadSourceTracker(@NotNull Function0<Long> function0, @NotNull Function0<Long> function02) {
        function0.getClass();
        function02.getClass();
        this.elapsedRealtimeClock = function0;
        this.wallClock = function02;
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList<>();
        this.latest = ConversationLoadSourceSnapshot.INSTANCE.getEMPTY();
    }

    private final ConversationLoadSourceSnapshot appendLocked(ConversationLoadSource source) {
        ConversationLoadSourceSnapshot conversationLoadSourceSnapshot = this.latest;
        if (conversationLoadSourceSnapshot.getLatestSource$AlexaMobileAndroidVoiceSDKApiCompatModel_release() == source) {
            return null;
        }
        ConversationLoadSourceSnapshot appended$AlexaMobileAndroidVoiceSDKApiCompatModel_release = conversationLoadSourceSnapshot.appended$AlexaMobileAndroidVoiceSDKApiCompatModel_release(new ConversationLoadTransition(source, this.elapsedRealtimeClock.invoke().longValue()));
        this.latest = appended$AlexaMobileAndroidVoiceSDKApiCompatModel_release;
        return appended$AlexaMobileAndroidVoiceSDKApiCompatModel_release;
    }

    private final void deliver(ConversationLoadSourceListener listener, ConversationLoadSourceSnapshot snapshot) {
        try {
            listener.onConversationLoadSourceChanged(snapshot);
        } catch (Exception e) {
            Log.w(TAG, "Conversation load source listener failed: ".concat(e.getClass().getName()));
        }
    }

    @NotNull
    public static final ConversationLoadSourceTracker getInstance() {
        return INSTANCE.getInstance();
    }

    public final void addListener(@NotNull ConversationLoadSourceListener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    public final void record(@Nullable ConversationLoadSource source) {
        ConversationLoadSourceSnapshot appendLocked;
        synchronized (this.lock) {
            appendLocked = appendLocked(source);
        }
        if (appendLocked == null) {
            return;
        }
        for (ConversationLoadSourceListener conversationLoadSourceListener : this.listeners) {
            conversationLoadSourceListener.getClass();
            deliver(conversationLoadSourceListener, appendLocked);
        }
    }

    public final void removeListener(@NotNull ConversationLoadSourceListener listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }

    @NotNull
    /* renamed from: snapshot, reason: from getter */
    public final ConversationLoadSourceSnapshot getLatest() {
        return this.latest;
    }

    @Nullable
    public final ConversationLoadSource sourceAt(long elapsedRealtimeMs) {
        return this.latest.sourceAt$AlexaMobileAndroidVoiceSDKApiCompatModel_release(elapsedRealtimeMs);
    }

    @Nullable
    public final ConversationLoadSource sourceAtEpoch(long epochMs) {
        return sourceAt(this.elapsedRealtimeClock.invoke().longValue() - (this.wallClock.invoke().longValue() - epochMs));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", AlexaEventBundleKeys.INSTANCE, "Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker;", "getInstance$annotations", "getInstance", "()Lcom/amazon/alexa/api/compat/model/conversation/ConversationLoadSourceTracker;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationLoadSourceTracker getInstance() {
            return ConversationLoadSourceTracker.instance;
        }

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationLoadSourceTracker() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ConversationLoadSourceTracker(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 2) != 0 ? AnonymousClass2.INSTANCE : function02);
    }
}
