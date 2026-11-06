package com.amazon.alexa.api.compat.migration.sdk;

import android.content.Context;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.dee.app.contacts.common.constants.Constants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition;", "Lcom/amazon/alexa/api/compat/migration/sdk/SdkPrecondition;", "mode", "Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode;", "<init>", "(Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode;)V", "()V", "featureName", "", "getFeatureName", "()Ljava/lang/String;", "evaluate", "Lcom/amazon/alexa/api/compat/migration/sdk/PreconditionResult;", "evaluateLegacy", "evaluateWeblab", "context", "Landroid/content/Context;", "featureServiceProvider", "Lkotlin/Function0;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "Mode", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FireOsPrecondition implements SdkPrecondition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FEATURE_NAME = "fire-os-gate";

    @NotNull
    public static final String FIREOS_FLAG = "ASSISTANT_SDK_ENABLEMENT_FIREOS";

    @NotNull
    public static final String KH_FLAG = "ASSISTANT_SDK_ENABLEMENT_KH";

    @NotNull
    private static final String TAG = "FireOsPrecondition";

    @NotNull
    public static final String WEBLAB_NAMESPACE = "ALEXA_ENDPOINTS_TRACE_HELIX";

    @NotNull
    private final String featureName;

    @NotNull
    private final Mode mode;

    private FireOsPrecondition(Mode mode) {
        this.mode = mode;
        this.featureName = FEATURE_NAME;
    }

    private final PreconditionResult evaluateLegacy() {
        return FireTabletUtils.isFireOS() ? PreconditionResult.UNSATISFIED : PreconditionResult.SATISFIED;
    }

    private final PreconditionResult evaluateWeblab(Context context, Function0<? extends FeatureServiceV2> featureServiceProvider) {
        return FireTabletUtils.isKHTablet() ? new FeatureFlagPrecondition(featureServiceProvider, WEBLAB_NAMESPACE, KH_FLAG).evaluate() : FireTabletUtils.shouldGrootBeEnabled(context) ? new FeatureFlagPrecondition(featureServiceProvider, WEBLAB_NAMESPACE, FIREOS_FLAG).evaluate() : PreconditionResult.SATISFIED;
    }

    @Override // com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition
    @NotNull
    public PreconditionResult evaluate() {
        Mode mode = this.mode;
        if (mode instanceof Mode.Legacy) {
            return evaluateLegacy();
        }
        if (mode instanceof Mode.Weblab) {
            return evaluateWeblab(((Mode.Weblab) mode).getContext(), ((Mode.Weblab) this.mode).getFeatureServiceProvider());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition
    @NotNull
    public String getFeatureName() {
        return this.featureName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "FEATURE_NAME", "WEBLAB_NAMESPACE", "FIREOS_FLAG", "KH_FLAG", "withWeblabs", "Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition;", "context", "Landroid/content/Context;", "featureServiceProvider", "Lkotlin/Function0;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FireOsPrecondition withWeblabs(@NotNull Context context, @NotNull Function0<? extends FeatureServiceV2> featureServiceProvider) {
            context.getClass();
            featureServiceProvider.getClass();
            return new FireOsPrecondition(new Mode.Weblab(context, featureServiceProvider), null);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode;", "", "<init>", "()V", "Legacy", "Weblab", "Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode$Legacy;", "Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode$Weblab;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Mode {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode$Legacy;", "Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode;", "<init>", "()V", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Legacy extends Mode {

            @NotNull
            public static final Legacy INSTANCE = new Legacy();

            private Legacy() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode$Weblab;", "Lcom/amazon/alexa/api/compat/migration/sdk/FireOsPrecondition$Mode;", "context", "Landroid/content/Context;", "featureServiceProvider", "Lkotlin/Function0;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getContext", "()Landroid/content/Context;", "getFeatureServiceProvider", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Weblab extends Mode {

            @NotNull
            private final Context context;

            @NotNull
            private final Function0<FeatureServiceV2> featureServiceProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Weblab(@NotNull Context context, @NotNull Function0<? extends FeatureServiceV2> function0) {
                super(null);
                context.getClass();
                function0.getClass();
                this.context = context;
                this.featureServiceProvider = function0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Weblab copy$default(Weblab weblab, Context context, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    context = weblab.context;
                }
                if ((i & 2) != 0) {
                    function0 = weblab.featureServiceProvider;
                }
                return weblab.copy(context, function0);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Context getContext() {
                return this.context;
            }

            @NotNull
            public final Function0<FeatureServiceV2> component2() {
                return this.featureServiceProvider;
            }

            @NotNull
            public final Weblab copy(@NotNull Context context, @NotNull Function0<? extends FeatureServiceV2> featureServiceProvider) {
                context.getClass();
                featureServiceProvider.getClass();
                return new Weblab(context, featureServiceProvider);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Weblab)) {
                    return false;
                }
                Weblab weblab = (Weblab) other;
                return Intrinsics.areEqual(this.context, weblab.context) && Intrinsics.areEqual(this.featureServiceProvider, weblab.featureServiceProvider);
            }

            @NotNull
            public final Context getContext() {
                return this.context;
            }

            @NotNull
            public final Function0<FeatureServiceV2> getFeatureServiceProvider() {
                return this.featureServiceProvider;
            }

            public int hashCode() {
                return this.featureServiceProvider.hashCode() + (this.context.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Weblab(context=" + this.context + ", featureServiceProvider=" + this.featureServiceProvider + MarkdownConstants.RIGHT_PARENTHESIS;
            }
        }

        public /* synthetic */ Mode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Mode() {
        }
    }

    public /* synthetic */ FireOsPrecondition(Mode mode, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode);
    }

    public FireOsPrecondition() {
        this(Mode.Legacy.INSTANCE);
    }
}
