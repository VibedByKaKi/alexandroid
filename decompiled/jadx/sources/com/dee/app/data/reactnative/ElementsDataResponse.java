package com.dee.app.data.reactnative;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ElementsDataResponse {

    @Nullable
    public ElementsCacheMetadata cacheMetadata;

    @Nullable
    public String contentType;

    @Nullable
    public DataBlob data;

    @Nullable
    public Map<String, String> headers;

    @Nullable
    public String id;
    public int statusCode;

    @Nullable
    public String statusText;

    @Nullable
    public String uri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElementsDataResponse elementsDataResponse = (ElementsDataResponse) obj;
        String str = this.contentType;
        String str2 = elementsDataResponse.contentType;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.uri;
        String str4 = elementsDataResponse.uri;
        if (str3 == null ? str4 != null : !str3.equals(str4)) {
            return false;
        }
        DataBlob dataBlob = this.data;
        DataBlob dataBlob2 = elementsDataResponse.data;
        if (dataBlob == null ? dataBlob2 != null : !dataBlob.equals(dataBlob2)) {
            return false;
        }
        ElementsCacheMetadata elementsCacheMetadata = this.cacheMetadata;
        ElementsCacheMetadata elementsCacheMetadata2 = elementsDataResponse.cacheMetadata;
        if (elementsCacheMetadata == null ? elementsCacheMetadata2 != null : !elementsCacheMetadata.equals(elementsCacheMetadata2)) {
            return false;
        }
        Map<String, String> map = this.headers;
        Map<String, String> map2 = elementsDataResponse.headers;
        if (map == null ? map2 != null : !map.equals(map2)) {
            return false;
        }
        String str5 = this.id;
        String str6 = elementsDataResponse.id;
        if (str5 == null ? str6 != null : !str5.equals(str6)) {
            return false;
        }
        if (this.statusCode != elementsDataResponse.statusCode) {
            return false;
        }
        String str7 = this.statusText;
        String str8 = elementsDataResponse.statusText;
        return str7 == null ? str8 == null : str7.equals(str8);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = str != null ? str.hashCode() : 0;
        Map<String, String> map = this.headers;
        int hashCode2 = Integer.valueOf(this.statusCode).hashCode() + hashCode + (map != null ? map.hashCode() : 0);
        String str2 = this.contentType;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        String str3 = this.statusText;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        String str4 = this.uri;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        ElementsCacheMetadata elementsCacheMetadata = this.cacheMetadata;
        int hashCode6 = hashCode5 + (elementsCacheMetadata != null ? elementsCacheMetadata.hashCode() : 0);
        DataBlob dataBlob = this.data;
        return hashCode6 + (dataBlob != null ? dataBlob.hashCode() : 0);
    }
}
