package expo.modules.adapters.react;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ModuleRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private ModuleRegistry mModuleRegistry;

    public ModuleRegistryReadyNotifier(ModuleRegistry moduleRegistry) {
        this.mModuleRegistry = moduleRegistry;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mModuleRegistry.ensureIsInitialized();
    }
}
