package expo.modules.core;

import android.content.Context;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.SingletonModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ModuleRegistryProvider {
    private List<Package> mPackages;

    public ModuleRegistryProvider(List<Package> list) {
        this.mPackages = list;
    }

    public Collection<InternalModule> createInternalModules(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<Package> it2 = getPackages().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().createInternalModules(context));
        }
        return arrayList;
    }

    public Collection<SingletonModule> createSingletonModules(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<Package> it2 = getPackages().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().createSingletonModules(context));
        }
        return arrayList;
    }

    public ModuleRegistry get(Context context) {
        return new ModuleRegistry(createInternalModules(context), createSingletonModules(context));
    }

    public List<Package> getPackages() {
        return this.mPackages;
    }
}
