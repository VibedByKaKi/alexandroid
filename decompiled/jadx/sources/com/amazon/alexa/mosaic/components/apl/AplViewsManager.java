package com.amazon.alexa.mosaic.components.apl;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mosaic.components.apl.interfaces.IAplEventListener;
import com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager;
import com.amazon.alexa.mosaic.components.apl.interfaces.IVisualContextEventListener;
import com.amazon.alexa.mosaic.components.apl.models.IAplEvent;
import com.amazon.alexa.mosaic.components.apl.models.IVisualContextEvent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AplViewsManager implements IAplViewsManager, IAplEventListener, IVisualContextEventListener {
    private static final String TAG = "AplViewsManager";
    private final Map<String, WeakReference<AplViewLayout>> activeAplViews;
    private final Map<String, JSONObject> activeVisualContexts;
    private IAplEventListener aplEventListener;

    public AplViewsManager() {
        this(new HashMap(), new HashMap());
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void clear(String str) {
        this.activeAplViews.remove(str);
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void clearAll() {
        this.activeAplViews.clear();
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void execute(String str, String str2) {
        WeakReference<AplViewLayout> weakReference = this.activeAplViews.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        weakReference.get().execute(str2);
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public JSONObject getVisualContext(@NonNull String str) {
        if (this.activeVisualContexts.containsKey(str)) {
            return this.activeVisualContexts.get(str);
        }
        return null;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IVisualContextEventListener
    public void onVisualContextEvent(IVisualContextEvent iVisualContextEvent) {
        iVisualContextEvent.getPresentationUri();
        this.activeVisualContexts.put(iVisualContextEvent.getPresentationUri(), iVisualContextEvent.getVisualContext());
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void pauseAll() {
        for (WeakReference<AplViewLayout> weakReference : this.activeAplViews.values()) {
            if (weakReference.get() != null) {
                weakReference.get().pause();
            }
        }
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void render(String str, String str2, AplViewLayout aplViewLayout) throws JSONException {
        String str3 = TAG;
        if (aplViewLayout == null) {
            Log.e(str3, "aplView is null");
        } else {
            aplViewLayout.render(str, str2, this, this);
            this.activeAplViews.put(str, new WeakReference<>(aplViewLayout));
        }
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void resumeAll() {
        for (WeakReference<AplViewLayout> weakReference : this.activeAplViews.values()) {
            if (weakReference.get() != null) {
                weakReference.get().resume();
            }
        }
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplEventListener
    public void sendEvent(IAplEvent iAplEvent) {
        iAplEvent.getPresentationUri();
        IAplEventListener iAplEventListener = this.aplEventListener;
        if (iAplEventListener != null) {
            iAplEventListener.sendEvent(iAplEvent);
        }
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void setAplEventListener(IAplEventListener iAplEventListener) {
        this.aplEventListener = iAplEventListener;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewsManager
    public void update(String str, String str2, String str3) {
        WeakReference<AplViewLayout> weakReference = this.activeAplViews.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        weakReference.get().update(str2, str3);
    }

    @VisibleForTesting
    public AplViewsManager(Map<String, WeakReference<AplViewLayout>> map, Map<String, JSONObject> map2) {
        this.activeAplViews = map;
        this.activeVisualContexts = map2;
    }
}
