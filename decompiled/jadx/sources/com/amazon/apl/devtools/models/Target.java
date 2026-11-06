package com.amazon.apl.devtools.models;

import android.util.Log;
import com.amazon.apl.devtools.enums.TargetType;
import com.amazon.apl.devtools.models.common.TargetModel;
import com.amazon.apl.devtools.util.DependencyContainer;
import com.amazon.apl.devtools.util.IdGenerator;
import com.amazon.apl.devtools.util.TargetCatalog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Target extends TargetModel {
    private static final String TAG = "Target";
    private static final IdGenerator targetIdGenerator = new IdGenerator();
    private final Map<String, Session> mRegisteredSessionsMap;
    private final TargetCatalog mTargetCatalog;

    public Target(TargetType targetType, String str) {
        super(targetIdGenerator.generateId("target"), targetType, str);
        this.mRegisteredSessionsMap = new HashMap();
        Log.i(TAG, "Creating target of type " + getType() + " with target id " + getTargetId());
        this.mTargetCatalog = DependencyContainer.getInstance().getTargetCatalog();
    }

    public Collection<String> getRegisteredSessionIds() {
        return this.mRegisteredSessionsMap.keySet();
    }

    public Collection<Session> getRegisteredSessions() {
        return this.mRegisteredSessionsMap.values();
    }

    public void registerSession(Session session) {
        this.mRegisteredSessionsMap.put(session.getSessionId(), session);
        Log.i(TAG, "registerSession: Target with target id " + getTargetId() + " is attached to " + this.mRegisteredSessionsMap.size() + " sessions");
    }

    public void registerToCatalog() {
        this.mTargetCatalog.add(this);
    }

    public void unregisterSession(String str) {
        this.mRegisteredSessionsMap.remove(str);
        Log.i(TAG, "unregisterSession: Target with target id " + getTargetId() + " is attached to " + this.mRegisteredSessionsMap.size() + " sessions");
    }

    public void unregisterToCatalog() {
        this.mTargetCatalog.remove(getTargetId());
    }
}
