package org.bouncycastle.crypto.engines;

import com.amazon.alexa.accessory.internal.bluetooth.GenericAccessProfile;
import com.amazon.alexa.presence.bleconn.service.protocols.relationships.RequesterRelationshipsPacketV1;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import okio.Utf8;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class DSTU7624Engine implements BlockCipher {
    private static final int ROUNDS_128 = 10;
    private static final int ROUNDS_256 = 14;
    private static final int ROUNDS_512 = 18;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, -40, 9, 109, -13, 29, -53, -55, 77, JsonWriter.COMMA, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, ByteSourceJsonBootstrapper.UTF8_BOM_3, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, ByteSourceJsonBootstrapper.UTF8_BOM_2, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, GenericAccessProfile.LE_SUPPORTED_FEATURES, 46, -25, -30, 90, -106, 22, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, GenericAccessProfile.MESH_BEACON, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, JsonWriter.ARRAY_START, -37, 56, JsonWriter.OBJECT_START, -61, 30, 34, 51, GenericAccessProfile.URI, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, JsonWriter.ESCAPE, -38, 24, 70, -51, JsonWriter.OBJECT_END, GenericAccessProfile.SERVICE_DATA_128BIT, -80, Utf8.REPLACEMENT_BYTE, 27, -119, -1, -21, -124, 105, JsonWriter.SEMI, -99, -41, -45, 112, 103, 64, -75, -34, JsonWriter.ARRAY_END, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, 47, ByteSourceJsonBootstrapper.UTF8_BOM_1, -24, -116, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, GenericAccessProfile.PB_ADV, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, GenericAccessProfile.MESH_MESSAGE, -123, GenericAccessProfile.INDOOR_POSITIONING, -26, -54, 124, -117, 86, Byte.MIN_VALUE};
    private static final byte[] S1 = {-50, ByteSourceJsonBootstrapper.UTF8_BOM_2, -21, -110, -22, -53, 19, -63, -23, JsonWriter.SEMI, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, JsonWriter.ESCAPE, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, 46, -9, 8, JsonWriter.ARRAY_END, 68, 62, -97, 20, -56, -82, 84, 16, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, JsonWriter.ARRAY_START, -52, 60, 25, -95, -127, 73, JsonWriter.OBJECT_START, -39, 111, 55, 96, -54, -25, GenericAccessProfile.MESH_BEACON, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, Utf8.REPLACEMENT_BYTE, -105, -44, 98, 45, 6, -92, -91, -125, 95, GenericAccessProfile.MESH_MESSAGE, -38, -55, 0, 126, -94, 85, ByteSourceJsonBootstrapper.UTF8_BOM_3, 17, -43, -100, -49, 14, 10, 61, 81, JsonWriter.OBJECT_END, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, ByteSourceJsonBootstrapper.UTF8_BOM_1, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, 118, 29, GenericAccessProfile.INDOOR_POSITIONING, GenericAccessProfile.URI, 5, -15, 110, -108, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, JsonWriter.COMMA, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, 90, -19, -89, 102, GenericAccessProfile.SERVICE_DATA_128BIT, Byte.MAX_VALUE, -118, GenericAccessProfile.LE_SUPPORTED_FEATURES, -57, -64, GenericAccessProfile.PB_ADV, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, GenericAccessProfile.MESH_BEACON, -62, -108, -12, ByteSourceJsonBootstrapper.UTF8_BOM_2, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, JsonWriter.ESCAPE, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, JsonWriter.COMMA, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, GenericAccessProfile.INDOOR_POSITIONING, -91, -41, 3, 17, 0, -61, 46, -110, ByteSourceJsonBootstrapper.UTF8_BOM_1, 78, 18, -99, JsonWriter.OBJECT_END, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, JsonWriter.OBJECT_START, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, JsonWriter.ARRAY_END, 109, Utf8.REPLACEMENT_BYTE, -120, -115, -57, -9, 29, -23, -20, -19, Byte.MIN_VALUE, GenericAccessProfile.PB_ADV, GenericAccessProfile.LE_SUPPORTED_FEATURES, -49, -103, -88, 80, 15, 55, GenericAccessProfile.URI, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, 48, -107, -46, 62, JsonWriter.ARRAY_START, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, JsonWriter.SEMI, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, -80, -22, 75, 100, -124, -126, 107, -11, 121, ByteSourceJsonBootstrapper.UTF8_BOM_3, 1, 95, 117, 99, 27, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, 61, 104, GenericAccessProfile.MESH_MESSAGE, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, GenericAccessProfile.SERVICE_DATA_128BIT, -117, -8, 12, 116, 103};
    private static final byte[] S3 = {104, -115, -54, 77, 115, 75, 78, GenericAccessProfile.MESH_MESSAGE, -44, 82, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, GenericAccessProfile.INDOOR_POSITIONING, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, JsonWriter.ARRAY_END, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, JsonWriter.SEMI, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, JsonWriter.COMMA, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, GenericAccessProfile.URI, -90, -88, -20, 103, 32, -37, 124, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, -35, -84, JsonWriter.ARRAY_START, 52, 126, 16, -15, JsonWriter.OBJECT_START, -113, 99, -96, 5, -102, 67, 119, GenericAccessProfile.SERVICE_DATA_128BIT, ByteSourceJsonBootstrapper.UTF8_BOM_3, GenericAccessProfile.LE_SUPPORTED_FEATURES, 9, -61, -97, -74, -41, GenericAccessProfile.PB_ADV, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, Utf8.REPLACEMENT_BYTE, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, GenericAccessProfile.MESH_BEACON, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, JsonWriter.ESCAPE, -127, 53, -34, -76, -91, -4, Byte.MIN_VALUE, ByteSourceJsonBootstrapper.UTF8_BOM_1, -53, ByteSourceJsonBootstrapper.UTF8_BOM_2, 107, 118, -70, 90, JsonWriter.OBJECT_END, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};
    private static final byte[] T0 = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, -46, -83, -25, -45, GenericAccessProfile.LE_SUPPORTED_FEATURES, JsonWriter.ARRAY_START, -29, -95, -24, -26, 124, GenericAccessProfile.MESH_MESSAGE, 85, 12, -122, 57, -41, -115, -72, 18, 111, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, -51, -118, 112, 86, 114, -7, ByteSourceJsonBootstrapper.UTF8_BOM_3, 79, 115, -23, -9, 87, 22, -84, 80, -64, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, -36, -50, 32, -116, -103, 95, 68, 1, -11, 30, -121, 94, 97, JsonWriter.COMMA, 75, 29, -127, 21, -12, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, -42, -22, -31, 103, -15, Byte.MAX_VALUE, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, 16, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, -49, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, ByteSourceJsonBootstrapper.UTF8_BOM_1, 120, 76, -52, -98, 48, 46, PSSSigner.TRAILER_IMPLICIT, 11, 84, 26, -90, ByteSourceJsonBootstrapper.UTF8_BOM_2, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, Byte.MIN_VALUE, 72, -108, 50, JsonWriter.OBJECT_END, -89, Utf8.REPLACEMENT_BYTE, -82, 34, 61, 102, -86, -10, 0, JsonWriter.ARRAY_END, -67, 74, -32, 59, -76, 23, -117, -97, 118, -80, GenericAccessProfile.URI, -102, GenericAccessProfile.INDOOR_POSITIONING, 99, -37, -21, 122, 62, JsonWriter.ESCAPE, -77, -79, GenericAccessProfile.PB_ADV, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, 19, 73, -120, -78, -20, -28, 52, 45, -106, -58, JsonWriter.SEMI, -19, -107, 14, -27, -123, 107, 64, GenericAccessProfile.SERVICE_DATA_128BIT, -101, 9, 25, GenericAccessProfile.MESH_BEACON, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, JsonWriter.OBJECT_START, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};
    private static final byte[] T1 = {-125, -14, GenericAccessProfile.MESH_MESSAGE, -21, -23, ByteSourceJsonBootstrapper.UTF8_BOM_3, JsonWriter.OBJECT_START, -100, 52, -106, -115, -104, -71, 105, -116, GenericAccessProfile.PB_ADV, 61, -120, 104, 6, 57, 17, 76, 14, -96, 86, 64, -110, 21, PSSSigner.TRAILER_IMPLICIT, -77, -36, 111, -8, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, -70, -66, -67, 49, -5, -61, -2, Byte.MIN_VALUE, 97, -31, 122, 50, -46, 112, 32, -95, 69, -20, -39, 26, JsonWriter.ARRAY_END, -76, -40, 9, -91, 85, -114, 55, 118, -87, 103, 16, 23, 54, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, 18, 29, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, ByteSourceJsonBootstrapper.UTF8_BOM_1, -12, 83, 25, 53, -26, Byte.MAX_VALUE, 94, -42, 121, 81, 34, 20, -9, 30, 74, 66, -101, 65, 115, 45, -63, JsonWriter.ESCAPE, -90, -94, -32, 46, -45, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, ByteSourceJsonBootstrapper.UTF8_BOM_2, -55, -82, 106, -47, 90, 48, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, -28, 22, 108, -6, -80, 109, 31, 82, -103, 13, 78, 3, -111, -62, 77, 100, 119, -97, -35, -60, 73, -118, -102, GenericAccessProfile.URI, 56, -89, 87, -123, -57, 124, JsonWriter.OBJECT_END, -25, -10, -73, -84, GenericAccessProfile.LE_SUPPORTED_FEATURES, 70, -34, -33, 59, -41, -98, GenericAccessProfile.MESH_BEACON, 11, -43, 19, 117, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, 114, -74, -99, 27, 1, Utf8.REPLACEMENT_BYTE, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, JsonWriter.SEMI, -126, 95, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, JsonWriter.ARRAY_START, -127, -18, 113, -30, -38, JsonWriter.COMMA, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, -64, -50, 67, GenericAccessProfile.INDOOR_POSITIONING, 28, GenericAccessProfile.SERVICE_DATA_128BIT, 51, 15, -81, 71, -19, 102, 99, -109, -86};
    private static final byte[] T2 = {69, -44, 11, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, JsonWriter.SEMI, -107, 80, 68, 75, -30, 116, 107, 30, 17, 90, -58, -76, -40, -91, -118, 112, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, 18, 49, JsonWriter.COMMA, 71, 106, -103, -82, -56, Byte.MAX_VALUE, -7, 79, JsonWriter.ARRAY_END, -106, 111, -12, -77, 57, GenericAccessProfile.SERVICE_DATA_128BIT, -38, -100, -123, -98, 59, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, ByteSourceJsonBootstrapper.UTF8_BOM_3, ByteSourceJsonBootstrapper.UTF8_BOM_1, 6, -18, -27, 95, 32, 16, -52, 60, 84, 74, 82, -108, 14, -64, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, -10, 86, 96, -94, -29, 15, -20, -99, GenericAccessProfile.URI, -125, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, ByteSourceJsonBootstrapper.UTF8_BOM_2, 29, 26, 47, -80, -2, -42, 52, 99, 53, -46, GenericAccessProfile.MESH_MESSAGE, 89, 109, 77, 119, -25, -114, 97, -49, -97, -50, GenericAccessProfile.LE_SUPPORTED_FEATURES, -11, Byte.MIN_VALUE, -122, -57, -90, -5, -8, -121, -85, 98, Utf8.REPLACEMENT_BYTE, -33, 72, 0, 20, -102, -67, JsonWriter.ARRAY_START, 4, -110, 2, GenericAccessProfile.INDOOR_POSITIONING, 101, 76, 83, 12, -14, GenericAccessProfile.PB_ADV, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, -60, JsonWriter.OBJECT_END, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, PSSSigner.TRAILER_IMPLICIT, -59, -45, 34, -73, 19, 70, 50, -24, 87, -120, GenericAccessProfile.MESH_BEACON, -127, -78, 78, 100, 28, -86, -111, 88, 46, -101, JsonWriter.ESCAPE, 27, 81, 115, 66, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, 1, 110, -13, 13, -66, 61, 10, 45, 31, 103, 51, 25, JsonWriter.OBJECT_START, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, 21, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};
    private static final byte[] T3 = {-78, -74, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, GenericAccessProfile.LE_SUPPORTED_FEATURES, -51, 24, 81, 98, 45, -9, JsonWriter.ESCAPE, 14, 59, -3, -54, -101, 13, 15, 121, -116, 16, 76, 116, 28, 10, -114, 124, -108, 7, -57, 94, 20, -95, GenericAccessProfile.SERVICE_DATA_128BIT, 87, 80, 78, -87, Byte.MIN_VALUE, -39, ByteSourceJsonBootstrapper.UTF8_BOM_1, 100, 65, -49, 60, -18, 46, 19, GenericAccessProfile.PB_ADV, -70, 52, 90, -82, -118, 97, 51, 18, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, GenericAccessProfile.INDOOR_POSITIONING, 9, 22, 12, GenericAccessProfile.MESH_MESSAGE, 56, -4, 32, -12, -27, Byte.MAX_VALUE, -41, 49, GenericAccessProfile.MESH_BEACON, 102, 111, -1, 114, -122, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, -93, 47, 120, 0, PSSSigner.TRAILER_IMPLICIT, -52, -30, -80, -15, 66, -76, 48, 95, 96, 4, -20, -91, -29, -117, -25, 29, ByteSourceJsonBootstrapper.UTF8_BOM_3, -124, JsonWriter.OBJECT_START, -26, -127, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, -111, -121, 88, -67, -55, -104, -36, 117, -64, 118, -11, 103, 107, 126, -21, 82, -53, -47, JsonWriter.ARRAY_START, -97, 11, -37, 64, -110, 26, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, JsonWriter.ARRAY_END, -73, -63, -81, 84, -5, 2, -32, 53, ByteSourceJsonBootstrapper.UTF8_BOM_2, JsonWriter.SEMI, 77, -83, JsonWriter.COMMA, 61, 86, 8, 27, 74, -109, 106, -85, -72, 122, -14, JsonWriter.OBJECT_END, -38, Utf8.REPLACEMENT_BYTE, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, 112, -106, 119, GenericAccessProfile.URI, 83, -33, -13, -125, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, 50, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};
    private boolean forEncryption;
    private long[] internalState;
    private long[][] roundKeys;
    private int roundsAmount;
    private int wordsInBlock;
    private int wordsInKey;
    private long[] workingKey;

    public DSTU7624Engine(int i) throws IllegalArgumentException {
        if (i != 128 && i != 256 && i != 512) {
            Single$$ExternalSyntheticBUOutline0.m$3("unsupported block length: only 128/256/512 are allowed");
            throw null;
        }
        int i2 = i >>> 6;
        this.wordsInBlock = i2;
        this.internalState = new long[i2];
    }

    private void addRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i2 = 0; i2 < this.wordsInBlock; i2++) {
            long[] jArr2 = this.internalState;
            jArr2[i2] = jArr2[i2] + jArr[i2];
        }
    }

    private void decryptBlock_128(byte[] bArr, int i, byte[] bArr2, int i2) {
        long littleEndianToLong = Pack.littleEndianToLong(bArr, i);
        long littleEndianToLong2 = Pack.littleEndianToLong(bArr, i + 8);
        long[][] jArr = this.roundKeys;
        int i3 = this.roundsAmount;
        long[] jArr2 = jArr[i3];
        boolean z = false;
        long j = littleEndianToLong - jArr2[0];
        boolean z2 = true;
        long j2 = littleEndianToLong2 - jArr2[1];
        while (true) {
            long mixColumnInv = mixColumnInv(j);
            long mixColumnInv2 = mixColumnInv(j2);
            int i4 = (int) mixColumnInv;
            int i5 = (int) (mixColumnInv >>> 32);
            int i6 = (int) mixColumnInv2;
            int i7 = (int) (mixColumnInv2 >>> 32);
            byte[] bArr3 = T0;
            byte b = bArr3[i4 & 255];
            byte[] bArr4 = T1;
            byte b2 = bArr4[(i4 >>> 8) & 255];
            byte[] bArr5 = T2;
            boolean z3 = z;
            byte b3 = bArr5[(i4 >>> 16) & 255];
            byte[] bArr6 = T3;
            int i8 = (bArr6[i4 >>> 24] << 24) | ((b3 & 255) << 16) | (b & 255) | ((b2 & 255) << 8);
            byte b4 = bArr3[i7 & 255];
            byte b5 = bArr4[(i7 >>> 8) & 255];
            byte b6 = bArr5[(i7 >>> 16) & 255];
            boolean z4 = z2;
            long j3 = (i8 & 4294967295L) | (((bArr6[i7 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16))) << 32);
            int i9 = (bArr6[i6 >>> 24] << 24) | (bArr3[i6 & 255] & 255) | ((bArr4[(i6 >>> 8) & 255] & 255) << 8) | ((bArr5[(i6 >>> 16) & 255] & 255) << 16);
            byte b7 = bArr3[i5 & 255];
            byte b8 = bArr4[(i5 >>> 8) & 255];
            byte b9 = bArr5[(i5 >>> 16) & 255];
            long j4 = (i9 & 4294967295L) | (((bArr6[i5 >>> 24] << 24) | (((b7 & 255) | ((b8 & 255) << 8)) | ((b9 & 255) << 16))) << 32);
            i3--;
            long[][] jArr3 = this.roundKeys;
            if (i3 == 0) {
                long[] jArr4 = jArr3[z3 ? 1 : 0];
                long j5 = j3 - jArr4[z3 ? 1 : 0];
                long j6 = j4 - jArr4[z4 ? 1 : 0];
                Pack.longToLittleEndian(j5, bArr2, i2);
                Pack.longToLittleEndian(j6, bArr2, i2 + 8);
                return;
            }
            long[] jArr5 = jArr3[i3];
            long j7 = jArr5[z3 ? 1 : 0] ^ j3;
            j2 = j4 ^ jArr5[z4 ? 1 : 0];
            j = j7;
            z = z3 ? 1 : 0;
            z2 = z4 ? 1 : 0;
        }
    }

    private void encryptBlock_128(byte[] bArr, int i, byte[] bArr2, int i2) {
        long littleEndianToLong = Pack.littleEndianToLong(bArr, i);
        long littleEndianToLong2 = Pack.littleEndianToLong(bArr, i + 8);
        boolean z = false;
        long[] jArr = this.roundKeys[0];
        long j = littleEndianToLong + jArr[0];
        boolean z2 = true;
        long j2 = littleEndianToLong2 + jArr[1];
        int i3 = 0;
        while (true) {
            int i4 = (int) j;
            int i5 = (int) (j >>> 32);
            int i6 = (int) j2;
            int i7 = (int) (j2 >>> 32);
            byte[] bArr3 = S0;
            byte b = bArr3[i4 & 255];
            byte[] bArr4 = S1;
            byte b2 = bArr4[(i4 >>> 8) & 255];
            byte[] bArr5 = S2;
            boolean z3 = z;
            byte b3 = bArr5[(i4 >>> 16) & 255];
            byte[] bArr6 = S3;
            int i8 = ((b3 & 255) << 16) | (b & 255) | ((b2 & 255) << 8) | (bArr6[i4 >>> 24] << 24);
            byte b4 = bArr3[i7 & 255];
            byte b5 = bArr4[(i7 >>> 8) & 255];
            byte b6 = bArr5[(i7 >>> 16) & 255];
            boolean z4 = z2;
            long j3 = (i8 & 4294967295L) | (((bArr6[i7 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16))) << 32);
            int i9 = (bArr6[i6 >>> 24] << 24) | (bArr3[i6 & 255] & 255) | ((bArr4[(i6 >>> 8) & 255] & 255) << 8) | ((bArr5[(i6 >>> 16) & 255] & 255) << 16);
            byte b7 = bArr3[i5 & 255];
            byte b8 = bArr4[(i5 >>> 8) & 255];
            byte b9 = bArr5[(i5 >>> 16) & 255];
            long j4 = (i9 & 4294967295L) | (((bArr6[i5 >>> 24] << 24) | (((b7 & 255) | ((b8 & 255) << 8)) | ((b9 & 255) << 16))) << 32);
            long mixColumn = mixColumn(j3);
            long mixColumn2 = mixColumn(j4);
            i3++;
            int i10 = this.roundsAmount;
            long[][] jArr2 = this.roundKeys;
            if (i3 == i10) {
                long[] jArr3 = jArr2[i10];
                long j5 = mixColumn + jArr3[z3 ? 1 : 0];
                long j6 = mixColumn2 + jArr3[z4 ? 1 : 0];
                Pack.longToLittleEndian(j5, bArr2, i2);
                Pack.longToLittleEndian(j6, bArr2, i2 + 8);
                return;
            }
            long[] jArr4 = jArr2[i3];
            long j7 = mixColumn ^ jArr4[z3 ? 1 : 0];
            j2 = mixColumn2 ^ jArr4[z4 ? 1 : 0];
            j = j7;
            z = z3 ? 1 : 0;
            z2 = z4 ? 1 : 0;
        }
    }

    private void invShiftRows() {
        int i = this.wordsInBlock;
        if (i == 2) {
            long[] jArr = this.internalState;
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = (j ^ j2) & (-4294967296L);
            jArr[0] = j ^ j3;
            jArr[1] = j3 ^ j2;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.internalState;
            long j4 = jArr2[0];
            long j5 = jArr2[1];
            long j6 = jArr2[2];
            long j7 = jArr2[3];
            long j8 = (j4 ^ j5) & (-281470681808896L);
            long j9 = j4 ^ j8;
            long j10 = j5 ^ j8;
            long j11 = (j6 ^ j7) & (-281470681808896L);
            long j12 = j6 ^ j11;
            long j13 = j7 ^ j11;
            long j14 = (j9 ^ j12) & (-4294967296L);
            long j15 = j9 ^ j14;
            long j16 = (j10 ^ j13) & 281474976645120L;
            jArr2[0] = j15;
            jArr2[1] = j10 ^ j16;
            jArr2[2] = j12 ^ j14;
            jArr2[3] = j16 ^ j13;
            return;
        }
        if (i != 8) {
            Single$$ExternalSyntheticBUOutline0.m$2("unsupported block length: only 128/256/512 are allowed");
            return;
        }
        long[] jArr3 = this.internalState;
        long j17 = jArr3[0];
        long j18 = jArr3[1];
        long j19 = jArr3[2];
        long j20 = jArr3[3];
        long j21 = jArr3[4];
        long j22 = jArr3[5];
        long j23 = jArr3[6];
        long j24 = jArr3[7];
        long j25 = (j17 ^ j18) & (-71777214294589696L);
        long j26 = j17 ^ j25;
        long j27 = j18 ^ j25;
        long j28 = (j19 ^ j20) & (-71777214294589696L);
        long j29 = j19 ^ j28;
        long j30 = j20 ^ j28;
        long j31 = (j21 ^ j22) & (-71777214294589696L);
        long j32 = j21 ^ j31;
        long j33 = j22 ^ j31;
        long j34 = (j23 ^ j24) & (-71777214294589696L);
        long j35 = j23 ^ j34;
        long j36 = j24 ^ j34;
        long j37 = (j26 ^ j29) & (-281470681808896L);
        long j38 = j26 ^ j37;
        long j39 = j29 ^ j37;
        long j40 = (j27 ^ j30) & 72056494543077120L;
        long j41 = j27 ^ j40;
        long j42 = j30 ^ j40;
        long j43 = (j32 ^ j35) & (-281470681808896L);
        long j44 = j32 ^ j43;
        long j45 = j35 ^ j43;
        long j46 = (j33 ^ j36) & 72056494543077120L;
        long j47 = j33 ^ j46;
        long j48 = j36 ^ j46;
        long j49 = (j38 ^ j44) & (-4294967296L);
        long j50 = j38 ^ j49;
        long j51 = j44 ^ j49;
        long j52 = (j41 ^ j47) & 72057594021150720L;
        long j53 = j41 ^ j52;
        long j54 = (j39 ^ j45) & 281474976645120L;
        long j55 = j39 ^ j54;
        long j56 = j54 ^ j45;
        long j57 = (j42 ^ j48) & 1099511627520L;
        jArr3[0] = j50;
        jArr3[1] = j53;
        jArr3[2] = j55;
        jArr3[3] = j42 ^ j57;
        jArr3[4] = j51;
        jArr3[5] = j47 ^ j52;
        jArr3[6] = j56;
        jArr3[7] = j48 ^ j57;
    }

    private void invSubBytes() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            long j = jArr[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte[] bArr = T0;
            byte b = bArr[i2 & 255];
            byte[] bArr2 = T1;
            byte b2 = bArr2[(i2 >>> 8) & 255];
            byte[] bArr3 = T2;
            byte b3 = bArr3[(i2 >>> 16) & 255];
            int i4 = (T3[i2 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
            byte b4 = bArr[i3 & 255];
            byte b5 = bArr2[(i3 >>> 8) & 255];
            byte b6 = bArr3[(i3 >>> 16) & 255];
            jArr[i] = (i4 & 4294967295L) | (((r11[i3 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16))) << 32);
        }
    }

    private static long mixColumn(long j) {
        long mulX = mulX(j);
        long rotate = rotate(8, j) ^ j;
        long rotate2 = (rotate ^ rotate(16, rotate)) ^ rotate(48, j);
        return ((rotate(32, mulX2((j ^ rotate2) ^ mulX)) ^ rotate2) ^ rotate(40, mulX)) ^ rotate(48, mulX);
    }

    private static long mixColumnInv(long j) {
        long rotate = rotate(8, j) ^ j;
        long rotate2 = (rotate ^ rotate(32, rotate)) ^ rotate(48, j);
        long j2 = rotate2 ^ j;
        long rotate3 = rotate(48, j);
        long rotate4 = rotate(56, j);
        long mulX = mulX(j2 ^ rotate4) ^ rotate(56, j2);
        long mulX2 = mulX(rotate(40, mulX(mulX) ^ j) ^ (rotate(16, j2) ^ j)) ^ (j2 ^ rotate3);
        return mulX(rotate(40, ((j ^ rotate(32, j2)) ^ rotate4) ^ mulX(((rotate3 ^ (rotate(24, j) ^ j2)) ^ rotate4) ^ mulX(mulX(mulX2) ^ rotate(16, rotate2))))) ^ rotate2;
    }

    private void mixColumns() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            jArr[i] = mixColumn(jArr[i]);
        }
    }

    private void mixColumnsInv() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            jArr[i] = mixColumnInv(jArr[i]);
        }
    }

    private static long mulX(long j) {
        return (((j & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j) << 1);
    }

    private static long mulX2(long j) {
        return (((j & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j) << 2) ^ ((((-9187201950435737472L) & j) >>> 6) * 29));
    }

    private static long rotate(int i, long j) {
        return (j << (-i)) | (j >>> i);
    }

    private void rotateLeft(long[] jArr, long[] jArr2) {
        int i = this.wordsInBlock;
        if (i == 2) {
            long j = jArr[0];
            long j2 = jArr[1];
            jArr2[0] = (j >>> 56) | (j2 << 8);
            jArr2[1] = (j << 8) | (j2 >>> 56);
            return;
        }
        if (i == 4) {
            long j3 = jArr[0];
            long j4 = jArr[1];
            long j5 = jArr[2];
            long j6 = jArr[3];
            jArr2[0] = (j4 >>> 24) | (j5 << 40);
            jArr2[1] = (j5 >>> 24) | (j6 << 40);
            jArr2[2] = (j6 >>> 24) | (j3 << 40);
            jArr2[3] = (j3 >>> 24) | (j4 << 40);
            return;
        }
        if (i != 8) {
            Single$$ExternalSyntheticBUOutline0.m$2("unsupported block length: only 128/256/512 are allowed");
            return;
        }
        long j7 = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        long j12 = jArr[5];
        long j13 = jArr[6];
        long j14 = jArr[7];
        jArr2[0] = (j9 >>> 24) | (j10 << 40);
        jArr2[1] = (j10 >>> 24) | (j11 << 40);
        jArr2[2] = (j11 >>> 24) | (j12 << 40);
        jArr2[3] = (j12 >>> 24) | (j13 << 40);
        jArr2[4] = (j13 >>> 24) | (j14 << 40);
        jArr2[5] = (j14 >>> 24) | (j7 << 40);
        jArr2[6] = (j7 >>> 24) | (j8 << 40);
        jArr2[7] = (j8 >>> 24) | (j9 << 40);
    }

    private void shiftRows() {
        int i = this.wordsInBlock;
        if (i == 2) {
            long[] jArr = this.internalState;
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = (j ^ j2) & (-4294967296L);
            jArr[0] = j ^ j3;
            jArr[1] = j3 ^ j2;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.internalState;
            long j4 = jArr2[0];
            long j5 = jArr2[1];
            long j6 = jArr2[2];
            long j7 = jArr2[3];
            long j8 = (j4 ^ j6) & (-4294967296L);
            long j9 = j4 ^ j8;
            long j10 = j6 ^ j8;
            long j11 = (j5 ^ j7) & 281474976645120L;
            long j12 = j5 ^ j11;
            long j13 = j7 ^ j11;
            long j14 = (j9 ^ j12) & (-281470681808896L);
            long j15 = (j10 ^ j13) & (-281470681808896L);
            jArr2[0] = j9 ^ j14;
            jArr2[1] = j12 ^ j14;
            jArr2[2] = j10 ^ j15;
            jArr2[3] = j13 ^ j15;
            return;
        }
        if (i != 8) {
            Single$$ExternalSyntheticBUOutline0.m$2("unsupported block length: only 128/256/512 are allowed");
            return;
        }
        long[] jArr3 = this.internalState;
        long j16 = jArr3[0];
        long j17 = jArr3[1];
        long j18 = jArr3[2];
        long j19 = jArr3[3];
        long j20 = jArr3[4];
        long j21 = jArr3[5];
        long j22 = jArr3[6];
        long j23 = jArr3[7];
        long j24 = (j16 ^ j20) & (-4294967296L);
        long j25 = j16 ^ j24;
        long j26 = j20 ^ j24;
        long j27 = (j17 ^ j21) & 72057594021150720L;
        long j28 = j17 ^ j27;
        long j29 = j21 ^ j27;
        long j30 = (j18 ^ j22) & 281474976645120L;
        long j31 = j18 ^ j30;
        long j32 = j22 ^ j30;
        long j33 = (j19 ^ j23) & 1099511627520L;
        long j34 = j19 ^ j33;
        long j35 = j23 ^ j33;
        long j36 = (j25 ^ j31) & (-281470681808896L);
        long j37 = j25 ^ j36;
        long j38 = j31 ^ j36;
        long j39 = (j28 ^ j34) & 72056494543077120L;
        long j40 = j28 ^ j39;
        long j41 = j34 ^ j39;
        long j42 = (j26 ^ j32) & (-281470681808896L);
        long j43 = j26 ^ j42;
        long j44 = j32 ^ j42;
        long j45 = (j29 ^ j35) & 72056494543077120L;
        long j46 = j29 ^ j45;
        long j47 = j35 ^ j45;
        long j48 = (j37 ^ j40) & (-71777214294589696L);
        long j49 = j37 ^ j48;
        long j50 = j40 ^ j48;
        long j51 = (j38 ^ j41) & (-71777214294589696L);
        long j52 = j38 ^ j51;
        long j53 = j41 ^ j51;
        long j54 = (j43 ^ j46) & (-71777214294589696L);
        long j55 = j43 ^ j54;
        long j56 = j46 ^ j54;
        long j57 = (j44 ^ j47) & (-71777214294589696L);
        jArr3[0] = j49;
        jArr3[1] = j50;
        jArr3[2] = j52;
        jArr3[3] = j53;
        jArr3[4] = j55;
        jArr3[5] = j56;
        jArr3[6] = j44 ^ j57;
        jArr3[7] = j47 ^ j57;
    }

    private void subBytes() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            long j = jArr[i];
            int i2 = (int) j;
            int i3 = (int) (j >>> 32);
            byte[] bArr = S0;
            byte b = bArr[i2 & 255];
            byte[] bArr2 = S1;
            byte b2 = bArr2[(i2 >>> 8) & 255];
            byte[] bArr3 = S2;
            byte b3 = bArr3[(i2 >>> 16) & 255];
            int i4 = (S3[i2 >>> 24] << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
            byte b4 = bArr[i3 & 255];
            byte b5 = bArr2[(i3 >>> 8) & 255];
            byte b6 = bArr3[(i3 >>> 16) & 255];
            jArr[i] = (i4 & 4294967295L) | (((r11[i3 >>> 24] << 24) | (((b4 & 255) | ((b5 & 255) << 8)) | ((b6 & 255) << 16))) << 32);
        }
    }

    private void subRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i2 = 0; i2 < this.wordsInBlock; i2++) {
            long[] jArr2 = this.internalState;
            jArr2[i2] = jArr2[i2] - jArr[i2];
        }
    }

    private void workingKeyExpandEven(long[] jArr, long[] jArr2) {
        int i;
        long[] jArr3;
        int i2;
        long[] jArr4;
        int i3 = this.wordsInKey;
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[this.wordsInBlock];
        System.arraycopy(jArr, 0, jArr5, 0, i3);
        long j = 281479271743489L;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 < this.wordsInBlock; i5++) {
                jArr6[i5] = jArr2[i5] + j;
            }
            for (int i6 = 0; i6 < this.wordsInBlock; i6++) {
                this.internalState[i6] = jArr5[i6] + jArr6[i6];
            }
            subBytes();
            shiftRows();
            mixColumns();
            for (int i7 = 0; i7 < this.wordsInBlock; i7++) {
                long[] jArr7 = this.internalState;
                jArr7[i7] = jArr7[i7] ^ jArr6[i7];
            }
            subBytes();
            shiftRows();
            mixColumns();
            int i8 = 0;
            while (true) {
                i = this.wordsInBlock;
                jArr3 = this.internalState;
                if (i8 >= i) {
                    break;
                }
                jArr3[i8] = jArr3[i8] + jArr6[i8];
                i8++;
            }
            System.arraycopy(jArr3, 0, this.roundKeys[i4], 0, i);
            if (this.roundsAmount == i4) {
                return;
            }
            if (this.wordsInBlock != this.wordsInKey) {
                i4 += 2;
                j <<= 1;
                for (int i9 = 0; i9 < this.wordsInBlock; i9++) {
                    jArr6[i9] = jArr2[i9] + j;
                }
                int i10 = 0;
                while (true) {
                    int i11 = this.wordsInBlock;
                    if (i10 >= i11) {
                        break;
                    }
                    this.internalState[i10] = jArr5[i11 + i10] + jArr6[i10];
                    i10++;
                }
                subBytes();
                shiftRows();
                mixColumns();
                for (int i12 = 0; i12 < this.wordsInBlock; i12++) {
                    long[] jArr8 = this.internalState;
                    jArr8[i12] = jArr8[i12] ^ jArr6[i12];
                }
                subBytes();
                shiftRows();
                mixColumns();
                int i13 = 0;
                while (true) {
                    i2 = this.wordsInBlock;
                    jArr4 = this.internalState;
                    if (i13 >= i2) {
                        break;
                    }
                    jArr4[i13] = jArr4[i13] + jArr6[i13];
                    i13++;
                }
                System.arraycopy(jArr4, 0, this.roundKeys[i4], 0, i2);
                if (this.roundsAmount == i4) {
                    return;
                }
            }
            i4 += 2;
            j <<= 1;
            long j2 = jArr5[0];
            for (int i14 = 1; i14 < i3; i14++) {
                jArr5[i14 - 1] = jArr5[i14];
            }
            jArr5[i3 - 1] = j2;
        }
    }

    private void workingKeyExpandKT(long[] jArr, long[] jArr2) {
        int i = this.wordsInBlock;
        long[] jArr3 = new long[i];
        long[] jArr4 = new long[i];
        long[] jArr5 = new long[i];
        this.internalState = jArr5;
        long j = jArr5[0];
        int i2 = this.wordsInKey;
        jArr5[0] = j + i + i2 + 1;
        System.arraycopy(jArr, 0, jArr3, 0, i);
        if (i == i2) {
            System.arraycopy(jArr, 0, jArr4, 0, i);
        } else {
            int i3 = this.wordsInBlock;
            System.arraycopy(jArr, i3, jArr4, 0, i3);
        }
        int i4 = 0;
        while (true) {
            long[] jArr6 = this.internalState;
            if (i4 >= jArr6.length) {
                break;
            }
            jArr6[i4] = jArr6[i4] + jArr3[i4];
            i4++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i5 = 0;
        while (true) {
            long[] jArr7 = this.internalState;
            if (i5 >= jArr7.length) {
                break;
            }
            jArr7[i5] = jArr7[i5] ^ jArr4[i5];
            i5++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i6 = 0;
        while (true) {
            long[] jArr8 = this.internalState;
            if (i6 >= jArr8.length) {
                subBytes();
                shiftRows();
                mixColumns();
                System.arraycopy(this.internalState, 0, jArr2, 0, this.wordsInBlock);
                return;
            }
            jArr8[i6] = jArr8[i6] + jArr3[i6];
            i6++;
        }
    }

    private void workingKeyExpandOdd() {
        for (int i = 1; i < this.roundsAmount; i += 2) {
            long[][] jArr = this.roundKeys;
            rotateLeft(jArr[i - 1], jArr[i]);
        }
    }

    private void xorRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i2 = 0; i2 < this.wordsInBlock; i2++) {
            long[] jArr2 = this.internalState;
            jArr2[i2] = jArr2[i2] ^ jArr[i2];
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.wordsInBlock << 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[LOOP:0: B:21:0x0053->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[EDGE_INSN: B:24:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:21:0x0053->B:23:0x0058], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // org.bouncycastle.crypto.BlockCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r5, org.bouncycastle.crypto.CipherParameters r6) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof org.bouncycastle.crypto.params.KeyParameter
            if (r0 == 0) goto L87
            r4.forEncryption = r5
            org.bouncycastle.crypto.params.KeyParameter r6 = (org.bouncycastle.crypto.params.KeyParameter) r6
            byte[] r5 = r6.getKey()
            int r6 = r5.length
            int r6 = r6 << 3
            int r0 = r4.wordsInBlock
            int r0 = r0 << 6
            r1 = 512(0x200, float:7.17E-43)
            r2 = 256(0x100, float:3.59E-43)
            r3 = 128(0x80, float:1.8E-43)
            if (r6 == r3) goto L26
            if (r6 == r2) goto L26
            if (r6 != r1) goto L20
            goto L26
        L20:
            java.lang.String r4 = "unsupported key length: only 128/256/512 are allowed"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r4)
            return
        L26:
            if (r6 == r0) goto L33
            int r0 = r0 * 2
            if (r6 != r0) goto L2d
            goto L33
        L2d:
            java.lang.String r4 = "Unsupported key length"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r4)
            return
        L33:
            if (r6 == r3) goto L42
            if (r6 == r2) goto L3f
            if (r6 == r1) goto L3a
            goto L45
        L3a:
            r0 = 18
        L3c:
            r4.roundsAmount = r0
            goto L45
        L3f:
            r0 = 14
            goto L3c
        L42:
            r0 = 10
            goto L3c
        L45:
            int r0 = r6 >>> 6
            r4.wordsInKey = r0
            int r0 = r4.roundsAmount
            int r0 = r0 + 1
            long[][] r0 = new long[r0][]
            r4.roundKeys = r0
            r0 = 0
            r1 = r0
        L53:
            long[][] r2 = r4.roundKeys
            int r3 = r2.length
            if (r1 >= r3) goto L61
            int r3 = r4.wordsInBlock
            long[] r3 = new long[r3]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L53
        L61:
            int r1 = r4.wordsInKey
            long[] r1 = new long[r1]
            r4.workingKey = r1
            int r2 = r5.length
            int r6 = r6 >>> 3
            if (r2 != r6) goto L81
            org.bouncycastle.util.Pack.littleEndianToLong(r5, r0, r1)
            int r5 = r4.wordsInBlock
            long[] r5 = new long[r5]
            long[] r6 = r4.workingKey
            r4.workingKeyExpandKT(r6, r5)
            long[] r6 = r4.workingKey
            r4.workingKeyExpandEven(r6, r5)
            r4.workingKeyExpandOdd()
            return
        L81:
            java.lang.String r4 = "Invalid key parameter passed to DSTU7624Engine init"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r4)
            return
        L87:
            java.lang.String r4 = "Invalid parameter passed to DSTU7624Engine init"
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.DSTU7624Engine.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        if (this.workingKey == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("DSTU7624Engine not initialised");
            return 0;
        }
        if (getBlockSize() + i > bArr.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$3("Input buffer too short");
            return 0;
        }
        if (getBlockSize() + i2 > bArr2.length) {
            CrlID$$ExternalSyntheticBUOutline0.m$2("Output buffer too short");
            return 0;
        }
        boolean z = this.forEncryption;
        int i4 = this.wordsInBlock;
        int i5 = 0;
        if (z) {
            if (i4 != 2) {
                Pack.littleEndianToLong(bArr, i, this.internalState);
                addRoundKey(0);
                while (true) {
                    subBytes();
                    shiftRows();
                    mixColumns();
                    i5++;
                    i3 = this.roundsAmount;
                    if (i5 == i3) {
                        break;
                    }
                    xorRoundKey(i5);
                }
                addRoundKey(i3);
                Pack.longToLittleEndian(this.internalState, bArr2, i2);
            } else {
                encryptBlock_128(bArr, i, bArr2, i2);
            }
        } else if (i4 != 2) {
            Pack.littleEndianToLong(bArr, i, this.internalState);
            subRoundKey(this.roundsAmount);
            int i6 = this.roundsAmount;
            while (true) {
                mixColumnsInv();
                invShiftRows();
                invSubBytes();
                i6--;
                if (i6 == 0) {
                    break;
                }
                xorRoundKey(i6);
            }
            subRoundKey(0);
            Pack.longToLittleEndian(this.internalState, bArr2, i2);
        } else {
            decryptBlock_128(bArr, i, bArr2, i2);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.internalState, 0L);
    }
}
