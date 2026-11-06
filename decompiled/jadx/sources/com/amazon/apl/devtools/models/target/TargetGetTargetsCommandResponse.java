package com.amazon.apl.devtools.models.target;

import android.util.Log;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.Target;
import com.amazon.apl.devtools.models.common.TargetDomainCommandResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TargetGetTargetsCommandResponse extends TargetDomainCommandResponse {
    private static final String TAG = "TargetGetTargetsCommandResponse";
    private final Result mResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        private final Collection<TargetInfo> mTargetInfos;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class TargetInfo {
            private final String mName;
            private final String mTargetId;
            private final String mType;

            public TargetInfo(String str, String str2, String str3) {
                this.mTargetId = str;
                this.mType = str2;
                this.mName = str3;
            }

            public String getName() {
                return this.mName;
            }

            public String getTargetId() {
                return this.mTargetId;
            }

            public String getType() {
                return this.mType;
            }
        }

        public Result(Collection<WeakReference<Target>> collection) {
            this.mTargetInfos = parseTargetInfos(collection);
        }

        private TargetInfo parseTargetInfo(Target target) {
            return new TargetInfo(target.getTargetId(), target.getType().toString(), target.getName());
        }

        private Collection<TargetInfo> parseTargetInfos(Collection<WeakReference<Target>> collection) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<Target>> it2 = collection.iterator();
            while (it2.hasNext()) {
                Target target = it2.next().get();
                if (target != null) {
                    arrayList.add(parseTargetInfo(target));
                }
            }
            return arrayList;
        }

        public Collection<TargetInfo> getTargetInfos() {
            return this.mTargetInfos;
        }
    }

    public TargetGetTargetsCommandResponse(int i, Collection<WeakReference<Target>> collection) {
        super(i);
        this.mResult = new Result(collection);
    }

    public Result getResult() {
        return this.mResult;
    }

    @Override // com.amazon.apl.devtools.models.common.TargetDomainCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + CommandMethod.TARGET_GET_TARGETS + " response object");
        JSONArray jSONArray = new JSONArray();
        for (Result.TargetInfo targetInfo : getResult().getTargetInfos()) {
            jSONArray.put(new JSONObject().put("targetId", targetInfo.getTargetId()).put("type", targetInfo.getType()).put("name", targetInfo.getName()));
        }
        return super.toJSONObject().put("result", new JSONObject().put("targetInfos", jSONArray));
    }
}
