package com.amazon.dee.app.framework.startup.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class PackageDetail {
    private final String componentName;
    private final Class interfaceName;
    private final String resourceId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PackageDetailBuilder {
        private Class className;
        private String componentName;
        private String resourceId;

        public PackageDetail create() {
            return new PackageDetail(this.className, this.componentName, this.resourceId);
        }

        public PackageDetailBuilder setClassName(Class cls) {
            this.className = cls;
            return this;
        }

        public PackageDetailBuilder setComponentName(String str) {
            this.componentName = str;
            return this;
        }

        public PackageDetailBuilder setResourceId(String str) {
            this.resourceId = str;
            return this;
        }
    }

    public PackageDetail(Class cls, String str, String str2) {
        this.interfaceName = cls;
        this.componentName = str;
        this.resourceId = str2;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public Class getInterfaceName() {
        return this.interfaceName;
    }

    public String getResourceId() {
        return this.resourceId;
    }
}
