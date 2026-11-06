package com.amazon.alexa.accessory.repositories.firmware;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.kota.PackageCandidateIdentifier;
import com.amazon.alexa.accessory.kota.PackageIdentifier;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface FirmwareContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ArtifactFilter {
        private final String artifactKey;
        private final String artifactType;
        private final Map<String, List<String>> filters;
        private final String name;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            private String artifactKey;
            private String artifactType;
            private Map<String, List<String>> filters;
            private String name;

            public Builder artifactKey(String str) {
                this.artifactKey = str;
                return this;
            }

            public Builder artifactType(String str) {
                this.artifactType = str;
                return this;
            }

            public ArtifactFilter build() {
                Preconditions.notNull(this.name, "name");
                Preconditions.notNull(this.artifactType, "artifactType");
                Preconditions.notNull(this.artifactKey, "artifactKey");
                Preconditions.notNull(this.filters, "filters");
                return new ArtifactFilter(this);
            }

            public Builder filters(Map<String, List<String>> map) {
                this.filters = map;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }
        }

        public ArtifactFilter(Builder builder) {
            this.name = builder.name;
            this.artifactType = builder.artifactType;
            this.artifactKey = builder.artifactKey;
            this.filters = builder.filters;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ArtifactFilter.class != obj.getClass()) {
                return false;
            }
            ArtifactFilter artifactFilter = (ArtifactFilter) obj;
            if (Objects.equals(this.name, artifactFilter.name) && Objects.equals(this.artifactType, artifactFilter.artifactType) && Objects.equals(this.artifactKey, artifactFilter.artifactKey)) {
                return Objects.equals(this.filters, artifactFilter.filters);
            }
            return false;
        }

        public String getArtifactKey() {
            return this.artifactKey;
        }

        public String getArtifactType() {
            return this.artifactType;
        }

        public Map<String, List<String>> getFilters() {
            return this.filters;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.artifactType;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.artifactKey;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Map<String, List<String>> map = this.filters;
            int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
            String str3 = this.name;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ArtifactFilter{name='");
            sb.append(this.name);
            sb.append("'artifactType='");
            sb.append(this.artifactType);
            sb.append("'artifactKey='");
            sb.append(this.artifactKey);
            sb.append("', filters='");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.filters, "'}");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Component {
        private final String name;
        private String packageName;
        private final String reference;
        private final int version;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            boolean isVersionSet;
            String name;
            String packageName;
            String reference;
            int version;

            public Component build() {
                Preconditions.notNull(this.name, "name");
                Preconditions.notNull(this.reference, TypedValues.Custom.S_REFERENCE);
                Preconditions.precondition(this.isVersionSet, "Version wasn't set!");
                return new Component(this);
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder reference(String str) {
                this.reference = str;
                return this;
            }

            public Builder version(int i) {
                this.version = i;
                this.isVersionSet = true;
                return this;
            }

            public Builder withPackageName(String str) {
                this.packageName = str;
                return this;
            }
        }

        public Component(Builder builder) {
            this.name = builder.name;
            this.reference = builder.reference;
            this.version = builder.version;
            this.packageName = builder.packageName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Component.class == obj.getClass()) {
                Component component = (Component) obj;
                if (this.version != component.version) {
                    return false;
                }
                String str = this.name;
                String str2 = component.name;
                if (str == null ? str2 != null : !str.equals(str2)) {
                    return false;
                }
                String str3 = this.reference;
                String str4 = component.reference;
                if (str3 == null ? str4 != null : !str3.equals(str4)) {
                    return false;
                }
                String str5 = this.packageName;
                String str6 = component.packageName;
                if (str5 != null) {
                    return str5.equals(str6);
                }
                if (str6 == null) {
                    return true;
                }
            }
            return false;
        }

        public String getName() {
            return this.name;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getReference() {
            return this.reference;
        }

        public int getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.reference;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.version) * 31;
            String str3 = this.packageName;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Component{name='");
            sb.append(this.name);
            sb.append("', reference='");
            sb.append(this.reference);
            sb.append("', version=");
            sb.append(this.version);
            sb.append(", packageName='");
            return a$$ExternalSyntheticOutline0.m(sb, this.packageName, "'}");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Package {
        private static final String ARTIFACT_KEY_JSON_KEY = "artifactKey";
        private static final String ARTIFACT_TYPE_JSON_KEY = "artifactType";
        private static final String DEVICE_ARTIFACTS_JSON_KEY = "device_artifacts";
        private static final String FILTERS_JSON_KEY = "filters";
        private static final String NAME_JSON_KEY = "name";
        private static final String TAG = "FirmwareContract.Package:";
        private final File file;
        private volatile JSONObject fileJSON;
        private final PackageIdentifier packageIdentifier;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Metadata {
            private final String reference;

            public Metadata(String str) {
                Preconditions.notNull(str, TypedValues.Custom.S_REFERENCE);
                this.reference = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Metadata.class != obj.getClass()) {
                    return false;
                }
                return this.reference.equals(((Metadata) obj).reference);
            }

            public String getReference() {
                return this.reference;
            }

            public int hashCode() {
                return this.reference.hashCode();
            }

            public String toString() {
                return a$$ExternalSyntheticOutline0.m(new StringBuilder("Metadata{reference='"), this.reference, "'}");
            }
        }

        private Package(File file, PackageIdentifier packageIdentifier) {
            Preconditions.notNull(file, "file");
            Preconditions.notNull(packageIdentifier, NotificationConstants.PACKAGE_IDENTIFIER_KEY);
            this.file = file;
            this.packageIdentifier = packageIdentifier;
        }

        public static Package create(File file) throws IOException, ParseException {
            Preconditions.notNull(file, "file");
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Buffer$$ExternalSyntheticBUOutline0.m$2(String.format(Locale.US, "Directory of file was null! File: %s", file));
                return null;
            }
            try {
                return create(parentFile, PackageIdentifier.fromIdentifierString(file.getName()));
            } catch (ParseException e) {
                Logger.e("Error trying to parse firmware file name %s, deleted it: %b", e, file.getName(), Boolean.valueOf(file.delete()));
                throw e;
            }
        }

        private synchronized JSONObject getFileJSON() throws IOException, JSONException {
            if (this.fileJSON != null) {
                return this.fileJSON;
            }
            ZipFile zipFile = new ZipFile(this.file, 1);
            try {
                ZipEntry entry = zipFile.getEntry("index.json");
                if (entry == null) {
                    throw new IOException("Unable to get index.json from zip file " + this.file.getName());
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    this.fileJSON = new JSONObject(new String(IOUtils.streamToByteArray(inputStream)));
                    JSONObject jSONObject = this.fileJSON;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    zipFile.close();
                    return jSONObject;
                } finally {
                }
            } finally {
            }
        }

        public static Package greaterHop(Package r2, Package r3) {
            Preconditions.notNull(r2, "package1");
            Preconditions.notNull(r3, "package2");
            return r2.packageIdentifier.updateVersion.intValue() > r3.packageIdentifier.updateVersion.intValue() ? r2 : r3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Package.class == obj.getClass()) {
                Package r5 = (Package) obj;
                if (Objects.equals(this.file, r5.file) && Objects.equals(this.packageIdentifier, r5.packageIdentifier)) {
                    return true;
                }
            }
            return false;
        }

        public List<ArtifactFilter> getArtifactFilters() throws JSONException, IOException {
            JSONObject fileJSON = getFileJSON();
            if (!fileJSON.has(DEVICE_ARTIFACTS_JSON_KEY)) {
                Logger.d("%s Filter does not exist in the package. No DAVS component to update.", TAG);
                return Collections.EMPTY_LIST;
            }
            JSONArray jSONArray = fileJSON.getJSONArray(DEVICE_ARTIFACTS_JSON_KEY);
            if (jSONArray.length() == 0) {
                throw new JSONException("Device artifacts are malformed for " + this.file.getName());
            }
            ArrayList arrayList = new ArrayList();
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, List<String>>>() { // from class: com.amazon.alexa.accessory.repositories.firmware.FirmwareContract.Package.1
            }.getType();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new ArtifactFilter.Builder().name(jSONObject.getString("name")).artifactType(jSONObject.getString(ARTIFACT_TYPE_JSON_KEY)).artifactKey(jSONObject.getString(ARTIFACT_KEY_JSON_KEY)).filters((Map) gson.fromJson(jSONObject.getJSONObject(FILTERS_JSON_KEY).toString(), type)).build());
            }
            return arrayList;
        }

        public Component getComponent(String str) throws JSONException, IOException {
            for (Component component : getComponents()) {
                if (component.getName().equals(str)) {
                    return component;
                }
            }
            Path$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("No matching component found with name ", str));
            return null;
        }

        public List<Component> getComponents() throws IOException, JSONException {
            JSONArray jSONArray = getFileJSON().getJSONArray("components");
            if (jSONArray.length() == 0) {
                throw new JSONException("Components are malformed for " + this.file.getName());
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new Component.Builder().version(jSONArray.getJSONObject(i).getInt("version")).name(jSONArray.getJSONObject(i).getString("name")).reference(jSONArray.getJSONObject(i).getString(TypedValues.Custom.S_REFERENCE)).withPackageName(this.file.getName()).build());
            }
            return arrayList;
        }

        public Integer getCurrentVersion() {
            return this.packageIdentifier.packageCandidateIdentifier.currentVersion;
        }

        public File getFile() {
            return this.file;
        }

        public Metadata getMetadata() throws IOException, JSONException {
            return new Metadata(getFileJSON().getJSONObject("metadata").getString(TypedValues.Custom.S_REFERENCE));
        }

        public String getName() throws IOException, JSONException {
            return getFileJSON().getString("name");
        }

        public String getReference() {
            return this.file.getPath();
        }

        public int getVersion() throws IOException, JSONException {
            return getFileJSON().getInt("version");
        }

        public int hashCode() {
            return Objects.hash(this.file, this.packageIdentifier, this.fileJSON);
        }

        public boolean isCandidate(PackageCandidateIdentifier packageCandidateIdentifier) {
            Preconditions.notNull(this.packageIdentifier, NotificationConstants.PACKAGE_IDENTIFIER_KEY);
            return this.packageIdentifier.packageCandidateIdentifier.equals(packageCandidateIdentifier);
        }

        public static Package create(File file, PackageIdentifier packageIdentifier) {
            return new Package(new File(file, packageIdentifier.toIdentifierString()), packageIdentifier);
        }
    }
}
