package com.amazon.alexa.assistant.foundation.audio;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0019H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource;", "", "receivedLength", "", "getReceivedLength", "()I", "isFinished", "", "()Z", SendEventResultBundleKeys.FAILURE, "", "getFailure", "()Ljava/lang/Throwable;", "awaitReceived", "Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource$AwaitResult;", "minReceivedLength", "timeoutMs", "", "copyInto", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, "", "destinationOffset", "position", "length", "cancel", "", "AwaitResult", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface StreamedAudioSource {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/StreamedAudioSource$AwaitResult;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "FINISHED", "FAILED", "TIMED_OUT", "CANCELLED", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AwaitResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AwaitResult[] $VALUES;
        public static final AwaitResult AVAILABLE = new AwaitResult("AVAILABLE", 0);
        public static final AwaitResult FINISHED = new AwaitResult("FINISHED", 1);
        public static final AwaitResult FAILED = new AwaitResult("FAILED", 2);
        public static final AwaitResult TIMED_OUT = new AwaitResult("TIMED_OUT", 3);
        public static final AwaitResult CANCELLED = new AwaitResult("CANCELLED", 4);

        private static final /* synthetic */ AwaitResult[] $values() {
            return new AwaitResult[]{AVAILABLE, FINISHED, FAILED, TIMED_OUT, CANCELLED};
        }

        static {
            AwaitResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private AwaitResult(String str, int i) {
        }

        @NotNull
        public static EnumEntries<AwaitResult> getEntries() {
            return $ENTRIES;
        }

        public static AwaitResult valueOf(String str) {
            return (AwaitResult) Enum.valueOf(AwaitResult.class, str);
        }

        public static AwaitResult[] values() {
            return (AwaitResult[]) $VALUES.clone();
        }
    }

    @NotNull
    AwaitResult awaitReceived(int minReceivedLength, long timeoutMs);

    void cancel();

    int copyInto(@NotNull byte[] destination, int destinationOffset, long position, int length);

    @Nullable
    Throwable getFailure();

    int getReceivedLength();

    boolean isFinished();
}
