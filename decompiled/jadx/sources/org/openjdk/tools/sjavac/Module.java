package org.openjdk.tools.sjavac;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.openjdk.tools.sjavac.pubapi.PubApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Module implements Comparable<Module> {
    private String dirname;
    private String name;
    private Map<String, Package> packages = new HashMap();
    private Map<String, Source> sources = new HashMap();
    private Map<String, File> artifacts = new HashMap();

    public Module(String str, String str2) {
        this.name = str;
        this.dirname = str;
    }

    public static Module load(String str) {
        int indexOf = str.indexOf(58, 2);
        if (indexOf == -1) {
            return null;
        }
        return new Module(str.substring(2, indexOf), "");
    }

    public static void saveModules(Map<String, Module> map, StringBuilder sb) {
        Iterator<Module> it2 = map.values().iterator();
        while (it2.hasNext()) {
            it2.next().save(sb);
        }
    }

    public void addArtifacts(String str, Set<URI> set) {
        Package lookupPackage = lookupPackage(str);
        Iterator<URI> it2 = set.iterator();
        while (it2.hasNext()) {
            lookupPackage.addArtifact(new File(it2.next()));
        }
    }

    public void addPackage(Package r2) {
        this.packages.put(r2.name(), r2);
    }

    public void addSource(String str, Source source) {
        Package lookupPackage = lookupPackage(str);
        source.setPackage(lookupPackage);
        lookupPackage.addSource(source);
        this.sources.put(source.file().getPath(), source);
    }

    public Map<String, File> artifacts() {
        return this.artifacts;
    }

    @Override // java.lang.Comparable
    public int compareTo(Module module) {
        return this.name.compareTo(module.name);
    }

    public String dirname() {
        return this.dirname;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Module) && this.name.equals(((Module) obj).name);
    }

    public boolean hasPubapiChanged(String str, PubApi pubApi) {
        return lookupPackage(str).hasPubApiChanged(pubApi);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public Package lookupPackage(String str) {
        Package r0 = this.packages.get(str);
        if (r0 != null) {
            return r0;
        }
        Package r02 = new Package(this, str);
        this.packages.put(str, r02);
        return r02;
    }

    public Source lookupSource(String str) {
        return this.sources.get(str);
    }

    public String name() {
        return this.name;
    }

    public Map<String, Package> packages() {
        return this.packages;
    }

    public void save(StringBuilder sb) {
        sb.append("M ");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.name, ":", "\n");
        Package.savePackages(this.packages, sb);
    }

    public void setDependencies(String str, Map<String, Set<String>> map, boolean z) {
        lookupPackage(str).setDependencies(map, z);
    }

    public void setPubapi(String str, PubApi pubApi) {
        lookupPackage(str).setPubapi(pubApi);
    }

    public Map<String, Source> sources() {
        return this.sources;
    }
}
