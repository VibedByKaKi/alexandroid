package expo.modules.core;

import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.RegistryLifecycleListener;
import expo.modules.core.interfaces.SingletonModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ModuleRegistry {
    private final Map<Class, InternalModule> mInternalModulesMap = new HashMap();
    private final Map<String, SingletonModule> mSingletonModulesMap = new HashMap();
    private final List<WeakReference<RegistryLifecycleListener>> mExtraRegistryLifecycleListeners = new ArrayList();
    private volatile boolean mIsInitialized = false;

    public ModuleRegistry(Collection<InternalModule> collection, Collection<SingletonModule> collection2) {
        Iterator<InternalModule> it2 = collection.iterator();
        while (it2.hasNext()) {
            registerInternalModule(it2.next());
        }
        Iterator<SingletonModule> it3 = collection2.iterator();
        while (it3.hasNext()) {
            registerSingletonModule(it3.next());
        }
    }

    public synchronized void ensureIsInitialized() {
        if (!this.mIsInitialized) {
            initialize();
            this.mIsInitialized = true;
        }
    }

    public <T> T getModule(Class<T> cls) {
        return (T) this.mInternalModulesMap.get(cls);
    }

    public <T> T getSingletonModule(String str, Class<T> cls) {
        return (T) this.mSingletonModulesMap.get(str);
    }

    public void initialize() {
        ArrayList arrayList = new ArrayList(this.mInternalModulesMap.values());
        Iterator<WeakReference<RegistryLifecycleListener>> it2 = this.mExtraRegistryLifecycleListeners.iterator();
        while (it2.hasNext()) {
            RegistryLifecycleListener registryLifecycleListener = it2.next().get();
            if (registryLifecycleListener != null) {
                arrayList.add(registryLifecycleListener);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((RegistryLifecycleListener) it3.next()).onCreate(this);
        }
    }

    public void onDestroy() {
        ArrayList arrayList = new ArrayList(this.mInternalModulesMap.values());
        Iterator<WeakReference<RegistryLifecycleListener>> it2 = this.mExtraRegistryLifecycleListeners.iterator();
        while (it2.hasNext()) {
            RegistryLifecycleListener registryLifecycleListener = it2.next().get();
            if (registryLifecycleListener != null) {
                arrayList.add(registryLifecycleListener);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((RegistryLifecycleListener) it3.next()).onDestroy();
        }
    }

    public void registerExtraListener(RegistryLifecycleListener registryLifecycleListener) {
        this.mExtraRegistryLifecycleListeners.add(new WeakReference<>(registryLifecycleListener));
    }

    public void registerInternalModule(InternalModule internalModule) {
        Iterator<? extends Class> it2 = internalModule.getExportedInterfaces().iterator();
        while (it2.hasNext()) {
            this.mInternalModulesMap.put(it2.next(), internalModule);
        }
    }

    public void registerSingletonModule(SingletonModule singletonModule) {
        this.mSingletonModulesMap.put(singletonModule.getName(), singletonModule);
    }

    public InternalModule unregisterInternalModule(Class cls) {
        return this.mInternalModulesMap.remove(cls);
    }
}
