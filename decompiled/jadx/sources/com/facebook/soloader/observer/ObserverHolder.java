package com.facebook.soloader.observer;

import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class ObserverHolder {
    private static final AtomicReference<Observer[]> sObservers = new AtomicReference<>();

    public static void addObserver(Observer observer) {
        Observer[] observerArr;
        while (true) {
            AtomicReference<Observer[]> atomicReference = sObservers;
            Observer[] observerArr2 = atomicReference.get();
            if (observerArr2 == null) {
                observerArr = new Observer[]{observer};
            } else {
                observerArr = new Observer[observerArr2.length + 1];
                System.arraycopy(observerArr2, 0, observerArr, 0, observerArr2.length);
                observerArr[observerArr2.length] = observer;
            }
            while (!atomicReference.compareAndSet(observerArr2, observerArr)) {
                if (atomicReference.get() != observerArr2) {
                    break;
                }
            }
            return;
        }
    }

    public static void onGetDependenciesEnd(@Nullable Throwable th) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onGetDependenciesEnd(th);
            }
        }
    }

    public static void onGetDependenciesStart() {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onGetDependenciesStart();
            }
        }
    }

    public static void onLoadDependencyEnd(@Nullable Throwable th, boolean z) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadDependencyEnd(th, z);
            }
        }
    }

    public static void onLoadDependencyStart(String str, int i) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadDependencyStart(str, i);
            }
        }
    }

    public static void onLoadLibraryEnd(@Nullable Throwable th, boolean z) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadLibraryEnd(th, z);
            }
        }
    }

    public static void onLoadLibraryStart(String str, @Nullable String str2, int i) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadLibraryStart(str, str2, i);
            }
        }
    }

    public static void onRecoveryEnd(@Nullable Throwable th) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onRecoveryEnd(th);
            }
        }
    }

    public static void onRecoveryStart(RecoveryStrategy recoveryStrategy) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onRecoveryStart(recoveryStrategy);
            }
        }
    }

    public static void onSoFileLoaderLoadEnd(@Nullable Throwable th) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoFileLoaderLoadEnd(th);
            }
        }
    }

    public static void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoFileLoaderLoadStart(soFileLoader, str, i);
            }
        }
    }

    public static void onSoSourceLoadLibraryEnd(@Nullable Throwable th) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoSourceLoadLibraryEnd(th);
            }
        }
    }

    public static void onSoSourceLoadLibraryStart(SoSource soSource) {
        Observer[] observerArr = sObservers.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoSourceLoadLibraryStart(soSource);
            }
        }
    }

    public static void resetObserversForTestsOnly() {
        sObservers.set(null);
    }
}
