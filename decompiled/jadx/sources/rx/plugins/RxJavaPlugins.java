package rx.plugins;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.annotations.Experimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class RxJavaPlugins {
    private static final RxJavaPlugins INSTANCE = new RxJavaPlugins();
    static final RxJavaErrorHandler DEFAULT_ERROR_HANDLER = new RxJavaErrorHandler() { // from class: rx.plugins.RxJavaPlugins.1
    };
    private final AtomicReference<RxJavaErrorHandler> errorHandler = new AtomicReference<>();
    private final AtomicReference<RxJavaObservableExecutionHook> observableExecutionHook = new AtomicReference<>();
    private final AtomicReference<RxJavaSingleExecutionHook> singleExecutionHook = new AtomicReference<>();
    private final AtomicReference<RxJavaCompletableExecutionHook> completableExecutionHook = new AtomicReference<>();
    private final AtomicReference<RxJavaSchedulersHook> schedulersHook = new AtomicReference<>();

    @Deprecated
    public static RxJavaPlugins getInstance() {
        return INSTANCE;
    }

    public static Object getPluginImplementationViaProperty(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            Iterator it2 = properties2.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String m = a$$ExternalSyntheticOutline0.m("rxjava.plugin.", obj.substring(0, obj.length() - 6).substring(14), ".impl");
                    String property2 = properties2.getProperty(m);
                    if (property2 == null) {
                        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Implementing class declaration for ", simpleName, " missing: ", m));
                        return null;
                    }
                    property = property2;
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            Single$$ExternalSyntheticBUOutline0.m$1(ParcelCompat$$ExternalSyntheticOutline0.m(simpleName, " implementation is not an instance of ", simpleName, ": ", property), e);
            return null;
        } catch (ClassNotFoundException e2) {
            Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m$1(simpleName, " implementation class not found: ", property), e2);
            return null;
        } catch (IllegalAccessException e3) {
            Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m$1(simpleName, " implementation not able to be accessed: ", property), e3);
            return null;
        } catch (InstantiationException e4) {
            Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m$1(simpleName, " implementation not able to be instantiated: ", property), e4);
            return null;
        }
    }

    @Experimental
    public RxJavaCompletableExecutionHook getCompletableExecutionHook() {
        if (this.completableExecutionHook.get() == null) {
            Object pluginImplementationViaProperty = getPluginImplementationViaProperty(RxJavaCompletableExecutionHook.class, System.getProperties());
            AtomicReference<RxJavaCompletableExecutionHook> atomicReference = this.completableExecutionHook;
            if (pluginImplementationViaProperty == null) {
                RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook = new RxJavaCompletableExecutionHook() { // from class: rx.plugins.RxJavaPlugins.2
                };
                while (!atomicReference.compareAndSet(null, rxJavaCompletableExecutionHook) && atomicReference.get() == null) {
                }
            } else {
                RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook2 = (RxJavaCompletableExecutionHook) pluginImplementationViaProperty;
                while (!atomicReference.compareAndSet(null, rxJavaCompletableExecutionHook2) && atomicReference.get() == null) {
                }
            }
        }
        return this.completableExecutionHook.get();
    }

    public RxJavaErrorHandler getErrorHandler() {
        if (this.errorHandler.get() == null) {
            Object pluginImplementationViaProperty = getPluginImplementationViaProperty(RxJavaErrorHandler.class, System.getProperties());
            AtomicReference<RxJavaErrorHandler> atomicReference = this.errorHandler;
            if (pluginImplementationViaProperty == null) {
                RxJavaErrorHandler rxJavaErrorHandler = DEFAULT_ERROR_HANDLER;
                while (!atomicReference.compareAndSet(null, rxJavaErrorHandler) && atomicReference.get() == null) {
                }
            } else {
                RxJavaErrorHandler rxJavaErrorHandler2 = (RxJavaErrorHandler) pluginImplementationViaProperty;
                while (!atomicReference.compareAndSet(null, rxJavaErrorHandler2) && atomicReference.get() == null) {
                }
            }
        }
        return this.errorHandler.get();
    }

    public RxJavaObservableExecutionHook getObservableExecutionHook() {
        if (this.observableExecutionHook.get() == null) {
            Object pluginImplementationViaProperty = getPluginImplementationViaProperty(RxJavaObservableExecutionHook.class, System.getProperties());
            AtomicReference<RxJavaObservableExecutionHook> atomicReference = this.observableExecutionHook;
            if (pluginImplementationViaProperty == null) {
                RxJavaObservableExecutionHook rxJavaObservableExecutionHookDefault = RxJavaObservableExecutionHookDefault.getInstance();
                while (!atomicReference.compareAndSet(null, rxJavaObservableExecutionHookDefault) && atomicReference.get() == null) {
                }
            } else {
                RxJavaObservableExecutionHook rxJavaObservableExecutionHook = (RxJavaObservableExecutionHook) pluginImplementationViaProperty;
                while (!atomicReference.compareAndSet(null, rxJavaObservableExecutionHook) && atomicReference.get() == null) {
                }
            }
        }
        return this.observableExecutionHook.get();
    }

    public RxJavaSchedulersHook getSchedulersHook() {
        if (this.schedulersHook.get() == null) {
            Object pluginImplementationViaProperty = getPluginImplementationViaProperty(RxJavaSchedulersHook.class, System.getProperties());
            AtomicReference<RxJavaSchedulersHook> atomicReference = this.schedulersHook;
            if (pluginImplementationViaProperty == null) {
                RxJavaSchedulersHook defaultInstance = RxJavaSchedulersHook.getDefaultInstance();
                while (!atomicReference.compareAndSet(null, defaultInstance) && atomicReference.get() == null) {
                }
            } else {
                RxJavaSchedulersHook rxJavaSchedulersHook = (RxJavaSchedulersHook) pluginImplementationViaProperty;
                while (!atomicReference.compareAndSet(null, rxJavaSchedulersHook) && atomicReference.get() == null) {
                }
            }
        }
        return this.schedulersHook.get();
    }

    public RxJavaSingleExecutionHook getSingleExecutionHook() {
        if (this.singleExecutionHook.get() == null) {
            Object pluginImplementationViaProperty = getPluginImplementationViaProperty(RxJavaSingleExecutionHook.class, System.getProperties());
            AtomicReference<RxJavaSingleExecutionHook> atomicReference = this.singleExecutionHook;
            if (pluginImplementationViaProperty == null) {
                RxJavaSingleExecutionHook rxJavaSingleExecutionHookDefault = RxJavaSingleExecutionHookDefault.getInstance();
                while (!atomicReference.compareAndSet(null, rxJavaSingleExecutionHookDefault) && atomicReference.get() == null) {
                }
            } else {
                RxJavaSingleExecutionHook rxJavaSingleExecutionHook = (RxJavaSingleExecutionHook) pluginImplementationViaProperty;
                while (!atomicReference.compareAndSet(null, rxJavaSingleExecutionHook) && atomicReference.get() == null) {
                }
            }
        }
        return this.singleExecutionHook.get();
    }

    @Experimental
    public void registerCompletableExecutionHook(RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook) {
        AtomicReference<RxJavaCompletableExecutionHook> atomicReference = this.completableExecutionHook;
        while (!atomicReference.compareAndSet(null, rxJavaCompletableExecutionHook)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m(this.singleExecutionHook.get(), "Another strategy was already registered: ");
                return;
            }
        }
    }

    public void registerErrorHandler(RxJavaErrorHandler rxJavaErrorHandler) {
        AtomicReference<RxJavaErrorHandler> atomicReference = this.errorHandler;
        while (!atomicReference.compareAndSet(null, rxJavaErrorHandler)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m(this.errorHandler.get(), "Another strategy was already registered: ");
                return;
            }
        }
    }

    public void registerObservableExecutionHook(RxJavaObservableExecutionHook rxJavaObservableExecutionHook) {
        AtomicReference<RxJavaObservableExecutionHook> atomicReference = this.observableExecutionHook;
        while (!atomicReference.compareAndSet(null, rxJavaObservableExecutionHook)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m(this.observableExecutionHook.get(), "Another strategy was already registered: ");
                return;
            }
        }
    }

    public void registerSchedulersHook(RxJavaSchedulersHook rxJavaSchedulersHook) {
        AtomicReference<RxJavaSchedulersHook> atomicReference = this.schedulersHook;
        while (!atomicReference.compareAndSet(null, rxJavaSchedulersHook)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m(this.schedulersHook.get(), "Another strategy was already registered: ");
                return;
            }
        }
    }

    public void registerSingleExecutionHook(RxJavaSingleExecutionHook rxJavaSingleExecutionHook) {
        AtomicReference<RxJavaSingleExecutionHook> atomicReference = this.singleExecutionHook;
        while (!atomicReference.compareAndSet(null, rxJavaSingleExecutionHook)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m(this.singleExecutionHook.get(), "Another strategy was already registered: ");
                return;
            }
        }
    }

    @Experimental
    public void reset() {
        RxJavaPlugins rxJavaPlugins = INSTANCE;
        rxJavaPlugins.errorHandler.set(null);
        rxJavaPlugins.observableExecutionHook.set(null);
        rxJavaPlugins.singleExecutionHook.set(null);
        rxJavaPlugins.completableExecutionHook.set(null);
        rxJavaPlugins.schedulersHook.set(null);
    }
}
