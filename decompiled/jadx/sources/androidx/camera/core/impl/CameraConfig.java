package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface CameraConfig extends ReadableConfig {
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;
    public static final Config.Option<UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = Config.Option.create("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class);
    public static final Config.Option<Identifier> OPTION_COMPATIBILITY_ID = Config.Option.create("camerax.core.camera.compatibilityId", Identifier.class);
    public static final Config.Option<Integer> OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = Config.Option.create("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final Config.Option<SessionProcessor> OPTION_SESSION_PROCESSOR = Config.Option.create("camerax.core.camera.SessionProcessor", SessionProcessor.class);
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.camera.isZslDisabled", Boolean.class);
    public static final Config.Option<Boolean> OPTION_POSTVIEW_SUPPORTED = Config.Option.create("camerax.core.camera.isPostviewSupported", Boolean.class);
    public static final Config.Option<Boolean> OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED = Config.Option.create("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Builder<B> {
        B setCaptureProcessProgressSupported(boolean z);

        @NonNull
        B setCompatibilityId(@NonNull Identifier identifier);

        B setPostviewSupported(boolean z);

        @NonNull
        B setSessionProcessor(@NonNull SessionProcessor sessionProcessor);

        @NonNull
        B setUseCaseCombinationRequiredRule(int i);

        @NonNull
        B setUseCaseConfigFactory(@NonNull UseCaseConfigFactory useCaseConfigFactory);

        @NonNull
        B setZslDisabled(boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    @NonNull
    Identifier getCompatibilityId();

    @Nullable
    default SessionProcessor getSessionProcessor(@Nullable SessionProcessor sessionProcessor) {
        return (SessionProcessor) retrieveOption(OPTION_SESSION_PROCESSOR, sessionProcessor);
    }

    default int getUseCaseCombinationRequiredRule() {
        return ((Integer) retrieveOption(OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    @NonNull
    default UseCaseConfigFactory getUseCaseConfigFactory() {
        return (UseCaseConfigFactory) retrieveOption(OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
    }

    default boolean isCaptureProcessProgressSupported() {
        return ((Boolean) retrieveOption(OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, Boolean.FALSE)).booleanValue();
    }

    default boolean isPostviewSupported() {
        return ((Boolean) retrieveOption(OPTION_POSTVIEW_SUPPORTED, Boolean.FALSE)).booleanValue();
    }

    @NonNull
    default SessionProcessor getSessionProcessor() {
        return (SessionProcessor) retrieveOption(OPTION_SESSION_PROCESSOR);
    }
}
