package com.amazon.alexa.accessory.frames.media.viewer;

import com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView;
import com.amazon.alexa.accessory.frames.media.viewer.MediaPagerAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaPagerAdapter$$ExternalSyntheticLambda0 implements MediaDisplayView.OnZoomChangedListener, MediaDisplayView.OnMediaLoadedListener, MediaDisplayView.OnSingleTapListener {
    public final /* synthetic */ MediaPagerAdapter f$0;
    public final /* synthetic */ MediaPagerAdapter.MediaViewHolder f$1;

    public /* synthetic */ MediaPagerAdapter$$ExternalSyntheticLambda0(MediaPagerAdapter mediaPagerAdapter, MediaPagerAdapter.MediaViewHolder mediaViewHolder) {
        this.f$0 = mediaPagerAdapter;
        this.f$1 = mediaViewHolder;
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView.OnMediaLoadedListener
    public void onMediaLoaded() {
        this.f$0.lambda$onBindViewHolder$0(this.f$1);
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView.OnSingleTapListener
    public void onSingleTap() {
        this.f$0.lambda$onBindViewHolder$1(this.f$1);
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView.OnZoomChangedListener
    public void onZoomChanged(boolean z) {
        this.f$0.lambda$onViewAttachedToWindow$2(this.f$1, z);
    }
}
