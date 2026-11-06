package com.amazon.alexa.client.alexaservice.ui.conversations;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.AlexaFragmentsChunkMetadata;
import com.amazon.alexa.api.AlexaFragmentsListener;
import com.amazon.alexa.api.AlexaFragmentsMetadata;
import com.amazon.alexa.client.alexaservice.utils.UniqueIdGenerator;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public final class ConversationFragmentsHandler {
    static final int MAX_CHUNK_PAYLOAD_CHARS = 65536;
    static final int MIN_TOTAL_CHUNKS = 1;
    static final int STARTING_CHUNK_INDEX = 0;
    private static final String TAG = "FragmentsHandler";
    private final UniqueIdGenerator uniqueIdGenerator;

    @Inject
    public ConversationFragmentsHandler(UniqueIdGenerator uniqueIdGenerator) {
        this.uniqueIdGenerator = uniqueIdGenerator;
    }

    private void onFragmentsReceived(Iterable<AlexaFragmentsListener> iterable, AlexaFragmentsMetadata alexaFragmentsMetadata, String str, int i, int i2, String str2) throws RemoteException {
        AlexaFragmentsChunkMetadata build = AlexaFragmentsChunkMetadata.builder().setCurrentChunkIndex(i).setTotalChunks(i2).setRequestId(str2).build();
        Iterator<AlexaFragmentsListener> it2 = iterable.iterator();
        while (it2.hasNext()) {
            it2.next().onFragments(alexaFragmentsMetadata, str, build);
        }
    }

    private static List<String> splitIntoChunks(JsonArray jsonArray, Gson gson) {
        Log.i(TAG, "Splitting the fragments into chunks and sending them");
        ArrayList arrayList = new ArrayList();
        JsonArray jsonArray2 = new JsonArray();
        Iterator<JsonElement> it2 = jsonArray.iterator();
        int i = 1;
        while (it2.hasNext()) {
            JsonElement next = it2.next();
            int length = gson.toJson(next).length() + 1;
            if (jsonArray2.size() > 0 && i + length > 65536) {
                arrayList.add(gson.toJson((JsonElement) jsonArray2));
                jsonArray2 = new JsonArray();
                i = 1;
            }
            jsonArray2.add(next);
            i += length;
        }
        arrayList.add(gson.toJson((JsonElement) jsonArray2));
        return arrayList;
    }

    public void sendFragmentsToConsumers(Iterable<AlexaFragmentsListener> iterable, JsonArray jsonArray, AlexaFragmentsMetadata alexaFragmentsMetadata, Gson gson) {
        String json = gson.toJson((JsonElement) jsonArray);
        Log.e(TAG, "Total size of string to transmit: " + json.length());
        String generateUniqueId = this.uniqueIdGenerator.generateUniqueId();
        List<String> singletonList = json.length() <= 65536 ? Collections.singletonList(json) : splitIntoChunks(jsonArray, gson);
        int i = 0;
        while (i < singletonList.size()) {
            try {
                String str = singletonList.get(i);
                str.length();
                singletonList.size();
                ConversationFragmentsHandler conversationFragmentsHandler = this;
                Iterable<AlexaFragmentsListener> iterable2 = iterable;
                AlexaFragmentsMetadata alexaFragmentsMetadata2 = alexaFragmentsMetadata;
                conversationFragmentsHandler.onFragmentsReceived(iterable2, alexaFragmentsMetadata2, str, i, singletonList.size(), generateUniqueId);
                i++;
                this = conversationFragmentsHandler;
                iterable = iterable2;
                alexaFragmentsMetadata = alexaFragmentsMetadata2;
            } catch (RemoteException e) {
                Log.e(TAG, "Remote exception when sending in chunks", e);
                return;
            }
        }
    }
}
