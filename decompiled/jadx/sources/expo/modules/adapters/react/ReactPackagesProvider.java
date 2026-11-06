package expo.modules.adapters.react;

import com.facebook.react.ReactPackage;
import expo.modules.core.interfaces.InternalModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReactPackagesProvider implements InternalModule {
    private Collection<ReactPackage> mReactPackages = new ArrayList();

    public void addPackage(ReactPackage reactPackage) {
        this.mReactPackages.add(reactPackage);
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<? extends Class> getExportedInterfaces() {
        return Collections.singletonList(ReactPackagesProvider.class);
    }

    public Collection<ReactPackage> getReactPackages() {
        return this.mReactPackages;
    }
}
