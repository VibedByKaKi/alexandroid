package com.amazon.alexa.mosaic.components.apl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mosaic.components.R;
import com.amazon.alexa.mosaic.components.apl.interfaces.IAplEventListener;
import com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewLayout;
import com.amazon.alexa.mosaic.components.apl.interfaces.IVisualContextEventListener;
import com.amazon.apl.android.APLController;
import com.amazon.apl.android.APLLayout;
import com.amazon.apl.android.IAPLController;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AplViewLayout extends FrameLayout implements IAplViewLayout {
    private static final String FIELD_DOCUMENT = "document";
    private IAPLController aplController;
    private APLLayout aplLayout;

    public AplViewLayout(Context context) {
        super(context);
    }

    private int getLayout() {
        return (getContext().getResources().getConfiguration().uiMode & 48) == 16 ? R.layout.apl_light : R.layout.apl_dark;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewLayout
    public void execute(@NonNull String str) {
        this.aplController.executeCommands(str, null);
    }

    @VisibleForTesting
    public IAPLController getAplController(AplViewOptions aplViewOptions, JSONObject jSONObject) {
        return APLController.builder().aplOptions(aplViewOptions.get()).rootConfig(AplRootConfig.get()).aplLayout(this.aplLayout).aplDocument(jSONObject.optString("document")).disableAsyncInflate(true).render();
    }

    @VisibleForTesting
    public AplViewOptions getAplViewOptions(String str, IAplEventListener iAplEventListener, IVisualContextEventListener iVisualContextEventListener, JSONObject jSONObject) {
        return new AplViewOptions(getContext(), jSONObject, str, iAplEventListener, iVisualContextEventListener);
    }

    @VisibleForTesting
    public JSONObject getJsonDoc(String str) throws JSONException {
        return new JSONObject(str);
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewLayout
    public void pause() {
        this.aplController.pauseDocument();
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewLayout
    public void render(String str, String str2, IAplEventListener iAplEventListener, IVisualContextEventListener iVisualContextEventListener) throws JSONException {
        removeAllViews();
        this.aplLayout = (APLLayout) LayoutInflater.from(getContext()).inflate(getLayout(), this).findViewById(R.id.apl_layout);
        JSONObject jsonDoc = getJsonDoc(str2);
        this.aplController = getAplController(getAplViewOptions(str, iAplEventListener, iVisualContextEventListener, jsonDoc), jsonDoc);
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewLayout
    public void resume() {
        this.aplController.resumeDocument();
    }

    @Override // com.amazon.alexa.mosaic.components.apl.interfaces.IAplViewLayout
    public void update(@NonNull String str, @NonNull String str2) {
        this.aplController.updateDataSource(str, str2, null);
    }

    public AplViewLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
