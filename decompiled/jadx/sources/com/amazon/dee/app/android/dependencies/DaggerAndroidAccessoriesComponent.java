package com.amazon.dee.app.android.dependencies;

import android.content.Context;
import com.amazon.alexa.accessory.Accessories;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.dee.app.dependencies.AccessoriesAlexaModule;
import com.amazon.dee.app.dependencies.AccessoriesAlexaModule_ProvideAlexaServicesConnectionFactory;
import com.amazon.dee.app.dependencies.AccessoryModule;
import com.amazon.dee.app.dependencies.AccessoryModule_ProvideAccessoriesFactory;
import com.amazon.dee.app.dependencies.AccessoryModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes3.dex */
public final class DaggerAndroidAccessoriesComponent {
    private DaggerAndroidAccessoriesComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private AccessoriesAlexaModule accessoriesAlexaModule;
        private AccessoryModule accessoryModule;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder accessoriesAlexaModule(AccessoriesAlexaModule accessoriesAlexaModule) {
            this.accessoriesAlexaModule = (AccessoriesAlexaModule) Preconditions.checkNotNull(accessoriesAlexaModule);
            return this;
        }

        public Builder accessoryModule(AccessoryModule accessoryModule) {
            this.accessoryModule = (AccessoryModule) Preconditions.checkNotNull(accessoryModule);
            return this;
        }

        public AndroidAccessoriesComponent build() {
            if (this.accessoriesAlexaModule == null) {
                this.accessoriesAlexaModule = new AccessoriesAlexaModule();
            }
            Preconditions.checkBuilderRequirement(this.accessoryModule, AccessoryModule.class);
            return new AndroidAccessoriesComponentImpl(this.accessoriesAlexaModule, this.accessoryModule, 0);
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AndroidAccessoriesComponentImpl implements AndroidAccessoriesComponent {
        private final AndroidAccessoriesComponentImpl androidAccessoriesComponentImpl;
        private Provider<Accessories> provideAccessoriesProvider;
        private Provider<AlexaServicesConnection> provideAlexaServicesConnectionProvider;
        private Provider<Context> provideContextProvider;

        private AndroidAccessoriesComponentImpl(AccessoriesAlexaModule accessoriesAlexaModule, AccessoryModule accessoryModule) {
            this.androidAccessoriesComponentImpl = this;
            initialize(accessoriesAlexaModule, accessoryModule);
        }

        private void initialize(AccessoriesAlexaModule accessoriesAlexaModule, AccessoryModule accessoryModule) {
            AccessoryModule_ProvideContextFactory create = AccessoryModule_ProvideContextFactory.create(accessoryModule);
            this.provideContextProvider = create;
            Provider<AlexaServicesConnection> provider = DoubleCheck.provider(AccessoriesAlexaModule_ProvideAlexaServicesConnectionFactory.create(accessoriesAlexaModule, create));
            this.provideAlexaServicesConnectionProvider = provider;
            this.provideAccessoriesProvider = DoubleCheck.provider(AccessoryModule_ProvideAccessoriesFactory.create(accessoryModule, this.provideContextProvider, provider));
        }

        @Override // com.amazon.dee.app.dependencies.AccessoriesComponent
        public Accessories accessories() {
            return this.provideAccessoriesProvider.get();
        }

        public /* synthetic */ AndroidAccessoriesComponentImpl(AccessoriesAlexaModule accessoriesAlexaModule, AccessoryModule accessoryModule, int i) {
            this(accessoriesAlexaModule, accessoryModule);
        }
    }
}
