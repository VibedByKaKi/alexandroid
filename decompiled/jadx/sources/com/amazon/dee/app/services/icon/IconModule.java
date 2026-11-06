package com.amazon.dee.app.services.icon;

import com.amazon.dee.app.dependencies.ApplicationScope;
import dagger.Binds;
import dagger.Module;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public abstract class IconModule {
    @Binds
    @ApplicationScope
    public abstract AppIconInitializer bindAppIconInitializer(DefaultAppIconInitializer defaultAppIconInitializer);
}
