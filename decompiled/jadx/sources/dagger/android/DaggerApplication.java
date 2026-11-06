package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class DaggerApplication extends Application implements HasAndroidInjector {

    @Inject
    volatile DispatchingAndroidInjector<Object> androidInjector;

    private void injectIfNecessary() {
        if (this.androidInjector == null) {
            synchronized (this) {
                try {
                    if (this.androidInjector == null) {
                        applicationInjector().inject(this);
                        if (this.androidInjector == null) {
                            throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // dagger.android.HasAndroidInjector
    public AndroidInjector<Object> androidInjector() {
        injectIfNecessary();
        return this.androidInjector;
    }

    @ForOverride
    public abstract AndroidInjector<? extends DaggerApplication> applicationInjector();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        injectIfNecessary();
    }
}
