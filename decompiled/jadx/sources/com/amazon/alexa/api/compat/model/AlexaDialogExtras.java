package com.amazon.alexa.api.compat.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.DialogExtrasBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002RSB×\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0015HÆ\u0003J\t\u0010G\u001a\u00020\u0017HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001cHÆ\u0003JÙ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\u0013\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006T"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras;", "", DialogExtrasBundleKeys.SUPPRESS_USER_INTERFACE, "", DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND, DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND, "suppressSpeechResponse", "invocationType", "", "launchType", "Lcom/amazon/alexa/api/compat/model/LaunchType;", DialogExtrasBundleKeys.USER_INTERFACE_OPTIONS, "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", DialogExtrasBundleKeys.ENABLE_INTERACTION_FROM_LOCKSCREEN, DialogExtrasBundleKeys.IS_USER_VOICE_VERIFIED, DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND_ONLY_ON_FIRST_TURN, DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN, DialogExtrasBundleKeys.SUPPRESS_WAKEWORD_VERIFICATION, DialogExtrasBundleKeys.ENABLE_SPEAKER_VERIFICATION, DialogExtrasBundleKeys.IS_USER_ON_COMMS, DialogExtrasBundleKeys.AUDIO_OUTPUT_CONTEXT, "Lcom/amazon/alexa/api/compat/model/AudioOutputContext;", "dialogStartTimestampMillis", "", DialogExtrasBundleKeys.MUST_COORDINATE_RESPONSES, "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "<init>", "(ZZZZLjava/lang/String;Lcom/amazon/alexa/api/compat/model/LaunchType;Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;ZZZZZZZLcom/amazon/alexa/api/compat/model/AudioOutputContext;JZLjava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/ResponseType;)V", "getSuppressUserInterface", "()Z", "getSuppressWakeSound", "getSuppressEndpointSound", "getSuppressSpeechResponse", "getInvocationType", "()Ljava/lang/String;", "getLaunchType", "()Lcom/amazon/alexa/api/compat/model/LaunchType;", "getUserInterfaceOptions", "()Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", "getEnableInteractionFromLockscreen", "getSuppressWakeSoundOnlyOnFirstTurn", "getSuppressEndpointSoundOnlyOnFirstTurn", "getSuppressWakewordVerification", "getEnableSpeakerVerification", "getAudioOutputContext", "()Lcom/amazon/alexa/api/compat/model/AudioOutputContext;", "getDialogStartTimestampMillis", "()J", "getMustCoordinateResponses", "getUniversalPrivacyCode", "getInteractionLabel", "getResponseType", "()Lcom/amazon/alexa/api/compat/model/ResponseType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaDialogExtras {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AudioOutputContext audioOutputContext;
    private final long dialogStartTimestampMillis;
    private final boolean enableInteractionFromLockscreen;
    private final boolean enableSpeakerVerification;

    @Nullable
    private final String interactionLabel;

    @NotNull
    private final String invocationType;
    private final boolean isUserOnComms;
    private final boolean isUserVoiceVerified;

    @NotNull
    private final LaunchType launchType;
    private final boolean mustCoordinateResponses;

    @Nullable
    private final ResponseType responseType;
    private final boolean suppressEndpointSound;
    private final boolean suppressEndpointSoundOnlyOnFirstTurn;
    private final boolean suppressSpeechResponse;
    private final boolean suppressUserInterface;
    private final boolean suppressWakeSound;
    private final boolean suppressWakeSoundOnlyOnFirstTurn;
    private final boolean suppressWakewordVerification;

    @Nullable
    private final String universalPrivacyCode;

    @Nullable
    private final AlexaUserInterfaceOptions userInterfaceOptions;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0017J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0019J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0005J\u0010\u0010.\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\nJ\u0010\u00100\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\nJ\u0010\u00102\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u001eJ\u0006\u00104\u001a\u000205R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras$Builder;", "", "<init>", "()V", DialogExtrasBundleKeys.SUPPRESS_USER_INTERFACE, "", DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND, DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND, "suppressSpeechResponse", "invocationType", "", "launchType", "Lcom/amazon/alexa/api/compat/model/LaunchType;", DialogExtrasBundleKeys.USER_INTERFACE_OPTIONS, "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", DialogExtrasBundleKeys.ENABLE_INTERACTION_FROM_LOCKSCREEN, DialogExtrasBundleKeys.IS_USER_VOICE_VERIFIED, DialogExtrasBundleKeys.SUPPRESS_WAKE_SOUND_ONLY_ON_FIRST_TURN, DialogExtrasBundleKeys.SUPPRESS_ENDPOINT_SOUND_ONLY_ON_FIRST_TURN, DialogExtrasBundleKeys.SUPPRESS_WAKEWORD_VERIFICATION, DialogExtrasBundleKeys.ENABLE_SPEAKER_VERIFICATION, DialogExtrasBundleKeys.IS_USER_ON_COMMS, DialogExtrasBundleKeys.AUDIO_OUTPUT_CONTEXT, "Lcom/amazon/alexa/api/compat/model/AudioOutputContext;", "dialogStartTimestampMillis", "", DialogExtrasBundleKeys.MUST_COORDINATE_RESPONSES, "universalPrivacyCode", "interactionLabel", "responseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "suppress", "setInvocationType", "setLaunchType", "setUserInterfaceOptions", "options", "enable", "setUserVoiceVerified", "verified", "onComms", "setAudioOutputContext", "context", "setDialogStartTimestampMillis", "millis", "setMustCoordinateResponses", "mustCoordinate", "setUniversalPrivacyCode", "code", "setInteractionLabel", "label", "setResponseType", "type", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaDialogExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaDialogExtras.kt\ncom/amazon/alexa/api/compat/model/AlexaDialogExtras$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private long dialogStartTimestampMillis;
        private boolean enableInteractionFromLockscreen;
        private boolean enableSpeakerVerification;

        @Nullable
        private String interactionLabel;
        private boolean isUserOnComms;
        private boolean isUserVoiceVerified;
        private boolean mustCoordinateResponses;

        @Nullable
        private ResponseType responseType;
        private boolean suppressEndpointSound;
        private boolean suppressEndpointSoundOnlyOnFirstTurn;
        private boolean suppressSpeechResponse;
        private boolean suppressUserInterface;
        private boolean suppressWakeSound;
        private boolean suppressWakeSoundOnlyOnFirstTurn;
        private boolean suppressWakewordVerification;

        @Nullable
        private String universalPrivacyCode;

        @Nullable
        private AlexaUserInterfaceOptions userInterfaceOptions;

        @NotNull
        private String invocationType = "UNKNOWN";

        @NotNull
        private LaunchType launchType = LaunchType.UNKNOWN;

        @NotNull
        private AudioOutputContext audioOutputContext = AudioOutputContext.DEFAULT;

        @NotNull
        public final AlexaDialogExtras build() {
            return new AlexaDialogExtras(this.suppressUserInterface, this.suppressWakeSound, this.suppressEndpointSound, this.suppressSpeechResponse, this.invocationType, this.launchType, this.userInterfaceOptions, this.enableInteractionFromLockscreen, this.isUserVoiceVerified, this.suppressWakeSoundOnlyOnFirstTurn, this.suppressEndpointSoundOnlyOnFirstTurn, this.suppressWakewordVerification, this.enableSpeakerVerification, this.isUserOnComms, this.audioOutputContext, this.dialogStartTimestampMillis, this.mustCoordinateResponses, this.universalPrivacyCode, this.interactionLabel, this.responseType);
        }

        @NotNull
        public final Builder enableInteractionFromLockscreen(boolean enable) {
            this.enableInteractionFromLockscreen = enable;
            return this;
        }

        @NotNull
        public final Builder enableSpeakerVerification(boolean enable) {
            this.enableSpeakerVerification = enable;
            return this;
        }

        @NotNull
        public final Builder isUserOnComms(boolean onComms) {
            this.isUserOnComms = onComms;
            return this;
        }

        @NotNull
        public final Builder setAudioOutputContext(@NotNull AudioOutputContext context) {
            context.getClass();
            this.audioOutputContext = context;
            return this;
        }

        @NotNull
        public final Builder setDialogStartTimestampMillis(long millis) {
            this.dialogStartTimestampMillis = millis;
            return this;
        }

        @NotNull
        public final Builder setInteractionLabel(@Nullable String label) {
            this.interactionLabel = label;
            return this;
        }

        @NotNull
        public final Builder setInvocationType(@NotNull String invocationType) {
            invocationType.getClass();
            this.invocationType = invocationType;
            return this;
        }

        @NotNull
        public final Builder setLaunchType(@NotNull LaunchType launchType) {
            launchType.getClass();
            this.launchType = launchType;
            return this;
        }

        @NotNull
        public final Builder setMustCoordinateResponses(boolean mustCoordinate) {
            this.mustCoordinateResponses = mustCoordinate;
            return this;
        }

        @NotNull
        public final Builder setResponseType(@Nullable ResponseType type) {
            this.responseType = type;
            return this;
        }

        @NotNull
        public final Builder setUniversalPrivacyCode(@Nullable String code) {
            this.universalPrivacyCode = code;
            return this;
        }

        @NotNull
        public final Builder setUserInterfaceOptions(@Nullable AlexaUserInterfaceOptions options) {
            this.userInterfaceOptions = options;
            return this;
        }

        @NotNull
        public final Builder setUserVoiceVerified(boolean verified) {
            this.isUserVoiceVerified = verified;
            return this;
        }

        @NotNull
        public final Builder suppressEndpointSound(boolean suppress) {
            this.suppressEndpointSound = suppress;
            return this;
        }

        @NotNull
        public final Builder suppressEndpointSoundOnlyOnFirstTurn(boolean suppress) {
            this.suppressEndpointSoundOnlyOnFirstTurn = suppress;
            return this;
        }

        @NotNull
        public final Builder suppressSpeechResponse(boolean suppress) {
            this.suppressSpeechResponse = suppress;
            return this;
        }

        @NotNull
        public final Builder suppressUserInterface(boolean suppress) {
            this.suppressUserInterface = suppress;
            return this;
        }

        @NotNull
        public final Builder suppressWakeSound(boolean suppress) {
            this.suppressWakeSound = suppress;
            return this;
        }

        @NotNull
        public final Builder suppressWakeSoundOnlyOnFirstTurn(boolean suppress) {
            this.suppressWakeSoundOnlyOnFirstTurn = suppress;
            return this;
        }

        @NotNull
        public final Builder suppressWakewordVerification(boolean suppress) {
            this.suppressWakewordVerification = suppress;
            return this;
        }
    }

    public /* synthetic */ AlexaDialogExtras(boolean z, boolean z2, boolean z3, boolean z4, String str, LaunchType launchType, AlexaUserInterfaceOptions alexaUserInterfaceOptions, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, AudioOutputContext audioOutputContext, long j, boolean z12, String str2, String str3, ResponseType responseType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? "UNKNOWN" : str, (i & 32) != 0 ? LaunchType.UNKNOWN : launchType, (i & 64) != 0 ? null : alexaUserInterfaceOptions, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? false : z8, (i & 2048) != 0 ? false : z9, (i & 4096) != 0 ? false : z10, (i & 8192) != 0 ? false : z11, (i & 16384) != 0 ? AudioOutputContext.DEFAULT : audioOutputContext, (i & 32768) != 0 ? 0L : j, (i & 65536) != 0 ? false : z12, (i & 131072) != 0 ? null : str2, (i & 262144) != 0 ? null : str3, (i & 524288) != 0 ? null : responseType);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaDialogExtras copy$default(AlexaDialogExtras alexaDialogExtras, boolean z, boolean z2, boolean z3, boolean z4, String str, LaunchType launchType, AlexaUserInterfaceOptions alexaUserInterfaceOptions, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, AudioOutputContext audioOutputContext, long j, boolean z12, String str2, String str3, ResponseType responseType, int i, Object obj) {
        ResponseType responseType2;
        String str4;
        boolean z13 = (i & 1) != 0 ? alexaDialogExtras.suppressUserInterface : z;
        boolean z14 = (i & 2) != 0 ? alexaDialogExtras.suppressWakeSound : z2;
        boolean z15 = (i & 4) != 0 ? alexaDialogExtras.suppressEndpointSound : z3;
        boolean z16 = (i & 8) != 0 ? alexaDialogExtras.suppressSpeechResponse : z4;
        String str5 = (i & 16) != 0 ? alexaDialogExtras.invocationType : str;
        LaunchType launchType2 = (i & 32) != 0 ? alexaDialogExtras.launchType : launchType;
        AlexaUserInterfaceOptions alexaUserInterfaceOptions2 = (i & 64) != 0 ? alexaDialogExtras.userInterfaceOptions : alexaUserInterfaceOptions;
        boolean z17 = (i & 128) != 0 ? alexaDialogExtras.enableInteractionFromLockscreen : z5;
        boolean z18 = (i & 256) != 0 ? alexaDialogExtras.isUserVoiceVerified : z6;
        boolean z19 = (i & 512) != 0 ? alexaDialogExtras.suppressWakeSoundOnlyOnFirstTurn : z7;
        boolean z20 = (i & 1024) != 0 ? alexaDialogExtras.suppressEndpointSoundOnlyOnFirstTurn : z8;
        boolean z21 = (i & 2048) != 0 ? alexaDialogExtras.suppressWakewordVerification : z9;
        boolean z22 = (i & 4096) != 0 ? alexaDialogExtras.enableSpeakerVerification : z10;
        boolean z23 = (i & 8192) != 0 ? alexaDialogExtras.isUserOnComms : z11;
        boolean z24 = z13;
        AudioOutputContext audioOutputContext2 = (i & 16384) != 0 ? alexaDialogExtras.audioOutputContext : audioOutputContext;
        long j2 = (i & 32768) != 0 ? alexaDialogExtras.dialogStartTimestampMillis : j;
        boolean z25 = (i & 65536) != 0 ? alexaDialogExtras.mustCoordinateResponses : z12;
        String str6 = (i & 131072) != 0 ? alexaDialogExtras.universalPrivacyCode : str2;
        boolean z26 = z25;
        String str7 = (i & 262144) != 0 ? alexaDialogExtras.interactionLabel : str3;
        if ((i & 524288) != 0) {
            str4 = str7;
            responseType2 = alexaDialogExtras.responseType;
        } else {
            responseType2 = responseType;
            str4 = str7;
        }
        return alexaDialogExtras.copy(z24, z14, z15, z16, str5, launchType2, alexaUserInterfaceOptions2, z17, z18, z19, z20, z21, z22, z23, audioOutputContext2, j2, z26, str6, str4, responseType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuppressUserInterface() {
        return this.suppressUserInterface;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSuppressWakeSoundOnlyOnFirstTurn() {
        return this.suppressWakeSoundOnlyOnFirstTurn;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getSuppressEndpointSoundOnlyOnFirstTurn() {
        return this.suppressEndpointSoundOnlyOnFirstTurn;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getSuppressWakewordVerification() {
        return this.suppressWakewordVerification;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getEnableSpeakerVerification() {
        return this.enableSpeakerVerification;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsUserOnComms() {
        return this.isUserOnComms;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final AudioOutputContext getAudioOutputContext() {
        return this.audioOutputContext;
    }

    /* renamed from: component16, reason: from getter */
    public final long getDialogStartTimestampMillis() {
        return this.dialogStartTimestampMillis;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getMustCoordinateResponses() {
        return this.mustCoordinateResponses;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuppressWakeSound() {
        return this.suppressWakeSound;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSuppressEndpointSound() {
        return this.suppressEndpointSound;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final AlexaUserInterfaceOptions getUserInterfaceOptions() {
        return this.userInterfaceOptions;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnableInteractionFromLockscreen() {
        return this.enableInteractionFromLockscreen;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsUserVoiceVerified() {
        return this.isUserVoiceVerified;
    }

    @NotNull
    public final AlexaDialogExtras copy(boolean suppressUserInterface, boolean suppressWakeSound, boolean suppressEndpointSound, boolean suppressSpeechResponse, @NotNull String invocationType, @NotNull LaunchType launchType, @Nullable AlexaUserInterfaceOptions userInterfaceOptions, boolean enableInteractionFromLockscreen, boolean isUserVoiceVerified, boolean suppressWakeSoundOnlyOnFirstTurn, boolean suppressEndpointSoundOnlyOnFirstTurn, boolean suppressWakewordVerification, boolean enableSpeakerVerification, boolean isUserOnComms, @NotNull AudioOutputContext audioOutputContext, long dialogStartTimestampMillis, boolean mustCoordinateResponses, @Nullable String universalPrivacyCode, @Nullable String interactionLabel, @Nullable ResponseType responseType) {
        invocationType.getClass();
        launchType.getClass();
        audioOutputContext.getClass();
        return new AlexaDialogExtras(suppressUserInterface, suppressWakeSound, suppressEndpointSound, suppressSpeechResponse, invocationType, launchType, userInterfaceOptions, enableInteractionFromLockscreen, isUserVoiceVerified, suppressWakeSoundOnlyOnFirstTurn, suppressEndpointSoundOnlyOnFirstTurn, suppressWakewordVerification, enableSpeakerVerification, isUserOnComms, audioOutputContext, dialogStartTimestampMillis, mustCoordinateResponses, universalPrivacyCode, interactionLabel, responseType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaDialogExtras)) {
            return false;
        }
        AlexaDialogExtras alexaDialogExtras = (AlexaDialogExtras) other;
        return this.suppressUserInterface == alexaDialogExtras.suppressUserInterface && this.suppressWakeSound == alexaDialogExtras.suppressWakeSound && this.suppressEndpointSound == alexaDialogExtras.suppressEndpointSound && this.suppressSpeechResponse == alexaDialogExtras.suppressSpeechResponse && Intrinsics.areEqual(this.invocationType, alexaDialogExtras.invocationType) && this.launchType == alexaDialogExtras.launchType && Intrinsics.areEqual(this.userInterfaceOptions, alexaDialogExtras.userInterfaceOptions) && this.enableInteractionFromLockscreen == alexaDialogExtras.enableInteractionFromLockscreen && this.isUserVoiceVerified == alexaDialogExtras.isUserVoiceVerified && this.suppressWakeSoundOnlyOnFirstTurn == alexaDialogExtras.suppressWakeSoundOnlyOnFirstTurn && this.suppressEndpointSoundOnlyOnFirstTurn == alexaDialogExtras.suppressEndpointSoundOnlyOnFirstTurn && this.suppressWakewordVerification == alexaDialogExtras.suppressWakewordVerification && this.enableSpeakerVerification == alexaDialogExtras.enableSpeakerVerification && this.isUserOnComms == alexaDialogExtras.isUserOnComms && Intrinsics.areEqual(this.audioOutputContext, alexaDialogExtras.audioOutputContext) && this.dialogStartTimestampMillis == alexaDialogExtras.dialogStartTimestampMillis && this.mustCoordinateResponses == alexaDialogExtras.mustCoordinateResponses && Intrinsics.areEqual(this.universalPrivacyCode, alexaDialogExtras.universalPrivacyCode) && Intrinsics.areEqual(this.interactionLabel, alexaDialogExtras.interactionLabel) && this.responseType == alexaDialogExtras.responseType;
    }

    @NotNull
    public final AudioOutputContext getAudioOutputContext() {
        return this.audioOutputContext;
    }

    public final long getDialogStartTimestampMillis() {
        return this.dialogStartTimestampMillis;
    }

    public final boolean getEnableInteractionFromLockscreen() {
        return this.enableInteractionFromLockscreen;
    }

    public final boolean getEnableSpeakerVerification() {
        return this.enableSpeakerVerification;
    }

    @Nullable
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @NotNull
    public final String getInvocationType() {
        return this.invocationType;
    }

    @NotNull
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    public final boolean getMustCoordinateResponses() {
        return this.mustCoordinateResponses;
    }

    @Nullable
    public final ResponseType getResponseType() {
        return this.responseType;
    }

    public final boolean getSuppressEndpointSound() {
        return this.suppressEndpointSound;
    }

    public final boolean getSuppressEndpointSoundOnlyOnFirstTurn() {
        return this.suppressEndpointSoundOnlyOnFirstTurn;
    }

    public final boolean getSuppressSpeechResponse() {
        return this.suppressSpeechResponse;
    }

    public final boolean getSuppressUserInterface() {
        return this.suppressUserInterface;
    }

    public final boolean getSuppressWakeSound() {
        return this.suppressWakeSound;
    }

    public final boolean getSuppressWakeSoundOnlyOnFirstTurn() {
        return this.suppressWakeSoundOnlyOnFirstTurn;
    }

    public final boolean getSuppressWakewordVerification() {
        return this.suppressWakewordVerification;
    }

    @Nullable
    public final String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    @Nullable
    public final AlexaUserInterfaceOptions getUserInterfaceOptions() {
        return this.userInterfaceOptions;
    }

    public int hashCode() {
        int hashCode = (this.launchType.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.suppressSpeechResponse, DoubleList$$ExternalSyntheticOutline0.m(this.suppressEndpointSound, DoubleList$$ExternalSyntheticOutline0.m(this.suppressWakeSound, Boolean.hashCode(this.suppressUserInterface) * 31, 31), 31), 31), 31, this.invocationType)) * 31;
        AlexaUserInterfaceOptions alexaUserInterfaceOptions = this.userInterfaceOptions;
        int m = DoubleList$$ExternalSyntheticOutline0.m(this.mustCoordinateResponses, BitVector$$ExternalSyntheticOutline0.m(this.dialogStartTimestampMillis, (this.audioOutputContext.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.isUserOnComms, DoubleList$$ExternalSyntheticOutline0.m(this.enableSpeakerVerification, DoubleList$$ExternalSyntheticOutline0.m(this.suppressWakewordVerification, DoubleList$$ExternalSyntheticOutline0.m(this.suppressEndpointSoundOnlyOnFirstTurn, DoubleList$$ExternalSyntheticOutline0.m(this.suppressWakeSoundOnlyOnFirstTurn, DoubleList$$ExternalSyntheticOutline0.m(this.isUserVoiceVerified, DoubleList$$ExternalSyntheticOutline0.m(this.enableInteractionFromLockscreen, (hashCode + (alexaUserInterfaceOptions == null ? 0 : alexaUserInterfaceOptions.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31);
        String str = this.universalPrivacyCode;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interactionLabel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResponseType responseType = this.responseType;
        return hashCode3 + (responseType != null ? responseType.hashCode() : 0);
    }

    public final boolean isUserOnComms() {
        return this.isUserOnComms;
    }

    public final boolean isUserVoiceVerified() {
        return this.isUserVoiceVerified;
    }

    @NotNull
    public String toString() {
        boolean z = this.suppressUserInterface;
        boolean z2 = this.suppressWakeSound;
        boolean z3 = this.suppressEndpointSound;
        boolean z4 = this.suppressSpeechResponse;
        String str = this.invocationType;
        LaunchType launchType = this.launchType;
        AlexaUserInterfaceOptions alexaUserInterfaceOptions = this.userInterfaceOptions;
        boolean z5 = this.enableInteractionFromLockscreen;
        boolean z6 = this.isUserVoiceVerified;
        boolean z7 = this.suppressWakeSoundOnlyOnFirstTurn;
        boolean z8 = this.suppressEndpointSoundOnlyOnFirstTurn;
        boolean z9 = this.suppressWakewordVerification;
        boolean z10 = this.enableSpeakerVerification;
        boolean z11 = this.isUserOnComms;
        AudioOutputContext audioOutputContext = this.audioOutputContext;
        long j = this.dialogStartTimestampMillis;
        boolean z12 = this.mustCoordinateResponses;
        String str2 = this.universalPrivacyCode;
        String str3 = this.interactionLabel;
        ResponseType responseType = this.responseType;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("AlexaDialogExtras(suppressUserInterface=", z, ", suppressWakeSound=", z2, ", suppressEndpointSound=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z3, ", suppressSpeechResponse=", z4, ", invocationType=");
        m.append(str);
        m.append(", launchType=");
        m.append(launchType);
        m.append(", userInterfaceOptions=");
        m.append(alexaUserInterfaceOptions);
        m.append(", enableInteractionFromLockscreen=");
        m.append(z5);
        m.append(", isUserVoiceVerified=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z6, ", suppressWakeSoundOnlyOnFirstTurn=", z7, ", suppressEndpointSoundOnlyOnFirstTurn=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z8, ", suppressWakewordVerification=", z9, ", enableSpeakerVerification=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z10, ", isUserOnComms=", z11, ", audioOutputContext=");
        m.append(audioOutputContext);
        m.append(", dialogStartTimestampMillis=");
        m.append(j);
        m.append(", mustCoordinateResponses=");
        m.append(z12);
        m.append(", universalPrivacyCode=");
        m.append(str2);
        m.append(", interactionLabel=");
        m.append(str3);
        m.append(", responseType=");
        m.append(responseType);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public AlexaDialogExtras(boolean z, boolean z2, boolean z3, boolean z4, @NotNull String str, @NotNull LaunchType launchType, @Nullable AlexaUserInterfaceOptions alexaUserInterfaceOptions, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, @NotNull AudioOutputContext audioOutputContext, long j, boolean z12, @Nullable String str2, @Nullable String str3, @Nullable ResponseType responseType) {
        str.getClass();
        launchType.getClass();
        audioOutputContext.getClass();
        this.suppressUserInterface = z;
        this.suppressWakeSound = z2;
        this.suppressEndpointSound = z3;
        this.suppressSpeechResponse = z4;
        this.invocationType = str;
        this.launchType = launchType;
        this.userInterfaceOptions = alexaUserInterfaceOptions;
        this.enableInteractionFromLockscreen = z5;
        this.isUserVoiceVerified = z6;
        this.suppressWakeSoundOnlyOnFirstTurn = z7;
        this.suppressEndpointSoundOnlyOnFirstTurn = z8;
        this.suppressWakewordVerification = z9;
        this.enableSpeakerVerification = z10;
        this.isUserOnComms = z11;
        this.audioOutputContext = audioOutputContext;
        this.dialogStartTimestampMillis = j;
        this.mustCoordinateResponses = z12;
        this.universalPrivacyCode = str2;
        this.interactionLabel = str3;
        this.responseType = responseType;
    }

    public AlexaDialogExtras() {
        this(false, false, false, false, null, null, null, false, false, false, false, false, false, false, null, 0L, false, null, null, null, 1048575, null);
    }
}
