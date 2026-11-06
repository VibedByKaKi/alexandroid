package com.amazon.apl.devtools.models.memory;

import android.os.Debug;
import android.util.Log;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.Response;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.tools.doclint.Messages;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MemoryGetMemoryCommandResponse extends Response {
    private static final String TAG = "MemoryGetMemoryCommandResponse";
    private Debug.MemoryInfo mMemoryInfo;

    public MemoryGetMemoryCommandResponse(int i, Debug.MemoryInfo memoryInfo) {
        super(i);
        this.mMemoryInfo = memoryInfo;
    }

    @Override // com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + CommandMethod.MEMORY_GET_MEMORY + " response object");
        int totalSharedDirty = this.mMemoryInfo.getTotalSharedDirty() + this.mMemoryInfo.getTotalSharedClean() + this.mMemoryInfo.getTotalPrivateDirty() + this.mMemoryInfo.getTotalPrivateClean();
        HashMap hashMap = new HashMap();
        hashMap.put("dalvikPrivateDirty", Integer.valueOf(this.mMemoryInfo.dalvikPrivateDirty));
        hashMap.put("dalvikPss", Integer.valueOf(this.mMemoryInfo.dalvikPss));
        hashMap.put("dalvikSharedDirty", Integer.valueOf(this.mMemoryInfo.dalvikSharedDirty));
        hashMap.put("nativePrivateDirty", Integer.valueOf(this.mMemoryInfo.nativePrivateDirty));
        hashMap.put("nativePss", Integer.valueOf(this.mMemoryInfo.nativePss));
        hashMap.put("nativeSharedDirty", Integer.valueOf(this.mMemoryInfo.nativeSharedDirty));
        hashMap.put("otherPrivateDirty", Integer.valueOf(this.mMemoryInfo.otherPrivateDirty));
        hashMap.put("otherPss", Integer.valueOf(this.mMemoryInfo.otherPss));
        hashMap.put("otherSharedDirty", Integer.valueOf(this.mMemoryInfo.otherSharedDirty));
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONArray.put(new JSONObject().put("name", entry.getKey()).put("value", entry.getValue()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total", totalSharedDirty);
        jSONObject.put(Messages.Stats.OPT, jSONArray);
        return super.toJSONObject().put("result", jSONObject);
    }
}
