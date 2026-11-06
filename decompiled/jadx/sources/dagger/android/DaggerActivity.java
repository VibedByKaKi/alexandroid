package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class DaggerActivity extends Activity implements HasAndroidInjector {

    @Inject
    DispatchingAndroidInjector<Object> androidInjector;

    @Override // dagger.android.HasAndroidInjector
    public AndroidInjector<Object> androidInjector() {
        return this.androidInjector;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        AndroidInjection.inject(this);
        super.onCreate(bundle);
    }
}
