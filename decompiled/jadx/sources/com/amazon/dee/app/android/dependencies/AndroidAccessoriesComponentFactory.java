package com.amazon.dee.app.android.dependencies;

import android.app.Application;
import com.amazon.dee.app.dependencies.AccessoriesComponent;
import com.amazon.dee.app.dependencies.AccessoriesComponentFactory;
import com.amazon.dee.app.dependencies.AccessoryModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class AndroidAccessoriesComponentFactory implements AccessoriesComponentFactory {
    @Override // com.amazon.dee.app.dependencies.AccessoriesComponentFactory
    public AccessoriesComponent create(Application application) {
        return DaggerAndroidAccessoriesComponent.builder().accessoryModule(new AccessoryModule(application)).build();
    }
}
