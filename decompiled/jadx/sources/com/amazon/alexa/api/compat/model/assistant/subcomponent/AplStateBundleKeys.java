package com.amazon.alexa.api.compat.model.assistant.subcomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/assistant/subcomponent/AplStateBundleKeys;", "", "<init>", "()V", "PRESENTATION_TOKEN", "", "PRESENTATION_SESSION", "VERSION", "COMPONENTS_VISIBLE_ON_SCREEN", "DATA_SOURCES", "SHOULD_CLEAR_STATE_PROVIDER_DATA", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplStateBundleKeys {
    public static final int $stable = 0;

    @NotNull
    public static final String COMPONENTS_VISIBLE_ON_SCREEN = "componentsVisibleOnScreen";

    @NotNull
    public static final String DATA_SOURCES = "dataSources";

    @NotNull
    public static final AplStateBundleKeys INSTANCE = new AplStateBundleKeys();

    @NotNull
    public static final String PRESENTATION_SESSION = "presentationSession";

    @NotNull
    public static final String PRESENTATION_TOKEN = "presentationToken";

    @NotNull
    public static final String SHOULD_CLEAR_STATE_PROVIDER_DATA = "shouldClearStateProviderData";

    @NotNull
    public static final String VERSION = "version";

    private AplStateBundleKeys() {
    }
}
