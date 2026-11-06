package com.amazon.alexa.accessorykit.accessories.session.firmware;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.kota.BinaryMetadata;
import com.amazon.alexa.accessorykit.ContainerProvider;
import com.amazon.alexa.accessorykit.accessories.MapModelTransformer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.text.ParseException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class BinaryMetadataModelTransformer implements MapModelTransformer<BinaryMetadata> {

    @VisibleForTesting
    static final String JSON_BINARY_TYPE = "binaryType";

    @VisibleForTesting
    static final String JSON_FILE_SIZE = "fileSize";

    @VisibleForTesting
    static final String JSON_MD5_SUM = "md5Sum";
    private final ContainerProvider containerProvider;

    public BinaryMetadataModelTransformer(ContainerProvider containerProvider) {
        Preconditions.notNull(containerProvider, "containerProvider");
        this.containerProvider = containerProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessorykit.accessories.MapModelTransformer
    public BinaryMetadata transform(ReadableMap readableMap) throws ParseException {
        throw new ParseException("Not supported", 0);
    }

    @Override // com.amazon.alexa.accessorykit.accessories.MapModelTransformer
    public WritableMap transformToMap(BinaryMetadata binaryMetadata) {
        WritableMap map = this.containerProvider.getMap();
        map.putString(JSON_BINARY_TYPE, binaryMetadata.getBinaryType());
        map.putString(JSON_MD5_SUM, binaryMetadata.getMd5Sum());
        long fileSize = binaryMetadata.getFileSize();
        if (fileSize >= 0) {
            map.putDouble("fileSize", fileSize);
        }
        return map;
    }
}
