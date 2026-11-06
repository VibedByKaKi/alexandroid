package com.amazon.apl.devtools.executers;

import com.amazon.apl.devtools.models.common.Response;
import com.amazon.apl.devtools.util.IDTCallback;
import com.amazon.apl.devtools.util.RequestStatus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ICommandExecutor<TResponse extends Response> {
    default void execute(IDTCallback<TResponse> iDTCallback) {
        iDTCallback.execute(execute(), RequestStatus.successful());
    }

    default TResponse execute() {
        return null;
    }
}
