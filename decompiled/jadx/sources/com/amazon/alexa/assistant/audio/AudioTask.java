package com.amazon.alexa.assistant.audio;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/audio/AudioTask;", "", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "release", "", "StopReason", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioTask {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/audio/AudioTask$StopReason;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING_NEW_TASK", "RELEASED", "INTERRUPTED", "FAILURE", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StopReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StopReason[] $VALUES;
        public static final StopReason INCOMING_NEW_TASK = new StopReason("INCOMING_NEW_TASK", 0);
        public static final StopReason RELEASED = new StopReason("RELEASED", 1);
        public static final StopReason INTERRUPTED = new StopReason("INTERRUPTED", 2);
        public static final StopReason FAILURE = new StopReason("FAILURE", 3);

        private static final /* synthetic */ StopReason[] $values() {
            return new StopReason[]{INCOMING_NEW_TASK, RELEASED, INTERRUPTED, FAILURE};
        }

        static {
            StopReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StopReason(String str, int i) {
        }

        @NotNull
        public static EnumEntries<StopReason> getEntries() {
            return $ENTRIES;
        }

        public static StopReason valueOf(String str) {
            return (StopReason) Enum.valueOf(StopReason.class, str);
        }

        public static StopReason[] values() {
            return (StopReason[]) $VALUES.clone();
        }
    }

    @NotNull
    String getIdentifier();

    void release();
}
