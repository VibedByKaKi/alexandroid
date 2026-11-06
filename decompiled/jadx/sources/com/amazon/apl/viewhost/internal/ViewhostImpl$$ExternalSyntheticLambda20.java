package com.amazon.apl.viewhost.internal;

import android.app.Activity;
import com.amazon.apl.viewhost.Viewhost;
import com.amazon.dee.app.elements.bridges.BiometricsDelegate;
import com.facebook.react.bridge.Promise;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewhostImpl$$ExternalSyntheticLambda20 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda20(ViewhostImpl viewhostImpl, String str, String str2, Map map, boolean z, Viewhost.ExtensionEventHandlerCallback extensionEventHandlerCallback) {
        this.f$0 = viewhostImpl;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = map;
        this.f$4 = z;
        this.f$5 = extensionEventHandlerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ViewhostImpl) this.f$0).lambda$invokeExtensionEventHandler$13((String) this.f$1, (String) this.f$2, (Map) this.f$3, this.f$4, (Viewhost.ExtensionEventHandlerCallback) this.f$5);
                break;
            case 1:
                ((BiometricsDelegate) this.f$0).lambda$authenticateWithOptions$0((Promise) this.f$3, (Activity) this.f$5, this.f$4, (String) this.f$1, (String) this.f$2);
                break;
            default:
                ((MediaSourceEventListener.EventDispatcher) this.f$0).lambda$loadError$3((MediaSourceEventListener) this.f$1, (LoadEventInfo) this.f$2, (MediaLoadData) this.f$3, (IOException) this.f$5, this.f$4);
                break;
        }
    }

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda20(BiometricsDelegate biometricsDelegate, Promise promise, Activity activity, boolean z, String str, String str2) {
        this.f$0 = biometricsDelegate;
        this.f$3 = promise;
        this.f$5 = activity;
        this.f$4 = z;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public /* synthetic */ ViewhostImpl$$ExternalSyntheticLambda20(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f$0 = eventDispatcher;
        this.f$1 = mediaSourceEventListener;
        this.f$2 = loadEventInfo;
        this.f$3 = mediaLoadData;
        this.f$5 = iOException;
        this.f$4 = z;
    }
}
