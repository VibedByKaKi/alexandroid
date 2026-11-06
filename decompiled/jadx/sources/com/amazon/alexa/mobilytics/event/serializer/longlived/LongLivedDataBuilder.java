package com.amazon.alexa.mobilytics.event.serializer.longlived;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.serializer.handlers.DataHandler;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;
import com.amazon.alexa.mobilytics.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class LongLivedDataBuilder {
    private static final String COMPONENT = "mobilytics";
    public static final String CUSTOM_DATA_PAYLOAD_FIELD = "customDataPayload";
    private static final String SUB_COMPONENT = "platform";
    private static final String TAG = Log.tag((Class<?>) LongLivedDataBuilder.class);
    private final List<DataHandler> coreDataHandlers;
    private final ObjectMapper objectMapper;
    private final DataHandler sessionDataHandler;

    @Inject
    public LongLivedDataBuilder(@NonNull ObjectMapper objectMapper, @NonNull @Named("CoreDataHandlers") List<DataHandler> list, @NonNull @Named("SessionDataHandler") DataHandler dataHandler) {
        this.objectMapper = (ObjectMapper) Preconditions.checkNotNull(objectMapper);
        this.coreDataHandlers = (List) Preconditions.checkNotNull(list);
        this.sessionDataHandler = (DataHandler) Preconditions.checkNotNull(dataHandler);
    }

    private void addCognitoPoolIdToApplication(@NonNull String str, @NonNull ObjectNode objectNode, @NonNull String str2) {
        if ("application".equalsIgnoreCase(str)) {
            objectNode.put("cognitoIdentityPoolId", str2);
        }
    }

    @NonNull
    public ObjectNode buildAllData(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable MobilyticsSession mobilyticsSession) throws JSONException {
        Log.i(TAG, "Building all long-lived data");
        DefaultMobilyticsOperationalEvent defaultMobilyticsOperationalEvent = new DefaultMobilyticsOperationalEvent("app:Mobilytics:customDataRefresh", "data", "mobilytics", "platform", OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND);
        if (mobilyticsSession != null) {
            defaultMobilyticsOperationalEvent.setSession(mobilyticsSession);
        }
        ObjectNode createObjectNode = this.objectMapper.createObjectNode();
        ArrayList arrayList = new ArrayList(this.coreDataHandlers);
        arrayList.add(this.sessionDataHandler);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            DataHandler dataHandler = (DataHandler) it2.next();
            try {
                Log.v(TAG, "Running handler: %s", dataHandler.getClass().getName());
                Pair<String, ObjectNode> processV2 = dataHandler.processV2(defaultMobilyticsOperationalEvent);
                if (processV2 != null) {
                    addCognitoPoolIdToApplication((String) processV2.first, (ObjectNode) processV2.second, str3);
                    createObjectNode.put((String) processV2.first, (JsonNode) processV2.second);
                }
            } catch (Exception e) {
                Log.e(TAG, e, "Handler %s failed to run", dataHandler.getClass().getName());
            }
        }
        createObjectNode.put("client", this.objectMapper.createObjectNode().put("clientId", str2).put("cognitoId", str));
        ObjectNode createObjectNode2 = this.objectMapper.createObjectNode();
        createObjectNode2.put("customDataPayload", createObjectNode);
        return createObjectNode2;
    }

    @NonNull
    public ObjectNode buildSessionDataOnly(@NonNull MobilyticsSession mobilyticsSession) throws JSONException {
        Log.i(TAG, "Building session data only");
        DefaultMobilyticsOperationalEvent defaultMobilyticsOperationalEvent = new DefaultMobilyticsOperationalEvent("app:Mobilytics:sessionDataRefresh", "data", "mobilytics", "platform", OwnerIdentifier.MOBILE_ORG_ANALYTICS_BACKEND);
        defaultMobilyticsOperationalEvent.setSession(mobilyticsSession);
        try {
            Pair<String, ObjectNode> processV2 = this.sessionDataHandler.processV2(defaultMobilyticsOperationalEvent);
            if (processV2 != null) {
                ObjectNode createObjectNode = this.objectMapper.createObjectNode();
                createObjectNode.put((String) processV2.first, (JsonNode) processV2.second);
                return createObjectNode;
            }
        } catch (Exception e) {
            Log.e(TAG, e, "SessionDataHandler failed to run", new Object[0]);
        }
        return this.objectMapper.createObjectNode();
    }

    @NonNull
    public ObjectNode updateSessionDataInExisting(@NonNull ObjectNode objectNode, @NonNull ObjectNode objectNode2) {
        Log.i(TAG, "Updating session data in existing long-lived data");
        ObjectNode deepCopy = objectNode.deepCopy();
        ObjectNode objectNode3 = (ObjectNode) deepCopy.get("customDataPayload");
        if (objectNode3 != null) {
            Iterator<Map.Entry<String, JsonNode>> fields = objectNode2.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> next = fields.next();
                objectNode3.put(next.getKey(), next.getValue());
            }
        }
        return deepCopy;
    }
}
