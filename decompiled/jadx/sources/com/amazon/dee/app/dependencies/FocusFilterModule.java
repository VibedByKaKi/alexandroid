package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.accessory.notificationpublisher.FocusFilterInitializer;
import com.dee.app.data.DefaultElementLocalStorage;
import com.dee.app.data.api.ElementLocalStorage;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.Objects;
import javax.inject.Named;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class FocusFilterModule {
    @Provides
    @ApplicationScope
    public FocusFilterInitializer provideFocusFilterInitializer(Context context, Lazy<OkHttpClient> lazy, @Named("dataStore") final Lazy<DefaultElementLocalStorage> lazy2) {
        Objects.requireNonNull(lazy2);
        return new FocusFilterInitializer(context, lazy, new Lazy() { // from class: com.amazon.dee.app.dependencies.FocusFilterModule$$ExternalSyntheticLambda0
            @Override // dagger.Lazy
            public final Object get() {
                return (ElementLocalStorage) Lazy.this.get();
            }
        });
    }
}
