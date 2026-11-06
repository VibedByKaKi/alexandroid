package com.amazon.alexa.smarthomecameras.view;

import com.amazon.alexa.smarthomecameras.dependencies.components.SmartAlertEventComponent;
import com.amazon.alexa.smarthomecameras.dependencies.modules.SmartAlertEventModule;
import com.amazon.alexa.smarthomecameras.view.SmartAlertEventViewController;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class DaggerSmartAlertEventViewController_Injector implements SmartAlertEventViewController.Injector {
    public /* synthetic */ DaggerSmartAlertEventViewController_Injector(SmartAlertEventComponent smartAlertEventComponent, int i) {
        this(smartAlertEventComponent);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private SmartAlertEventComponent smartAlertEventComponent;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public SmartAlertEventViewController.Injector build() {
            Preconditions.checkBuilderRequirement(this.smartAlertEventComponent, SmartAlertEventComponent.class);
            return new DaggerSmartAlertEventViewController_Injector(this.smartAlertEventComponent, 0);
        }

        public Builder smartAlertEventComponent(SmartAlertEventComponent smartAlertEventComponent) {
            this.smartAlertEventComponent = (SmartAlertEventComponent) Preconditions.checkNotNull(smartAlertEventComponent);
            return this;
        }

        @Deprecated
        public Builder smartAlertEventModule(SmartAlertEventModule smartAlertEventModule) {
            Preconditions.checkNotNull(smartAlertEventModule);
            return this;
        }

        private Builder() {
        }
    }

    private DaggerSmartAlertEventViewController_Injector(SmartAlertEventComponent smartAlertEventComponent) {
    }

    @Override // com.amazon.alexa.smarthomecameras.view.SmartAlertEventViewController.Injector
    public void inject(SmartAlertEventViewController smartAlertEventViewController) {
    }
}
