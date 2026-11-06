package com.amazon.apl.viewhost;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.APLLayout;
import com.amazon.apl.viewhost.config.ViewhostConfig;
import com.amazon.apl.viewhost.internal.DocumentStateChangeListener;
import com.amazon.apl.viewhost.internal.SavedDocument;
import com.amazon.apl.viewhost.internal.ViewhostImpl;
import com.amazon.apl.viewhost.primitives.DisplayState;
import com.amazon.apl.viewhost.request.PrepareDocumentRequest;
import com.amazon.apl.viewhost.request.RenderDocumentRequest;
import com.amazon.apl.viewhost.request.UpdateViewStateRequest;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Viewhost {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExtensionEventHandlerCallback {
        void onComplete();

        void onTerminated();
    }

    public static Viewhost create(ViewhostConfig viewhostConfig) {
        return new ViewhostImpl(viewhostConfig);
    }

    public abstract void bind(APLLayout aPLLayout);

    public abstract void cancelExecution();

    public abstract DisplayState getDisplayState();

    public abstract double getProcessingRate();

    public abstract void invokeExtensionEventHandler(@NonNull String str, @NonNull String str2, Map<String, Object> map, boolean z, @Nullable ExtensionEventHandlerCallback extensionEventHandlerCallback);

    public abstract boolean isBound();

    public abstract PreparedDocument prepare(PrepareDocumentRequest prepareDocumentRequest);

    public abstract void registerStateChangeListener(DocumentStateChangeListener documentStateChangeListener);

    public abstract DocumentHandle render(PreparedDocument preparedDocument);

    public abstract DocumentHandle render(RenderDocumentRequest renderDocumentRequest);

    public abstract boolean restoreDocument(SavedDocument savedDocument);

    public abstract void unBind();

    @Deprecated
    public abstract void updateDisplayState(com.amazon.apl.enums.DisplayState displayState);

    public abstract void updateViewState(UpdateViewStateRequest updateViewStateRequest);
}
