package com.esotericsoftware.kryo;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import org.objenesis.instantiator.ObjectInstantiator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Registration {
    private final int id;
    private ObjectInstantiator instantiator;
    private Serializer serializer;
    private final Class type;

    public Registration(Class cls, Serializer serializer, int i) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("type cannot be null.");
            throw null;
        }
        if (serializer == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("serializer cannot be null.");
            throw null;
        }
        this.type = cls;
        this.serializer = serializer;
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    public ObjectInstantiator getInstantiator() {
        return this.instantiator;
    }

    public Serializer getSerializer() {
        return this.serializer;
    }

    public Class getType() {
        return this.type;
    }

    public void setInstantiator(ObjectInstantiator objectInstantiator) {
        if (objectInstantiator != null) {
            this.instantiator = objectInstantiator;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("instantiator cannot be null.");
        }
    }

    public void setSerializer(Serializer serializer) {
        if (serializer == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("serializer cannot be null.");
            return;
        }
        this.serializer = serializer;
        if (Log.TRACE) {
            Log.trace("kryo", "Update registered serializer: " + this.type.getName() + " (" + serializer.getClass().getName() + MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public String toString() {
        return MarkdownConstants.LEFT_BRACKET + this.id + ", " + Util.className(this.type) + MarkdownConstants.RIGHT_BRACKET;
    }
}
