package com.amazon.coral.model;

import com.amazon.coral.model.xml.Definition;
import com.amazon.coral.model.xml.TraitsBuilder;
import java.util.Collection;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TraitDescriptor {
    private final TraitsBuilder builder;
    private final String name;
    private final Map<String, TraitPropertyDescriptor> properties;
    private final Collection<Class<?>> targets;
    private final Class<? extends Traits> type;

    public TraitDescriptor(Class<? extends Traits> cls, TraitsBuilder traitsBuilder, String str, Collection<Class<?>> collection, Map<String, TraitPropertyDescriptor> map) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("type cannot be null");
            throw null;
        }
        if (traitsBuilder == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("constructor cannot be null");
            throw null;
        }
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("name cannot be null");
            throw null;
        }
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("targets cannot be null");
            throw null;
        }
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("properties cannot be null");
            throw null;
        }
        this.type = cls;
        this.builder = traitsBuilder;
        this.name = str;
        this.targets = collection;
        this.properties = map;
    }

    public String getName() {
        return this.name;
    }

    public Collection<TraitPropertyDescriptor> getProperties() {
        return this.properties.values();
    }

    public TraitPropertyDescriptor getProperty(String str) {
        return this.properties.get(str);
    }

    public Collection<Class<?>> getTargets() {
        return this.targets;
    }

    public Class<? extends Traits> getType() {
        return this.type;
    }

    public Traits newInstance(Definition definition, Definition definition2) {
        return this.builder.build(definition, definition2);
    }
}
