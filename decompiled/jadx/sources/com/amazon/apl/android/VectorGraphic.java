package com.amazon.apl.android;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.apl.android.component.ComponentDependencies;
import com.amazon.apl.android.content.MediaCallbackContentRetrieverDecorator;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.graphic.GraphicContainerElement;
import com.amazon.apl.android.primitive.UrlRequests;
import com.amazon.apl.enums.PropertyKey;
import com.amazon.apl.enums.VectorGraphicAlign;
import com.amazon.apl.enums.VectorGraphicScale;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VectorGraphic extends Component {
    private static final String TAG = "com.amazon.apl.android.VectorGraphic";
    private final IContentRetriever<Uri, String> mContentRetriever;
    private GraphicContainerElement mGraphicContainerElement;

    public VectorGraphic(ComponentDependencies componentDependencies) {
        super(componentDependencies);
        this.mContentRetriever = componentDependencies.getRenderingContext().getAvgRetriever();
    }

    private native Set<String> nGetDirtyGraphics(long j);

    private native long nGetGraphic(long j, int i);

    private native void nUpdateGraphic(long j, String str);

    public final VectorGraphicAlign getAlign() {
        return VectorGraphicAlign.valueOf(this.mProperties.getEnum(PropertyKey.kPropertyAlign));
    }

    public IContentRetriever<Uri, String> getContentRetriever() {
        return MediaCallbackContentRetrieverDecorator.create(getViewPresenter(), this.mContentRetriever);
    }

    public Set<String> getDirtyGraphics() {
        return nGetDirtyGraphics(getNativeHandle());
    }

    @Nullable
    public GraphicContainerElement getOrCreateGraphicContainerElement() {
        GraphicContainerElement graphicContainerElement = this.mGraphicContainerElement;
        if (graphicContainerElement != null) {
            return graphicContainerElement;
        }
        if (!hasGraphic()) {
            Log.e(TAG, "Attempting to get root when no graphic is loaded.");
            return null;
        }
        GraphicContainerElement create = GraphicContainerElement.create(nGetGraphic(getNativeHandle(), PropertyKey.kPropertyGraphic.getIndex()), getRenderingContext());
        this.mGraphicContainerElement = create;
        return create;
    }

    public final VectorGraphicScale getScale() {
        return VectorGraphicScale.valueOf(this.mProperties.getEnum(PropertyKey.kPropertyScale));
    }

    @Nullable
    public final UrlRequests.UrlRequest getSourceRequest() {
        UrlRequests urlRequests = this.mProperties.getUrlRequests(PropertyKey.kPropertySource);
        if (urlRequests.size() == 0) {
            return null;
        }
        return urlRequests.at(0);
    }

    public boolean hasGraphic() {
        return this.mProperties.hasProperty(PropertyKey.kPropertyGraphic);
    }

    public void resetGraphicContainerElement() {
        this.mGraphicContainerElement = null;
    }

    public void updateGraphic(String str) {
        nUpdateGraphic(getNativeHandle(), str);
    }
}
