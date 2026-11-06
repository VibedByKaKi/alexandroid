package com.facebook.drawee.backends.pipeline.info;

import com.facebook.fresco.ui.common.ImageLoadStatus;
import com.facebook.fresco.ui.common.ImagePerfData;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.VisibilityState;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class ForwardingImagePerfDataListener implements ImagePerfDataListener {
    private final Collection<ImagePerfDataListener> mListeners;

    public ForwardingImagePerfDataListener(Collection<ImagePerfDataListener> collection) {
        this.mListeners = collection;
    }

    @Override // com.facebook.fresco.ui.common.ImagePerfDataListener
    public void onImageLoadStatusUpdated(ImagePerfData imagePerfData, ImageLoadStatus imageLoadStatus) {
        Iterator<ImagePerfDataListener> it2 = this.mListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onImageLoadStatusUpdated(imagePerfData, imageLoadStatus);
        }
    }

    @Override // com.facebook.fresco.ui.common.ImagePerfDataListener
    public void onImageVisibilityUpdated(ImagePerfData imagePerfData, VisibilityState visibilityState) {
        Iterator<ImagePerfDataListener> it2 = this.mListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onImageVisibilityUpdated(imagePerfData, visibilityState);
        }
    }
}
