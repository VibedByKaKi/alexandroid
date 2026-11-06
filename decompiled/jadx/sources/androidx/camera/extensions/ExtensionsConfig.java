package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class ExtensionsConfig implements CameraConfig {
    public static final Config.Option<Integer> OPTION_EXTENSION_MODE = Config.Option.create("camerax.extensions.extensionMode", Integer.TYPE);
    private final Config mConfig;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder implements CameraConfig.Builder<Builder> {
        private final MutableOptionsBundle mConfig = MutableOptionsBundle.create();

        public ExtensionsConfig build() {
            return new ExtensionsConfig(this.mConfig);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setCaptureProcessProgressSupported(boolean z) {
            this.mConfig.insertOption(CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setCompatibilityId(@NonNull Identifier identifier) {
            this.mConfig.insertOption(CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        public Builder setExtensionMode(int i) {
            this.mConfig.insertOption(ExtensionsConfig.OPTION_EXTENSION_MODE, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setPostviewSupported(boolean z) {
            this.mConfig.insertOption(CameraConfig.OPTION_POSTVIEW_SUPPORTED, Boolean.valueOf(z));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setSessionProcessor(@NonNull SessionProcessor sessionProcessor) {
            this.mConfig.insertOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setUseCaseCombinationRequiredRule(int i) {
            this.mConfig.insertOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setUseCaseConfigFactory(@NonNull UseCaseConfigFactory useCaseConfigFactory) {
            this.mConfig.insertOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setZslDisabled(boolean z) {
            this.mConfig.insertOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }
    }

    public ExtensionsConfig(Config config) {
        this.mConfig = config;
    }

    @Override // androidx.camera.core.impl.CameraConfig
    @NonNull
    public Identifier getCompatibilityId() {
        return (Identifier) retrieveOption(CameraConfig.OPTION_COMPATIBILITY_ID);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    public int getExtensionMode() {
        return ((Integer) retrieveOption(OPTION_EXTENSION_MODE)).intValue();
    }
}
