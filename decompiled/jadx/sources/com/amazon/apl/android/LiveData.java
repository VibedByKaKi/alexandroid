package com.amazon.apl.android;

import com.amazon.common.BoundObject;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class LiveData extends BoundObject {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Update {
        private int index;
        private String key;
        private String type;
        private Object value;

        public Update(String str, int i, String str2, Object obj) {
            this.type = str;
            this.index = i;
            this.key = str2;
            this.value = obj;
        }

        public int getIndex() {
            return this.index;
        }

        public String getKey() {
            return this.key;
        }

        public String getType() {
            return this.type;
        }

        public Object getValue() {
            return this.value;
        }
    }

    public abstract boolean applyUpdates(List<Update> list);
}
