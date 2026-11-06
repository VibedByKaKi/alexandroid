package com.bumptech.glide.request;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.target.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public abstract class ExperimentalRequestListener<ResourceT> implements RequestListener<ResourceT> {
    public abstract boolean onResourceReady(ResourceT resourcet, Object obj, Target<ResourceT> target, DataSource dataSource, boolean z, boolean z2);

    public void onRequestStarted(Object obj) {
    }
}
