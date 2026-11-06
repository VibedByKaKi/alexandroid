package com.amazon.apl.viewhost;

import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.ExecuteCommandsRequest;
import com.amazon.apl.viewhost.request.FinishDocumentRequest;
import com.amazon.apl.viewhost.request.UpdateDataSourceRequest;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes20.dex */
public abstract class DocumentHandle extends UserDataHolder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DataSourceContextCallback {
        void onFailure(String str);

        void onSuccess(Decodable decodable);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DocumentSettingsCallback {
        void onFailure(String str);

        void onSuccess(Decodable decodable);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VisualContextCallback {
        void onFailure(String str);

        void onSuccess(Decodable decodable);
    }

    public abstract void cancelExecution();

    public abstract boolean executeCommands(ExecuteCommandsRequest executeCommandsRequest);

    public abstract boolean finish(FinishDocumentRequest finishDocumentRequest);

    public abstract String getToken();

    public abstract String getUniqueId();

    public abstract boolean isValid();

    public abstract boolean requestDataSourceContext(DataSourceContextCallback dataSourceContextCallback);

    public abstract boolean requestDocumentSettings(DocumentSettingsCallback documentSettingsCallback);

    public abstract boolean requestVisualContext(VisualContextCallback visualContextCallback);

    public abstract boolean updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);
}
