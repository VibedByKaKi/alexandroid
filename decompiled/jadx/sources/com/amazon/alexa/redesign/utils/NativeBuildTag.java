package com.amazon.alexa.redesign.utils;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.ui.appcomponent.AlexaAppUIComponent;
import com.amazon.dee.app.storage.BobDispatchEndpointContentProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/redesign/utils/NativeBuildTag;", "", "<init>", "()V", com.dee.app.contacts.common.constants.Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "current", "forBuildType", "buildType", "", "forBuildType$AlexaMobileAndroidHomeChannel_release", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeBuildTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeBuildTag.kt\ncom/amazon/alexa/redesign/utils/NativeBuildTag\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes19.dex */
public final class NativeBuildTag {
    public static final int $stable = 0;

    @NotNull
    public static final NativeBuildTag INSTANCE = new NativeBuildTag();
    private static final String TAG = "NativeBuildTag";

    private NativeBuildTag() {
    }

    @Nullable
    public final String current() {
        Object m25294constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(forBuildType$AlexaMobileAndroidHomeChannel_release(((AlexaAppUIComponent) ComponentRegistry.getInstance().get(AlexaAppUIComponent.class).get()).getGlobalHeaderBuilder().build().getBuildType()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Log.w(TAG, "build type unavailable; sending no build tag", m25297exceptionOrNullimpl);
        }
        if (Result.m25300isFailureimpl(m25294constructorimpl)) {
            m25294constructorimpl = null;
        }
        return (String) m25294constructorimpl;
    }

    @VisibleForTesting
    @Nullable
    public final String forBuildType$AlexaMobileAndroidHomeChannel_release(int buildType) {
        if (buildType == 0) {
            return "DEV";
        }
        if (buildType == 1) {
            return "BETA";
        }
        if (buildType != 2) {
            return null;
        }
        return BobDispatchEndpointContentProvider.PROD;
    }
}
