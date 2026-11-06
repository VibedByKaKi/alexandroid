package com.amazon.alexa.assistant.capability.conversation.model;

import com.amazon.alexa.client.alexaservice.localfragment.LocalFragmentResult;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/FragmentPurpose;", "", "<init>", "(Ljava/lang/String;I)V", "ADVERTISEMENT", LocalFragmentResult.DEFAULT_PURPOSE, "ENGAGEMENT", "INFORMATION", "RELATED", SimbaEventProcessor.SOURCE_SUGGESTION, "USER", "AGENT_PREAMBLE", "EXPANDED", "UNSUPPORTED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FragmentPurpose {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FragmentPurpose[] $VALUES;
    public static final FragmentPurpose ADVERTISEMENT = new FragmentPurpose("ADVERTISEMENT", 0);
    public static final FragmentPurpose AGENT = new FragmentPurpose(LocalFragmentResult.DEFAULT_PURPOSE, 1);
    public static final FragmentPurpose ENGAGEMENT = new FragmentPurpose("ENGAGEMENT", 2);
    public static final FragmentPurpose INFORMATION = new FragmentPurpose("INFORMATION", 3);
    public static final FragmentPurpose RELATED = new FragmentPurpose("RELATED", 4);
    public static final FragmentPurpose SUGGESTION = new FragmentPurpose(SimbaEventProcessor.SOURCE_SUGGESTION, 5);
    public static final FragmentPurpose USER = new FragmentPurpose("USER", 6);
    public static final FragmentPurpose AGENT_PREAMBLE = new FragmentPurpose("AGENT_PREAMBLE", 7);
    public static final FragmentPurpose EXPANDED = new FragmentPurpose("EXPANDED", 8);
    public static final FragmentPurpose UNSUPPORTED = new FragmentPurpose("UNSUPPORTED", 9);

    private static final /* synthetic */ FragmentPurpose[] $values() {
        return new FragmentPurpose[]{ADVERTISEMENT, AGENT, ENGAGEMENT, INFORMATION, RELATED, SUGGESTION, USER, AGENT_PREAMBLE, EXPANDED, UNSUPPORTED};
    }

    static {
        FragmentPurpose[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FragmentPurpose(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FragmentPurpose> getEntries() {
        return $ENTRIES;
    }

    public static FragmentPurpose valueOf(String str) {
        return (FragmentPurpose) Enum.valueOf(FragmentPurpose.class, str);
    }

    public static FragmentPurpose[] values() {
        return (FragmentPurpose[]) $VALUES.clone();
    }
}
