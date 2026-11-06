package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class CaptionResponse {
    static final String EMPTY_DIALOG_REQUEST_ID = "";
    private final String content;
    private final String dialogRequestId;
    private final TextResponseMetadata metadata;
    private final CaptionFormat type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<CaptionResponse> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum CaptionResponseKeys implements Bundles.Key {
            CAPTION_CONTENT,
            CAPTION_TYPE,
            META_DATA,
            DIALOG_REQUEST_ID
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public CaptionResponse createFromBundle(Bundle bundle) {
            String string = bundle.getString(CaptionResponseKeys.CAPTION_CONTENT.name());
            String string2 = bundle.getString(CaptionResponseKeys.CAPTION_TYPE.name(), CaptionFormat.RAW.name());
            Serializable serializable = bundle.getSerializable(CaptionResponseKeys.META_DATA.name());
            return new CaptionResponse(string, CaptionFormat.valueOf(string2), serializable != null ? (TextResponseMetadata) serializable : null, bundle.getString(CaptionResponseKeys.DIALOG_REQUEST_ID.name(), ""));
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(CaptionResponse captionResponse) {
            Bundle bundle = new Bundle();
            bundle.putString(CaptionResponseKeys.CAPTION_CONTENT.name(), captionResponse.content);
            if (captionResponse.type == null) {
                bundle.putString(CaptionResponseKeys.CAPTION_TYPE.name(), CaptionFormat.RAW.name());
            } else {
                bundle.putString(CaptionResponseKeys.CAPTION_TYPE.name(), captionResponse.type.name());
            }
            bundle.putSerializable(CaptionResponseKeys.META_DATA.name(), captionResponse.metadata);
            bundle.putString(CaptionResponseKeys.DIALOG_REQUEST_ID.name(), captionResponse.dialogRequestId);
            return bundle;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CaptionFormat {
        WEBVTT,
        RAW
    }

    public CaptionResponse(String str, CaptionFormat captionFormat) {
        this.content = str;
        this.type = captionFormat;
        this.metadata = null;
        this.dialogRequestId = "";
    }

    public String getContent() {
        return this.content;
    }

    public String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public TextResponseMetadata getMetadata() {
        return this.metadata;
    }

    public CaptionFormat getType() {
        return this.type;
    }

    public CaptionResponse(String str, CaptionFormat captionFormat, TextResponseMetadata textResponseMetadata) {
        this.content = str;
        this.type = captionFormat;
        this.metadata = textResponseMetadata;
        this.dialogRequestId = "";
    }

    public CaptionResponse(String str, CaptionFormat captionFormat, TextResponseMetadata textResponseMetadata, String str2) {
        this.content = str;
        this.type = captionFormat;
        this.metadata = textResponseMetadata;
        this.dialogRequestId = str2;
    }
}
