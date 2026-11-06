package com.amazon.alexa.apl.context;

import com.amazon.alexa.api.AplState;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AplStateBundleKeys;
import com.amazon.alexa.apl.payload.PresentationSession;
import com.amazon.alexa.apl.sdk.AlexaClientSdkApis;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/apl/context/AplStateReporter;", "", "alexaClientSdkApis", "Lcom/amazon/alexa/apl/sdk/AlexaClientSdkApis;", "(Lcom/amazon/alexa/apl/sdk/AlexaClientSdkApis;)V", "clearContext", "", "reportAplState", "mPresentationToken", "", "mPresentationSession", "Lcom/amazon/alexa/apl/payload/PresentationSession;", AplStateBundleKeys.COMPONENTS_VISIBLE_ON_SCREEN, "Lorg/json/JSONObject;", AplStateBundleKeys.DATA_SOURCES, "Lorg/json/JSONArray;", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplStateReporter {
    private static final String TAG = "AplStateReporter";

    @NotNull
    private static final String VERSION_NAME = "MobileSDK-APL-1.0";

    @NotNull
    private final AlexaClientSdkApis alexaClientSdkApis;

    @Inject
    public AplStateReporter(@NotNull AlexaClientSdkApis alexaClientSdkApis) {
        alexaClientSdkApis.getClass();
        this.alexaClientSdkApis = alexaClientSdkApis;
    }

    public final void clearContext() {
        AplState build = AplState.builder().setShouldClearStateProviderData(true).build();
        AlexaClientSdkApis alexaClientSdkApis = this.alexaClientSdkApis;
        build.getClass();
        alexaClientSdkApis.reportAplState(build);
    }

    public final void reportAplState(@NotNull String mPresentationToken, @NotNull PresentationSession mPresentationSession, @Nullable JSONObject componentsVisibleOnScreen, @Nullable JSONArray dataSources) {
        mPresentationToken.getClass();
        mPresentationSession.getClass();
        AplState.Builder presentationSession = AplState.builder().setVersion(VERSION_NAME).setPresentationToken(mPresentationToken).setShouldClearStateProviderData(false).setPresentationSession(mPresentationSession.toJson().toString());
        if (componentsVisibleOnScreen != null) {
            presentationSession.setComponentsVisibleOnScreen(componentsVisibleOnScreen.toString());
        }
        if (dataSources != null && dataSources.length() > 0) {
            presentationSession.setDataSources(dataSources.toString());
        }
        AlexaClientSdkApis alexaClientSdkApis = this.alexaClientSdkApis;
        AplState build = presentationSession.build();
        build.getClass();
        alexaClientSdkApis.reportAplState(build);
    }
}
