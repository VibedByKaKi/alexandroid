package com.amazon.alexa.client.alexaservice.ui.core;

import com.amazon.alexa.api.LaunchType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum LaunchSource {
    INTERNAL("internal"),
    REQUEST_DIALOG("requestDialog"),
    NOTIFICATION_TAP("notificationTap"),
    WAKE_WORD("wakeWord"),
    EXPECT_SPEECH("expectSpeech"),
    TEXT("text"),
    VOICE_CHAT("voiceChat"),
    UNKNOWN("unknown"),
    NATURAL_TURN("naturalTurn");

    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.ui.core.LaunchSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$LaunchType;

        static {
            int[] iArr = new int[LaunchType.values().length];
            $SwitchMap$com$amazon$alexa$api$LaunchType = iArr;
            try {
                iArr[LaunchType.WAKE_WORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$LaunchType[LaunchType.TAP_TO_TALK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$LaunchType[LaunchType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$LaunchType[LaunchType.NATURAL_TURN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    LaunchSource(String str) {
        this.value = str;
    }

    public static LaunchSource fromLaunchType(LaunchType launchType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$LaunchType[launchType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? UNKNOWN : NATURAL_TURN : TEXT : REQUEST_DIALOG : WAKE_WORD;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isText() {
        return TEXT.value.equals(getValue());
    }
}
