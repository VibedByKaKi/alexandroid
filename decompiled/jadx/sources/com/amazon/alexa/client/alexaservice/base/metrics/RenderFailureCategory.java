package com.amazon.alexa.client.alexaservice.base.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum RenderFailureCategory {
    SDK_DIALOG_FAILURE("SDKDialogFailure"),
    NO_RESPONSE_NO_RPS_NO_RPC("NoResponseFragment.NoRpsNoRpc"),
    NO_RESPONSE_NO_RPS_WITH_RPC("NoResponseFragment.RpcWithoutRps"),
    NO_RESPONSE_OTHER("NoResponseFragment.Other"),
    NO_RESPONSE_THIRD_PARTY_SKILL("NoResponseFragment.ThirdPartySkill"),
    NO_RESPONSE_EMPTY_CONTAINER("NoResponseFragment.EmptyContainer"),
    NO_RESPONSE_NON_EMPTY_CONTAINER("NoResponseFragment.NonEmptyContainer"),
    UI_RENDERING_FAILURE("UIRenderingFailure"),
    UI_RENDERING_FAILURE_FRAGMENT_PARSED("UIRenderingFailure.FragmentParsed"),
    UI_RENDERING_FAILURE_FRAGMENT_NOT_PARSED("UIRenderingFailure.FragmentNotParsed"),
    RESPONSE_FRAGMENT_MISSING_RELATION("ResponseFragment.MissingRelation"),
    UI_RENDERING_FAILURE_DEEPLINK_NAVIGATION("UIRenderingFailure.DeeplinkNavigation"),
    UI_RENDERING_FAILURE_SCROLL_DISPOSE("UIRenderingFailure.ScrollDispose"),
    NO_RESPONSE_PREAMBLE_ONLY("NoResponseFragment.PreambleOnly"),
    NO_RESPONSE_PREAMBLE_ONLY_EMPTY_CONTAINER("NoResponseFragment.PreambleOnly.EmptyContainer"),
    NO_RESPONSE_PREAMBLE_ONLY_NON_EMPTY_CONTAINER("NoResponseFragment.PreambleOnly.NonEmptyContainer"),
    NO_RESPONSE_WAKE_WORD_ONLY("NoResponseFragment.WakeWordOnlyUtterance"),
    INTERRUPTED_BY_NEXT_DIALOG_BARGE_IN("InterruptedByNextDialog.BargeIn"),
    INTERRUPTED_BY_NEXT_DIALOG_EXPECT_SPEECH("InterruptedByNextDialog.ExpectSpeech"),
    INTERRUPTED_BY_USER_NAVIGATE_AWAY("InterruptedByUser.NavigateAway"),
    INTERRUPTED_BY_USER_APP_BACKGROUNDED("InterruptedByUser.AppBackgrounded");

    private final String failureCategory;

    RenderFailureCategory(String str) {
        this.failureCategory = str;
    }

    public String getValue() {
        return this.failureCategory;
    }
}
