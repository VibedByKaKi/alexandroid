package com.amazon.deecomms.calling.incallcommands.models;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class InCallCommandModel {
    private static final String TAG = "HalloInCallCommandModel";
    protected String callId;
    protected AlexaContextsProvider context;
    protected AlexaHeader header;
    protected String inCallCommandName;
    protected AlexaPayload payload;

    public InCallCommandModel(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        this.inCallCommandName = extras.getString("inCallEvent", "");
        String string = extras.getString("callId", "");
        this.callId = string;
        if (string.isEmpty() || this.inCallCommandName.isEmpty()) {
            Log.i(TAG, toString());
            StringBuilder sb = new StringBuilder("callId is: ");
            sb.append(this.callId);
            sb.append("or inCallCommand: ");
            Single$$ExternalSyntheticBUOutline0.m$3(InCallCommandModel$$ExternalSyntheticOutline0.m(sb, this.inCallCommandName, " is empty"));
            throw null;
        }
    }

    @Nullable
    public synchronized AlexaContextsProvider getContext() {
        return this.context;
    }

    @NonNull
    public synchronized AlexaHeader getHeader() {
        return this.header;
    }

    @NonNull
    public synchronized String getInCallCommandName() {
        return this.inCallCommandName;
    }

    @NonNull
    public synchronized AlexaPayload getPayload() {
        return this.payload;
    }

    public abstract boolean hasContext();

    @NonNull
    public synchronized String toString() {
        return "callId: " + this.callId + ", inCallCommandName: " + this.inCallCommandName;
    }

    public InCallCommandModel(@NonNull AlexaHeader alexaHeader, @NonNull AlexaPayload alexaPayload, @NonNull AlexaContextsProvider alexaContextsProvider, @NonNull String str) {
        this.header = alexaHeader;
        this.payload = alexaPayload;
        this.context = alexaContextsProvider;
        this.inCallCommandName = alexaHeader.getName();
        this.callId = str;
    }
}
