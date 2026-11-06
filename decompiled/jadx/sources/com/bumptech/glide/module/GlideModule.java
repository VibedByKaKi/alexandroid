package com.bumptech.glide.module;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public interface GlideModule extends RegistersComponents, AppliesOptions {
    @Override // com.bumptech.glide.module.AppliesOptions
    /* synthetic */ void applyOptions(Context context, GlideBuilder glideBuilder);

    @Override // com.bumptech.glide.module.RegistersComponents
    /* synthetic */ void registerComponents(Context context, Glide glide, Registry registry);
}
