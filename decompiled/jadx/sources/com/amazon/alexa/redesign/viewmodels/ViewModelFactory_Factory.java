package com.amazon.alexa.redesign.viewmodels;

import androidx.lifecycle.ViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
    private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

    public ViewModelFactory_Factory(Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> provider) {
        this.creatorsProvider = provider;
    }

    public static ViewModelFactory_Factory create(Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> provider) {
        return new ViewModelFactory_Factory(provider);
    }

    public static ViewModelFactory newInstance(Map<Class<? extends ViewModel>, Provider<ViewModel>> map) {
        return new ViewModelFactory(map);
    }

    @Override // javax.inject.Provider
    public ViewModelFactory get() {
        return newInstance(this.creatorsProvider.get());
    }
}
