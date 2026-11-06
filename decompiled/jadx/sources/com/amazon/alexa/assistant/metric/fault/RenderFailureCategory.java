package com.amazon.alexa.assistant.metric.fault;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/RenderFailureCategory;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SDK_DIALOG_FAILURE", "NO_RESPONSE_NO_RPS_WITH_RPC", "NO_RESPONSE_OTHER", "NO_RESPONSE_THIRD_PARTY_SKILL", "NO_RESPONSE_EMPTY_CONTAINER", "NO_RESPONSE_NON_EMPTY_CONTAINER", "UI_RENDERING_FAILURE", "UI_RENDERING_FAILURE_FRAGMENT_PARSED", "UI_RENDERING_FAILURE_FRAGMENT_NOT_PARSED", "RESPONSE_FRAGMENT_MISSING_RELATION", "UI_RENDERING_FAILURE_DEEPLINK_NAVIGATION", "UI_RENDERING_FAILURE_SCROLL_DISPOSE", "NO_RESPONSE_PREAMBLE_ONLY", "NO_RESPONSE_PREAMBLE_ONLY_EMPTY_CONTAINER", "NO_RESPONSE_PREAMBLE_ONLY_NON_EMPTY_CONTAINER", "NO_RESPONSE_WAKE_WORD_ONLY", "INTERRUPTED_BY_NEXT_DIALOG_BARGE_IN", "INTERRUPTED_BY_NEXT_DIALOG_EXPECT_SPEECH", "INTERRUPTED_BY_USER_NAVIGATE_AWAY", "INTERRUPTED_BY_APP_BACKGROUNDED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RenderFailureCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RenderFailureCategory[] $VALUES;

    @NotNull
    private final String value;
    public static final RenderFailureCategory SDK_DIALOG_FAILURE = new RenderFailureCategory("SDK_DIALOG_FAILURE", 0, "SDKDialogFailure");
    public static final RenderFailureCategory NO_RESPONSE_NO_RPS_WITH_RPC = new RenderFailureCategory("NO_RESPONSE_NO_RPS_WITH_RPC", 1, "NoResponseFragment.RpcWithoutRps");
    public static final RenderFailureCategory NO_RESPONSE_OTHER = new RenderFailureCategory("NO_RESPONSE_OTHER", 2, "NoResponseFragment.Other");
    public static final RenderFailureCategory NO_RESPONSE_THIRD_PARTY_SKILL = new RenderFailureCategory("NO_RESPONSE_THIRD_PARTY_SKILL", 3, "NoResponseFragment.ThirdPartySkill");
    public static final RenderFailureCategory NO_RESPONSE_EMPTY_CONTAINER = new RenderFailureCategory("NO_RESPONSE_EMPTY_CONTAINER", 4, "NoResponseFragment.EmptyContainer");
    public static final RenderFailureCategory NO_RESPONSE_NON_EMPTY_CONTAINER = new RenderFailureCategory("NO_RESPONSE_NON_EMPTY_CONTAINER", 5, "NoResponseFragment.NonEmptyContainer");
    public static final RenderFailureCategory UI_RENDERING_FAILURE = new RenderFailureCategory("UI_RENDERING_FAILURE", 6, "UIRenderingFailure");
    public static final RenderFailureCategory UI_RENDERING_FAILURE_FRAGMENT_PARSED = new RenderFailureCategory("UI_RENDERING_FAILURE_FRAGMENT_PARSED", 7, "UIRenderingFailure.FragmentParsed");
    public static final RenderFailureCategory UI_RENDERING_FAILURE_FRAGMENT_NOT_PARSED = new RenderFailureCategory("UI_RENDERING_FAILURE_FRAGMENT_NOT_PARSED", 8, "UIRenderingFailure.FragmentNotParsed");
    public static final RenderFailureCategory RESPONSE_FRAGMENT_MISSING_RELATION = new RenderFailureCategory("RESPONSE_FRAGMENT_MISSING_RELATION", 9, "ResponseFragment.MissingRelation");
    public static final RenderFailureCategory UI_RENDERING_FAILURE_DEEPLINK_NAVIGATION = new RenderFailureCategory("UI_RENDERING_FAILURE_DEEPLINK_NAVIGATION", 10, "UIRenderingFailure.DeeplinkNavigation");
    public static final RenderFailureCategory UI_RENDERING_FAILURE_SCROLL_DISPOSE = new RenderFailureCategory("UI_RENDERING_FAILURE_SCROLL_DISPOSE", 11, "UIRenderingFailure.ScrollDispose");
    public static final RenderFailureCategory NO_RESPONSE_PREAMBLE_ONLY = new RenderFailureCategory("NO_RESPONSE_PREAMBLE_ONLY", 12, "NoResponseFragment.PreambleOnly");
    public static final RenderFailureCategory NO_RESPONSE_PREAMBLE_ONLY_EMPTY_CONTAINER = new RenderFailureCategory("NO_RESPONSE_PREAMBLE_ONLY_EMPTY_CONTAINER", 13, "NoResponseFragment.PreambleOnly.EmptyContainer");
    public static final RenderFailureCategory NO_RESPONSE_PREAMBLE_ONLY_NON_EMPTY_CONTAINER = new RenderFailureCategory("NO_RESPONSE_PREAMBLE_ONLY_NON_EMPTY_CONTAINER", 14, "NoResponseFragment.PreambleOnly.NonEmptyContainer");
    public static final RenderFailureCategory NO_RESPONSE_WAKE_WORD_ONLY = new RenderFailureCategory("NO_RESPONSE_WAKE_WORD_ONLY", 15, "NoResponseFragment.WakeWordOnlyUtterance");
    public static final RenderFailureCategory INTERRUPTED_BY_NEXT_DIALOG_BARGE_IN = new RenderFailureCategory("INTERRUPTED_BY_NEXT_DIALOG_BARGE_IN", 16, "InterruptedByNextDialog.BargeIn");
    public static final RenderFailureCategory INTERRUPTED_BY_NEXT_DIALOG_EXPECT_SPEECH = new RenderFailureCategory("INTERRUPTED_BY_NEXT_DIALOG_EXPECT_SPEECH", 17, "InterruptedByNextDialog.ExpectSpeech");
    public static final RenderFailureCategory INTERRUPTED_BY_USER_NAVIGATE_AWAY = new RenderFailureCategory("INTERRUPTED_BY_USER_NAVIGATE_AWAY", 18, "InterruptedByUser.NavigateAway");
    public static final RenderFailureCategory INTERRUPTED_BY_APP_BACKGROUNDED = new RenderFailureCategory("INTERRUPTED_BY_APP_BACKGROUNDED", 19, "InterruptedByAppBackgrounded");

    private static final /* synthetic */ RenderFailureCategory[] $values() {
        return new RenderFailureCategory[]{SDK_DIALOG_FAILURE, NO_RESPONSE_NO_RPS_WITH_RPC, NO_RESPONSE_OTHER, NO_RESPONSE_THIRD_PARTY_SKILL, NO_RESPONSE_EMPTY_CONTAINER, NO_RESPONSE_NON_EMPTY_CONTAINER, UI_RENDERING_FAILURE, UI_RENDERING_FAILURE_FRAGMENT_PARSED, UI_RENDERING_FAILURE_FRAGMENT_NOT_PARSED, RESPONSE_FRAGMENT_MISSING_RELATION, UI_RENDERING_FAILURE_DEEPLINK_NAVIGATION, UI_RENDERING_FAILURE_SCROLL_DISPOSE, NO_RESPONSE_PREAMBLE_ONLY, NO_RESPONSE_PREAMBLE_ONLY_EMPTY_CONTAINER, NO_RESPONSE_PREAMBLE_ONLY_NON_EMPTY_CONTAINER, NO_RESPONSE_WAKE_WORD_ONLY, INTERRUPTED_BY_NEXT_DIALOG_BARGE_IN, INTERRUPTED_BY_NEXT_DIALOG_EXPECT_SPEECH, INTERRUPTED_BY_USER_NAVIGATE_AWAY, INTERRUPTED_BY_APP_BACKGROUNDED};
    }

    static {
        RenderFailureCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RenderFailureCategory(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<RenderFailureCategory> getEntries() {
        return $ENTRIES;
    }

    public static RenderFailureCategory valueOf(String str) {
        return (RenderFailureCategory) Enum.valueOf(RenderFailureCategory.class, str);
    }

    public static RenderFailureCategory[] values() {
        return (RenderFailureCategory[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
