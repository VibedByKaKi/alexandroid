package com.amazon.alexa.assistant.conversation;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u0004¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/conversation/ConversationRecencyFilter;", "", "<init>", "(Ljava/lang/String;I)V", "PAST_24_HOURS", "maxConversationAge", "Lkotlin/time/Duration;", "getMaxConversationAge-UwyO8pc$voice_release", "()J", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationRecencyFilter {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationRecencyFilter[] $VALUES;
    public static final ConversationRecencyFilter PAST_24_HOURS = new ConversationRecencyFilter("PAST_24_HOURS", 0);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationRecencyFilter.values().length];
            try {
                iArr[ConversationRecencyFilter.PAST_24_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ConversationRecencyFilter[] $values() {
        return new ConversationRecencyFilter[]{PAST_24_HOURS};
    }

    static {
        ConversationRecencyFilter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ConversationRecencyFilter(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ConversationRecencyFilter> getEntries() {
        return $ENTRIES;
    }

    public static ConversationRecencyFilter valueOf(String str) {
        return (ConversationRecencyFilter) Enum.valueOf(ConversationRecencyFilter.class, str);
    }

    public static ConversationRecencyFilter[] values() {
        return (ConversationRecencyFilter[]) $VALUES.clone();
    }

    /* renamed from: getMaxConversationAge-UwyO8pc$voice_release, reason: not valid java name */
    public final long m15012getMaxConversationAgeUwyO8pc$voice_release() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            Duration.Companion companion = Duration.INSTANCE;
            return DurationKt.toDuration(24, DurationUnit.HOURS);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return 0L;
    }
}
