package com.amazon.alexa.redesign.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B0\b\u0007\u0012%\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003¢\u0006\u0002\b\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0004H\u0016¢\u0006\u0002\u0010\rR-\u0010\u0002\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/redesign/viewmodels/ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "creators", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljava/util/Map;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    private final Map<Class<? extends ViewModel>, Provider<ViewModel>> creators;

    @Inject
    public ViewModelFactory(@NotNull Map<Class<? extends ViewModel>, Provider<ViewModel>> map) {
        map.getClass();
        this.creators = map;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        modelClass.getClass();
        Provider<ViewModel> provider = this.creators.get(modelClass);
        if (provider == null) {
            Iterator<Map.Entry<Class<? extends ViewModel>, Provider<ViewModel>>> it2 = this.creators.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<Class<? extends ViewModel>, Provider<ViewModel>> next = it2.next();
                Class<? extends ViewModel> key = next.getKey();
                Provider<ViewModel> value = next.getValue();
                if (modelClass.isAssignableFrom(key)) {
                    provider = value;
                    break;
                }
            }
        }
        if (provider == null) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown model class ", modelClass));
            return null;
        }
        try {
            ViewModel viewModel = provider.get();
            viewModel.getClass();
            return (T) viewModel;
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
