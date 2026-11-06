package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class MetadataManager {
    private static final String ALTERNATE_FORMATS_FILE_PREFIX = "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto";
    static final String MULTI_FILE_PHONE_NUMBER_METADATA_FILE_PREFIX = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
    private static final String SHORT_NUMBER_METADATA_FILE_PREFIX = "/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto";
    static final String SINGLE_FILE_PHONE_NUMBER_METADATA_FILE_NAME = "/com/google/i18n/phonenumbers/data/SingleFilePhoneNumberMetadataProto";
    static final MetadataLoader DEFAULT_METADATA_LOADER = new MetadataLoader() { // from class: com.google.i18n.phonenumbers.MetadataManager.1
        @Override // com.google.i18n.phonenumbers.MetadataLoader
        public InputStream loadMetadata(String str) {
            return MetadataManager.class.getResourceAsStream(str);
        }
    };
    private static final Logger logger = Logger.getLogger(MetadataManager.class.getName());
    private static final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> alternateFormatsMap = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> shortNumberMetadataMap = new ConcurrentHashMap<>();
    private static final Set<Integer> alternateFormatsCountryCodes = AlternateFormatsCountryCodeSet.getCountryCodeSet();
    private static final Set<String> shortNumberMetadataRegionCodes = ShortNumbersRegionCodeSet.getRegionCodeSet();

    private MetadataManager() {
    }

    public static Phonemetadata.PhoneMetadata getAlternateFormatsForCountry(int i) {
        if (alternateFormatsCountryCodes.contains(Integer.valueOf(i))) {
            return getMetadataFromMultiFilePrefix(Integer.valueOf(i), alternateFormatsMap, ALTERNATE_FORMATS_FILE_PREFIX, DEFAULT_METADATA_LOADER);
        }
        return null;
    }

    public static <T> Phonemetadata.PhoneMetadata getMetadataFromMultiFilePrefix(T t, ConcurrentHashMap<T, Phonemetadata.PhoneMetadata> concurrentHashMap, String str, MetadataLoader metadataLoader) {
        Phonemetadata.PhoneMetadata phoneMetadata = concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        String str2 = str + "_" + t;
        List<Phonemetadata.PhoneMetadata> metadataFromSingleFileName = getMetadataFromSingleFileName(str2, metadataLoader);
        if (metadataFromSingleFileName.size() > 1) {
            logger.log(Level.WARNING, "more than one metadata in file ".concat(str2));
        }
        Phonemetadata.PhoneMetadata phoneMetadata2 = metadataFromSingleFileName.get(0);
        Phonemetadata.PhoneMetadata putIfAbsent = concurrentHashMap.putIfAbsent(t, phoneMetadata2);
        return putIfAbsent != null ? putIfAbsent : phoneMetadata2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Phonemetadata.PhoneMetadata> getMetadataFromSingleFileName(String str, MetadataLoader metadataLoader) {
        InputStream loadMetadata = metadataLoader.loadMetadata(str);
        if (loadMetadata == null) {
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("missing metadata: ", str));
            return null;
        }
        List<Phonemetadata.PhoneMetadata> metadataList = loadMetadataAndCloseInput(loadMetadata).getMetadataList();
        if (metadataList.size() != 0) {
            return metadataList;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("empty metadata: ", str));
        return null;
    }

    public static Phonemetadata.PhoneMetadata getShortNumberMetadataForRegion(String str) {
        if (shortNumberMetadataRegionCodes.contains(str)) {
            return getMetadataFromMultiFilePrefix(str, shortNumberMetadataMap, SHORT_NUMBER_METADATA_FILE_PREFIX, DEFAULT_METADATA_LOADER);
        }
        return null;
    }

    public static SingleFileMetadataMaps getSingleFileMetadataMaps(AtomicReference<SingleFileMetadataMaps> atomicReference, String str, MetadataLoader metadataLoader) {
        SingleFileMetadataMaps singleFileMetadataMaps = atomicReference.get();
        if (singleFileMetadataMaps != null) {
            return singleFileMetadataMaps;
        }
        SingleFileMetadataMaps load = SingleFileMetadataMaps.load(str, metadataLoader);
        while (!atomicReference.compareAndSet(null, load) && atomicReference.get() == null) {
        }
        return atomicReference.get();
    }

    public static Set<String> getSupportedShortNumberRegions() {
        return Collections.unmodifiableSet(shortNumberMetadataRegionCodes);
    }

    private static Phonemetadata.PhoneMetadataCollection loadMetadataAndCloseInput(InputStream inputStream) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(inputStream);
            } catch (IOException e) {
                throw new RuntimeException("cannot load/parse metadata", e);
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Phonemetadata.PhoneMetadataCollection phoneMetadataCollection = new Phonemetadata.PhoneMetadataCollection();
            try {
                phoneMetadataCollection.readExternal(objectInputStream);
                try {
                    objectInputStream.close();
                    return phoneMetadataCollection;
                } catch (IOException e2) {
                    logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e2);
                    return phoneMetadataCollection;
                }
            } catch (IOException e3) {
                throw new RuntimeException("cannot load/parse metadata", e3);
            }
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            try {
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                } else {
                    inputStream.close();
                }
            } catch (IOException e4) {
                logger.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e4);
            }
            throw th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SingleFileMetadataMaps {
        private final Map<Integer, Phonemetadata.PhoneMetadata> countryCallingCodeToMetadata;
        private final Map<String, Phonemetadata.PhoneMetadata> regionCodeToMetadata;

        private SingleFileMetadataMaps(Map<String, Phonemetadata.PhoneMetadata> map, Map<Integer, Phonemetadata.PhoneMetadata> map2) {
            this.regionCodeToMetadata = Collections.unmodifiableMap(map);
            this.countryCallingCodeToMetadata = Collections.unmodifiableMap(map2);
        }

        public static SingleFileMetadataMaps load(String str, MetadataLoader metadataLoader) {
            List<Phonemetadata.PhoneMetadata> metadataFromSingleFileName = MetadataManager.getMetadataFromSingleFileName(str, metadataLoader);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (Phonemetadata.PhoneMetadata phoneMetadata : metadataFromSingleFileName) {
                String id = phoneMetadata.getId();
                if (PhoneNumberUtil.REGION_CODE_FOR_NON_GEO_ENTITY.equals(id)) {
                    hashMap2.put(Integer.valueOf(phoneMetadata.getCountryCode()), phoneMetadata);
                } else {
                    hashMap.put(id, phoneMetadata);
                }
            }
            return new SingleFileMetadataMaps(hashMap, hashMap2);
        }

        public Phonemetadata.PhoneMetadata get(int i) {
            return this.countryCallingCodeToMetadata.get(Integer.valueOf(i));
        }

        public Phonemetadata.PhoneMetadata get(String str) {
            return this.regionCodeToMetadata.get(str);
        }
    }
}
