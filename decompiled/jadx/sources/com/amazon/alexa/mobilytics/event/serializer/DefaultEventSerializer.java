package com.amazon.alexa.mobilytics.event.serializer;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.serializer.EventSerializer;
import com.amazon.alexa.mobilytics.event.serializer.customdata.CustomDataStorage;
import com.amazon.alexa.mobilytics.event.serializer.handlers.DataHandler;
import com.amazon.alexa.mobilytics.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class DefaultEventSerializer implements EventSerializer {
    public static final String COUPLED_EVENT_PAYLOAD_FIELD = "payload";
    public static final String COUPLED_EVENT_VERSION_FIELD = "version";
    public static final String COUPLED_P2_EVENT_PAYLOAD_FIELD = "events";
    public static final String CUSTOM_DATA_PAYLOAD_FIELD = "customDataPayload";
    public static final int EVENT_COUPLING_P2_VERSION_WITH_JACKSON = 4;
    public static final int EVENT_COUPLING_VERSION = 2;
    public static final int EVENT_COUPLING_VERSION_WITH_JACKSON = 3;
    private static final String TAG = Log.tag((Class<?>) DefaultEventSerializer.class);
    private final CustomDataStorage customDataStorage;
    private final List<DataHandler> fullChain;
    private final List<DataHandler> handlers;
    private final String installationId;
    private final ObjectMapper objectMapper;
    private final List<DataHandler> transientHandlers;

    @Inject
    public DefaultEventSerializer(@NonNull @Named("DefaultDataHandlers") List<DataHandler> list, @NonNull @Named("TransientDataHandlers") List<DataHandler> list2, @NonNull ObjectMapper objectMapper, @NonNull CustomDataStorage customDataStorage, @Nullable @Named("InstallationId") String str) {
        List<DataHandler> list3 = (List) Preconditions.checkNotNull(list);
        this.handlers = list3;
        List<DataHandler> list4 = (List) Preconditions.checkNotNull(list2);
        this.transientHandlers = list4;
        this.objectMapper = (ObjectMapper) Preconditions.checkNotNull(objectMapper);
        this.customDataStorage = (CustomDataStorage) Preconditions.checkNotNull(customDataStorage);
        this.installationId = str;
        ArrayList arrayList = new ArrayList(list3);
        for (DataHandler dataHandler : list4) {
            if (!arrayList.contains(dataHandler)) {
                arrayList.add(dataHandler);
            }
        }
        this.fullChain = arrayList;
    }

    private void addCustomDataToPayload(@NonNull ObjectNode objectNode) {
        String str = TAG;
        Log.d(str, "Adding custom data to payload");
        ObjectNode read = this.customDataStorage.read();
        if (read == null) {
            Log.w(str, "No custom data available in storage - possible timing issue or multiple instance bug");
            return;
        }
        JsonNode jsonNode = read.get("customDataPayload");
        if (jsonNode == null) {
            Log.w(str, "Custom data payload field not found in storage");
        } else {
            Log.v(str, "Custom data payload found and added to final payload");
            objectNode.set("customDataPayload", jsonNode);
        }
    }

    private String doSerialize(@NonNull List<MobilyticsEvent> list, @Nullable EventSerializer.Visitor visitor, @Nullable DataHandler[] dataHandlerArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<MobilyticsEvent> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(getJsonObject(it2.next(), visitor, dataHandlerArr));
        }
        jSONObject.put("payload", jSONArray);
        jSONObject.put("version", 2);
        return jSONObject.toString();
    }

    private String doSerializeV2(List<MobilyticsEvent> list, EventSerializer.VisitorV2 visitorV2, DataHandler[] dataHandlerArr) throws JSONException {
        ObjectNode createObjectNode = this.objectMapper.createObjectNode();
        ArrayNode createArrayNode = this.objectMapper.createArrayNode();
        Iterator<MobilyticsEvent> it2 = list.iterator();
        while (it2.hasNext()) {
            createArrayNode.add(getObjectNode(it2.next(), visitorV2, dataHandlerArr));
        }
        createObjectNode.put("payload", createArrayNode);
        createObjectNode.put("version", 3);
        return createObjectNode.toString();
    }

    private String doSerializeV3(@NonNull List<MobilyticsEvent> list) throws JSONException {
        Log.d(TAG, "Processing V3 serialization for %d events with long lived data", Integer.valueOf(list.size()));
        ObjectNode createObjectNode = this.objectMapper.createObjectNode();
        ArrayNode createArrayNode = this.objectMapper.createArrayNode();
        Iterator<MobilyticsEvent> it2 = list.iterator();
        while (it2.hasNext()) {
            createArrayNode.add(getObjectNodeV3(it2.next()));
        }
        createObjectNode.set("events", createArrayNode);
        addCustomDataToPayload(createObjectNode);
        createObjectNode.put("version", 4);
        return createObjectNode.toString();
    }

    private JSONObject getJsonObject(@NonNull MobilyticsEvent mobilyticsEvent, @Nullable EventSerializer.Visitor visitor, @Nullable DataHandler[] dataHandlerArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(this.handlers);
        if (dataHandlerArr != null) {
            arrayList.addAll(Arrays.asList(dataHandlerArr));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            DataHandler dataHandler = (DataHandler) it2.next();
            try {
                Log.v(TAG, "Running handler: %s", dataHandler.getClass().getName());
                Pair<String, JSONObject> process = dataHandler.process(mobilyticsEvent);
                if (process != null) {
                    if (visitor != null) {
                        try {
                            visitor.visit((String) process.first, (JSONObject) process.second);
                        } catch (Exception e) {
                            Log.e(TAG, e, "Visitor failed", new Object[0]);
                        }
                    }
                    jSONObject.put((String) process.first, process.second);
                }
            } catch (Exception e2) {
                Log.e(TAG, e2, "Handler %s failed to run", dataHandler.getClass().getName());
            }
        }
        return jSONObject;
    }

    private ObjectNode getObjectNode(@NonNull MobilyticsEvent mobilyticsEvent, @Nullable EventSerializer.VisitorV2 visitorV2, @Nullable DataHandler[] dataHandlerArr) throws JSONException {
        ObjectNode createObjectNode = this.objectMapper.createObjectNode();
        ArrayList arrayList = new ArrayList(this.handlers);
        if (dataHandlerArr != null) {
            arrayList.addAll(Arrays.asList(dataHandlerArr));
        }
        runOnDataHandlers(mobilyticsEvent, visitorV2, createObjectNode, arrayList);
        return createObjectNode;
    }

    private ObjectNode getObjectNodeV3(@NonNull MobilyticsEvent mobilyticsEvent) throws JSONException {
        Log.v(TAG, "Creating V3 object node for event: %s", mobilyticsEvent.getClass().getSimpleName());
        ObjectNode createObjectNode = this.objectMapper.createObjectNode();
        runOnDataHandlers(mobilyticsEvent, null, createObjectNode, new ArrayList(this.transientHandlers));
        return createObjectNode;
    }

    private void runOnDataHandlers(MobilyticsEvent mobilyticsEvent, @Nullable EventSerializer.VisitorV2 visitorV2, ObjectNode objectNode, List<DataHandler> list) {
        for (DataHandler dataHandler : list) {
            try {
                Log.v(TAG, "Running handler in V2 mode: %s", dataHandler.getClass().getName());
                Pair<String, ObjectNode> processV2 = dataHandler.processV2(mobilyticsEvent);
                if (processV2 != null) {
                    if (visitorV2 != null) {
                        try {
                            visitorV2.visit((String) processV2.first, (ObjectNode) processV2.second);
                        } catch (Exception e) {
                            Log.e(TAG, e, "Visitor failed", new Object[0]);
                        }
                    }
                    objectNode.put((String) processV2.first, (JsonNode) processV2.second);
                }
            } catch (Exception e2) {
                Log.e(TAG, e2, "Handler %s failed to run", dataHandler.getClass().getName());
            }
        }
    }

    @NonNull
    public ObjectNode buildFullEventNode(@NonNull MobilyticsEvent mobilyticsEvent) {
        ObjectNode createObjectNode = this.objectMapper.createObjectNode();
        runOnDataHandlers(mobilyticsEvent, null, createObjectNode, this.fullChain);
        String str = this.installationId;
        if (str != null && !str.isEmpty()) {
            ObjectNode createObjectNode2 = this.objectMapper.createObjectNode();
            createObjectNode2.put("clientId", this.installationId);
            createObjectNode.set("client", createObjectNode2);
        }
        return createObjectNode;
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serialize(@NonNull MobilyticsEvent mobilyticsEvent) throws JSONException {
        return doSerialize(mobilyticsEvent, (EventSerializer.Visitor) null, (DataHandler[]) null);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serializeList(@NonNull List<MobilyticsEvent> list) throws JSONException {
        return doSerialize(list, (EventSerializer.Visitor) null, (DataHandler[]) null);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serializeListV2(@NonNull List<MobilyticsEvent> list, @NonNull EventSerializer.VisitorV2 visitorV2, @NonNull DataHandler... dataHandlerArr) throws JSONException {
        return doSerializeV2(list, visitorV2, dataHandlerArr);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serializeListV3(@NonNull List<MobilyticsEvent> list) throws JSONException {
        return doSerializeV3(list);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serialize(@NonNull MobilyticsEvent mobilyticsEvent, @NonNull EventSerializer.Visitor visitor) throws JSONException {
        return doSerialize(mobilyticsEvent, visitor, (DataHandler[]) null);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serializeList(@NonNull List<MobilyticsEvent> list, @NonNull EventSerializer.Visitor visitor) throws JSONException {
        return doSerialize(list, visitor, (DataHandler[]) null);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serialize(@NonNull MobilyticsEvent mobilyticsEvent, @NonNull DataHandler... dataHandlerArr) throws JSONException {
        return doSerialize(mobilyticsEvent, (EventSerializer.Visitor) null, dataHandlerArr);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serializeList(@NonNull List<MobilyticsEvent> list, @NonNull DataHandler... dataHandlerArr) throws JSONException {
        return doSerialize(list, (EventSerializer.Visitor) null, dataHandlerArr);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serialize(@NonNull MobilyticsEvent mobilyticsEvent, @NonNull EventSerializer.Visitor visitor, @NonNull DataHandler... dataHandlerArr) throws JSONException {
        return doSerialize(mobilyticsEvent, visitor, dataHandlerArr);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.EventSerializer
    public String serializeList(@NonNull List<MobilyticsEvent> list, @NonNull EventSerializer.Visitor visitor, @NonNull DataHandler... dataHandlerArr) throws JSONException {
        return doSerialize(list, visitor, dataHandlerArr);
    }

    private String doSerialize(@NonNull MobilyticsEvent mobilyticsEvent, @Nullable EventSerializer.Visitor visitor, @Nullable DataHandler[] dataHandlerArr) throws JSONException {
        return getJsonObject(mobilyticsEvent, visitor, dataHandlerArr).toString();
    }

    public DefaultEventSerializer(@NonNull @Named("DefaultDataHandlers") List<DataHandler> list, @NonNull @Named("TransientDataHandlers") List<DataHandler> list2, @NonNull ObjectMapper objectMapper, @NonNull CustomDataStorage customDataStorage) {
        this(list, list2, objectMapper, customDataStorage, null);
    }
}
