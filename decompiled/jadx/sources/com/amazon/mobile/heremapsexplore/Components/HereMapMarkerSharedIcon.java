package com.amazon.mobile.heremapsexplore.Components;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class HereMapMarkerSharedIcon {
    private Bitmap icon;
    private Set<HereMapMarker> markers = Collections.newSetFromMap(new WeakHashMap());
    private boolean loadImageStarted = false;

    public static String generateIconKey(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + "#");
        for (Object obj : map.keySet()) {
            sb.append(obj + ":" + map.get(obj).toString() + "#");
        }
        return sb.toString();
    }

    public synchronized void addMarker(HereMapMarker hereMapMarker) {
        this.markers.add(hereMapMarker);
        Bitmap bitmap = this.icon;
        if (bitmap != null) {
            hereMapMarker.setIcon(bitmap);
        }
    }

    public synchronized boolean containsMarker(HereMapMarker hereMapMarker) {
        return this.markers.contains(hereMapMarker);
    }

    public synchronized void doneLoadingImage() {
        this.loadImageStarted = true;
    }

    public synchronized boolean hasMarker() {
        return !this.markers.isEmpty();
    }

    public synchronized void removeMarker(HereMapMarker hereMapMarker) {
        this.markers.remove(hereMapMarker);
    }

    public synchronized boolean shouldLoadImage() {
        return !this.loadImageStarted;
    }

    public synchronized void updateIcon(Bitmap bitmap) {
        this.icon = bitmap;
        if (this.markers.isEmpty()) {
            return;
        }
        for (HereMapMarker hereMapMarker : this.markers) {
            if (hereMapMarker != null) {
                hereMapMarker.setIcon(bitmap);
            }
        }
    }
}
