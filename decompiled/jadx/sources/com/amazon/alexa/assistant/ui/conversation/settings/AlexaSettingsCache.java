package com.amazon.alexa.assistant.ui.conversation.settings;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.toolkit.storage.PersistentStorage;
import com.dee.app.metrics.MetricsConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0014J\u001c\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0086@¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0086@¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/settings/AlexaSettingsCache;", "", "storage", "Lcom/amazon/alexa/assistant/toolkit/storage/PersistentStorage;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/storage/PersistentStorage;)V", "save", "", "settings", "Lcom/amazon/alexa/assistant/ui/conversation/settings/CachedVoiceResponseSettings;", "(Lcom/amazon/alexa/assistant/ui/conversation/settings/CachedVoiceResponseSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "defaultFollowUp", "", "defaultBrief", "defaultWhisper", "defaultAdaptiveVolume", "(ZZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFollowUpMode", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBriefMode", "saveWhisperMode", "saveAdaptiveVolume", "saveWakeWordEnabled", "loadWakeWordEnabled", "defaultValue", "saveStartChimeEnabled", "loadStartChimeEnabled", "saveEndChimeEnabled", "loadEndChimeEnabled", "saveDirtySettings", "dirty", "", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadDirtySettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MetricsConstants.Method.CACHE_CLEAR, "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlexaSettingsCache {

    @NotNull
    private static final String KEY_ADAPTIVE_VOLUME = "voice_response_adaptive_volume";

    @NotNull
    private static final String KEY_BRIEF = "voice_response_brief";

    @NotNull
    private static final String KEY_DIRTY_SETTINGS = "dirty_settings";

    @NotNull
    private static final String KEY_END_CHIME_ENABLED = "end_chime_enabled";

    @NotNull
    private static final String KEY_FOLLOW_UP = "voice_response_follow_up";

    @NotNull
    private static final String KEY_START_CHIME_ENABLED = "start_chime_enabled";

    @NotNull
    private static final String KEY_WAKE_WORD_ENABLED = "wake_word_enabled";

    @NotNull
    private static final String KEY_WHISPER = "voice_response_whisper";

    @NotNull
    private final PersistentStorage storage;
    public static final int $stable = 8;

    public AlexaSettingsCache(@NotNull PersistentStorage persistentStorage) {
        persistentStorage.getClass();
        this.storage = persistentStorage;
    }

    public static /* synthetic */ Object loadEndChimeEnabled$default(AlexaSettingsCache alexaSettingsCache, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return alexaSettingsCache.loadEndChimeEnabled(z, continuation);
    }

    public static /* synthetic */ Object loadStartChimeEnabled$default(AlexaSettingsCache alexaSettingsCache, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return alexaSettingsCache.loadStartChimeEnabled(z, continuation);
    }

    public static /* synthetic */ Object loadWakeWordEnabled$default(AlexaSettingsCache alexaSettingsCache, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return alexaSettingsCache.loadWakeWordEnabled(z, continuation);
    }

    @Nullable
    public final Object clear(@NotNull Continuation<? super Unit> continuation) {
        Object removeAll = this.storage.removeAll(continuation);
        return removeAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeAll : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(boolean r9, boolean r10, boolean r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.amazon.alexa.assistant.ui.conversation.settings.CachedVoiceResponseSettings> r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache.load(boolean, boolean, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadDirtySettings(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache$loadDirtySettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache$loadDirtySettings$1 r0 = (com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache$loadDirtySettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache$loadDirtySettings$1 r0 = new com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache$loadDirtySettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            com.amazon.alexa.assistant.toolkit.storage.PersistentStorage r5 = r5.storage
            r0.label = r4
            java.lang.String r6 = "dirty_settings"
            java.lang.Object r6 = r5.getString(r6, r3, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L47
            goto L48
        L47:
            r3 = r6
        L48:
            int r5 = r3.length()
            if (r5 != 0) goto L53
            java.util.Set r5 = kotlin.collections.SetsKt.emptySet()
            return r5
        L53:
            java.lang.String r5 = ","
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r6 = 0
            r0 = 6
            java.util.List r5 = kotlin.text.StringsKt.split$default(r3, r5, r6, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r5 = kotlin.collections.CollectionsKt.toSet(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.ui.conversation.settings.AlexaSettingsCache.loadDirtySettings(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object loadEndChimeEnabled(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return this.storage.getBoolean(KEY_END_CHIME_ENABLED, z, continuation);
    }

    @Nullable
    public final Object loadStartChimeEnabled(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return this.storage.getBoolean(KEY_START_CHIME_ENABLED, z, continuation);
    }

    @Nullable
    public final Object loadWakeWordEnabled(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return this.storage.getBoolean(KEY_WAKE_WORD_ENABLED, z, continuation);
    }

    @Nullable
    public final Object save(@NotNull CachedVoiceResponseSettings cachedVoiceResponseSettings, @NotNull Continuation<? super Unit> continuation) {
        Object commit = this.storage.transaction().putBoolean(KEY_FOLLOW_UP, cachedVoiceResponseSettings.getFollowUpMode()).putBoolean(KEY_BRIEF, cachedVoiceResponseSettings.getBriefMode()).putBoolean(KEY_WHISPER, cachedVoiceResponseSettings.getWhisperMode()).putBoolean(KEY_ADAPTIVE_VOLUME, cachedVoiceResponseSettings.getAdaptiveVolume()).commit(continuation);
        return commit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? commit : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveAdaptiveVolume(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_ADAPTIVE_VOLUME, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveBriefMode(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_BRIEF, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveDirtySettings(@NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation) {
        boolean isEmpty = set.isEmpty();
        PersistentStorage persistentStorage = this.storage;
        if (isEmpty) {
            Object remove = persistentStorage.remove(KEY_DIRTY_SETTINGS, continuation);
            return remove == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : Unit.INSTANCE;
        }
        Object putString = persistentStorage.putString(KEY_DIRTY_SETTINGS, CollectionsKt.joinToString$default(set, ",", null, null, null, 62), continuation);
        return putString == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putString : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveEndChimeEnabled(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_END_CHIME_ENABLED, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveFollowUpMode(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_FOLLOW_UP, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveStartChimeEnabled(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_START_CHIME_ENABLED, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveWakeWordEnabled(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_WAKE_WORD_ENABLED, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveWhisperMode(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object putBoolean = this.storage.putBoolean(KEY_WHISPER, z, continuation);
        return putBoolean == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? putBoolean : Unit.INSTANCE;
    }
}
